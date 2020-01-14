# PartnersApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrganization**](PartnersApi.md#cancelOrganization) | **DELETE** /api/partner/organizations/cancel | Cancels organization by Id and deletes all users
[**fetchAllOrganizations**](PartnersApi.md#fetchAllOrganizations) | **GET** /api/partner/organizations | Fetch all organizations
[**getApiCredentials**](PartnersApi.md#getApiCredentials) | **GET** /api/partner/organizations/apiCredentials | API credentials per organization from organizations owned by partner
[**registerUser**](PartnersApi.md#registerUser) | **POST** /api/partner/user/register | Register a user


<a name="cancelOrganization"></a>
# **cancelOrganization**
> cancelOrganization(organizationId)

Cancels organization by Id and deletes all users

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.PartnersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PartnersApi apiInstance = new PartnersApi();
UUID organizationId = new UUID(); // UUID | organizationId
try {
    apiInstance.cancelOrganization(organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnersApi#cancelOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | [**UUID**](.md)| organizationId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="fetchAllOrganizations"></a>
# **fetchAllOrganizations**
> List&lt;UUID&gt; fetchAllOrganizations()

Fetch all organizations

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.PartnersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PartnersApi apiInstance = new PartnersApi();
try {
    List<UUID> result = apiInstance.fetchAllOrganizations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnersApi#fetchAllOrganizations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getApiCredentials"></a>
# **getApiCredentials**
> Map&lt;String, List&lt;APICredentialsOrganization&gt;&gt; getApiCredentials()

API credentials per organization from organizations owned by partner

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.PartnersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PartnersApi apiInstance = new PartnersApi();
try {
    Map<String, List<APICredentialsOrganization>> result = apiInstance.getApiCredentials();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnersApi#getApiCredentials");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, List&lt;APICredentialsOrganization&gt;&gt;**](List.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="registerUser"></a>
# **registerUser**
> RegistrationResponse registerUser(request)

Register a user

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.PartnersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PartnersApi apiInstance = new PartnersApi();
UserRegistrationRequest request = new UserRegistrationRequest(); // UserRegistrationRequest | request
try {
    RegistrationResponse result = apiInstance.registerUser(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnersApi#registerUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UserRegistrationRequest**](UserRegistrationRequest.md)| request |

### Return type

[**RegistrationResponse**](RegistrationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

