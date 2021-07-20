package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.ThreatIntel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ThreatIntelligenceApi {
  private ApiClient apiClient;

  public ThreatIntelligenceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ThreatIntelligenceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getCollectionObjects
   * 
   * @param ioc ioc (required)
   * @param iocType iocType (required)
   * @return List&lt;ThreatIntel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ThreatIntel> getCollectionObjects1(String ioc, String iocType) throws ApiException {
    return getCollectionObjects1WithHttpInfo(ioc, iocType).getData();
      }

  /**
   * getCollectionObjects
   * 
   * @param ioc ioc (required)
   * @param iocType iocType (required)
   * @return ApiResponse&lt;List&lt;ThreatIntel&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ThreatIntel>> getCollectionObjects1WithHttpInfo(String ioc, String iocType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ioc' is set
    if (ioc == null) {
      throw new ApiException(400, "Missing the required parameter 'ioc' when calling getCollectionObjects1");
    }
    
    // verify the required parameter 'iocType' is set
    if (iocType == null) {
      throw new ApiException(400, "Missing the required parameter 'iocType' when calling getCollectionObjects1");
    }
    
    // create path and map variables
    String localVarPath = "/api/threat-intel/{iocType}/{ioc}"
      .replaceAll("\\{" + "ioc" + "\\}", apiClient.escapeString(ioc.toString()))
      .replaceAll("\\{" + "iocType" + "\\}", apiClient.escapeString(iocType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<ThreatIntel>> localVarReturnType = new GenericType<List<ThreatIntel>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
