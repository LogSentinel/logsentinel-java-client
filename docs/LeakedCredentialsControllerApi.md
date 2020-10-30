# LeakedCredentialsControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**insertEmails**](LeakedCredentialsControllerApi.md#insertEmails) | **POST** /api/leaked-credentials/emails | Insert emails


<a name="insertEmails"></a>
# **insertEmails**
> insertEmails(emails)

Insert emails

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LeakedCredentialsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LeakedCredentialsControllerApi apiInstance = new LeakedCredentialsControllerApi();
List<String> emails = Arrays.asList(new List<String>()); // List<String> | emails
try {
    apiInstance.insertEmails(emails);
} catch (ApiException e) {
    System.err.println("Exception when calling LeakedCredentialsControllerApi#insertEmails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emails** | **List&lt;String&gt;**| emails |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

