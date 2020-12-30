# OrganizationUsersApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeRole**](OrganizationUsersApi.md#changeRole) | **POST** /api/users/userId/{userId}/changeRole/{role} | Changes user role
[**create**](OrganizationUsersApi.md#create) | **PUT** /api/users/create | Creates new user in the organization
[**forgetUser**](OrganizationUsersApi.md#forgetUser) | **POST** /api/users/forget/{userId} | Forgets user profile
[**getUserDetailsByEmail**](OrganizationUsersApi.md#getUserDetailsByEmail) | **GET** /api/users/email/{email} | Gets user details by email
[**getUserDetailsById**](OrganizationUsersApi.md#getUserDetailsById) | **GET** /api/users/userId/{userId} | Gets user details by user id
[**update**](OrganizationUsersApi.md#update) | **POST** /api/users/update | Updates user profile


<a name="changeRole"></a>
# **changeRole**
> UserDetails changeRole(role, userId)

Changes user role

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.OrganizationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OrganizationUsersApi apiInstance = new OrganizationUsersApi();
String role = "role_example"; // String | role
UUID userId = new UUID(); // UUID | userId
try {
    UserDetails result = apiInstance.changeRole(role, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationUsersApi#changeRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| role | [enum: ADMIN, AUDITOR, SECURITY_ANALYST, SYSADMIN, DEVELOPER, MANAGER, IT, BUSINESS_ANALYST, PUBLIC_USER]
 **userId** | [**UUID**](.md)| userId |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="create"></a>
# **create**
> UserDetails create(request)

Creates new user in the organization

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.OrganizationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OrganizationUsersApi apiInstance = new OrganizationUsersApi();
UserRegistrationRequest request = new UserRegistrationRequest(); // UserRegistrationRequest | request
try {
    UserDetails result = apiInstance.create(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationUsersApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UserRegistrationRequest**](UserRegistrationRequest.md)| request |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="forgetUser"></a>
# **forgetUser**
> UserDetails forgetUser(userId)

Forgets user profile

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.OrganizationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OrganizationUsersApi apiInstance = new OrganizationUsersApi();
UUID userId = new UUID(); // UUID | userId
try {
    UserDetails result = apiInstance.forgetUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationUsersApi#forgetUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| userId |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="getUserDetailsByEmail"></a>
# **getUserDetailsByEmail**
> UserDetails getUserDetailsByEmail(email)

Gets user details by email

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.OrganizationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OrganizationUsersApi apiInstance = new OrganizationUsersApi();
String email = "email_example"; // String | email
try {
    UserDetails result = apiInstance.getUserDetailsByEmail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationUsersApi#getUserDetailsByEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| email |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="getUserDetailsById"></a>
# **getUserDetailsById**
> UserDetails getUserDetailsById(userId)

Gets user details by user id

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.OrganizationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OrganizationUsersApi apiInstance = new OrganizationUsersApi();
UUID userId = new UUID(); // UUID | userId
try {
    UserDetails result = apiInstance.getUserDetailsById(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationUsersApi#getUserDetailsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**UUID**](.md)| userId |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="update"></a>
# **update**
> UserDetails update(request)

Updates user profile

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.OrganizationUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

OrganizationUsersApi apiInstance = new OrganizationUsersApi();
UpdateUserRequest request = new UpdateUserRequest(); // UpdateUserRequest | request
try {
    UserDetails result = apiInstance.update(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationUsersApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateUserRequest**](UpdateUserRequest.md)| request |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

