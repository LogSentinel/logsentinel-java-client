# SearchApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatch**](SearchApi.md#getBatch) | **GET** /api/search/batch | Search entries in batches by field
[**getEntityHistory**](SearchApi.md#getEntityHistory) | **GET** /api/search/entityHistory | Get entity history
[**search**](SearchApi.md#search) | **POST** /api/search | Search logged entries


<a name="getBatch"></a>
# **getBatch**
> List&lt;AuditLogEntry&gt; getBatch(applicationId, field, values, batchSize, entityType, page)

Search entries in batches by field

Search entries by specifying a list of actorIds or entityIds. If entityId is specified, entityType should also be specified.

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String field = "field_example"; // String | Field to search in for the supplied values
List<String> values = Arrays.asList("values_example"); // List<String> | Values that match the specified field
Integer batchSize = 1000; // Integer | batchSize
String entityType = "entityType_example"; // String | When the event is about a particular model entity, you can set its type here
Integer page = 0; // Integer | page
try {
    List<AuditLogEntry> result = apiInstance.getBatch(applicationId, field, values, batchSize, entityType, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **field** | **String**| Field to search in for the supplied values | [enum: ID, ENTITY_ID, ACTOR_ID]
 **values** | [**List&lt;String&gt;**](String.md)| Values that match the specified field |
 **batchSize** | **Integer**| batchSize | [optional] [default to 1000]
 **entityType** | **String**| When the event is about a particular model entity, you can set its type here | [optional]
 **page** | **Integer**| page | [optional] [default to 0]

### Return type

[**List&lt;AuditLogEntry&gt;**](AuditLogEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="getEntityHistory"></a>
# **getEntityHistory**
> List&lt;AuditLogEntry&gt; getEntityHistory(applicationId, entityId, entityType)

Get entity history

Fetches all entries related to a specific entity (specified by type and id). Entity modifications can consist of diffs, so that fetching the whole history can be used for reconstructing the current state of the entity

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String entityId = "entityId_example"; // String | When the event is about a particular model entity, you can set its ID here
String entityType = "entityType_example"; // String | When the event is about a particular model entity, you can set its type here
try {
    List<AuditLogEntry> result = apiInstance.getEntityHistory(applicationId, entityId, entityType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getEntityHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **entityId** | **String**| When the event is about a particular model entity, you can set its ID here |
 **entityType** | **String**| When the event is about a particular model entity, you can set its type here |

### Return type

[**List&lt;AuditLogEntry&gt;**](AuditLogEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="search"></a>
# **search**
> List&lt;AuditLogEntry&gt; search(applicationId, searchRequest)

Search logged entries

Perform search using a Lucene query. The lucene query syntax can be &lt;a href&#x3D;\&quot;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-query-string-query.html#query-string-syntax\&quot;&gt;found here&lt;/a&gt;

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
SearchRequest searchRequest = new SearchRequest(); // SearchRequest | searchRequest
try {
    List<AuditLogEntry> result = apiInstance.search(applicationId, searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **searchRequest** | [**SearchRequest**](SearchRequest.md)| searchRequest |

### Return type

[**List&lt;AuditLogEntry&gt;**](AuditLogEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

