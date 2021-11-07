package com.logsentinel;

import java.util.Base64;
import java.util.List;
import java.util.concurrent.Executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.logsentinel.grpc.LogServiceGrpc;
import com.logsentinel.grpc.LogServiceOuterClass;
import com.logsentinel.grpc.LogServiceOuterClass.BatchLogRequest;
import com.logsentinel.grpc.LogServiceOuterClass.LogEntry;
import com.logsentinel.model.ActionData;
import com.logsentinel.model.ActorData;
import com.logsentinel.model.BatchLogRequestEntry;

import io.grpc.CallCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.StreamObserver;

/**
 * gRPC client
 */
public class LogSentinelGrpcClient {

    private static final Logger logger = LoggerFactory.getLogger(LogSentinelGrpcClient.class);
    
    public static io.grpc.Metadata.Key<String> AuthorizationMetadataKey =
            Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);
    
    private LogServiceGrpc.LogServiceStub stub;
    
    public LogSentinelGrpcClient(String server, int port, boolean encrypted, 
            String organizationId, String secret) {
        ManagedChannelBuilder<?> builder = ManagedChannelBuilder.forAddress(server, port).userAgent("LogSentinel-gRPC-Client");
        if (encrypted) {
            builder.useTransportSecurity();
        } else {
            builder.usePlaintext();
        }
        ManagedChannel channel = builder.build();
        stub = LogServiceGrpc.newStub(channel).withCallCredentials(new BasicAuthCredentials(organizationId, secret));
    }
    
    public <T> String logBatch(List<BatchLogRequestEntry<T>> requestData, String applicationId) {

        BatchLogRequest.Builder requestBuilder = BatchLogRequest.newBuilder();
        for (BatchLogRequestEntry<T> entry : requestData) {
            LogEntry logEntry = toGrpcLogEntry(entry, applicationId);
            requestBuilder.addEntries(logEntry);
        }
        
        stub.logBatch(requestBuilder.build(), null);
        
        return null;
        
    }

    public <T> LogEntry toGrpcLogEntry(BatchLogRequestEntry<T> entry, String applicationId) {
        LogEntry.Builder logEntry = LogEntry.newBuilder();
        if (entry.getActorData() != null) {
            if (entry.getActorData().getActorId() != null) {
                logEntry.setActorId(entry.getActorData().getActorId());
            }
            if (entry.getActorData().getActorDisplayName() != null) {
                logEntry.setActorDisplayName(entry.getActorData().getActorDisplayName());
            }
            if (entry.getActorData().getActorRoles() != null) {
                entry.getActorData().getActorRoles().forEach(role -> logEntry.addActorRoles(role));
            }
        }
        if (entry.getActionData() != null) {
            if (entry.getActionData().getAction() != null) {
                logEntry.setAction(entry.getActionData().getAction());
            }
            if (entry.getActionData().getDetails() != null) {
                logEntry.setDetails(entry.getActionData().getDetails().toString());
            }
            if (entry.getTags() != null) {
                entry.getTags().forEach(tag -> logEntry.addTags(tag));
            }
            if (entry.getActionData().getEntryType() != null) {
                logEntry.setEntryType(entry.getActionData().getEntryType().toString());
            }
            if (entry.getActionData().getEntityType() != null) {
                logEntry.setEntityType(entry.getActionData().getEntityType());
            }
            if (entry.getActionData().getEntityId() != null) {
                logEntry.setEntityId(entry.getActionData().getEntityId());
            }
            if (entry.getActionData().getParams() != null) {
                logEntry.putAllParams(entry.getActionData().getParams());
            }
            if (entry.getActionData().getTags() != null) {
                entry.getActionData().getTags().forEach(tag -> logEntry.addTags(tag));
            }
        }
        
        if (entry.getParams() != null) {
            logEntry.putAllParams(entry.getParams());
        }
        logEntry.setApplicationId(applicationId);
        
        return logEntry.build();
    }

    public String log(ActorData actorData, ActionData<Object> actionData, String applicationId) {
        BatchLogRequestEntry<Object> wrapper = new BatchLogRequestEntry<>();
        wrapper.setActorData(actorData);
        wrapper.setActionData(actionData);
        stub.log(toGrpcLogEntry(wrapper, applicationId), new ResponseObserver<LogServiceOuterClass.LogResponse>());
        return null;
    }
    

    public static class BasicAuthCredentials extends CallCredentials {

        private String organizationId;
        private String secret;
        public BasicAuthCredentials(String organizationId, String secret) {
            this.organizationId = organizationId;
            this.secret = secret;
        }

        @Override
        public void applyRequestMetadata(RequestInfo requestInfo, Executor appExecutor, MetadataApplier applier) {
            Metadata metadata = new Metadata();
            metadata.put(AuthorizationMetadataKey, 
                    "Basic " + Base64.getEncoder().encodeToString((organizationId + ":" + secret).getBytes()));
            applier.apply(metadata);            
        }

        @Override
        public void thisUsesUnstableApi() {
            
        }
    }
    
    public static class ResponseObserver<T> implements StreamObserver<T> {

        @Override
        public void onNext(T value) {
        }

        @Override
        public void onError(Throwable t) {
            logger.error("Failed to make gRPC call", t);
        }

        @Override
        public void onCompleted() {
        }
        
    }
}
