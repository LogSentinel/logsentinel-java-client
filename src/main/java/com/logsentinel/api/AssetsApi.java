package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AssetsApi {
  private ApiClient apiClient;

  public AssetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AssetsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Check asset
   * 
   * @param ip ip (required)
   * @param port port (required)
   * @param protocol protocol (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean assetExists(String ip, Integer port, String protocol) throws ApiException {
    return assetExistsWithHttpInfo(ip, port, protocol).getData();
      }

  /**
   * Check asset
   * 
   * @param ip ip (required)
   * @param port port (required)
   * @param protocol protocol (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Boolean> assetExistsWithHttpInfo(String ip, Integer port, String protocol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ip' is set
    if (ip == null) {
      throw new ApiException(400, "Missing the required parameter 'ip' when calling assetExists");
    }
    
    // verify the required parameter 'port' is set
    if (port == null) {
      throw new ApiException(400, "Missing the required parameter 'port' when calling assetExists");
    }
    
    // verify the required parameter 'protocol' is set
    if (protocol == null) {
      throw new ApiException(400, "Missing the required parameter 'protocol' when calling assetExists");
    }
    
    // create path and map variables
    String localVarPath = "/api/assets/exists";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ip", ip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "port", port));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "protocol", protocol));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Insert asset
   * 
   * @param ip ip (required)
   * @param port port (required)
   * @param protocol protocol (required)
   * @param serviceName serviceName (required)
   * @param riskLevel riskLevel (optional)
   * @param sourceCategory sourceCategory (optional)
   * @throws ApiException if fails to make API call
   */
  public void insertAsset(String ip, Integer port, String protocol, String serviceName, Integer riskLevel, String sourceCategory) throws ApiException {

    insertAssetWithHttpInfo(ip, port, protocol, serviceName, riskLevel, sourceCategory);
  }

  /**
   * Insert asset
   * 
   * @param ip ip (required)
   * @param port port (required)
   * @param protocol protocol (required)
   * @param serviceName serviceName (required)
   * @param riskLevel riskLevel (optional)
   * @param sourceCategory sourceCategory (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> insertAssetWithHttpInfo(String ip, Integer port, String protocol, String serviceName, Integer riskLevel, String sourceCategory) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ip' is set
    if (ip == null) {
      throw new ApiException(400, "Missing the required parameter 'ip' when calling insertAsset");
    }
    
    // verify the required parameter 'port' is set
    if (port == null) {
      throw new ApiException(400, "Missing the required parameter 'port' when calling insertAsset");
    }
    
    // verify the required parameter 'protocol' is set
    if (protocol == null) {
      throw new ApiException(400, "Missing the required parameter 'protocol' when calling insertAsset");
    }
    
    // verify the required parameter 'serviceName' is set
    if (serviceName == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceName' when calling insertAsset");
    }
    
    // create path and map variables
    String localVarPath = "/api/assets/insert";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ip", ip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "port", port));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "protocol", protocol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "riskLevel", riskLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "serviceName", serviceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceCategory", sourceCategory));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
