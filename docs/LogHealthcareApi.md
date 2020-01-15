# LogHealthcareApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logDicomEvent**](LogHealthcareApi.md#logDicomEvent) | **POST** /api/dicom/log | Logs a DICOM audit message
[**logFhirEvent**](LogHealthcareApi.md#logFhirEvent) | **POST** /api/fhir/log | Logs a FHIR audit event in order to help with HIPAA compliance
[**logIheEvent**](LogHealthcareApi.md#logIheEvent) | **POST** /api/ihe/log | Logs an IHE audit message


<a name="logDicomEvent"></a>
# **logDicomEvent**
> LogResponse logDicomEvent(applicationId, dicomAuditEvent)

Logs a DICOM audit message

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LogHealthcareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LogHealthcareApi apiInstance = new LogHealthcareApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String dicomAuditEvent = "dicomAuditEvent_example"; // String | dicomAuditEvent
try {
    LogResponse result = apiInstance.logDicomEvent(applicationId, dicomAuditEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogHealthcareApi#logDicomEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **dicomAuditEvent** | **String**| dicomAuditEvent |

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logFhirEvent"></a>
# **logFhirEvent**
> LogResponse logFhirEvent(applicationId, fhirAuditEvent)

Logs a FHIR audit event in order to help with HIPAA compliance

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LogHealthcareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LogHealthcareApi apiInstance = new LogHealthcareApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String fhirAuditEvent = "fhirAuditEvent_example"; // String | A record of an FHIR event made for purposes of maintaining a security log. See https://www.hl7.org/fhir/auditevent.html
try {
    LogResponse result = apiInstance.logFhirEvent(applicationId, fhirAuditEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogHealthcareApi#logFhirEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **fhirAuditEvent** | **String**| A record of an FHIR event made for purposes of maintaining a security log. See https://www.hl7.org/fhir/auditevent.html |

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logIheEvent"></a>
# **logIheEvent**
> LogResponse logIheEvent(applicationId, iheAuditEvent)

Logs an IHE audit message

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LogHealthcareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LogHealthcareApi apiInstance = new LogHealthcareApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String iheAuditEvent = "iheAuditEvent_example"; // String | iheAuditEvent
try {
    LogResponse result = apiInstance.logIheEvent(applicationId, iheAuditEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogHealthcareApi#logIheEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **iheAuditEvent** | **String**| iheAuditEvent |

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

