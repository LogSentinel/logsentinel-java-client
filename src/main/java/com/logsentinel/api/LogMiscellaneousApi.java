package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.KubernetesAuditLogRequest;
import com.logsentinel.model.LogResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogMiscellaneousApi {
  private ApiClient apiClient;

  public LogMiscellaneousApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogMiscellaneousApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Consume kubernetes audit log
   * 
   * @param applicationId applicationId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void logKubernetesEvent(UUID applicationId, KubernetesAuditLogRequest request) throws ApiException {

    logKubernetesEventWithHttpInfo(applicationId, request);
  }

  /**
   * Consume kubernetes audit log
   * 
   * @param applicationId applicationId (required)
   * @param request request (required)
   * @return api response
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> logKubernetesEventWithHttpInfo(UUID applicationId, KubernetesAuditLogRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logKubernetesEvent");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling logKubernetesEvent");
    }
    
    // create path and map variables
    String localVarPath = "/api/k8s/log";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "applicationId", applicationId));

    
    
    final String[] localVarAccepts = {
      "application/json"
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
   * Logs a Provenance document
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param provenanceDocument Provenance model document, representing event that serves security log purposes. See https://www.w3.org/TR/2013/NOTE-prov-primer-20130430/ (required)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logProvenance(String applicationId, String provenanceDocument) throws ApiException {
    return logProvenanceWithHttpInfo(applicationId, provenanceDocument).getData();
      }

  /**
   * Logs a Provenance document
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param provenanceDocument Provenance model document, representing event that serves security log purposes. See https://www.w3.org/TR/2013/NOTE-prov-primer-20130430/ (required)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logProvenanceWithHttpInfo(String applicationId, String provenanceDocument) throws ApiException {
    Object localVarPostBody = provenanceDocument;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logProvenance");
    }
    
    // verify the required parameter 'provenanceDocument' is set
    if (provenanceDocument == null) {
      throw new ApiException(400, "Missing the required parameter 'provenanceDocument' when calling logProvenance");
    }
    
    // create path and map variables
    String localVarPath = "/api/provenance/log";

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

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
