# SavedSearchesApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSavedSearch**](SavedSearchesApi.md#createSavedSearch) | **POST** /api/search/saved | Creates saved search
[**getSavedSearchIds**](SavedSearchesApi.md#getSavedSearchIds) | **GET** /api/search/saved/fetch | Fetches saved search ids of all users of an organization
[**performSavedSearch**](SavedSearchesApi.md#performSavedSearch) | **GET** /api/search/saved | Calls saved search by its id


<a name="createSavedSearch"></a>
# **createSavedSearch**
> List&lt;SavedSearch&gt; createSavedSearch(end, name, query, start)

Creates saved search

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.SavedSearchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SavedSearchesApi apiInstance = new SavedSearchesApi();
Long end = 789L; // Long | end
String name = "name_example"; // String | name
String query = "query_example"; // String | query
Long start = 789L; // Long | start
try {
    List<SavedSearch> result = apiInstance.createSavedSearch(end, name, query, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedSearchesApi#createSavedSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end** | **Long**| end |
 **name** | **String**| name |
 **query** | **String**| query |
 **start** | **Long**| start |

### Return type

[**List&lt;SavedSearch&gt;**](SavedSearch.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="getSavedSearchIds"></a>
# **getSavedSearchIds**
> List&lt;SavedSearch&gt; getSavedSearchIds()

Fetches saved search ids of all users of an organization

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.SavedSearchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SavedSearchesApi apiInstance = new SavedSearchesApi();
try {
    List<SavedSearch> result = apiInstance.getSavedSearchIds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedSearchesApi#getSavedSearchIds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SavedSearch&gt;**](SavedSearch.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="performSavedSearch"></a>
# **performSavedSearch**
> List&lt;AuditLogEntry&gt; performSavedSearch(savedSearchId)

Calls saved search by its id

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.SavedSearchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SavedSearchesApi apiInstance = new SavedSearchesApi();
String savedSearchId = "savedSearchId_example"; // String | savedSearchId
try {
    List<AuditLogEntry> result = apiInstance.performSavedSearch(savedSearchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedSearchesApi#performSavedSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savedSearchId** | **String**| savedSearchId |

### Return type

[**List&lt;AuditLogEntry&gt;**](AuditLogEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

