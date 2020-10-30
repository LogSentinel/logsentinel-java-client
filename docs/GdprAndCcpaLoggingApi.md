# GdprAndCcpaLoggingApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logCCPARequestResults**](GdprAndCcpaLoggingApi.md#logCCPARequestResults) | **POST** /api/log-ccpa/request-result/{requestType} | Push data about the result of a CCPA request
[**logCcpaRequest**](GdprAndCcpaLoggingApi.md#logCcpaRequest) | **POST** /api/log-ccpa/request/{requestType} | Log a CCPA request by a given user
[**logConsent**](GdprAndCcpaLoggingApi.md#logConsent) | **POST** /api/log-gdpr/consent | Log the consent by a given user
[**logGdprRequest**](GdprAndCcpaLoggingApi.md#logGdprRequest) | **POST** /api/log-gdpr/request/{requestType} | Log a GDPR request by a given user
[**logGdprRequestResults**](GdprAndCcpaLoggingApi.md#logGdprRequestResults) | **POST** /api/log-gdpr/request-result/{requestType} | Push data about the result of a GDPR request


<a name="logCCPARequestResults"></a>
# **logCCPARequestResults**
> LogResponse logCCPARequestResults(requestType, result, signature, encryptedKeywords)

Push data about the result of a CCPA request

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprAndCcpaLoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprAndCcpaLoggingApi apiInstance = new GdprAndCcpaLoggingApi();
String requestType = "requestType_example"; // String | requestType
CCPAResult result = new CCPAResult(); // CCPAResult | result
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
try {
    LogResponse result = apiInstance.logCCPARequestResults(requestType, result, signature, encryptedKeywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprAndCcpaLoggingApi#logCCPARequestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestType** | **String**| requestType | [enum: CCPA_CATEGORIES_DISCLOSURE, CCPA_DELETION, CCPA_FULL_DATA_DISCLOSURE, CCPA_SELLING_DISCLOSURE, CCPA_SELLING_OPT_OUT]
 **result** | [**CCPAResult**](CCPAResult.md)| result |
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logCcpaRequest"></a>
# **logCcpaRequest**
> LogResponse logCcpaRequest(ccpaRequest, requestType, signature, encryptedKeywords)

Log a CCPA request by a given user

Log a request for consumer rights under CCPA. Include the consumer details as well as any relevant additional details.

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprAndCcpaLoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprAndCcpaLoggingApi apiInstance = new GdprAndCcpaLoggingApi();
CCPARequest ccpaRequest = new CCPARequest(); // CCPARequest | ccpaRequest
String requestType = "requestType_example"; // String | requestType
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
try {
    LogResponse result = apiInstance.logCcpaRequest(ccpaRequest, requestType, signature, encryptedKeywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprAndCcpaLoggingApi#logCcpaRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ccpaRequest** | [**CCPARequest**](CCPARequest.md)| ccpaRequest |
 **requestType** | **String**| requestType | [enum: CCPA_CATEGORIES_DISCLOSURE, CCPA_DELETION, CCPA_FULL_DATA_DISCLOSURE, CCPA_SELLING_DISCLOSURE, CCPA_SELLING_OPT_OUT]
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

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
//import com.logsentinel.api.GdprAndCcpaLoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprAndCcpaLoggingApi apiInstance = new GdprAndCcpaLoggingApi();
Consent consent = new Consent(); // Consent | Details about the consent. You should normally pass the data subject ID and the processing activity for which the consent is given.
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
try {
    LogResponse result = apiInstance.logConsent(consent, signature, encryptedKeywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprAndCcpaLoggingApi#logConsent");
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
//import com.logsentinel.api.GdprAndCcpaLoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprAndCcpaLoggingApi apiInstance = new GdprAndCcpaLoggingApi();
GDPRRequest gdprRequest = new GDPRRequest(); // GDPRRequest | gdprRequest
String requestType = "requestType_example"; // String | requestType
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
try {
    LogResponse result = apiInstance.logGdprRequest(gdprRequest, requestType, signature, encryptedKeywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprAndCcpaLoggingApi#logGdprRequest");
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

<a name="logGdprRequestResults"></a>
# **logGdprRequestResults**
> LogResponse logGdprRequestResults(requestType, result, signature, encryptedKeywords)

Push data about the result of a GDPR request

Log the result of handling a GDPR request. E.g. after manually reviewing a request for erasure or for data portability, you should log whether the request was approved and executed or not, including the reasons why.

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprAndCcpaLoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprAndCcpaLoggingApi apiInstance = new GdprAndCcpaLoggingApi();
String requestType = "requestType_example"; // String | requestType
GDPRResult result = new GDPRResult(); // GDPRResult | result
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
try {
    LogResponse result = apiInstance.logGdprRequestResults(requestType, result, signature, encryptedKeywords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprAndCcpaLoggingApi#logGdprRequestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestType** | **String**| requestType | [enum: GDPR_ERASURE, GDPR_RESTRICTION, GDPR_ACCESS, GDPR_PORTABILITY, GDPR_RECTIFICATION, GDPR_OBJECTION]
 **result** | [**GDPRResult**](GDPRResult.md)| result |
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

