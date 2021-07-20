# ThreatIntelligenceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCollectionObjects1**](ThreatIntelligenceApi.md#getCollectionObjects1) | **GET** /api/threat-intel/{iocType}/{ioc} | getCollectionObjects


<a name="getCollectionObjects1"></a>
# **getCollectionObjects1**
> List&lt;ThreatIntel&gt; getCollectionObjects1(ioc, iocType)

getCollectionObjects

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.ThreatIntelligenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ThreatIntelligenceApi apiInstance = new ThreatIntelligenceApi();
String ioc = "ioc_example"; // String | ioc
String iocType = "iocType_example"; // String | iocType
try {
    List<ThreatIntel> result = apiInstance.getCollectionObjects1(ioc, iocType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThreatIntelligenceApi#getCollectionObjects1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ioc** | **String**| ioc |
 **iocType** | **String**| iocType | [enum: IPV4, IPV6, EMAIL_ADDRESS, DOMAIN, URL]

### Return type

[**List&lt;ThreatIntel&gt;**](ThreatIntel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

