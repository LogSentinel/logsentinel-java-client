# CollectorApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendStatistics**](CollectorApi.md#sendStatistics) | **POST** /api/collector/sendStatistics | Invoked during Collector&#39;s operation. Publish statistics for (some of) collector&#39;s Agent(s)
[**sysInit**](CollectorApi.md#sysInit) | **POST** /api/collector/sysInit | Invoked during Collector instance startup. Publish all configured Agent(s)together with their respective dataSourceId(s)
[**updateStatus**](CollectorApi.md#updateStatus) | **POST** /api/collector/updateStatus | Invoked during Collector&#39;s operation. Publish current status of (some of) collector&#39;s Agent(s)(no dataSourceIds included)


<a name="sendStatistics"></a>
# **sendStatistics**
> sendStatistics(collectorId)

Invoked during Collector&#39;s operation. Publish statistics for (some of) collector&#39;s Agent(s)

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.CollectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CollectorApi apiInstance = new CollectorApi();
UUID collectorId = new UUID(); // UUID | collectorId
try {
    apiInstance.sendStatistics(collectorId);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectorApi#sendStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectorId** | [**UUID**](.md)| collectorId | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="sysInit"></a>
# **sysInit**
> sysInit(collectorId, info0AdditionalMessage, info0ConnectorId, info0ConnectorName, info0DataSourceIds, info0NewlyCreated, info0Status)

Invoked during Collector instance startup. Publish all configured Agent(s)together with their respective dataSourceId(s)

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.CollectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CollectorApi apiInstance = new CollectorApi();
UUID collectorId = new UUID(); // UUID | collectorId
String info0AdditionalMessage = "info0AdditionalMessage_example"; // String | 
String info0ConnectorId = "info0ConnectorId_example"; // String | 
String info0ConnectorName = "info0ConnectorName_example"; // String | 
List<String> info0DataSourceIds = Arrays.asList("info0DataSourceIds_example"); // List<String> | 
Boolean info0NewlyCreated = true; // Boolean | 
String info0Status = "info0Status_example"; // String | 
try {
    apiInstance.sysInit(collectorId, info0AdditionalMessage, info0ConnectorId, info0ConnectorName, info0DataSourceIds, info0NewlyCreated, info0Status);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectorApi#sysInit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectorId** | [**UUID**](.md)| collectorId | [optional]
 **info0AdditionalMessage** | **String**|  | [optional]
 **info0ConnectorId** | **String**|  | [optional]
 **info0ConnectorName** | **String**|  | [optional]
 **info0DataSourceIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **info0NewlyCreated** | **Boolean**|  | [optional]
 **info0Status** | **String**|  | [optional] [enum: SYS_INIT, STARTUP, UP, SOME_ISSUES, SEVERE_ERROR, SHUTDOWN, DOWN]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateStatus"></a>
# **updateStatus**
> updateStatus(collectorId, info0AdditionalMessage, info0ConnectorId, info0ConnectorName, info0DataSourceIds, info0NewlyCreated, info0Status)

Invoked during Collector&#39;s operation. Publish current status of (some of) collector&#39;s Agent(s)(no dataSourceIds included)

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.CollectorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CollectorApi apiInstance = new CollectorApi();
UUID collectorId = new UUID(); // UUID | collectorId
String info0AdditionalMessage = "info0AdditionalMessage_example"; // String | 
String info0ConnectorId = "info0ConnectorId_example"; // String | 
String info0ConnectorName = "info0ConnectorName_example"; // String | 
List<String> info0DataSourceIds = Arrays.asList("info0DataSourceIds_example"); // List<String> | 
Boolean info0NewlyCreated = true; // Boolean | 
String info0Status = "info0Status_example"; // String | 
try {
    apiInstance.updateStatus(collectorId, info0AdditionalMessage, info0ConnectorId, info0ConnectorName, info0DataSourceIds, info0NewlyCreated, info0Status);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectorApi#updateStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectorId** | [**UUID**](.md)| collectorId | [optional]
 **info0AdditionalMessage** | **String**|  | [optional]
 **info0ConnectorId** | **String**|  | [optional]
 **info0ConnectorName** | **String**|  | [optional]
 **info0DataSourceIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **info0NewlyCreated** | **Boolean**|  | [optional]
 **info0Status** | **String**|  | [optional] [enum: SYS_INIT, STARTUP, UP, SOME_ISSUES, SEVERE_ERROR, SHUTDOWN, DOWN]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

