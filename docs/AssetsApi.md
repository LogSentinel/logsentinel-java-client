# AssetsApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetExists**](AssetsApi.md#assetExists) | **GET** /api/assets/exists | Check asset
[**insertAsset**](AssetsApi.md#insertAsset) | **POST** /api/assets/insert | Insert asset


<a name="assetExists"></a>
# **assetExists**
> Boolean assetExists(ip, port, protocol)

Check asset

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AssetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AssetsApi apiInstance = new AssetsApi();
String ip = "ip_example"; // String | ip
Integer port = 56; // Integer | port
String protocol = "protocol_example"; // String | protocol
try {
    Boolean result = apiInstance.assetExists(ip, port, protocol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#assetExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| ip |
 **port** | **Integer**| port |
 **protocol** | **String**| protocol |

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="insertAsset"></a>
# **insertAsset**
> insertAsset(ip, port, protocol, serviceName, riskLevel, sourceCategory)

Insert asset

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AssetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AssetsApi apiInstance = new AssetsApi();
String ip = "ip_example"; // String | ip
Integer port = 56; // Integer | port
String protocol = "protocol_example"; // String | protocol
String serviceName = "serviceName_example"; // String | serviceName
Integer riskLevel = 56; // Integer | riskLevel
String sourceCategory = "sourceCategory_example"; // String | sourceCategory
try {
    apiInstance.insertAsset(ip, port, protocol, serviceName, riskLevel, sourceCategory);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#insertAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| ip |
 **port** | **Integer**| port |
 **protocol** | **String**| protocol |
 **serviceName** | **String**| serviceName |
 **riskLevel** | **Integer**| riskLevel | [optional]
 **sourceCategory** | **String**| sourceCategory | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

