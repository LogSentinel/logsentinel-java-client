# FlowLoggingApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logFlow**](FlowLoggingApi.md#logFlow) | **POST** /api/flow/log | Log an event by a given actor


<a name="logFlow"></a>
# **logFlow**
> LogResponse logFlow(applicationId, details)

Log an event by a given actor

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.FlowLoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FlowLoggingApi apiInstance = new FlowLoggingApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String details = "details_example"; // String | Any details in any format about the event that you want to store in the log
try {
    LogResponse result = apiInstance.logFlow(applicationId, details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowLoggingApi#logFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **details** | **String**| Any details in any format about the event that you want to store in the log |

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

