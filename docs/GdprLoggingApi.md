# GdprLoggingApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logConsent**](GdprLoggingApi.md#logConsent) | **POST** /api/log-gdpr/consent | Log the consent by a given user
[**logGdprRequest**](GdprLoggingApi.md#logGdprRequest) | **POST** /api/log-gdpr/request/{requestType} | Log a GDPR request by a given user
[**logRequestResults**](GdprLoggingApi.md#logRequestResults) | **POST** /api/log-gdpr/request-result/{requestType} | Push data about the result of a GDPR request


<a name="logConsent"></a>
# **logConsent**
> LogResponse logConsent(consent, signature, encryptedKeywords)

Log the consent by a given user

Logs GDPR consent. Include any consent-related data (e.g. data subject ID, data subject names, processing activity or any other details). You can also log consent withdrawal (include \&quot;withdrawal\&quot; in the additional details field). 

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprLoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprLoggingApi apiInstance = new GdprLoggingApi();
Consent consent = new Consent(); // Consent | Details about the consent. You should normally pass the data subject ID and the processing activity for which the consent is given.
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
try {
    LogResponse result = apiInstance.logConsent(consent, signature, encryptedKeywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprLoggingApi#logConsent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consent** | [**Consent**](Consent.md)| Details about the consent. You should normally pass the data subject ID and the processing activity for which the consent is given. |
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logGdprRequest"></a>
# **logGdprRequest**
> LogResponse logGdprRequest(gdprRequest, requestType, signature, encryptedKeywords)

Log a GDPR request by a given user

Log a request for data subject rights under GDPR. Include the data subject details as well as any relevant additional details.

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprLoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprLoggingApi apiInstance = new GdprLoggingApi();
GDPRRequest gdprRequest = new GDPRRequest(); // GDPRRequest | gdprRequest
String requestType = "requestType_example"; // String | requestType
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
try {
    LogResponse result = apiInstance.logGdprRequest(gdprRequest, requestType, signature, encryptedKeywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprLoggingApi#logGdprRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gdprRequest** | [**GDPRRequest**](GDPRRequest.md)| gdprRequest |
 **requestType** | **String**| requestType | [enum: GDPR_ERASURE, GDPR_RESTRICTION, GDPR_ACCESS, GDPR_PORTABILITY, GDPR_RECTIFICATION, GDPR_OBJECTION]
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logRequestResults"></a>
# **logRequestResults**
> LogResponse logRequestResults(requestType, result, signature, encryptedKeywords)

Push data about the result of a GDPR request

Log the result of handling a GDPR request. E.g. after manually reviewing a request for erasure or for data portability, you should log whether the request was approved and executed or not, including the reasons why.

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprLoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprLoggingApi apiInstance = new GdprLoggingApi();
String requestType = "requestType_example"; // String | requestType
Result result = new Result(); // Result | result
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
try {
    LogResponse result = apiInstance.logRequestResults(requestType, result, signature, encryptedKeywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprLoggingApi#logRequestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestType** | **String**| requestType | [enum: GDPR_ERASURE, GDPR_RESTRICTION, GDPR_ACCESS, GDPR_PORTABILITY, GDPR_RECTIFICATION, GDPR_OBJECTION]
 **result** | [**Result**](Result.md)| result |
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

