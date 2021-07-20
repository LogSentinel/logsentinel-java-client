package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.Bundle;
import com.logsentinel.model.TaxiiCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TaxiiApi {
  private ApiClient apiClient;

  public TaxiiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TaxiiApi(ApiClient apiClient) {
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
   * @param id id (required)
   * @return Bundle
   * @throws ApiException if fails to make API call
   */
  public Bundle getCollectionObjects(String id) throws ApiException {
    return getCollectionObjectsWithHttpInfo(id).getData();
      }

  /**
   * getCollectionObjects
   * 
   * @param id id (required)
   * @return ApiResponse&lt;Bundle&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Bundle> getCollectionObjectsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCollectionObjects");
    }
    
    // create path and map variables
    String localVarPath = "/api/taxii/collections/{id}/objects"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "application/vnd.oasis.stix+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Bundle> localVarReturnType = new GenericType<Bundle>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getCollections
   * 
   * @return TaxiiCollections
   * @throws ApiException if fails to make API call
   */
  public TaxiiCollections getCollections() throws ApiException {
    return getCollectionsWithHttpInfo().getData();
      }

  /**
   * getCollections
   * 
   * @return ApiResponse&lt;TaxiiCollections&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TaxiiCollections> getCollectionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/taxii/collections";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "application/vnd.oasis.taxii+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<TaxiiCollections> localVarReturnType = new GenericType<TaxiiCollections>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
