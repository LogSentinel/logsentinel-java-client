package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.Application;
import java.util.UUID;
import com.logsentinel.model.UpdateApplicationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ApplicationsApi {
  private ApiClient apiClient;

  public ApplicationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplicationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new application
   * 
   * @param application application (required)
   * @return Application
   * @throws ApiException if fails to make API call
   */
  public Application createApplication(UpdateApplicationRequest application) throws ApiException {
    return createApplicationWithHttpInfo(application).getData();
      }

  /**
   * Create a new application
   * 
   * @param application application (required)
   * @return ApiResponse&lt;Application&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Application> createApplicationWithHttpInfo(UpdateApplicationRequest application) throws ApiException {
    Object localVarPostBody = application;
    
    // verify the required parameter 'application' is set
    if (application == null) {
      throw new ApiException(400, "Missing the required parameter 'application' when calling createApplication");
    }
    
    // create path and map variables
    String localVarPath = "/api/application";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Application> localVarReturnType = new GenericType<Application>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an existing application
   * 
   * @param applicationId applicationId (required)
   * @return Application
   * @throws ApiException if fails to make API call
   */
  public Application deleteApplication(UUID applicationId) throws ApiException {
    return deleteApplicationWithHttpInfo(applicationId).getData();
      }

  /**
   * Delete an existing application
   * 
   * @param applicationId applicationId (required)
   * @return ApiResponse&lt;Application&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Application> deleteApplicationWithHttpInfo(UUID applicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling deleteApplication");
    }
    
    // create path and map variables
    String localVarPath = "/api/application";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "applicationId", applicationId));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Application> localVarReturnType = new GenericType<Application>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all applications of an organization
   * 
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public List<UUID> getApplications() throws ApiException {
    return getApplicationsWithHttpInfo().getData();
      }

  /**
   * Get all applications of an organization
   * 
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<UUID>> getApplicationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/application";

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

    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an existing application
   * 
   * @param application application (required)
   * @return Application
   * @throws ApiException if fails to make API call
   */
  public Application updateApplication(UpdateApplicationRequest application) throws ApiException {
    return updateApplicationWithHttpInfo(application).getData();
      }

  /**
   * Update an existing application
   * 
   * @param application application (required)
   * @return ApiResponse&lt;Application&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Application> updateApplicationWithHttpInfo(UpdateApplicationRequest application) throws ApiException {
    Object localVarPostBody = application;
    
    // verify the required parameter 'application' is set
    if (application == null) {
      throw new ApiException(400, "Missing the required parameter 'application' when calling updateApplication");
    }
    
    // create path and map variables
    String localVarPath = "/api/application";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Application> localVarReturnType = new GenericType<Application>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
