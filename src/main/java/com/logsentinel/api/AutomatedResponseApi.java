package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.DeferredResultOfAutomatedResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AutomatedResponseApi {
  private ApiClient apiClient;

  public AutomatedResponseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AutomatedResponseApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * connect
   * 
   * @param collectorId collectorId (optional)
   * @return DeferredResultOfAutomatedResponse
   * @throws ApiException if fails to make API call
   */
  public DeferredResultOfAutomatedResponse connect(UUID collectorId) throws ApiException {
    return connectWithHttpInfo(collectorId).getData();
      }

  /**
   * connect
   * 
   * @param collectorId collectorId (optional)
   * @return ApiResponse&lt;DeferredResultOfAutomatedResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DeferredResultOfAutomatedResponse> connectWithHttpInfo(UUID collectorId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/response/connect";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collectorId", collectorId));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<DeferredResultOfAutomatedResponse> localVarReturnType = new GenericType<DeferredResultOfAutomatedResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
