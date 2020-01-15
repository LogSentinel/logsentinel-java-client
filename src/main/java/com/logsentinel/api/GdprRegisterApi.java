package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.GDPRRegisterRecord;
import com.logsentinel.model.GDPRRegisterRecordDto;
import com.logsentinel.model.GDPRResponsibleEntity;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GdprRegisterApi {
  private ApiClient apiClient;

  public GdprRegisterApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GdprRegisterApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Adds entitity to the GDPR register
   * 
   * @param request request (required)
   * @return UUID
   * @throws ApiException if fails to make API call
   */
  public UUID addEntity(GDPRResponsibleEntity request) throws ApiException {
    return addEntityWithHttpInfo(request).getData();
      }

  /**
   * Adds entitity to the GDPR register
   * 
   * @param request request (required)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UUID> addEntityWithHttpInfo(GDPRResponsibleEntity request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addEntity");
    }
    
    // create path and map variables
    String localVarPath = "/api/gdpr/addEntity";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes entity in the GDPR register
   * 
   * @param id id (required)
   * @return GDPRResponsibleEntity
   * @throws ApiException if fails to make API call
   */
  public GDPRResponsibleEntity deleteEntity(UUID id) throws ApiException {
    return deleteEntityWithHttpInfo(id).getData();
      }

  /**
   * Deletes entity in the GDPR register
   * 
   * @param id id (required)
   * @return ApiResponse&lt;GDPRResponsibleEntity&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GDPRResponsibleEntity> deleteEntityWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteEntity");
    }
    
    // create path and map variables
    String localVarPath = "/api/gdpr/entity";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GDPRResponsibleEntity> localVarReturnType = new GenericType<GDPRResponsibleEntity>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes record  from the GDPR register
   * 
   * @param id id (required)
   * @return GDPRRegisterRecord
   * @throws ApiException if fails to make API call
   */
  public GDPRRegisterRecord deleteRecord(UUID id) throws ApiException {
    return deleteRecordWithHttpInfo(id).getData();
      }

  /**
   * Deletes record  from the GDPR register
   * 
   * @param id id (required)
   * @return ApiResponse&lt;GDPRRegisterRecord&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GDPRRegisterRecord> deleteRecordWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/gdpr/record";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GDPRRegisterRecord> localVarReturnType = new GenericType<GDPRRegisterRecord>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetch entities from the GDPR register
   * 
   * @return List&lt;GDPRResponsibleEntity&gt;
   * @throws ApiException if fails to make API call
   */
  public List<GDPRResponsibleEntity> gdprEntities() throws ApiException {
    return gdprEntitiesWithHttpInfo().getData();
      }

  /**
   * Fetch entities from the GDPR register
   * 
   * @return ApiResponse&lt;List&lt;GDPRResponsibleEntity&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<GDPRResponsibleEntity>> gdprEntitiesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/gdpr/entities";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<GDPRResponsibleEntity>> localVarReturnType = new GenericType<List<GDPRResponsibleEntity>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets entity by id from the GDPR register
   * 
   * @param id id (required)
   * @return GDPRResponsibleEntity
   * @throws ApiException if fails to make API call
   */
  public GDPRResponsibleEntity getEntity(UUID id) throws ApiException {
    return getEntityWithHttpInfo(id).getData();
      }

  /**
   * Gets entity by id from the GDPR register
   * 
   * @param id id (required)
   * @return ApiResponse&lt;GDPRResponsibleEntity&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GDPRResponsibleEntity> getEntityWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getEntity");
    }
    
    // create path and map variables
    String localVarPath = "/api/gdpr/entity";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GDPRResponsibleEntity> localVarReturnType = new GenericType<GDPRResponsibleEntity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets record by id from the GDPR register
   * 
   * @param id id (required)
   * @return GDPRRegisterRecord
   * @throws ApiException if fails to make API call
   */
  public GDPRRegisterRecord getRecord(UUID id) throws ApiException {
    return getRecordWithHttpInfo(id).getData();
      }

  /**
   * Gets record by id from the GDPR register
   * 
   * @param id id (required)
   * @return ApiResponse&lt;GDPRRegisterRecord&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GDPRRegisterRecord> getRecordWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/gdpr/record";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<GDPRRegisterRecord> localVarReturnType = new GenericType<GDPRRegisterRecord>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetch records from the GDPR register
   * 
   * @param role role (required)
   * @param filterTags Limit the response by providing specific tags (optional)
   * @return List&lt;GDPRRegisterRecordDto&gt;
   * @throws ApiException if fails to make API call
   */
  public List<GDPRRegisterRecordDto> getRecords(String role, List<String> filterTags) throws ApiException {
    return getRecordsWithHttpInfo(role, filterTags).getData();
      }

  /**
   * Fetch records from the GDPR register
   * 
   * @param role role (required)
   * @param filterTags Limit the response by providing specific tags (optional)
   * @return ApiResponse&lt;List&lt;GDPRRegisterRecordDto&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<GDPRRegisterRecordDto>> getRecordsWithHttpInfo(String role, List<String> filterTags) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling getRecords");
    }
    
    // create path and map variables
    String localVarPath = "/api/gdpr/records";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterTags", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<GDPRRegisterRecordDto>> localVarReturnType = new GenericType<List<GDPRRegisterRecordDto>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates entity in the GDPR register
   * 
   * @param request request (required)
   * @return UUID
   * @throws ApiException if fails to make API call
   */
  public UUID saveEntity(GDPRResponsibleEntity request) throws ApiException {
    return saveEntityWithHttpInfo(request).getData();
      }

  /**
   * Updates entity in the GDPR register
   * 
   * @param request request (required)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UUID> saveEntityWithHttpInfo(GDPRResponsibleEntity request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling saveEntity");
    }
    
    // create path and map variables
    String localVarPath = "/api/gdpr/entity";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Saves record in the GDPR register
   * 
   * @param record record (required)
   * @return UUID
   * @throws ApiException if fails to make API call
   */
  public UUID saveRecord(GDPRRegisterRecord record) throws ApiException {
    return saveRecordWithHttpInfo(record).getData();
      }

  /**
   * Saves record in the GDPR register
   * 
   * @param record record (required)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UUID> saveRecordWithHttpInfo(GDPRRegisterRecord record) throws ApiException {
    Object localVarPostBody = record;
    
    // verify the required parameter 'record' is set
    if (record == null) {
      throw new ApiException(400, "Missing the required parameter 'record' when calling saveRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/gdpr/saveRecord";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
