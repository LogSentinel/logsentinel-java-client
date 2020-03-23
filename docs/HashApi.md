# HashApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHash**](HashApi.md#getHash) | **POST** /api/getStandaloneHash | Get the standalone (non-chained) hash for an entry
[**getHashableContent**](HashApi.md#getHashableContent) | **POST** /api/getHashableContent/{actorId}/{action} | Get the content over which to compute the hash of a request for simple (minimal metadata) actions
[**getHashableContentForAuthAction**](HashApi.md#getHashableContentForAuthAction) | **POST** /api/getHashableContent/{actorId}/auth/{authAction} | Get the content over which to compute the hash of a request for auth actions
[**getHashableContentForStandardAction**](HashApi.md#getHashableContentForStandardAction) | **POST** /api/getHashableContent/{actorId}/{action}/{entityType}/{entityId} | Get the content over which to compute the hash of a request for standard actions
[**getHashableContentSimple**](HashApi.md#getHashableContentSimple) | **POST** /api/getHashableContent | Get the content over which to compute the hash of a request without any additional metadata (including encrypted request bodies)


<a name="getHash"></a>
# **getHash**
> String getHash(applicationId, entryId)

Get the standalone (non-chained) hash for an entry

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.HashApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HashApi apiInstance = new HashApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
UUID entryId = new UUID(); // UUID | ID of the audit log entry to verify
try {
    String result = apiInstance.getHash(applicationId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HashApi#getHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **entryId** | [**UUID**](.md)| ID of the audit log entry to verify |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="getHashableContent"></a>
# **getHashableContent**
> String getHashableContent(applicationId, action, actorId, auditLogEntryType, signature, actorDepartment, actorDisplayName, actorRoles, details, logLevel, originalEventTimestamp)

Get the content over which to compute the hash of a request for simple (minimal metadata) actions

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.HashApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HashApi apiInstance = new HashApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String action = "action_example"; // String | The name of the action being logged
String actorId = "actorId_example"; // String | ID of the actor performing the action being logged
String auditLogEntryType = "BUSINESS_LOGIC_ENTRY"; // String | The type of the event
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
String actorDepartment = "actorDepartment_example"; // String | actorDepartment
String actorDisplayName = "actorDisplayName_example"; // String | Display name of the actor (e.g. a name, in case ID is not human-readable)
List<String> actorRoles = Arrays.asList("actorRoles_example"); // List<String> | The roles of the actor
String details = "details_example"; // String | Any details in any format about the event that you want to store in the log
String logLevel = "logLevel_example"; // String | logLevel
Long originalEventTimestamp = 789L; // Long | originalEventTimestamp
try {
    String result = apiInstance.getHashableContent(applicationId, action, actorId, auditLogEntryType, signature, actorDepartment, actorDisplayName, actorRoles, details, logLevel, originalEventTimestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HashApi#getHashableContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **action** | **String**| The name of the action being logged |
 **actorId** | **String**| ID of the actor performing the action being logged |
 **auditLogEntryType** | **String**| The type of the event | [optional] [default to BUSINESS_LOGIC_ENTRY] [enum: BUSINESS_LOGIC_ENTRY, DATABASE_QUERY, SYSTEM_EVENT, NETWORK_EVENT, ANONYMIZED_ENTRY, SPECIALIZED_BUSINESS_LOGIC_ENTRY, DOCUMENT]
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **actorDepartment** | **String**| actorDepartment | [optional]
 **actorDisplayName** | **String**| Display name of the actor (e.g. a name, in case ID is not human-readable) | [optional]
 **actorRoles** | [**List&lt;String&gt;**](String.md)| The roles of the actor | [optional]
 **details** | **String**| Any details in any format about the event that you want to store in the log | [optional]
 **logLevel** | **String**| logLevel | [optional] [enum: TRACE, DEBUG, INFO, WARN, ERROR, CRITICAL, FATAL]
 **originalEventTimestamp** | **Long**| originalEventTimestamp | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="getHashableContentForAuthAction"></a>
# **getHashableContentForAuthAction**
> String getHashableContentForAuthAction(applicationId, actorId, authAction, signature, signedLoginChallenge, userPublicKey, actorDepartment, actorDisplayName, actorRoles, details, originalEventTimestamp)

Get the content over which to compute the hash of a request for auth actions

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.HashApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HashApi apiInstance = new HashApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String actorId = "actorId_example"; // String | ID of the actor performing the action being logged
String authAction = "authAction_example"; // String | Specific action related to user authentication
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
String signedLoginChallenge = "signedLoginChallenge_example"; // String | Signed-Login-Challenge
String userPublicKey = "userPublicKey_example"; // String | User-Public-Key
String actorDepartment = "actorDepartment_example"; // String | actorDepartment
String actorDisplayName = "actorDisplayName_example"; // String | Display name of the actor (e.g. a name, in case ID is not human-readable)
List<String> actorRoles = Arrays.asList("actorRoles_example"); // List<String> | The roles of the actor
String details = "details_example"; // String | Any details in any format about the event that you want to store in the log
Long originalEventTimestamp = 789L; // Long | originalEventTimestamp
try {
    String result = apiInstance.getHashableContentForAuthAction(applicationId, actorId, authAction, signature, signedLoginChallenge, userPublicKey, actorDepartment, actorDisplayName, actorRoles, details, originalEventTimestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HashApi#getHashableContentForAuthAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **actorId** | **String**| ID of the actor performing the action being logged |
 **authAction** | **String**| Specific action related to user authentication | [enum: LOGIN, LOGIN_AS, LOGOUT, SIGNUP, AUTO_LOGIN, LOGIN_FAILED, CHANGE_PASSWORD]
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **signedLoginChallenge** | **String**| Signed-Login-Challenge | [optional]
 **userPublicKey** | **String**| User-Public-Key | [optional]
 **actorDepartment** | **String**| actorDepartment | [optional]
 **actorDisplayName** | **String**| Display name of the actor (e.g. a name, in case ID is not human-readable) | [optional]
 **actorRoles** | [**List&lt;String&gt;**](String.md)| The roles of the actor | [optional]
 **details** | **String**| Any details in any format about the event that you want to store in the log | [optional]
 **originalEventTimestamp** | **Long**| originalEventTimestamp | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="getHashableContentForStandardAction"></a>
# **getHashableContentForStandardAction**
> String getHashableContentForStandardAction(applicationId, action, actorId, entityId, entityType, auditLogEntryType, signature, actorDepartment, actorDisplayName, actorRoles, details, logLevel, originalEventTimestamp)

Get the content over which to compute the hash of a request for standard actions

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.HashApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HashApi apiInstance = new HashApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String action = "action_example"; // String | The name of the action being logged
String actorId = "actorId_example"; // String | ID of the actor performing the action being logged
String entityId = "entityId_example"; // String | When the event is about a particular model entity, you can set its ID here
String entityType = "entityType_example"; // String | When the event is about a particular model entity, you can set its type here
String auditLogEntryType = "BUSINESS_LOGIC_ENTRY"; // String | The type of the event
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
String actorDepartment = "actorDepartment_example"; // String | actorDepartment
String actorDisplayName = "actorDisplayName_example"; // String | Display name of the actor (e.g. a name, in case ID is not human-readable)
List<String> actorRoles = Arrays.asList("actorRoles_example"); // List<String> | The roles of the actor
String details = "details_example"; // String | Any details in any format about the event that you want to store in the log
String logLevel = "logLevel_example"; // String | logLevel
Long originalEventTimestamp = 789L; // Long | originalEventTimestamp
try {
    String result = apiInstance.getHashableContentForStandardAction(applicationId, action, actorId, entityId, entityType, auditLogEntryType, signature, actorDepartment, actorDisplayName, actorRoles, details, logLevel, originalEventTimestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HashApi#getHashableContentForStandardAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **action** | **String**| The name of the action being logged |
 **actorId** | **String**| ID of the actor performing the action being logged |
 **entityId** | **String**| When the event is about a particular model entity, you can set its ID here |
 **entityType** | **String**| When the event is about a particular model entity, you can set its type here |
 **auditLogEntryType** | **String**| The type of the event | [optional] [default to BUSINESS_LOGIC_ENTRY] [enum: BUSINESS_LOGIC_ENTRY, DATABASE_QUERY, SYSTEM_EVENT, NETWORK_EVENT, ANONYMIZED_ENTRY, SPECIALIZED_BUSINESS_LOGIC_ENTRY, DOCUMENT]
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **actorDepartment** | **String**| actorDepartment | [optional]
 **actorDisplayName** | **String**| Display name of the actor (e.g. a name, in case ID is not human-readable) | [optional]
 **actorRoles** | [**List&lt;String&gt;**](String.md)| The roles of the actor | [optional]
 **details** | **String**| Any details in any format about the event that you want to store in the log | [optional]
 **logLevel** | **String**| logLevel | [optional] [enum: TRACE, DEBUG, INFO, WARN, ERROR, CRITICAL, FATAL]
 **originalEventTimestamp** | **Long**| originalEventTimestamp | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="getHashableContentSimple"></a>
# **getHashableContentSimple**
> String getHashableContentSimple(applicationId, auditLogEntryType, signature, details, logLevel, originalEventTimestamp)

Get the content over which to compute the hash of a request without any additional metadata (including encrypted request bodies)

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.HashApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HashApi apiInstance = new HashApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String auditLogEntryType = "BUSINESS_LOGIC_ENTRY"; // String | The type of the event
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
String details = "details_example"; // String | Any details in any format about the event that you want to store in the log
String logLevel = "logLevel_example"; // String | logLevel
Long originalEventTimestamp = 789L; // Long | originalEventTimestamp
try {
    String result = apiInstance.getHashableContentSimple(applicationId, auditLogEntryType, signature, details, logLevel, originalEventTimestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HashApi#getHashableContentSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **auditLogEntryType** | **String**| The type of the event | [optional] [default to BUSINESS_LOGIC_ENTRY] [enum: BUSINESS_LOGIC_ENTRY, DATABASE_QUERY, SYSTEM_EVENT, NETWORK_EVENT, ANONYMIZED_ENTRY, SPECIALIZED_BUSINESS_LOGIC_ENTRY, DOCUMENT]
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **details** | **String**| Any details in any format about the event that you want to store in the log | [optional]
 **logLevel** | **String**| logLevel | [optional] [enum: TRACE, DEBUG, INFO, WARN, ERROR, CRITICAL, FATAL]
 **originalEventTimestamp** | **Long**| originalEventTimestamp | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

