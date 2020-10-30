# ApiApplicationRuleMappingApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRulesByApplication**](ApiApplicationRuleMappingApi.md#getRulesByApplication) | **GET** /api/application-rule-mapping | getRulesByApplication


<a name="getRulesByApplication"></a>
# **getRulesByApplication**
> List&lt;UUID&gt; getRulesByApplication(applicationId)

getRulesByApplication

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.ApiApplicationRuleMappingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApiApplicationRuleMappingApi apiInstance = new ApiApplicationRuleMappingApi();
UUID applicationId = new UUID(); // UUID | applicationId
try {
    List<UUID> result = apiInstance.getRulesByApplication(applicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApplicationRuleMappingApi#getRulesByApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)| applicationId |

### Return type

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

