# CollectorApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBlankApplication**](CollectorApi.md#createBlankApplication) | **POST** /api/collector/createApplication | Invoked during Collector&#39;s operation. Creates a new data source if a connector gets data from an unrecognized source
[**sendStatistics**](CollectorApi.md#sendStatistics) | **POST** /api/collector/sendStatistics | Invoked during Collector&#39;s operation. Publish statistics for (some of) collector&#39;s Agent(s)
[**sysInit**](CollectorApi.md#sysInit) | **POST** /api/collector/sysInit | Invoked during Collector instance startup. Publish all configured Agent(s)together with their respective dataSourceId(s)
[**updateStatus**](CollectorApi.md#updateStatus) | **POST** /api/collector/updateStatus | Invoked during Collector&#39;s operation. Publish current status of (some of) collector&#39;s Agent(s)(no dataSourceIds included)


<a name="createBlankApplication"></a>
# **createBlankApplication**
> UUID createBlankApplication(application)

Invoked during Collector&#39;s operation. Creates a new data source if a connector gets data from an unrecognized source

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
ApplicationRequest application = new ApplicationRequest(); // ApplicationRequest | application
try {
    UUID result = apiInstance.createBlankApplication(application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectorApi#createBlankApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**ApplicationRequest**](ApplicationRequest.md)| application |

### Return type

[**UUID**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

<a name="sendStatistics"></a>
# **sendStatistics**
> sendStatistics(metadata)

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
CollectorMetadataDto metadata = new CollectorMetadataDto(); // CollectorMetadataDto | metadata
try {
    apiInstance.sendStatistics(metadata);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectorApi#sendStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadata** | [**CollectorMetadataDto**](CollectorMetadataDto.md)| metadata |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

<a name="sysInit"></a>
# **sysInit**
> Map&lt;String, UUID&gt; sysInit(data)

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
CollectorStatusDto data = new CollectorStatusDto(); // CollectorStatusDto | data
try {
    Map<String, UUID> result = apiInstance.sysInit(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectorApi#sysInit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CollectorStatusDto**](CollectorStatusDto.md)| data |

### Return type

[**Map&lt;String, UUID&gt;**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

<a name="updateStatus"></a>
# **updateStatus**
> Map&lt;String, UUID&gt; updateStatus(data)

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
CollectorStatusDto data = new CollectorStatusDto(); // CollectorStatusDto | data
try {
    Map<String, UUID> result = apiInstance.updateStatus(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectorApi#updateStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CollectorStatusDto**](CollectorStatusDto.md)| data |

### Return type

[**Map&lt;String, UUID&gt;**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

