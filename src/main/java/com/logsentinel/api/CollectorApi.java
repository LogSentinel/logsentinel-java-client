package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.CollectorMetadataDto;
import com.logsentinel.model.CollectorStatusDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CollectorApi {
  private ApiClient apiClient;

  public CollectorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CollectorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Invoked during Collector&#39;s operation. Publish statistics for (some of) collector&#39;s Agent(s)
   * 
   * @param metadata metadata (required)
   * @throws ApiException if fails to make API call
   */
  public void sendStatistics(CollectorMetadataDto metadata) throws ApiException {

    sendStatisticsWithHttpInfo(metadata);
  }

  /**
   * Invoked during Collector&#39;s operation. Publish statistics for (some of) collector&#39;s Agent(s)
   * 
   * @param metadata metadata (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendStatisticsWithHttpInfo(CollectorMetadataDto metadata) throws ApiException {
    Object localVarPostBody = metadata;
    
    // verify the required parameter 'metadata' is set
    if (metadata == null) {
      throw new ApiException(400, "Missing the required parameter 'metadata' when calling sendStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/api/collector/sendStatistics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Invoked during Collector instance startup. Publish all configured Agent(s)together with their respective dataSourceId(s)
   * 
   * @param data data (required)
   * @throws ApiException if fails to make API call
   */
  public void sysInit(CollectorStatusDto data) throws ApiException {

    sysInitWithHttpInfo(data);
  }

  /**
   * Invoked during Collector instance startup. Publish all configured Agent(s)together with their respective dataSourceId(s)
   * 
   * @param data data (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sysInitWithHttpInfo(CollectorStatusDto data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(400, "Missing the required parameter 'data' when calling sysInit");
    }
    
    // create path and map variables
    String localVarPath = "/api/collector/sysInit";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Invoked during Collector&#39;s operation. Publish current status of (some of) collector&#39;s Agent(s)(no dataSourceIds included)
   * 
   * @param data data (required)
   * @throws ApiException if fails to make API call
   */
  public void updateStatus(CollectorStatusDto data) throws ApiException {

    updateStatusWithHttpInfo(data);
  }

  /**
   * Invoked during Collector&#39;s operation. Publish current status of (some of) collector&#39;s Agent(s)(no dataSourceIds included)
   * 
   * @param data data (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateStatusWithHttpInfo(CollectorStatusDto data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(400, "Missing the required parameter 'data' when calling updateStatus");
    }
    
    // create path and map variables
    String localVarPath = "/api/collector/updateStatus";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
