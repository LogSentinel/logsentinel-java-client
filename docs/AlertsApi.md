# AlertsApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActionChainRule**](AlertsApi.md#createActionChainRule) | **POST** /api/alerts/actionChainRule | Creates Action Chain (Correlation) Alert Rule
[**createDestination**](AlertsApi.md#createDestination) | **POST** /api/alerts/destination | Creates Alert destination. Type is EMAIL or TELEGRAM
[**createRule**](AlertsApi.md#createRule) | **POST** /api/alerts/rule | Creates Alert rule. Type is ST_DEV or FIXED. Aggregation type is COUNT, AVG or SUM
[**deleteActionChainRule**](AlertsApi.md#deleteActionChainRule) | **DELETE** /api/alerts/actionChainRule | Deletes Action Chain (Correlation) Alert rule
[**deleteDestination**](AlertsApi.md#deleteDestination) | **DELETE** /api/alerts/destination | Deletes Alert destination
[**deleteRule**](AlertsApi.md#deleteRule) | **DELETE** /api/alerts/rule | Deletes Alert rule
[**getActionChainAlertRules**](AlertsApi.md#getActionChainAlertRules) | **GET** /api/alerts/actionChainRules | Gets all Action Chain (Correlation) Alert rules in the organization
[**getAlertDestinations**](AlertsApi.md#getAlertDestinations) | **GET** /api/alerts/destinations | Gets all Alert destinations in the organization
[**getAlertRuleRuns**](AlertsApi.md#getAlertRuleRuns) | **GET** /api/alerts/runs | Gets all Alert rule runs in the organization
[**getAlertRules**](AlertsApi.md#getAlertRules) | **GET** /api/alerts/rules | Gets all Alert rules in the organization
[**updateActionChainRule**](AlertsApi.md#updateActionChainRule) | **PUT** /api/alerts/actionChainRule | Updates Action Chain (Correlation) Alert Rule
[**updateDestination**](AlertsApi.md#updateDestination) | **PUT** /api/alerts/destination | Updates Alert destination. Type cannot be changed
[**updateRule**](AlertsApi.md#updateRule) | **PUT** /api/alerts/rule | Updates Alert rule. Type is ST_DEV or FIXED. Aggregation type is COUNT, AVG or SUM
[**updateWorkingHours**](AlertsApi.md#updateWorkingHours) | **POST** /api/alerts/updateWorkingHours | Updates the working hours for the organization


<a name="createActionChainRule"></a>
# **createActionChainRule**
> ActionChainAlertRule createActionChainRule(alertRule)

Creates Action Chain (Correlation) Alert Rule

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
ActionChainAlertRule alertRule = new ActionChainAlertRule(); // ActionChainAlertRule | alertRule
try {
    ActionChainAlertRule result = apiInstance.createActionChainRule(alertRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#createActionChainRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertRule** | [**ActionChainAlertRule**](ActionChainAlertRule.md)| alertRule |

### Return type

[**ActionChainAlertRule**](ActionChainAlertRule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="createDestination"></a>
# **createDestination**
> AlertDestination createDestination(request)

Creates Alert destination. Type is EMAIL or TELEGRAM

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
AlertDestinationRequest request = new AlertDestinationRequest(); // AlertDestinationRequest | request
try {
    AlertDestination result = apiInstance.createDestination(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#createDestination");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AlertDestinationRequest**](AlertDestinationRequest.md)| request |

### Return type

[**AlertDestination**](AlertDestination.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="createRule"></a>
# **createRule**
> AlertRule createRule(request)

Creates Alert rule. Type is ST_DEV or FIXED. Aggregation type is COUNT, AVG or SUM

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
AlertRuleRequest request = new AlertRuleRequest(); // AlertRuleRequest | request
try {
    AlertRule result = apiInstance.createRule(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#createRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AlertRuleRequest**](AlertRuleRequest.md)| request |

### Return type

[**AlertRule**](AlertRule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="deleteActionChainRule"></a>
# **deleteActionChainRule**
> deleteActionChainRule(id)

Deletes Action Chain (Correlation) Alert rule

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
String id = "id_example"; // String | id
try {
    apiInstance.deleteActionChainRule(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#deleteActionChainRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="deleteDestination"></a>
# **deleteDestination**
> deleteDestination(id)

Deletes Alert destination

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
String id = "id_example"; // String | id
try {
    apiInstance.deleteDestination(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#deleteDestination");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="deleteRule"></a>
# **deleteRule**
> deleteRule(id)

Deletes Alert rule

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
String id = "id_example"; // String | id
try {
    apiInstance.deleteRule(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#deleteRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getActionChainAlertRules"></a>
# **getActionChainAlertRules**
> List&lt;ActionChainAlertRule&gt; getActionChainAlertRules()

Gets all Action Chain (Correlation) Alert rules in the organization

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
try {
    List<ActionChainAlertRule> result = apiInstance.getActionChainAlertRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#getActionChainAlertRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ActionChainAlertRule&gt;**](ActionChainAlertRule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getAlertDestinations"></a>
# **getAlertDestinations**
> List&lt;AlertDestination&gt; getAlertDestinations()

Gets all Alert destinations in the organization

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
try {
    List<AlertDestination> result = apiInstance.getAlertDestinations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#getAlertDestinations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AlertDestination&gt;**](AlertDestination.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getAlertRuleRuns"></a>
# **getAlertRuleRuns**
> List&lt;AlertRuleRun&gt; getAlertRuleRuns()

Gets all Alert rule runs in the organization

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
try {
    List<AlertRuleRun> result = apiInstance.getAlertRuleRuns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#getAlertRuleRuns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AlertRuleRun&gt;**](AlertRuleRun.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getAlertRules"></a>
# **getAlertRules**
> List&lt;AlertRule&gt; getAlertRules()

Gets all Alert rules in the organization

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
try {
    List<AlertRule> result = apiInstance.getAlertRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#getAlertRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AlertRule&gt;**](AlertRule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="updateActionChainRule"></a>
# **updateActionChainRule**
> ActionChainAlertRule updateActionChainRule(id, rule)

Updates Action Chain (Correlation) Alert Rule

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
String id = "id_example"; // String | id
ActionChainAlertRule rule = new ActionChainAlertRule(); // ActionChainAlertRule | rule
try {
    ActionChainAlertRule result = apiInstance.updateActionChainRule(id, rule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#updateActionChainRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **rule** | [**ActionChainAlertRule**](ActionChainAlertRule.md)| rule |

### Return type

[**ActionChainAlertRule**](ActionChainAlertRule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="updateDestination"></a>
# **updateDestination**
> AlertDestination updateDestination(id, request)

Updates Alert destination. Type cannot be changed

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
String id = "id_example"; // String | id
AlertDestinationRequest request = new AlertDestinationRequest(); // AlertDestinationRequest | request
try {
    AlertDestination result = apiInstance.updateDestination(id, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#updateDestination");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **request** | [**AlertDestinationRequest**](AlertDestinationRequest.md)| request |

### Return type

[**AlertDestination**](AlertDestination.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="updateRule"></a>
# **updateRule**
> AlertRule updateRule(id, request)

Updates Alert rule. Type is ST_DEV or FIXED. Aggregation type is COUNT, AVG or SUM

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
String id = "id_example"; // String | id
AlertRuleRequest request = new AlertRuleRequest(); // AlertRuleRequest | request
try {
    AlertRule result = apiInstance.updateRule(id, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#updateRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **request** | [**AlertRuleRequest**](AlertRuleRequest.md)| request |

### Return type

[**AlertRule**](AlertRule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

<a name="updateWorkingHours"></a>
# **updateWorkingHours**
> updateWorkingHours(workingHoursDto)

Updates the working hours for the organization

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AlertsApi apiInstance = new AlertsApi();
WorkingHoursDto workingHoursDto = new WorkingHoursDto(); // WorkingHoursDto | workingHoursDto
try {
    apiInstance.updateWorkingHours(workingHoursDto);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#updateWorkingHours");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workingHoursDto** | [**WorkingHoursDto**](WorkingHoursDto.md)| workingHoursDto |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: */*, application/json

