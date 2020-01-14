# VerificationApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConsistencyProof**](VerificationApi.md#getConsistencyProof) | **GET** /api/verification/merkle/proofs/consistency | Get consistency proof for an application merkle tree. Async operation, as the generation may be slow
[**getEntriesBetweenHashes**](VerificationApi.md#getEntriesBetweenHashes) | **GET** /api/verification/entries | Get all entries between two hashes
[**getInclusionProof**](VerificationApi.md#getInclusionProof) | **GET** /api/verification/merkle/proofs/inclusion | Get inclusion proof for the application merkle tree. Async operation, as the generation may be slow
[**getLatestTreeHead**](VerificationApi.md#getLatestTreeHead) | **GET** /api/verification/merkle/latestTreeHead | Get latest tree head of the application merkle tree. Async operation, as the operation may be slow
[**getMerkleTreeInfo**](VerificationApi.md#getMerkleTreeInfo) | **GET** /api/verification/merkle/info | Get general info about merkle tree parameters
[**getResolvedVerificationFailures**](VerificationApi.md#getResolvedVerificationFailures) | **GET** /api/verification/resolved-failures | Get all resolved verification failures
[**verify**](VerificationApi.md#verify) | **POST** /api/verification/verify | Verify whether a given hash is present, indicating that the log is intact
[**verifyEntry**](VerificationApi.md#verifyEntry) | **POST** /api/verification/verifyEntry | Verify whether a given entry&#39;s hash is present, indicating that the log is intact


<a name="getConsistencyProof"></a>
# **getConsistencyProof**
> ConsistencyProof getConsistencyProof(applicationId, firstTreeHash, secondTreeHash)

Get consistency proof for an application merkle tree. Async operation, as the generation may be slow

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

VerificationApi apiInstance = new VerificationApi();
UUID applicationId = new UUID(); // UUID | Application ID, identifying a target application (obtained from the API credentials page)
String firstTreeHash = "firstTreeHash_example"; // String | firstTreeHash
String secondTreeHash = "-1"; // String | secondTreeHash
try {
    ConsistencyProof result = apiInstance.getConsistencyProof(applicationId, firstTreeHash, secondTreeHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#getConsistencyProof");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)| Application ID, identifying a target application (obtained from the API credentials page) |
 **firstTreeHash** | **String**| firstTreeHash |
 **secondTreeHash** | **String**| secondTreeHash | [optional] [default to -1]

### Return type

[**ConsistencyProof**](ConsistencyProof.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getEntriesBetweenHashes"></a>
# **getEntriesBetweenHashes**
> List&lt;AuditLogEntry&gt; getEntriesBetweenHashes(applicationId, endHash, startHash)

Get all entries between two hashes

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

VerificationApi apiInstance = new VerificationApi();
UUID applicationId = new UUID(); // UUID | Application ID, identifying a target application (obtained from the API credentials page)
String endHash = "endHash_example"; // String | endHash
String startHash = "startHash_example"; // String | startHash
try {
    List<AuditLogEntry> result = apiInstance.getEntriesBetweenHashes(applicationId, endHash, startHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#getEntriesBetweenHashes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)| Application ID, identifying a target application (obtained from the API credentials page) |
 **endHash** | **String**| endHash |
 **startHash** | **String**| startHash |

### Return type

[**List&lt;AuditLogEntry&gt;**](AuditLogEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="getInclusionProof"></a>
# **getInclusionProof**
> InclusionProof getInclusionProof(applicationId, hash)

Get inclusion proof for the application merkle tree. Async operation, as the generation may be slow

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

VerificationApi apiInstance = new VerificationApi();
UUID applicationId = new UUID(); // UUID | Application ID, identifying a target application (obtained from the API credentials page)
String hash = "hash_example"; // String | Hash of the entry to verify
try {
    InclusionProof result = apiInstance.getInclusionProof(applicationId, hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#getInclusionProof");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)| Application ID, identifying a target application (obtained from the API credentials page) |
 **hash** | **String**| Hash of the entry to verify |

### Return type

[**InclusionProof**](InclusionProof.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getLatestTreeHead"></a>
# **getLatestTreeHead**
> TreeHead getLatestTreeHead(applicationId)

Get latest tree head of the application merkle tree. Async operation, as the operation may be slow

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

VerificationApi apiInstance = new VerificationApi();
UUID applicationId = new UUID(); // UUID | Application ID, identifying a target application (obtained from the API credentials page)
try {
    TreeHead result = apiInstance.getLatestTreeHead(applicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#getLatestTreeHead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)| Application ID, identifying a target application (obtained from the API credentials page) |

### Return type

[**TreeHead**](TreeHead.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getMerkleTreeInfo"></a>
# **getMerkleTreeInfo**
> TreeHead getMerkleTreeInfo()

Get general info about merkle tree parameters

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

VerificationApi apiInstance = new VerificationApi();
try {
    TreeHead result = apiInstance.getMerkleTreeInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#getMerkleTreeInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TreeHead**](TreeHead.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getResolvedVerificationFailures"></a>
# **getResolvedVerificationFailures**
> List&lt;ResolvedVerificationFailureResponse&gt; getResolvedVerificationFailures(applicationId)

Get all resolved verification failures

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

VerificationApi apiInstance = new VerificationApi();
UUID applicationId = new UUID(); // UUID | Application ID, identifying a target application (obtained from the API credentials page)
try {
    List<ResolvedVerificationFailureResponse> result = apiInstance.getResolvedVerificationFailures(applicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#getResolvedVerificationFailures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | [**UUID**](.md)| Application ID, identifying a target application (obtained from the API credentials page) |

### Return type

[**List&lt;ResolvedVerificationFailureResponse&gt;**](ResolvedVerificationFailureResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="verify"></a>
# **verify**
> Verification verify(applicationId, hash)

Verify whether a given hash is present, indicating that the log is intact

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

VerificationApi apiInstance = new VerificationApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String hash = "hash_example"; // String | Hash of the entry to verify
try {
    Verification result = apiInstance.verify(applicationId, hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#verify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **hash** | **String**| Hash of the entry to verify |

### Return type

[**Verification**](Verification.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="verifyEntry"></a>
# **verifyEntry**
> Verification verifyEntry(applicationId, entryId)

Verify whether a given entry&#39;s hash is present, indicating that the log is intact

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.VerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

VerificationApi apiInstance = new VerificationApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String entryId = "entryId_example"; // String | ID of the audit log entry to verify
try {
    Verification result = apiInstance.verifyEntry(applicationId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#verifyEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **entryId** | **String**| ID of the audit log entry to verify |

### Return type

[**Verification**](Verification.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

