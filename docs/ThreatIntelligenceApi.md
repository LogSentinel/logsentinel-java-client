# ThreatIntelligenceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getThreatIntelligence**](ThreatIntelligenceApi.md#getThreatIntelligence) | **GET** /api/threat-intel/{iocType}/{ioc} | getThreatIntelligence


<a name="getThreatIntelligence"></a>
# **getThreatIntelligence**
> List&lt;ThreatIntel&gt; getThreatIntelligence(ioc, iocType)

getThreatIntelligence

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
    List<ThreatIntel> result = apiInstance.getThreatIntelligence(ioc, iocType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThreatIntelligenceApi#getThreatIntelligence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ioc** | **String**| ioc |
 **iocType** | **String**| iocType | [enum: IPV4, IPV6, EMAIL_ADDRESS, DOMAIN, URL, FILE_HASH]

### Return type

[**List&lt;ThreatIntel&gt;**](ThreatIntel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

