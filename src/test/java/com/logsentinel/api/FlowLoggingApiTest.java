/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.model.LogResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FlowLoggingApi
 */
@Ignore
public class FlowLoggingApiTest {

    private final FlowLoggingApi api = new FlowLoggingApi();

    
    /**
     * Log an event by a given actor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logFlowTest() throws ApiException {
        String applicationId = null;
        String details = null;
        LogResponse response = api.logFlow(applicationId, details);

        // TODO: test validations
    }
    
}
