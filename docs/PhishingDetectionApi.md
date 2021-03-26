# PhishingDetectionApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detectAndReport**](PhishingDetectionApi.md#detectAndReport) | **POST** /api/phishing/detect | Detects phishing attempts


<a name="detectAndReport"></a>
# **detectAndReport**
> Integer detectAndReport(attachments, body, from, subject)

Detects phishing attempts

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.PhishingDetectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PhishingDetectionApi apiInstance = new PhishingDetectionApi();
List<String> attachments = Arrays.asList("attachments_example"); // List<String> | attachments
String body = "body_example"; // String | body
String from = "from_example"; // String | from
String subject = "subject_example"; // String | subject
try {
    Integer result = apiInstance.detectAndReport(attachments, body, from, subject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhishingDetectionApi#detectAndReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachments** | [**List&lt;String&gt;**](String.md)| attachments |
 **body** | **String**| body |
 **from** | **String**| from |
 **subject** | **String**| subject |

### Return type

**Integer**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/xml, application/json

