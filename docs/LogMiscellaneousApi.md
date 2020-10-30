# LogMiscellaneousApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logKubernetesEvent**](LogMiscellaneousApi.md#logKubernetesEvent) | **POST** /api/k8s/log | Consume kubernetes audit log
[**logProvenance**](LogMiscellaneousApi.md#logProvenance) | **POST** /api/provenance/log | Logs a Provenance document


<a name="logKubernetesEvent"></a>
# **logKubernetesEvent**
> logKubernetesEvent(applicationId, request)

Consume kubernetes audit log

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LogMiscellaneousApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LogMiscellaneousApi apiInstance = new LogMiscellaneousApi();
UUID applicationId = new UUID(); // UUID | applicationId
KubernetesAuditLogRequest request = new KubernetesAuditLogRequest(); // KubernetesAuditLogRequest | request
try {
    apiInstance.logKubernetesEvent(applicationId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling LogMiscellaneousApi#logKubernetesEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)| applicationId |
 **request** | [**KubernetesAuditLogRequest**](KubernetesAuditLogRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logProvenance"></a>
# **logProvenance**
> LogResponse logProvenance(applicationId, provenanceDocument)

Logs a Provenance document

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LogMiscellaneousApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LogMiscellaneousApi apiInstance = new LogMiscellaneousApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String provenanceDocument = "provenanceDocument_example"; // String | Provenance model document, representing event that serves security log purposes. See https://www.w3.org/TR/2013/NOTE-prov-primer-20130430/
try {
    LogResponse result = apiInstance.logProvenance(applicationId, provenanceDocument);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogMiscellaneousApi#logProvenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **provenanceDocument** | **String**| Provenance model document, representing event that serves security log purposes. See https://www.w3.org/TR/2013/NOTE-prov-primer-20130430/ |

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

