package com.logsentinel.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.core.GenericType;

import org.apache.commons.lang3.StringUtils;

import com.logsentinel.ApiClient;
import com.logsentinel.ApiException;
import com.logsentinel.ApiResponse;
import com.logsentinel.BodySerializer;
import com.logsentinel.BodySigner;
import com.logsentinel.Configuration;
import com.logsentinel.EncryptingKeywordExtractor;
import com.logsentinel.Pair;
import com.logsentinel.client.BodyAndKeywords;
import com.logsentinel.model.ActionData;
import com.logsentinel.model.ActionData.EntryTypeEnum;
import com.logsentinel.model.ActorData;
import com.logsentinel.model.AuditLogEntry;
import com.logsentinel.model.BatchLogRequestEntry;
import com.logsentinel.model.LogResponse;

import static com.logsentinel.util.EncryptUtil.base64Encode;
import static com.logsentinel.util.EncryptUtil.encrypt;

import java.nio.charset.StandardCharsets;

public class LoggingApi {
  private ApiClient apiClient;

  private BodySerializer bodySerializer;
  private BodySigner bodySigner; 
  private EncryptingKeywordExtractor encryptingKeywordExtractor;
  
  public LoggingApi() {
    this(Configuration.getDefaultApiClient(), null, null, null);
  }

