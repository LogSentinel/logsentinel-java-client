package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.APICredentialsOrganization;
import com.logsentinel.model.OrganizationDto;
import com.logsentinel.model.RegistrationResponse;
import java.util.UUID;
import com.logsentinel.model.UserRegistrationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
   * Get the organization for the supplied email
   * 
   * @param email email (required)
   * @return OrganizationDto
   * @throws ApiException if fails to make API call
   */
  public OrganizationDto getOrganizationByUserEmail(String email) throws ApiException {
    return getOrganizationByUserEmailWithHttpInfo(email).getData();
      }

  /**
   * Get the organization for the supplied email
   * 
   * @param email email (required)
   * @return ApiResponse&lt;OrganizationDto&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationDto> getOrganizationByUserEmailWithHttpInfo(String email) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling getOrganizationByUserEmail");
    }
    
    // create path and map variables
    String localVarPath = "/api/partner/organizationByUserEmail";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<OrganizationDto> localVarReturnType = new GenericType<OrganizationDto>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user id by user email
   * 
   * @param email email (required)
   * @return UUID
   * @throws ApiException if fails to make API call
   */
  public UUID getUserIdByEmail(String email) throws ApiException {
    return getUserIdByEmailWithHttpInfo(email).getData();
      }

  /**
   * Get user id by user email
   * 
   * @param email email (required)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UUID> getUserIdByEmailWithHttpInfo(String email) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling getUserIdByEmail");
    }
    
    // create path and map variables
    String localVarPath = "/api/partner/userIdByEmail";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
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
