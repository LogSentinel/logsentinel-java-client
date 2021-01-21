package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import java.util.UUID;

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
   * @param collectorId collectorId (optional)
   * @throws ApiException if fails to make API call
   */
  public void sendStatistics(UUID collectorId) throws ApiException {

    sendStatisticsWithHttpInfo(collectorId);
  }

  /**
   * Invoked during Collector&#39;s operation. Publish statistics for (some of) collector&#39;s Agent(s)
   * 
   * @param collectorId collectorId (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendStatisticsWithHttpInfo(UUID collectorId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/collector/sendStatistics";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Invoked during Collector instance startup. Publish all configured Agent(s)together with their respective dataSourceId(s)
   * 
   * @param collectorId collectorId (optional)
   * @param info0AdditionalMessage  (optional)
   * @param info0ConnectorId  (optional)
   * @param info0ConnectorName  (optional)
   * @param info0DataSourceIds  (optional)
   * @param info0NewlyCreated  (optional)
   * @param info0Status  (optional)
   * @throws ApiException if fails to make API call
   */
  public void sysInit(UUID collectorId, String info0AdditionalMessage, String info0ConnectorId, String info0ConnectorName, List<String> info0DataSourceIds, Boolean info0NewlyCreated, String info0Status) throws ApiException {

    sysInitWithHttpInfo(collectorId, info0AdditionalMessage, info0ConnectorId, info0ConnectorName, info0DataSourceIds, info0NewlyCreated, info0Status);
  }

  /**
   * Invoked during Collector instance startup. Publish all configured Agent(s)together with their respective dataSourceId(s)
   * 
   * @param collectorId collectorId (optional)
   * @param info0AdditionalMessage  (optional)
   * @param info0ConnectorId  (optional)
   * @param info0ConnectorName  (optional)
   * @param info0DataSourceIds  (optional)
   * @param info0NewlyCreated  (optional)
   * @param info0Status  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sysInitWithHttpInfo(UUID collectorId, String info0AdditionalMessage, String info0ConnectorId, String info0ConnectorName, List<String> info0DataSourceIds, Boolean info0NewlyCreated, String info0Status) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/collector/sysInit";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collectorId", collectorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].additionalMessage", info0AdditionalMessage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].connectorId", info0ConnectorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].connectorName", info0ConnectorName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "info[0].dataSourceIds", info0DataSourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].newlyCreated", info0NewlyCreated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].status", info0Status));

    
    
    final String[] localVarAccepts = {
      "*/*"
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
   * @param collectorId collectorId (optional)
   * @param info0AdditionalMessage  (optional)
   * @param info0ConnectorId  (optional)
   * @param info0ConnectorName  (optional)
   * @param info0DataSourceIds  (optional)
   * @param info0NewlyCreated  (optional)
   * @param info0Status  (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateStatus(UUID collectorId, String info0AdditionalMessage, String info0ConnectorId, String info0ConnectorName, List<String> info0DataSourceIds, Boolean info0NewlyCreated, String info0Status) throws ApiException {

    updateStatusWithHttpInfo(collectorId, info0AdditionalMessage, info0ConnectorId, info0ConnectorName, info0DataSourceIds, info0NewlyCreated, info0Status);
  }

  /**
   * Invoked during Collector&#39;s operation. Publish current status of (some of) collector&#39;s Agent(s)(no dataSourceIds included)
   * 
   * @param collectorId collectorId (optional)
   * @param info0AdditionalMessage  (optional)
   * @param info0ConnectorId  (optional)
   * @param info0ConnectorName  (optional)
   * @param info0DataSourceIds  (optional)
   * @param info0NewlyCreated  (optional)
   * @param info0Status  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateStatusWithHttpInfo(UUID collectorId, String info0AdditionalMessage, String info0ConnectorId, String info0ConnectorName, List<String> info0DataSourceIds, Boolean info0NewlyCreated, String info0Status) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/collector/updateStatus";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collectorId", collectorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].additionalMessage", info0AdditionalMessage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].connectorId", info0ConnectorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].connectorName", info0ConnectorName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "info[0].dataSourceIds", info0DataSourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].newlyCreated", info0NewlyCreated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "info[0].status", info0Status));

    
    
    final String[] localVarAccepts = {
      "*/*"
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
