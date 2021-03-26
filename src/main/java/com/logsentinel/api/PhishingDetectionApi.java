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


public class PhishingDetectionApi {
  private ApiClient apiClient;

  public PhishingDetectionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PhishingDetectionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Detects phishing attempts
   * 
   * @param attachments attachments (required)
   * @param body body (required)
   * @param from from (required)
   * @param subject subject (required)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer detectAndReport(List<String> attachments, String body, String from, String subject) throws ApiException {
    return detectAndReportWithHttpInfo(attachments, body, from, subject).getData();
      }

  /**
   * Detects phishing attempts
   * 
   * @param attachments attachments (required)
   * @param body body (required)
   * @param from from (required)
   * @param subject subject (required)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Integer> detectAndReportWithHttpInfo(List<String> attachments, String body, String from, String subject) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'attachments' is set
    if (attachments == null) {
      throw new ApiException(400, "Missing the required parameter 'attachments' when calling detectAndReport");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling detectAndReport");
    }
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling detectAndReport");
    }
    
    // verify the required parameter 'subject' is set
    if (subject == null) {
      throw new ApiException(400, "Missing the required parameter 'subject' when calling detectAndReport");
    }
    
    // create path and map variables
    String localVarPath = "/api/phishing/detect";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attachments", attachments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject", subject));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "text/plain"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
