package com.logsentinel;

import java.util.List;

import com.logsentinel.model.ActionData;
import com.logsentinel.model.ActorData;
import com.logsentinel.model.BatchLogRequestEntry;

/**
 * Default, LogSentinel SIEM output client
 */
public class LogSentinelLoggingClient implements LoggingClient {

    private LogSentinelClient client;
    
    public LogSentinelLoggingClient(LogSentinelClient client) {
        this.client = client;
    }

    @Override
    public <T> String logBatch(List<BatchLogRequestEntry<T>> requestData) {
        return client.getAuditLogActions().logBatch(requestData).getLogEntryId();
        
    }

    @Override
    public String log(ActorData actorData, ActionData<?> actionData) {
        return client.getAuditLogActions().log(actorData, actionData).getLogEntryId();
    }
    
    @Override
    public Object unwrap() {
        return client;
    }

}
