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


public class LeakedCredentialsControllerApi {
  private ApiClient apiClient;

  public LeakedCredentialsControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LeakedCredentialsControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Insert emails
   * 
   * @param emails emails (required)
   * @throws ApiException if fails to make API call
   */
  public void insertEmails(List<String> emails) throws ApiException {

    insertEmailsWithHttpInfo(emails);
  }

  /**
   * Insert emails
   * 
   * @param emails emails (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> insertEmailsWithHttpInfo(List<String> emails) throws ApiException {
    Object localVarPostBody = emails;
    
    // verify the required parameter 'emails' is set
    if (emails == null) {
      throw new ApiException(400, "Missing the required parameter 'emails' when calling insertEmails");
    }
    
    // create path and map variables
    String localVarPath = "/api/leaked-credentials/emails";

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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
