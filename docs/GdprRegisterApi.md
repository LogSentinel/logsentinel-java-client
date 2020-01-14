# GdprRegisterApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEntity**](GdprRegisterApi.md#addEntity) | **POST** /api/gdpr/addEntity | Adds entitity to the GDPR register
[**deleteEntity**](GdprRegisterApi.md#deleteEntity) | **DELETE** /api/gdpr/entity | Deletes entity in the GDPR register
[**deleteRecord**](GdprRegisterApi.md#deleteRecord) | **DELETE** /api/gdpr/record | Deletes record  from the GDPR register
[**gdprEntities**](GdprRegisterApi.md#gdprEntities) | **GET** /api/gdpr/entities | Fetch entities from the GDPR register
[**getEntity**](GdprRegisterApi.md#getEntity) | **GET** /api/gdpr/entity | Gets entity by id from the GDPR register
[**getRecord**](GdprRegisterApi.md#getRecord) | **GET** /api/gdpr/record | Gets record by id from the GDPR register
[**getRecords**](GdprRegisterApi.md#getRecords) | **GET** /api/gdpr/records | Fetch records from the GDPR register
[**saveEntity**](GdprRegisterApi.md#saveEntity) | **POST** /api/gdpr/entity | Updates entity in the GDPR register
[**saveRecord**](GdprRegisterApi.md#saveRecord) | **POST** /api/gdpr/saveRecord | Saves record in the GDPR register


<a name="addEntity"></a>
# **addEntity**
> UUID addEntity(request)

Adds entitity to the GDPR register

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprRegisterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprRegisterApi apiInstance = new GdprRegisterApi();
GDPRResponsibleEntity request = new GDPRResponsibleEntity(); // GDPRResponsibleEntity | request
try {
    UUID result = apiInstance.addEntity(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprRegisterApi#addEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GDPRResponsibleEntity**](GDPRResponsibleEntity.md)| request |

### Return type

[**UUID**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="deleteEntity"></a>
# **deleteEntity**
> GDPRResponsibleEntity deleteEntity(id)

Deletes entity in the GDPR register

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprRegisterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprRegisterApi apiInstance = new GdprRegisterApi();
UUID id = new UUID(); // UUID | id
try {
    GDPRResponsibleEntity result = apiInstance.deleteEntity(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprRegisterApi#deleteEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

[**GDPRResponsibleEntity**](GDPRResponsibleEntity.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="deleteRecord"></a>
# **deleteRecord**
> GDPRRegisterRecord deleteRecord(id)

Deletes record  from the GDPR register

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprRegisterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprRegisterApi apiInstance = new GdprRegisterApi();
UUID id = new UUID(); // UUID | id
try {
    GDPRRegisterRecord result = apiInstance.deleteRecord(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprRegisterApi#deleteRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

[**GDPRRegisterRecord**](GDPRRegisterRecord.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="gdprEntities"></a>
# **gdprEntities**
> List&lt;GDPRResponsibleEntity&gt; gdprEntities()

Fetch entities from the GDPR register

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprRegisterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprRegisterApi apiInstance = new GdprRegisterApi();
try {
    List<GDPRResponsibleEntity> result = apiInstance.gdprEntities();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprRegisterApi#gdprEntities");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GDPRResponsibleEntity&gt;**](GDPRResponsibleEntity.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getEntity"></a>
# **getEntity**
> GDPRResponsibleEntity getEntity(id)

Gets entity by id from the GDPR register

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprRegisterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprRegisterApi apiInstance = new GdprRegisterApi();
UUID id = new UUID(); // UUID | id
try {
    GDPRResponsibleEntity result = apiInstance.getEntity(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprRegisterApi#getEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

[**GDPRResponsibleEntity**](GDPRResponsibleEntity.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getRecord"></a>
# **getRecord**
> GDPRRegisterRecord getRecord(id)

Gets record by id from the GDPR register

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprRegisterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprRegisterApi apiInstance = new GdprRegisterApi();
UUID id = new UUID(); // UUID | id
try {
    GDPRRegisterRecord result = apiInstance.getRecord(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprRegisterApi#getRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

[**GDPRRegisterRecord**](GDPRRegisterRecord.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getRecords"></a>
# **getRecords**
> List&lt;GDPRRegisterRecordDto&gt; getRecords(role, filterTags)

Fetch records from the GDPR register

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprRegisterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprRegisterApi apiInstance = new GdprRegisterApi();
String role = "role_example"; // String | role
List<String> filterTags = Arrays.asList("filterTags_example"); // List<String> | Limit the response by providing specific tags
try {
    List<GDPRRegisterRecordDto> result = apiInstance.getRecords(role, filterTags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprRegisterApi#getRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| role | [enum: CONTROLLER, PROCESSOR]
 **filterTags** | [**List&lt;String&gt;**](String.md)| Limit the response by providing specific tags | [optional]

### Return type

[**List&lt;GDPRRegisterRecordDto&gt;**](GDPRRegisterRecordDto.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="saveEntity"></a>
# **saveEntity**
> UUID saveEntity(request)

Updates entity in the GDPR register

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprRegisterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprRegisterApi apiInstance = new GdprRegisterApi();
GDPRResponsibleEntity request = new GDPRResponsibleEntity(); // GDPRResponsibleEntity | request
try {
    UUID result = apiInstance.saveEntity(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprRegisterApi#saveEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GDPRResponsibleEntity**](GDPRResponsibleEntity.md)| request |

### Return type

[**UUID**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="saveRecord"></a>
# **saveRecord**
> UUID saveRecord(record)

Saves record in the GDPR register

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.GdprRegisterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

GdprRegisterApi apiInstance = new GdprRegisterApi();
GDPRRegisterRecord record = new GDPRRegisterRecord(); // GDPRRegisterRecord | record
try {
    UUID result = apiInstance.saveRecord(record);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GdprRegisterApi#saveRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **record** | [**GDPRRegisterRecord**](GDPRRegisterRecord.md)| record |

### Return type

[**UUID**](UUID.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

