package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.LogResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FlowLoggingApi {
  private ApiClient apiClient;

  public FlowLoggingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FlowLoggingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Log an event by a given actor
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param details Any details in any format about the event that you want to store in the log (required)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logFlow(String applicationId, String details) throws ApiException {
    return logFlowWithHttpInfo(applicationId, details).getData();
      }

  /**
   * Log an event by a given actor
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param details Any details in any format about the event that you want to store in the log (required)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logFlowWithHttpInfo(String applicationId, String details) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logFlow");
    }
    
    // verify the required parameter 'details' is set
    if (details == null) {
      throw new ApiException(400, "Missing the required parameter 'details' when calling logFlow");
    }
    
    // create path and map variables
    String localVarPath = "/api/flow/log";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
