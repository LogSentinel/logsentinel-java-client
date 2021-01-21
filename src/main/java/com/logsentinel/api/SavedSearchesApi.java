package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.AuditLogEntry;
import com.logsentinel.model.SavedSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SavedSearchesApi {
  private ApiClient apiClient;

  public SavedSearchesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SavedSearchesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates saved search
   * 
   * @param end end (required)
   * @param name name (required)
   * @param query query (required)
   * @param start start (required)
   * @return List&lt;SavedSearch&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SavedSearch> createSavedSearch(Long end, String name, String query, Long start) throws ApiException {
    return createSavedSearchWithHttpInfo(end, name, query, start).getData();
      }

  /**
   * Creates saved search
   * 
   * @param end end (required)
   * @param name name (required)
   * @param query query (required)
   * @param start start (required)
   * @return ApiResponse&lt;List&lt;SavedSearch&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SavedSearch>> createSavedSearchWithHttpInfo(Long end, String name, String query, Long start) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'end' is set
    if (end == null) {
      throw new ApiException(400, "Missing the required parameter 'end' when calling createSavedSearch");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling createSavedSearch");
    }
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling createSavedSearch");
    }
    
    // verify the required parameter 'start' is set
    if (start == null) {
      throw new ApiException(400, "Missing the required parameter 'start' when calling createSavedSearch");
    }
    
    // create path and map variables
    String localVarPath = "/api/search/saved";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<SavedSearch>> localVarReturnType = new GenericType<List<SavedSearch>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetches saved search ids of all users of an organization
   * 
   * @return List&lt;SavedSearch&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SavedSearch> getSavedSearchIds() throws ApiException {
    return getSavedSearchIdsWithHttpInfo().getData();
      }

  /**
   * Fetches saved search ids of all users of an organization
   * 
   * @return ApiResponse&lt;List&lt;SavedSearch&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SavedSearch>> getSavedSearchIdsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/search/saved/fetch";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<SavedSearch>> localVarReturnType = new GenericType<List<SavedSearch>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Calls saved search by its id
   * 
   * @param savedSearchId savedSearchId (required)
   * @return List&lt;AuditLogEntry&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AuditLogEntry> performSavedSearch(String savedSearchId) throws ApiException {
    return performSavedSearchWithHttpInfo(savedSearchId).getData();
      }

  /**
   * Calls saved search by its id
   * 
   * @param savedSearchId savedSearchId (required)
   * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AuditLogEntry>> performSavedSearchWithHttpInfo(String savedSearchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'savedSearchId' is set
    if (savedSearchId == null) {
      throw new ApiException(400, "Missing the required parameter 'savedSearchId' when calling performSavedSearch");
    }
    
    // create path and map variables
    String localVarPath = "/api/search/saved";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "savedSearchId", savedSearchId));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<AuditLogEntry>> localVarReturnType = new GenericType<List<AuditLogEntry>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
