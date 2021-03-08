# AutomatedResponseApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connect**](AutomatedResponseApi.md#connect) | **GET** /api/response/connect | connect


<a name="connect"></a>
# **connect**
> DeferredResultOfAutomatedResponse connect(collectorId)

connect

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AutomatedResponseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AutomatedResponseApi apiInstance = new AutomatedResponseApi();
UUID collectorId = new UUID(); // UUID | collectorId
try {
    DeferredResultOfAutomatedResponse result = apiInstance.connect(collectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomatedResponseApi#connect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectorId** | [**UUID**](.md)| collectorId |

### Return type

[**DeferredResultOfAutomatedResponse**](DeferredResultOfAutomatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

