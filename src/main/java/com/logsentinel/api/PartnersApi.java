package com.logsentinel.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.core.GenericType;

import com.logsentinel.ApiClient;
import com.logsentinel.ApiException;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;
import com.logsentinel.model.APICredentialsOrganization;
import com.logsentinel.model.RegistrationResponse;
import com.logsentinel.model.UserRegistrationRequest;


public class PartnersApi {
  private ApiClient apiClient;

  public PartnersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PartnersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancels organization by Id and deletes all users
   * 
   * @param organizationId organizationId (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelOrganization(UUID organizationId) throws ApiException {

    cancelOrganizationWithHttpInfo(organizationId);
  }

  /**
   * Cancels organization by Id and deletes all users
   * 
   * @param organizationId organizationId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> cancelOrganizationWithHttpInfo(UUID organizationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling cancelOrganization");
    }
    
    // create path and map variables
    String localVarPath = "/api/partner/organizations/cancel";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Fetch all organizations
   * 
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public List<UUID> fetchAllOrganizations() throws ApiException {
    return fetchAllOrganizationsWithHttpInfo().getData();
      }

  /**
   * Fetch all organizations
   * 
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<UUID>> fetchAllOrganizationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/partner/organizations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * API credentials per organization from organizations owned by partner
   * 
   * @return Map&lt;String, List&lt;APICredentialsOrganization&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<APICredentialsOrganization>> getApiCredentials() throws ApiException {
    return getApiCredentialsWithHttpInfo().getData();
      }

  /**
   * API credentials per organization from organizations owned by partner
   * 
   * @return ApiResponse&lt;Map&lt;String, List&lt;APICredentialsOrganization&gt;&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, List<APICredentialsOrganization>>> getApiCredentialsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/partner/organizations/apiCredentials";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Map<String, List<APICredentialsOrganization>>> localVarReturnType = new GenericType<Map<String, List<APICredentialsOrganization>>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Register a user
   * 
   * @param request request (required)
   * @return RegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public RegistrationResponse registerUser(UserRegistrationRequest request) throws ApiException {
    return registerUserWithHttpInfo(request).getData();
      }

  /**
   * Register a user
   * 
   * @param request request (required)
   * @return ApiResponse&lt;RegistrationResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RegistrationResponse> registerUserWithHttpInfo(UserRegistrationRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling registerUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/partner/user/register";

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

    GenericType<RegistrationResponse> localVarReturnType = new GenericType<RegistrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
