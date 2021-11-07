package com.logsentinel;

import java.util.List;

import com.logsentinel.model.ActionData;
import com.logsentinel.model.ActorData;
import com.logsentinel.model.BatchLogRequestEntry;
import com.logsentinel.model.LogResponse;

/**
 * Default, LogSentinel SIEM output client
 */
public class LogSentinelLoggingClient implements LoggingClient {

    private LogSentinelClient client;
    private LogSentinelGrpcClient grpcClient;
    
    private boolean grpc;
    private String applicationId;
    
    public LogSentinelLoggingClient(LogSentinelClient client) {
        this.client = client;
        this.grpc = false;
    }
    
    public LogSentinelLoggingClient(LogSentinelClient client, 
            LogSentinelGrpcClient grpcClient, 
            boolean grpc,
            String applicationId) {
        this.client = client;
        this.grpcClient = grpcClient;
        this.grpc = grpc;
        this.applicationId = applicationId;
    }

    @Override
    public <T> String logBatch(List<BatchLogRequestEntry<T>> requestData) {
        if (grpc) {
            return grpcClient.logBatch(requestData, applicationId);
        } else {
            LogResponse result = client.getAuditLogActions().logBatch(requestData);
            if (result == null) {
                return null;
            }
            return result.getLogEntryId();
        }
        
    }

    @Override
    public String log(ActorData actorData, ActionData<?> actionData) {
        if (grpc) {
            return grpcClient.log(actorData, (ActionData<Object>) actionData, applicationId);
        } else {
            return client.getAuditLogActions().log(actorData, actionData).getLogEntryId();
        }
    }
    
    @Override
    public Object unwrap() {
        return client;
    }

}
