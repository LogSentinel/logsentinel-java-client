package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import java.util.UUID;
import com.logsentinel.model.UpdateUserRequest;
import com.logsentinel.model.UserDetails;
import com.logsentinel.model.UserRegistrationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OrganizationUsersApi {
  private ApiClient apiClient;

  public OrganizationUsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganizationUsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Changes user role
   * 
   * @param role role (required)
   * @param userId userId (required)
   * @return UserDetails
   * @throws ApiException if fails to make API call
   */
  public UserDetails changeRole(String role, UUID userId) throws ApiException {
    return changeRoleWithHttpInfo(role, userId).getData();
      }

  /**
   * Changes user role
   * 
   * @param role role (required)
   * @param userId userId (required)
   * @return ApiResponse&lt;UserDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserDetails> changeRoleWithHttpInfo(String role, UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'role' is set
    if (role == null) {
      throw new ApiException(400, "Missing the required parameter 'role' when calling changeRole");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling changeRole");
    }
    
    // create path and map variables
    String localVarPath = "/api/users/userId/{userId}/changeRole/{role}"
      .replaceAll("\\{" + "role" + "\\}", apiClient.escapeString(role.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserDetails> localVarReturnType = new GenericType<UserDetails>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates new user in the organization
   * 
   * @param request request (required)
   * @return UserDetails
   * @throws ApiException if fails to make API call
   */
  public UserDetails create(UserRegistrationRequest request) throws ApiException {
    return createWithHttpInfo(request).getData();
      }

  /**
   * Creates new user in the organization
   * 
   * @param request request (required)
   * @return ApiResponse&lt;UserDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserDetails> createWithHttpInfo(UserRegistrationRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling create");
    }
    
    // create path and map variables
    String localVarPath = "/api/users/create";

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

    GenericType<UserDetails> localVarReturnType = new GenericType<UserDetails>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Forgets user profile
   * 
   * @param userId userId (required)
   * @return UserDetails
   * @throws ApiException if fails to make API call
   */
  public UserDetails forgetUser(UUID userId) throws ApiException {
    return forgetUserWithHttpInfo(userId).getData();
      }

  /**
   * Forgets user profile
   * 
   * @param userId userId (required)
   * @return ApiResponse&lt;UserDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserDetails> forgetUserWithHttpInfo(UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling forgetUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/users/forget/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserDetails> localVarReturnType = new GenericType<UserDetails>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets user details by email
   * 
   * @param email email (required)
   * @return UserDetails
   * @throws ApiException if fails to make API call
   */
  public UserDetails getUserDetailsByEmail(String email) throws ApiException {
    return getUserDetailsByEmailWithHttpInfo(email).getData();
      }

  /**
   * Gets user details by email
   * 
   * @param email email (required)
   * @return ApiResponse&lt;UserDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserDetails> getUserDetailsByEmailWithHttpInfo(String email) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling getUserDetailsByEmail");
    }
    
    // create path and map variables
    String localVarPath = "/api/users/email/{email}"
      .replaceAll("\\{" + "email" + "\\}", apiClient.escapeString(email.toString()));

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

    GenericType<UserDetails> localVarReturnType = new GenericType<UserDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets user details by user id
   * 
   * @param userId userId (required)
   * @return UserDetails
   * @throws ApiException if fails to make API call
   */
  public UserDetails getUserDetailsById(UUID userId) throws ApiException {
    return getUserDetailsByIdWithHttpInfo(userId).getData();
      }

  /**
   * Gets user details by user id
   * 
   * @param userId userId (required)
   * @return ApiResponse&lt;UserDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserDetails> getUserDetailsByIdWithHttpInfo(UUID userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserDetailsById");
    }
    
    // create path and map variables
    String localVarPath = "/api/users/userId/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserDetails> localVarReturnType = new GenericType<UserDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates user profile
   * 
   * @param request request (required)
   * @return UserDetails
   * @throws ApiException if fails to make API call
   */
  public UserDetails update(UpdateUserRequest request) throws ApiException {
    return updateWithHttpInfo(request).getData();
      }

  /**
   * Updates user profile
   * 
   * @param request request (required)
   * @return ApiResponse&lt;UserDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserDetails> updateWithHttpInfo(UpdateUserRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling update");
    }
    
    // create path and map variables
    String localVarPath = "/api/users/update";

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

    GenericType<UserDetails> localVarReturnType = new GenericType<UserDetails>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
