# LoggingApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntryById**](LoggingApi.md#getEntryById) | **GET** /api/getEntryById | Get entry by id
[**getHashByEntryId**](LoggingApi.md#getHashByEntryId) | **GET** /api/getHashByEntryId | getHashByEntryId
[**log**](LoggingApi.md#log) | **POST** /api/log/{actorId}/{action} | Log an event by a given actor
[**logAuthAction**](LoggingApi.md#logAuthAction) | **POST** /api/log/{actorId}/auth/{authAction} | Log an authentication event with the option to pass actor public key and signature
[**logBatch**](LoggingApi.md#logBatch) | **POST** /api/log/batch | Log multiple events at the same time. This should rarely be used, but allows background processes to push multiple events at the same time
[**logDocument**](LoggingApi.md#logDocument) | **POST** /api/log/document/{actorId}/{action}/{documentId} | Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action
[**logFull**](LoggingApi.md#logFull) | **POST** /api/log/{actorId}/{action}/{entityType}/{entityId} | Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action
[**logSimple**](LoggingApi.md#logSimple) | **POST** /api/log/simple | Log an event by providing just the body without any additional metadata. The body can be fully encrypted or can represent just the hash of the data/document


<a name="getEntryById"></a>
# **getEntryById**
> AuditLogEntry getEntryById(applicationId, entryId)

Get entry by id

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LoggingApi apiInstance = new LoggingApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String entryId = "entryId_example"; // String | ID of the audit log entry to verify
try {
    AuditLogEntry result = apiInstance.getEntryById(applicationId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#getEntryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **entryId** | **String**| ID of the audit log entry to verify |

### Return type

[**AuditLogEntry**](AuditLogEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="getHashByEntryId"></a>
# **getHashByEntryId**
> LogResponse getHashByEntryId(applicationId, entryId)

getHashByEntryId

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LoggingApi apiInstance = new LoggingApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String entryId = "entryId_example"; // String | ID of the audit log entry to verify
try {
    LogResponse result = apiInstance.getHashByEntryId(applicationId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#getHashByEntryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **entryId** | **String**| ID of the audit log entry to verify |

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="log"></a>
# **log**
> LogResponse log(applicationId, action, actorId, logEntryType, signature, actorDepartment, actorDisplayName, actorRoles, binaryContent, details, directExternalPush, encryptedKeywords, gdprCorrelationKey, logLevel, originalEventTimestamp, process, tags)

Log an event by a given actor

Log an event by specifying actor and action, as well as the request body. There are no limitations to the structure of the request body.

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LoggingApi apiInstance = new LoggingApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String action = "action_example"; // String | The name of the action being logged
String actorId = "actorId_example"; // String | ID of the actor performing the action being logged
String logEntryType = "AUDIT_LOG"; // String | Log-Entry-Type
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
String actorDepartment = "actorDepartment_example"; // String | actorDepartment
String actorDisplayName = "actorDisplayName_example"; // String | Display name of the actor (e.g. a name, in case ID is not human-readable)
List<String> actorRoles = Arrays.asList("actorRoles_example"); // List<String> | The roles of the actor
Boolean binaryContent = true; // Boolean | binaryContent
byte[] details = BINARY_DATA_HERE; // byte[] | Any details in any format about the event that you want to store in the log
List<String> directExternalPush = Arrays.asList("directExternalPush_example"); // List<String> | directExternalPush
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
String gdprCorrelationKey = "gdprCorrelationKey_example"; // String | If the event is about GDPR-related action, you can correlate it with a process in the GDPR register
String logLevel = "logLevel_example"; // String | logLevel
Long originalEventTimestamp = 789L; // Long | The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it's received) 
String process = "process_example"; // String | process
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags
try {
    LogResponse result = apiInstance.log(applicationId, action, actorId, logEntryType, signature, actorDepartment, actorDisplayName, actorRoles, binaryContent, details, directExternalPush, encryptedKeywords, gdprCorrelationKey, logLevel, originalEventTimestamp, process, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#log");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **action** | **String**| The name of the action being logged |
 **actorId** | **String**| ID of the actor performing the action being logged |
 **logEntryType** | **String**| Log-Entry-Type | [optional] [default to AUDIT_LOG] [enum: SYSTEM_EVENT, NETWORK_EVENT, AUTHENTICATION_EVENT, EXTERNAL_ALERT, AUDIT_LOG, WEBSITE_LOG, BUSINESS_LOGIC_ENTRY, DATABASE_QUERY, ANONYMIZED_ENTRY, SPECIALIZED_BUSINESS_LOGIC_ENTRY, DOCUMENT]
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **actorDepartment** | **String**| actorDepartment | [optional]
 **actorDisplayName** | **String**| Display name of the actor (e.g. a name, in case ID is not human-readable) | [optional]
 **actorRoles** | [**List&lt;String&gt;**](String.md)| The roles of the actor | [optional]
 **binaryContent** | **Boolean**| binaryContent | [optional]
 **details** | **byte[]**| Any details in any format about the event that you want to store in the log | [optional]
 **directExternalPush** | [**List&lt;String&gt;**](String.md)| directExternalPush | [optional] [enum: ETHEREUM, QTSA, EMAIL, TWITTER]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]
 **gdprCorrelationKey** | **String**| If the event is about GDPR-related action, you can correlate it with a process in the GDPR register | [optional]
 **logLevel** | **String**| logLevel | [optional] [enum: TRACE, DEBUG, INFO, WARN, ERROR, CRITICAL, FATAL]
 **originalEventTimestamp** | **Long**| The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  | [optional]
 **process** | **String**| process | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| tags | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logAuthAction"></a>
# **logAuthAction**
> LogResponse logAuthAction(applicationId, actorId, authAction, signature, signedLoginChallenge, userPublicKey, actorDepartment, actorDisplayName, actorRoles, binaryContent, details, directExternalPush, encryptedKeywords, gdprCorrelationKey, originalEventTimestamp, process, tags)

Log an authentication event with the option to pass actor public key and signature

Log an authentication action (e.g. login, signup, logout, auto-login).

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LoggingApi apiInstance = new LoggingApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String actorId = "actorId_example"; // String | ID of the actor performing the action being logged
String authAction = "authAction_example"; // String | Specific action related to user authentication
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
String signedLoginChallenge = "signedLoginChallenge_example"; // String | Signed-Login-Challenge
String userPublicKey = "userPublicKey_example"; // String | User-Public-Key
String actorDepartment = "actorDepartment_example"; // String | actorDepartment
String actorDisplayName = "actorDisplayName_example"; // String | Display name of the actor (e.g. a name, in case ID is not human-readable)
List<String> actorRoles = Arrays.asList("actorRoles_example"); // List<String> | The roles of the actor
Boolean binaryContent = true; // Boolean | binaryContent
byte[] details = BINARY_DATA_HERE; // byte[] | Any details in any format about the event that you want to store in the log
List<String> directExternalPush = Arrays.asList("directExternalPush_example"); // List<String> | directExternalPush
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
String gdprCorrelationKey = "gdprCorrelationKey_example"; // String | If the event is about GDPR-related action, you can correlate it with a process in the GDPR register
Long originalEventTimestamp = 789L; // Long | The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it's received) 
String process = "process_example"; // String | process
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags
try {
    LogResponse result = apiInstance.logAuthAction(applicationId, actorId, authAction, signature, signedLoginChallenge, userPublicKey, actorDepartment, actorDisplayName, actorRoles, binaryContent, details, directExternalPush, encryptedKeywords, gdprCorrelationKey, originalEventTimestamp, process, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#logAuthAction");
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
 **binaryContent** | **Boolean**| binaryContent | [optional]
 **details** | **byte[]**| Any details in any format about the event that you want to store in the log | [optional]
 **directExternalPush** | [**List&lt;String&gt;**](String.md)| directExternalPush | [optional] [enum: ETHEREUM, QTSA, EMAIL, TWITTER]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]
 **gdprCorrelationKey** | **String**| If the event is about GDPR-related action, you can correlate it with a process in the GDPR register | [optional]
 **originalEventTimestamp** | **Long**| The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  | [optional]
 **process** | **String**| process | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| tags | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logBatch"></a>
# **logBatch**
> LogResponse logBatch(applicationId, requestData)

Log multiple events at the same time. This should rarely be used, but allows background processes to push multiple events at the same time

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LoggingApi apiInstance = new LoggingApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
List<BatchLogRequestEntry> requestData = Arrays.asList(new BatchLogRequestEntry()); // List<BatchLogRequestEntry> | A list of log requests
try {
    LogResponse result = apiInstance.logBatch(applicationId, requestData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#logBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **requestData** | [**List&lt;BatchLogRequestEntry&gt;**](BatchLogRequestEntry.md)| A list of log requests |

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logDocument"></a>
# **logDocument**
> LogResponse logDocument(applicationId, action, actorId, details, documentId, signature, actorDepartment, actorDisplayName, actorRoles, binaryContent, directExternalPush, documentName, documentType, encryptedKeywords, gdprCorrelationKey, originalEventTimestamp, process, tags)

Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action

Log a document action. If working with documents, use this to store all events relating to a particular document - creation, modification, deletion, retrieval. You can store the hash of the document in the request body to ensure its integrity.

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LoggingApi apiInstance = new LoggingApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String action = "action_example"; // String | The name of the action being logged
String actorId = "actorId_example"; // String | ID of the actor performing the action being logged
byte[] details = BINARY_DATA_HERE; // byte[] | Any details in any format about the event that you want to store in the log
String documentId = "documentId_example"; // String | documentId
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
String actorDepartment = "actorDepartment_example"; // String | actorDepartment
String actorDisplayName = "actorDisplayName_example"; // String | Display name of the actor (e.g. a name, in case ID is not human-readable)
List<String> actorRoles = Arrays.asList("actorRoles_example"); // List<String> | The roles of the actor
Boolean binaryContent = true; // Boolean | binaryContent
List<String> directExternalPush = Arrays.asList("directExternalPush_example"); // List<String> | directExternalPush
String documentName = "documentName_example"; // String | documentName
String documentType = "documentType_example"; // String | documentType
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
String gdprCorrelationKey = "gdprCorrelationKey_example"; // String | If the event is about GDPR-related action, you can correlate it with a process in the GDPR register
Long originalEventTimestamp = 789L; // Long | The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it's received) 
String process = "process_example"; // String | process
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags
try {
    LogResponse result = apiInstance.logDocument(applicationId, action, actorId, details, documentId, signature, actorDepartment, actorDisplayName, actorRoles, binaryContent, directExternalPush, documentName, documentType, encryptedKeywords, gdprCorrelationKey, originalEventTimestamp, process, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#logDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **action** | **String**| The name of the action being logged | [enum: CREATE_DOCUMENT, UPDATE_DOCUMENT, DELETE_DOCUMENT, RETRIEVE_DOCUMENT]
 **actorId** | **String**| ID of the actor performing the action being logged |
 **details** | **byte[]**| Any details in any format about the event that you want to store in the log |
 **documentId** | **String**| documentId |
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **actorDepartment** | **String**| actorDepartment | [optional]
 **actorDisplayName** | **String**| Display name of the actor (e.g. a name, in case ID is not human-readable) | [optional]
 **actorRoles** | [**List&lt;String&gt;**](String.md)| The roles of the actor | [optional]
 **binaryContent** | **Boolean**| binaryContent | [optional] [default to true]
 **directExternalPush** | [**List&lt;String&gt;**](String.md)| directExternalPush | [optional] [enum: ETHEREUM, QTSA, EMAIL, TWITTER]
 **documentName** | **String**| documentName | [optional]
 **documentType** | **String**| documentType | [optional]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]
 **gdprCorrelationKey** | **String**| If the event is about GDPR-related action, you can correlate it with a process in the GDPR register | [optional]
 **originalEventTimestamp** | **Long**| The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  | [optional]
 **process** | **String**| process | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| tags | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logFull"></a>
# **logFull**
> LogResponse logFull(applicationId, action, actorId, entityId, entityType, logEntryType, signature, actorDepartment, actorDisplayName, actorRoles, binaryContent, details, directExternalPush, encryptedKeywords, gdprCorrelationKey, logLevel, originalEventTimestamp, process, tags)

Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action

Log an even by specifying all relevant details - actor, action and the entity about which the action is, as well as the request body. There are no limitations to the structure of the request body.

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LoggingApi apiInstance = new LoggingApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String action = "action_example"; // String | The name of the action being logged
String actorId = "actorId_example"; // String | ID of the actor performing the action being logged
String entityId = "entityId_example"; // String | When the event is about a particular model entity, you can set its ID here
String entityType = "entityType_example"; // String | When the event is about a particular model entity, you can set its type here
String logEntryType = "AUDIT_LOG"; // String | Log-Entry-Type
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
String actorDepartment = "actorDepartment_example"; // String | actorDepartment
String actorDisplayName = "actorDisplayName_example"; // String | Display name of the actor (e.g. a name, in case ID is not human-readable)
List<String> actorRoles = Arrays.asList("actorRoles_example"); // List<String> | The roles of the actor
Boolean binaryContent = true; // Boolean | binaryContent
byte[] details = BINARY_DATA_HERE; // byte[] | Any details in any format about the event that you want to store in the log
List<String> directExternalPush = Arrays.asList("directExternalPush_example"); // List<String> | directExternalPush
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
String gdprCorrelationKey = "gdprCorrelationKey_example"; // String | If the event is about GDPR-related action, you can correlate it with a process in the GDPR register
String logLevel = "logLevel_example"; // String | logLevel
Long originalEventTimestamp = 789L; // Long | The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it's received) 
String process = "process_example"; // String | process
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags
try {
    LogResponse result = apiInstance.logFull(applicationId, action, actorId, entityId, entityType, logEntryType, signature, actorDepartment, actorDisplayName, actorRoles, binaryContent, details, directExternalPush, encryptedKeywords, gdprCorrelationKey, logLevel, originalEventTimestamp, process, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#logFull");
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
 **logEntryType** | **String**| Log-Entry-Type | [optional] [default to AUDIT_LOG] [enum: SYSTEM_EVENT, NETWORK_EVENT, AUTHENTICATION_EVENT, EXTERNAL_ALERT, AUDIT_LOG, WEBSITE_LOG, BUSINESS_LOGIC_ENTRY, DATABASE_QUERY, ANONYMIZED_ENTRY, SPECIALIZED_BUSINESS_LOGIC_ENTRY, DOCUMENT]
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **actorDepartment** | **String**| actorDepartment | [optional]
 **actorDisplayName** | **String**| Display name of the actor (e.g. a name, in case ID is not human-readable) | [optional]
 **actorRoles** | [**List&lt;String&gt;**](String.md)| The roles of the actor | [optional]
 **binaryContent** | **Boolean**| binaryContent | [optional]
 **details** | **byte[]**| Any details in any format about the event that you want to store in the log | [optional]
 **directExternalPush** | [**List&lt;String&gt;**](String.md)| directExternalPush | [optional] [enum: ETHEREUM, QTSA, EMAIL, TWITTER]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]
 **gdprCorrelationKey** | **String**| If the event is about GDPR-related action, you can correlate it with a process in the GDPR register | [optional]
 **logLevel** | **String**| logLevel | [optional] [enum: TRACE, DEBUG, INFO, WARN, ERROR, CRITICAL, FATAL]
 **originalEventTimestamp** | **Long**| The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  | [optional]
 **process** | **String**| process | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| tags | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logSimple"></a>
# **logSimple**
> LogResponse logSimple(applicationId, logEntryType, signature, binaryContent, details, directExternalPush, encryptedKeywords, logLevel, originalEventTimestamp, tags)

Log an event by providing just the body without any additional metadata. The body can be fully encrypted or can represent just the hash of the data/document

Log an event by just specifying the request body. There are no limitations to the structure of the request body.

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LoggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LoggingApi apiInstance = new LoggingApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String logEntryType = "AUDIT_LOG"; // String | Log-Entry-Type
String signature = "signature_example"; // String | Base64-encoded digital signature on the entry details (the request body)
Boolean binaryContent = true; // Boolean | binaryContent
byte[] details = BINARY_DATA_HERE; // byte[] | Any details in any format about the event that you want to store in the log
List<String> directExternalPush = Arrays.asList("directExternalPush_example"); // List<String> | directExternalPush
List<String> encryptedKeywords = Arrays.asList("encryptedKeywords_example"); // List<String> | If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text
String logLevel = "logLevel_example"; // String | logLevel
Long originalEventTimestamp = 789L; // Long | The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it's received) 
List<String> tags = Arrays.asList("tags_example"); // List<String> | tags
try {
    LogResponse result = apiInstance.logSimple(applicationId, logEntryType, signature, binaryContent, details, directExternalPush, encryptedKeywords, logLevel, originalEventTimestamp, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoggingApi#logSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **logEntryType** | **String**| Log-Entry-Type | [optional] [default to AUDIT_LOG] [enum: SYSTEM_EVENT, NETWORK_EVENT, AUTHENTICATION_EVENT, EXTERNAL_ALERT, AUDIT_LOG, WEBSITE_LOG, BUSINESS_LOGIC_ENTRY, DATABASE_QUERY, ANONYMIZED_ENTRY, SPECIALIZED_BUSINESS_LOGIC_ENTRY, DOCUMENT]
 **signature** | **String**| Base64-encoded digital signature on the entry details (the request body) | [optional]
 **binaryContent** | **Boolean**| binaryContent | [optional]
 **details** | **byte[]**| Any details in any format about the event that you want to store in the log | [optional]
 **directExternalPush** | [**List&lt;String&gt;**](String.md)| directExternalPush | [optional] [enum: ETHEREUM, QTSA, EMAIL, TWITTER]
 **encryptedKeywords** | [**List&lt;String&gt;**](String.md)| If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text | [optional]
 **logLevel** | **String**| logLevel | [optional] [enum: TRACE, DEBUG, INFO, WARN, ERROR, CRITICAL, FATAL]
 **originalEventTimestamp** | **Long**| The timestamp (in epoch milliseconds) of the event as it originally happened (as opposed to the time when it&#39;s received)  | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| tags | [optional]

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

