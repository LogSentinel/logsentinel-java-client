package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.AuditLogEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SearchApi {
  private ApiClient apiClient;

  public SearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Search entries in batches by field
   * Search entries by specifying a list of actorIds or entityIds. If entityId is specified, entityType should also be specified.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param field Field to search in for the supplied values (required)
   * @param values Values that match the specified field (required)
   * @param batchSize batchSize (optional, default to 1000)
   * @param entityType When the event is about a particular model entity, you can set its type here (optional)
   * @param page page (optional, default to 0)
   * @return List&lt;AuditLogEntry&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AuditLogEntry> getBatch(String applicationId, String field, List<String> values, Integer batchSize, String entityType, Integer page) throws ApiException {
    return getBatchWithHttpInfo(applicationId, field, values, batchSize, entityType, page).getData();
      }

  /**
   * Search entries in batches by field
   * Search entries by specifying a list of actorIds or entityIds. If entityId is specified, entityType should also be specified.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param field Field to search in for the supplied values (required)
   * @param values Values that match the specified field (required)
   * @param batchSize batchSize (optional, default to 1000)
   * @param entityType When the event is about a particular model entity, you can set its type here (optional)
   * @param page page (optional, default to 0)
   * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AuditLogEntry>> getBatchWithHttpInfo(String applicationId, String field, List<String> values, Integer batchSize, String entityType, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getBatch");
    }
    
    // verify the required parameter 'field' is set
    if (field == null) {
      throw new ApiException(400, "Missing the required parameter 'field' when calling getBatch");
    }
    
    // verify the required parameter 'values' is set
    if (values == null) {
      throw new ApiException(400, "Missing the required parameter 'values' when calling getBatch");
    }
    
    // create path and map variables
    String localVarPath = "/api/search/batch";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "batchSize", batchSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityType", entityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "field", field));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "values", values));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
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
  /**
   * Get entity history
   * Fetches all entries related to a specific entity (specified by type and id). Entity modifications can consist of diffs, so that fetching the whole history can be used for reconstructing the current state of the entity
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entityId When the event is about a particular model entity, you can set its ID here (required)
   * @param entityType When the event is about a particular model entity, you can set its type here (required)
   * @return List&lt;AuditLogEntry&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AuditLogEntry> getEntityHistory(String applicationId, String entityId, String entityType) throws ApiException {
    return getEntityHistoryWithHttpInfo(applicationId, entityId, entityType).getData();
      }

  /**
   * Get entity history
   * Fetches all entries related to a specific entity (specified by type and id). Entity modifications can consist of diffs, so that fetching the whole history can be used for reconstructing the current state of the entity
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entityId When the event is about a particular model entity, you can set its ID here (required)
   * @param entityType When the event is about a particular model entity, you can set its type here (required)
   * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AuditLogEntry>> getEntityHistoryWithHttpInfo(String applicationId, String entityId, String entityType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getEntityHistory");
    }
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling getEntityHistory");
    }
    
    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      throw new ApiException(400, "Missing the required parameter 'entityType' when calling getEntityHistory");
    }
    
    // create path and map variables
    String localVarPath = "/api/search/entityHistory";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityId", entityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityType", entityType));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
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
  /**
   * Search logged entries
   * Perform search using a Lucene query. The lucene query syntax can be &lt;a href&#x3D;\&quot;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-query-string-query.html#query-string-syntax\&quot;&gt;found here&lt;/a&gt;
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param endTime endTime (required)
   * @param page page (required)
   * @param pageSize pageSize (required)
   * @param query query (required)
   * @param startTime startTime (required)
   * @return List&lt;AuditLogEntry&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AuditLogEntry> search(String applicationId, Long endTime, Integer page, Integer pageSize, String query, Long startTime) throws ApiException {
    return searchWithHttpInfo(applicationId, endTime, page, pageSize, query, startTime).getData();
      }

  /**
   * Search logged entries
   * Perform search using a Lucene query. The lucene query syntax can be &lt;a href&#x3D;\&quot;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-query-string-query.html#query-string-syntax\&quot;&gt;found here&lt;/a&gt;
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param endTime endTime (required)
   * @param page page (required)
   * @param pageSize pageSize (required)
   * @param query query (required)
   * @param startTime startTime (required)
   * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AuditLogEntry>> searchWithHttpInfo(String applicationId, Long endTime, Integer page, Integer pageSize, String query, Long startTime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling search");
    }
    
    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(400, "Missing the required parameter 'endTime' when calling search");
    }
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling search");
    }
    
    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(400, "Missing the required parameter 'pageSize' when calling search");
    }
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling search");
    }
    
    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(400, "Missing the required parameter 'startTime' when calling search");
    }
    
    // create path and map variables
    String localVarPath = "/api/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
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
