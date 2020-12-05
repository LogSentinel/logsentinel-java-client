package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.BodySerializer;
import com.logsentinel.BodySigner;
import com.logsentinel.Configuration;
import com.logsentinel.EncryptingKeywordExtractor;
import com.logsentinel.Pair;
import com.logsentinel.client.BodyAndKeywords;
import com.logsentinel.model.ActionData;
import com.logsentinel.model.ActorData;
import com.logsentinel.model.ActionData.EntryTypeEnum;

import javax.ws.rs.core.GenericType;

import java.util.UUID;

import static com.logsentinel.util.EncryptUtil.base64Encode;
import static com.logsentinel.util.EncryptUtil.encrypt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashApi {
  private ApiClient apiClient;
  private BodySerializer bodySerializer;
  private BodySigner bodySigner; 
  private EncryptingKeywordExtractor encryptingKeywordExtractor;
  
  public HashApi() {
    this(Configuration.getDefaultApiClient(), null, null, null);
  }

  public HashApi(ApiClient apiClient, BodySerializer bodySerializer, BodySigner bodySigner, 
          EncryptingKeywordExtractor encryptingKeywordExtractor) {
    this.apiClient = apiClient;
    this.bodySerializer = bodySerializer;
    this.bodySigner = bodySigner;
    this.encryptingKeywordExtractor = encryptingKeywordExtractor;
  }

  public HashApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the standalone (non-chained) hash for an entry
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getHash(UUID applicationId, UUID entryId) throws ApiException {
    return getHashWithHttpInfo(applicationId, entryId).getData();
      }

  /**
   * Get the standalone (non-chained) hash for an entry
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> getHashWithHttpInfo(UUID applicationId, UUID entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getHash");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling getHash");
    }
    
    // create path and map variables
    String localVarPath = "/api/getStandaloneHash";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entryId", entryId));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the content over which to compute the hash of a request for simple (minimal metadata) actions
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param auditLogEntryType The type of the event (optional, default to BUSINESS_LOGIC_ENTRY)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param logLevel logLevel (optional)
   * @param additionalParams additionalParams (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getHashableContent(UUID applicationId, String action, String actorId, String auditLogEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, String details, String logLevel, Long originalEventTimestamp, Map<String, String> additionalParams) throws ApiException {
    return getHashableContentWithHttpInfo(applicationId, action, actorId, auditLogEntryType, signature, actorDepartment, actorDisplayName, actorRoles, details, logLevel, originalEventTimestamp, additionalParams).getData();
      }

  /**
   * Get the content over which to compute the hash of a request for simple (minimal metadata) actions
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param auditLogEntryType The type of the event (optional, default to BUSINESS_LOGIC_ENTRY)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param logLevel logLevel (optional)
   * @param additionalParams additionalParams (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> getHashableContentWithHttpInfo(UUID applicationId, String action, String actorId, String auditLogEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, String details, String logLevel, Long originalEventTimestamp, Map<String, String> additionalParams) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getHashableContent");
    }
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling getHashableContent");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling getHashableContent");
    }
    
    // create path and map variables
    String localVarPath = "/api/getHashableContent/{actorId}/{action}"
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()))
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logLevel", logLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originalEventTimestamp", originalEventTimestamp));

    if (additionalParams != null && !additionalParams.isEmpty()) {
        additionalParams.forEach((k, v) -> localVarQueryParams.add(new Pair(k, v)));
    }
    
    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (auditLogEntryType != null)
      localVarHeaderParams.put("Audit-Log-Entry-Type", apiClient.parameterToString(auditLogEntryType));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));

    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the content over which to compute the hash of a request for auth actions
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param authAction Specific action related to user authentication (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param signedLoginChallenge Signed-Login-Challenge (optional)
   * @param userPublicKey User-Public-Key (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param additionalParams additionalParams (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getHashableContentForAuthAction(UUID applicationId, String actorId, String authAction, String signature, String signedLoginChallenge, String userPublicKey, String actorDepartment, String actorDisplayName, List<String> actorRoles, String details, Long originalEventTimestamp, Map<String, String> additionalParams) throws ApiException {
    return getHashableContentForAuthActionWithHttpInfo(applicationId, actorId, authAction, signature, signedLoginChallenge, userPublicKey, actorDepartment, actorDisplayName, actorRoles, details, originalEventTimestamp, additionalParams).getData();
      }

  /**
   * Get the content over which to compute the hash of a request for auth actions
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param authAction Specific action related to user authentication (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param signedLoginChallenge Signed-Login-Challenge (optional)
   * @param userPublicKey User-Public-Key (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param additionalParams additionalParams (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> getHashableContentForAuthActionWithHttpInfo(UUID applicationId, String actorId, String authAction, String signature, String signedLoginChallenge, String userPublicKey, String actorDepartment, String actorDisplayName, List<String> actorRoles, String details, Long originalEventTimestamp, Map<String, String> additionalParams) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getHashableContentForAuthAction");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling getHashableContentForAuthAction");
    }
    
    // verify the required parameter 'authAction' is set
    if (authAction == null) {
      throw new ApiException(400, "Missing the required parameter 'authAction' when calling getHashableContentForAuthAction");
    }
    
    // create path and map variables
    String localVarPath = "/api/getHashableContent/{actorId}/auth/{authAction}"
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()))
      .replaceAll("\\{" + "authAction" + "\\}", apiClient.escapeString(authAction.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originalEventTimestamp", originalEventTimestamp));

    if (additionalParams != null && !additionalParams.isEmpty()) {
        additionalParams.forEach((k, v) -> localVarQueryParams.add(new Pair(k, v)));
    }
    
    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));
if (signedLoginChallenge != null)
      localVarHeaderParams.put("Signed-Login-Challenge", apiClient.parameterToString(signedLoginChallenge));
if (userPublicKey != null)
      localVarHeaderParams.put("User-Public-Key", apiClient.parameterToString(userPublicKey));

    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the content over which to compute the hash of a request for standard actions
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param entityId When the event is about a particular model entity, you can set its ID here (required)
   * @param entityType When the event is about a particular model entity, you can set its type here (required)
   * @param auditLogEntryType The type of the event (optional, default to BUSINESS_LOGIC_ENTRY)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param logLevel logLevel (optional)
   * @param additionalParams additionalParams (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getHashableContentForStandardAction(UUID applicationId, String action, String actorId, String entityId, String entityType, String auditLogEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, String details, String logLevel, Long originalEventTimestamp, Map<String, String> additionalParams) throws ApiException {
    return getHashableContentForStandardActionWithHttpInfo(applicationId, action, actorId, entityId, entityType, auditLogEntryType, signature, actorDepartment, actorDisplayName, actorRoles, details, logLevel, originalEventTimestamp, additionalParams).getData();
      }

  /**
   * Get the content over which to compute the hash of a request for standard actions
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param entityId When the event is about a particular model entity, you can set its ID here (required)
   * @param entityType When the event is about a particular model entity, you can set its type here (required)
   * @param auditLogEntryType The type of the event (optional, default to BUSINESS_LOGIC_ENTRY)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param logLevel logLevel (optional)
   * @param additionalParams additionalParams (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> getHashableContentForStandardActionWithHttpInfo(UUID applicationId, String action, String actorId, String entityId, String entityType, String auditLogEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, String details, String logLevel, Long originalEventTimestamp, Map<String, String> additionalParams) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getHashableContentForStandardAction");
    }
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling getHashableContentForStandardAction");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling getHashableContentForStandardAction");
    }
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling getHashableContentForStandardAction");
    }
    
    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      throw new ApiException(400, "Missing the required parameter 'entityType' when calling getHashableContentForStandardAction");
    }
    
    // create path and map variables
    String localVarPath = "/api/getHashableContent/{actorId}/{action}/{entityType}/{entityId}"
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()))
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()))
      .replaceAll("\\{" + "entityId" + "\\}", apiClient.escapeString(entityId.toString()))
      .replaceAll("\\{" + "entityType" + "\\}", apiClient.escapeString(entityType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logLevel", logLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originalEventTimestamp", originalEventTimestamp));

    if (additionalParams != null && !additionalParams.isEmpty()) {
        additionalParams.forEach((k, v) -> localVarQueryParams.add(new Pair(k, v)));
    }
    
    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (auditLogEntryType != null)
      localVarHeaderParams.put("Audit-Log-Entry-Type", apiClient.parameterToString(auditLogEntryType));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));

    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the content over which to compute the hash of a request without any additional metadata (including encrypted request bodies)
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param auditLogEntryType The type of the event (optional, default to BUSINESS_LOGIC_ENTRY)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param logLevel logLevel (optional)
   * @param additionalParams additionalParams (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getHashableContentSimple(UUID applicationId, String auditLogEntryType, String signature, String details, String logLevel, Long originalEventTimestamp, Map<String, String> additionalParams) throws ApiException {
    return getHashableContentSimpleWithHttpInfo(applicationId, auditLogEntryType, signature, details, logLevel, originalEventTimestamp, additionalParams).getData();
      }

  /**
   * Get the content over which to compute the hash of a request without any additional metadata (including encrypted request bodies)
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param auditLogEntryType The type of the event (optional, default to BUSINESS_LOGIC_ENTRY)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param logLevel logLevel (optional)
   * @param additionalParams additional params
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> getHashableContentSimpleWithHttpInfo(UUID applicationId, String auditLogEntryType, String signature, String details, String logLevel, Long originalEventTimestamp, Map<String, String> additionalParams) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getHashableContentSimple");
    }
    
    // create path and map variables
    String localVarPath = "/api/getHashableContent";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logLevel", logLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originalEventTimestamp", originalEventTimestamp));

    if (additionalParams != null && !additionalParams.isEmpty()) {
        additionalParams.forEach((k, v) -> localVarQueryParams.add(new Pair(k, v)));
    }
    
    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (auditLogEntryType != null)
      localVarHeaderParams.put("Audit-Log-Entry-Type", apiClient.parameterToString(auditLogEntryType));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  public <T> String getHashableContent(ActorData actorData, ActionData<T> actionData, UUID applicationId) {
      BodyAndKeywords bodyAndKeywords = preProcessBody(actionData);
      String signature = null;
      if (bodySigner != null) {
          signature = bodySigner.computeSignature(bodyAndKeywords.getBody());
      }
      
      String entryType = EntryTypeEnum.BUSINESS_LOGIC_ENTRY.getValue();
      if (actionData.getEntryType() != null) {
          entryType = actionData.getEntryType().getValue();
      }
      return getHashableContent(applicationId, actionData.getAction(), actorData.getActorId(), entryType, signature, actorData.getDepartment(), 
              actorData.getActorDisplayName(), actorData.getActorRoles(), 
              bodyAndKeywords.getBody(), null, actionData.getOriginalEventTimestamp(), actionData.getParams());
  }
  
  private <T> BodyAndKeywords preProcessBody(ActionData<T> actionData) {
      String serialized = null;
      List<String> keywords = null;
      if (actionData.getDetails() != null) {
          serialized = bodySerializer.serialize(actionData.getDetails());
          if (encryptingKeywordExtractor != null) {
              keywords = encryptingKeywordExtractor.extract(actionData.getDetails().toString());
          }

      } else if (actionData.getDiffDetails() != null) {
          serialized = bodySerializer.serialize(actionData.getDiffDetails());
          if (encryptingKeywordExtractor != null) {
              keywords = encryptingKeywordExtractor.extract(actionData.getDiffDetails().toString());
          }

      }

      // encrypting with per-action/per-user key. Note that if the serializer is
      // an encrypting one, we are doing double encryption
      // keywords are not encrypted twice
      if (actionData.getEncryptionKey() != null) {
          try {
              serialized = base64Encode(encrypt(serialized, actionData.getEncryptionKey(), true));
          } catch (Exception e) {
              throw new RuntimeException("Failed to perform symmetric encryption", e);
          }
      }
      return new BodyAndKeywords(serialized, keywords);
  }
}