  public LoggingApi(ApiClient apiClient, BodySerializer bodySerializer, BodySigner bodySigner, 
          EncryptingKeywordExtractor encryptingKeywordExtractor) {
    this.apiClient = apiClient;
    this.bodySerializer = bodySerializer;
    this.bodySigner = bodySigner;
    this.encryptingKeywordExtractor = encryptingKeywordExtractor;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get entry by id
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return AuditLogEntry
   * @throws ApiException if fails to make API call
   */
  public AuditLogEntry getEntryById(UUID applicationId, String entryId) throws ApiException {
    return getEntryByIdWithHttpInfo(applicationId, entryId).getData();
      }

  /**
   * Get entry by id
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return ApiResponse&lt;AuditLogEntry&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AuditLogEntry> getEntryByIdWithHttpInfo(UUID applicationId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling getEntryById");
    }
    
    // create path and map variables
    String localVarPath = "/api/getEntryById";

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
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<AuditLogEntry> localVarReturnType = new GenericType<AuditLogEntry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getHashByEntryId
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse getHashByEntryId(UUID applicationId, String entryId) throws ApiException {
    return getHashByEntryIdWithHttpInfo(applicationId, entryId).getData();
      }

  /**
   * getHashByEntryId
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> getHashByEntryIdWithHttpInfo(UUID applicationId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling getHashByEntryId");
    }
    
    // create path and map variables
    String localVarPath = "/api/getHashByEntryId";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an event by a given actor
   * Log an event by specifying actor and action, as well as the request body. There are no limitations to the structure of the request body.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param logEntryType Log-Entry-Type (optional, default to AUDIT_LOG)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param logLevel logLevel (optional)
   * @param originalEventTimestamp originalEventTimestamp (optional)
   * @param process process (optional)
   * @param params params (optional)
   * @param tags tags (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse log(UUID applicationId, String action, String actorId, String logEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String gdprCorrelationKey, String logLevel, Long originalEventTimestamp, String process, Map<String, String> params, List<String> tags) throws ApiException {
    return logWithHttpInfo(applicationId, action, actorId, logEntryType, signature, actorDepartment, actorDisplayName, actorRoles, binaryContent, details, directExternalPush, encryptedKeywords, gdprCorrelationKey, logLevel, originalEventTimestamp, process, params, tags).getData();
      }

  /**
   * Log an event by a given actor
   * Log an event by specifying actor and action, as well as the request body. There are no limitations to the structure of the request body.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param logEntryType Log-Entry-Type (optional, default to AUDIT_LOG)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param logLevel logLevel (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @param process process (optional)
   * @param params params (optional)
   * @param tags tags (optional)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logWithHttpInfo(UUID applicationId, String action, String actorId, String logEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String gdprCorrelationKey, String logLevel, Long originalEventTimestamp, String process, Map<String, String> params, List<String> tags) throws ApiException {
    Object localVarPostBody = details;
    
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling log");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling log");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/{actorId}/{action}"
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()))
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gdprCorrelationKey", gdprCorrelationKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logLevel", logLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originalEventTimestamp", originalEventTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "process", process));
    
    if (params != null && !params.isEmpty()) {
        params.forEach((k, v) -> localVarQueryParams.add(new Pair(k, v)));
    }
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (logEntryType != null)
      localVarHeaderParams.put("Log-Entry-Type", apiClient.parameterToString(logEntryType));
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

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an authentication event with the option to pass actor public key and signature
   * Log an authentication action (e.g. login, signup, logout, auto-login).
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param authAction Specific action related to user authentication (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param signedLoginChallenge Signed-Login-Challenge (optional)
   * @param userPublicKey User-Public-Key (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @param process process (optional)
   * @param params params (optional)
   * @param tags tags (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logAuthAction(UUID applicationId, String actorId, String authAction, String signature, String signedLoginChallenge, String userPublicKey, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String gdprCorrelationKey, Long originalEventTimestamp, String process, Map<String, String> params, List<String> tags) throws ApiException {
    return logAuthActionWithHttpInfo(applicationId, actorId, authAction, signature, signedLoginChallenge, userPublicKey, actorDepartment, actorDisplayName, actorRoles, binaryContent, details, directExternalPush, encryptedKeywords, gdprCorrelationKey, originalEventTimestamp, process, params, tags).getData();
      }

  /**
   * Log an authentication event with the option to pass actor public key and signature
   * Log an authentication action (e.g. login, signup, logout, auto-login).
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param authAction Specific action related to user authentication (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param signedLoginChallenge Signed-Login-Challenge (optional)
   * @param userPublicKey User-Public-Key (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @param process process (optional)
   * @param params params (optional)
   * @param tags tags (optional)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logAuthActionWithHttpInfo(UUID applicationId, String actorId, String authAction, String signature, String signedLoginChallenge, String userPublicKey, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String gdprCorrelationKey, Long originalEventTimestamp, String process, Map<String, String> params, List<String> tags) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling logAuthAction");
    }
    
    // verify the required parameter 'authAction' is set
    if (authAction == null) {
      throw new ApiException(400, "Missing the required parameter 'authAction' when calling logAuthAction");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/{actorId}/auth/{authAction}"
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()))
      .replaceAll("\\{" + "authAction" + "\\}", apiClient.escapeString(authAction.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gdprCorrelationKey", gdprCorrelationKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originalEventTimestamp", originalEventTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "process", process));
    if (params != null && !params.isEmpty()) {
        params.forEach((k, v) -> localVarQueryParams.add(new Pair(k, v)));
    }
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));
if (signedLoginChallenge != null)
      localVarHeaderParams.put("Signed-Login-Challenge", apiClient.parameterToString(signedLoginChallenge));
if (userPublicKey != null)
      localVarHeaderParams.put("User-Public-Key", apiClient.parameterToString(userPublicKey));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log multiple events at the same time. This should rarely be used, but allows background processes to push multiple events at the same time
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param requestData A list of log requests (required)
   * @param <T> type of batch entry body
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public <T> LogResponse logBatch(UUID applicationId, List<BatchLogRequestEntry<T>> requestData) throws ApiException {
    return logBatchWithHttpInfo(applicationId, requestData).getData();
      }
  
  /**
   * Log multiple events at the same time. This should rarely be used, but allows background processes to push multiple events at the same time
   * 
   * @param requestData A list of log requests (required)
   * @param <T> type of batch entry body
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public <T> LogResponse logBatch(List<BatchLogRequestEntry<T>> requestData) throws ApiException {
    return logBatchWithHttpInfo(null, requestData).getData();
      }

  /**
   * Log multiple events at the same time. This should rarely be used, but allows background processes to push multiple events at the same time
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param requestData A list of log requests (required)
   * @param <T> type of batch entry body
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public <T> ApiResponse<LogResponse> logBatchWithHttpInfo(UUID applicationId, List<BatchLogRequestEntry<T>> requestData) throws ApiException {
    Object localVarPostBody = requestData;
    
    // verify the required parameter 'requestData' is set
    if (requestData == null) {
      throw new ApiException(400, "Missing the required parameter 'requestData' when calling logBatch");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/batch";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    requestData.forEach(e -> {
      if (e.getAdditionalParams() == null) {
          e.setAdditionalParams(new HashMap<>());
      }
      if (e.getParams() == null) {
          e.setParams(new HashMap<>());
      }
      e.getParams().putAll(e.getAdditionalParams());
      
      if (e.getActionData() != null && e.getActionData().getParams() != null) {
          e.getActionData().getParams().forEach((k, v) -> e.getParams().put(k, v));
      }
    });
    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action
   * Log a document action. If working with documents, use this to store all events relating to a particular document - creation, modification, deletion, retrieval. You can store the hash of the document in the request body to ensure its integrity.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param details Any details in any format about the event that you want to store in the log (required)
   * @param documentId documentId (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional, default to true)
   * @param directExternalPush directExternalPush (optional)
   * @param documentName documentName (optional)
   * @param documentType documentType (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @param process process (optional)
   * @param params params (optional)
   * @param tags tags (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logDocument(UUID applicationId, String action, String actorId, byte[] details, String documentId, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, List<String> directExternalPush, String documentName, String documentType, List<String> encryptedKeywords, String gdprCorrelationKey, Long originalEventTimestamp, String process, Map<String, String> params, List<String> tags) throws ApiException {
    return logDocumentWithHttpInfo(applicationId, action, actorId, details, documentId, signature, actorDepartment, actorDisplayName, actorRoles, binaryContent, directExternalPush, documentName, documentType, encryptedKeywords, gdprCorrelationKey, originalEventTimestamp, process, params, tags).getData();
      }

  /**
   * Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action
   * Log a document action. If working with documents, use this to store all events relating to a particular document - creation, modification, deletion, retrieval. You can store the hash of the document in the request body to ensure its integrity.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param details Any details in any format about the event that you want to store in the log (required)
   * @param documentId documentId (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional, default to true)
   * @param directExternalPush directExternalPush (optional)
   * @param documentName documentName (optional)
   * @param documentType documentType (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @param process process (optional)
   * @param params params (optional)
   * @param tags tags (optional)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logDocumentWithHttpInfo(UUID applicationId, String action, String actorId, byte[] details, String documentId, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, List<String> directExternalPush, String documentName, String documentType, List<String> encryptedKeywords, String gdprCorrelationKey, Long originalEventTimestamp, String process, Map<String, String> params, List<String> tags) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling logDocument");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling logDocument");
    }
    
    // verify the required parameter 'details' is set
    if (details == null) {
      throw new ApiException(400, "Missing the required parameter 'details' when calling logDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling logDocument");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/document/{actorId}/{action}/{documentId}"
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()))
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentName", documentName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentType", documentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gdprCorrelationKey", gdprCorrelationKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originalEventTimestamp", originalEventTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "process", process));
    if (params != null && !params.isEmpty()) {
        params.forEach((k, v) -> localVarQueryParams.add(new Pair(k, v)));
    }
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
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

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action
   * Log an even by specifying all relevant details - actor, action and the entity about which the action is, as well as the request body. There are no limitations to the structure of the request body.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param entityId When the event is about a particular model entity, you can set its ID here (required)
   * @param entityType When the event is about a particular model entity, you can set its type here (required)
   * @param logEntryType Log-Entry-Type (optional, default to AUDIT_LOG)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param logLevel logLevel (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @param process process (optional)
   * @param params params (optional)
   * @param tags tags (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logFull(UUID applicationId, String action, String actorId, String entityId, String entityType, String logEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String gdprCorrelationKey, String logLevel, Long originalEventTimestamp, String process, Map<String, String> params, List<String> tags) throws ApiException {
    return logFullWithHttpInfo(applicationId, action, actorId, entityId, entityType, logEntryType, signature, actorDepartment, actorDisplayName, actorRoles, binaryContent, details, directExternalPush, encryptedKeywords, gdprCorrelationKey, logLevel, originalEventTimestamp, process, params, tags).getData();
      }

  /**
   * Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action
   * Log an even by specifying all relevant details - actor, action and the entity about which the action is, as well as the request body. There are no limitations to the structure of the request body.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param entityId When the event is about a particular model entity, you can set its ID here (required)
   * @param entityType When the event is about a particular model entity, you can set its type here (required)
   * @param logEntryType Log-Entry-Type (optional, default to AUDIT_LOG)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param logLevel logLevel (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @param process process (optional)
   * @param params params (optional)
   * @param tags tags (optional)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logFullWithHttpInfo(UUID applicationId, String action, String actorId, String entityId, String entityType, String logEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String gdprCorrelationKey, String logLevel, Long originalEventTimestamp, String process, Map<String, String> params, List<String> tags) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling logFull");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling logFull");
    }
    
    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      throw new ApiException(400, "Missing the required parameter 'entityType' when calling logFull");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/{actorId}/{action}/{entityType}/{entityId}"
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gdprCorrelationKey", gdprCorrelationKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logLevel", logLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originalEventTimestamp", originalEventTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "process", process));
    if (params != null && !params.isEmpty()) {
        params.forEach((k, v) -> localVarQueryParams.add(new Pair(k, v)));
    }
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (logEntryType != null)
      localVarHeaderParams.put("Log-Entry-Type", apiClient.parameterToString(logEntryType));
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

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an event by providing just the body without any additional metadata. The body can be fully encrypted or can represent just the hash of the data/document
   * Log an event by just specifying the request body. There are no limitations to the structure of the request body.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param logEntryType Log-Entry-Type (optional, default to AUDIT_LOG)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param logLevel logLevel (optional)
   * @param params params (optional)
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @param tags tags (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logSimple(UUID applicationId, String logEntryType, String signature, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String logLevel, Long originalEventTimestamp, Map<String, String> params, List<String> tags) throws ApiException {
    return logSimpleWithHttpInfo(applicationId, logEntryType, signature, binaryContent, details, directExternalPush, encryptedKeywords, logLevel, originalEventTimestamp, params, tags).getData();
      }

  /**
   * Log an event by providing just the body without any additional metadata. The body can be fully encrypted or can represent just the hash of the data/document
   * Log an event by just specifying the request body. There are no limitations to the structure of the request body.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param logEntryType Log-Entry-Type (optional, default to AUDIT_LOG)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param logLevel logLevel (optional)
   * @param params params (optional) 
   * @param originalEventTimestamp The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  (optional)
   * @param tags tags (optional)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logSimpleWithHttpInfo(UUID applicationId, String logEntryType, String signature, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String logLevel, Long originalEventTimestamp, Map<String, String> params, List<String> tags) throws ApiException {
    Object localVarPostBody = details;
    
    // create path and map variables
    String localVarPath = "/api/log/simple";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logLevel", logLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "originalEventTimestamp", originalEventTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

    if (params != null && !params.isEmpty()) {
        params.forEach((k, v) -> localVarQueryParams.add(new Pair(k, v)));
    }
    
    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (logEntryType != null)
      localVarHeaderParams.put("Log-Entry-Type", apiClient.parameterToString(logEntryType));
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

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  
  
  public <T> LogResponse log(ActorData actorData, ActionData<T> actionData) {
      return log(actorData, actionData, null);
  }
  
  public <T> LogResponse log(ActorData actorData, ActionData<T> actionData, UUID applicationId) {
      BodyAndKeywords bodyAndKeywords = preProcessBody(actionData);
      String signature = null;
      if (bodySigner != null) {
          signature = bodySigner.computeSignature(bodyAndKeywords.getBody());
      }
      byte[] body = null;
      if (bodyAndKeywords.getBody() != null) {
          body = bodyAndKeywords.getBody().getBytes(StandardCharsets.UTF_8);
      }
      
      String entryType = EntryTypeEnum.BUSINESS_LOGIC_ENTRY.getValue();
      if (actionData.getEntryType() != null) {
          entryType = actionData.getEntryType().getValue();
      }
      
      if (StringUtils.isNotBlank(actionData.getEntityType())) {
          return logFull(applicationId, actionData.getAction(), actorData.getActorId(), actionData.getEntityId(), actionData.getEntityType(), 
              entryType, signature, actorData.getDepartment(), 
              actorData.getActorDisplayName(), actorData.getActorRoles(), actionData.isBinaryContent(), 
              body, null, bodyAndKeywords.getKeywords(), null, null, actionData.getOriginalEventTimestamp(), null,
              actionData.getParams(), actionData.getTags());
      } else if (StringUtils.isNotBlank(actionData.getAction()) && StringUtils.isNotBlank(actorData.getActorId())) {
          return log(applicationId, actionData.getAction(), actorData.getActorId(), 
                  entryType, signature, actorData.getDepartment(), 
                  actorData.getActorDisplayName(), actorData.getActorRoles(), actionData.isBinaryContent(), 
                  body, null, bodyAndKeywords.getKeywords(), null, null, actionData.getOriginalEventTimestamp(), null, 
                  actionData.getParams(), actionData.getTags());
      } else {
          return logSimple(applicationId, entryType, signature, actionData.isBinaryContent(), 
                  body, null, bodyAndKeywords.getKeywords(), null, actionData.getOriginalEventTimestamp(), 
                  actionData.getParams(), actionData.getTags());
      }
  }
  
  private <T> BodyAndKeywords preProcessBody(ActionData<T> actionData) {
      String serialized = null;
      List<String> keywords = null;
      if (actionData.getDetails() != null) {
          serialized = bodySerializer.serialize(actionData.getDetails());
          if (encryptingKeywordExtractor != null) {
              keywords = encryptingKeywordExtractor.extract(actionData.getDetails().toString());
          }

      } else {
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
