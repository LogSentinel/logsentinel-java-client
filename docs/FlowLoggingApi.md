# FlowLoggingApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logFlow**](FlowLoggingApi.md#logFlow) | **POST** /api/flow/log | Log a given flow event


<a name="logFlow"></a>
# **logFlow**
> Boolean logFlow(applicationId, flows)

Log a given flow event

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
List<FlowEntry> flows = Arrays.asList(new FlowEntry()); // List<FlowEntry> | flows
try {
    Boolean result = apiInstance.logFlow(applicationId, flows);
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
 **flows** | [**List&lt;FlowEntry&gt;**](FlowEntry.md)| flows |

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

