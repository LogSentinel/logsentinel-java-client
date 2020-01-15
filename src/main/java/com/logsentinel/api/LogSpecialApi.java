package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.LogResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogSpecialApi {
  private ApiClient apiClient;

  public LogSpecialApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogSpecialApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
