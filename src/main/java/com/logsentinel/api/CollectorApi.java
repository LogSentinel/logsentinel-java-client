package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.ApplicationRequest;
import com.logsentinel.model.CollectorMetadataDto;
import com.logsentinel.model.CollectorStatusDto;
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
   * Invoked during Collector&#39;s operation. Creates a new data source if a connector gets data from an unrecognized source
   * 
   * @param application application (required)
   * @return UUID
   * @throws ApiException if fails to make API call
   */
  public UUID createBlankApplication(ApplicationRequest application) throws ApiException {
    return createBlankApplicationWithHttpInfo(application).getData();
      }

  /**
   * Invoked during Collector&#39;s operation. Creates a new data source if a connector gets data from an unrecognized source
   * 
   * @param application application (required)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UUID> createBlankApplicationWithHttpInfo(ApplicationRequest application) throws ApiException {
    Object localVarPostBody = application;
    
    // verify the required parameter 'application' is set
    if (application == null) {
      throw new ApiException(400, "Missing the required parameter 'application' when calling createBlankApplication");
    }
    
    // create path and map variables
    String localVarPath = "/api/collector/createApplication";

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

    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * @return Map&lt;String, UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, UUID> sysInit(CollectorStatusDto data) throws ApiException {
    return sysInitWithHttpInfo(data).getData();
      }

  /**
   * Invoked during Collector instance startup. Publish all configured Agent(s)together with their respective dataSourceId(s)
   * 
   * @param data data (required)
   * @return ApiResponse&lt;Map&lt;String, UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, UUID>> sysInitWithHttpInfo(CollectorStatusDto data) throws ApiException {
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

    GenericType<Map<String, UUID>> localVarReturnType = new GenericType<Map<String, UUID>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Invoked during Collector&#39;s operation. Publish current status of (some of) collector&#39;s Agent(s)(no dataSourceIds included)
   * 
   * @param data data (required)
   * @return Map&lt;String, UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, UUID> updateStatus(CollectorStatusDto data) throws ApiException {
    return updateStatusWithHttpInfo(data).getData();
      }

  /**
   * Invoked during Collector&#39;s operation. Publish current status of (some of) collector&#39;s Agent(s)(no dataSourceIds included)
   * 
   * @param data data (required)
   * @return ApiResponse&lt;Map&lt;String, UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, UUID>> updateStatusWithHttpInfo(CollectorStatusDto data) throws ApiException {
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

    GenericType<Map<String, UUID>> localVarReturnType = new GenericType<Map<String, UUID>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
