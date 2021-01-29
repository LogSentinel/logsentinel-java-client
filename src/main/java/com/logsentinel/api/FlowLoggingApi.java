package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.FlowEntry;

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
   * Log a given flow event
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param flows flows (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean logFlow(String applicationId, List<FlowEntry> flows) throws ApiException {
    return logFlowWithHttpInfo(applicationId, flows).getData();
      }

  /**
   * Log a given flow event
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param flows flows (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Boolean> logFlowWithHttpInfo(String applicationId, List<FlowEntry> flows) throws ApiException {
    Object localVarPostBody = flows;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logFlow");
    }
    
    // verify the required parameter 'flows' is set
    if (flows == null) {
      throw new ApiException(400, "Missing the required parameter 'flows' when calling logFlow");
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

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
