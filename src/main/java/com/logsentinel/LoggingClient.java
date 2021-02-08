package com.logsentinel;

import java.util.List;

import com.logsentinel.model.ActionData;
import com.logsentinel.model.ActorData;
import com.logsentinel.model.BatchLogRequestEntry;

/**
 * Interface for all output logging clients to implement
 *
 */
public interface LoggingClient {

    <T> String logBatch(List<BatchLogRequestEntry<T>> requestData);
    
    String log(ActorData actorData, ActionData<?> actionData);
    
    Object unwrap();
}
