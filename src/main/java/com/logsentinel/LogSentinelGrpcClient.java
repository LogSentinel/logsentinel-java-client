package com.logsentinel;

import java.util.List;

import com.logsentinel.grpc.LogServiceGrpc;
import com.logsentinel.grpc.LogServiceOuterClass.BatchLogRequest;
import com.logsentinel.grpc.LogServiceOuterClass.LogEntry;
import com.logsentinel.model.ActionData;
import com.logsentinel.model.ActorData;
import com.logsentinel.model.BatchLogRequestEntry;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * gRPC client
 */
public class LogSentinelGrpcClient {

    private LogServiceGrpc.LogServiceStub stub;
    
    public LogSentinelGrpcClient(String server, int port, boolean encrypted) {
        ManagedChannelBuilder<?> builder = ManagedChannelBuilder.forAddress(server, port).userAgent("LogSentinel-gRPC-Client");
        if (encrypted) {
            builder.useTransportSecurity();
        } else {
            builder.usePlaintext();
        }
        ManagedChannel channel = builder.build();
        stub = LogServiceGrpc.newStub(channel);
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
            logEntry.setActorId(entry.getActorData().getActorId());
            logEntry.setActorDisplayName(entry.getActorData().getActorDisplayName());
            entry.getActorData().getActorRoles().forEach(role -> logEntry.addActorRoles(role));
        }
        if (entry.getActionData() != null) {
            logEntry.setAction(entry.getActionData().getAction());
            if (entry.getActionData().getDetails() != null) {
                logEntry.setDetails(entry.getActionData().getDetails().toString());
            }
            if (entry.getTags() != null) {
                entry.getTags().forEach(tag -> logEntry.addTags(tag));
            }
            if (entry.getActionData().getEntryType() != null) {
                logEntry.setEntryType(entry.getActionData().getEntryType().toString());
            }
            logEntry.setEntityType(entry.getActionData().getEntityType());
            logEntry.setEntityId(entry.getActionData().getEntityId());
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
        stub.log(toGrpcLogEntry(wrapper, applicationId), null);
        return null;
    }
    
    
}
