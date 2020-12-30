package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.ActionChainAlertRule;
import com.logsentinel.model.AlertDestination;
import com.logsentinel.model.AlertDestinationRequest;
import com.logsentinel.model.AlertRule;
import com.logsentinel.model.AlertRuleRequest;
import com.logsentinel.model.AlertRuleRun;
import java.util.UUID;
import com.logsentinel.model.WorkingHoursDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AlertsApi {
  private ApiClient apiClient;

  public AlertsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlertsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates Action Chain (Correlation) Alert Rule
   * 
   * @param alertRule alertRule (required)
   * @return ActionChainAlertRule
   * @throws ApiException if fails to make API call
   */
  public ActionChainAlertRule createActionChainRule(ActionChainAlertRule alertRule) throws ApiException {
    return createActionChainRuleWithHttpInfo(alertRule).getData();
      }

  /**
   * Creates Action Chain (Correlation) Alert Rule
   * 
   * @param alertRule alertRule (required)
   * @return ApiResponse&lt;ActionChainAlertRule&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ActionChainAlertRule> createActionChainRuleWithHttpInfo(ActionChainAlertRule alertRule) throws ApiException {
    Object localVarPostBody = alertRule;
    
    // verify the required parameter 'alertRule' is set
    if (alertRule == null) {
      throw new ApiException(400, "Missing the required parameter 'alertRule' when calling createActionChainRule");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/actionChainRule";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ActionChainAlertRule> localVarReturnType = new GenericType<ActionChainAlertRule>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates Alert destination. Type is EMAIL or TELEGRAM
   * 
   * @param request request (required)
   * @return AlertDestination
   * @throws ApiException if fails to make API call
   */
  public AlertDestination createDestination(AlertDestinationRequest request) throws ApiException {
    return createDestinationWithHttpInfo(request).getData();
      }

  /**
   * Creates Alert destination. Type is EMAIL or TELEGRAM
   * 
   * @param request request (required)
   * @return ApiResponse&lt;AlertDestination&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AlertDestination> createDestinationWithHttpInfo(AlertDestinationRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling createDestination");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/destination";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<AlertDestination> localVarReturnType = new GenericType<AlertDestination>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates Alert rule. Type is ST_DEV or FIXED. Aggregation type is COUNT, AVG or SUM
   * 
   * @param request request (required)
   * @return AlertRule
   * @throws ApiException if fails to make API call
   */
  public AlertRule createRule(AlertRuleRequest request) throws ApiException {
    return createRuleWithHttpInfo(request).getData();
      }

  /**
   * Creates Alert rule. Type is ST_DEV or FIXED. Aggregation type is COUNT, AVG or SUM
   * 
   * @param request request (required)
   * @return ApiResponse&lt;AlertRule&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AlertRule> createRuleWithHttpInfo(AlertRuleRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling createRule");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/rule";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<AlertRule> localVarReturnType = new GenericType<AlertRule>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes Action Chain (Correlation) Alert rule
   * 
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteActionChainRule(String id) throws ApiException {

    deleteActionChainRuleWithHttpInfo(id);
  }

  /**
   * Deletes Action Chain (Correlation) Alert rule
   * 
   * @param id id (required)
   * @return api response
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteActionChainRuleWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteActionChainRule");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/actionChainRule";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes Alert destination
   * 
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDestination(String id) throws ApiException {

    deleteDestinationWithHttpInfo(id);
  }

  /**
   * Deletes Alert destination
   * 
   * @param id id (required)
   * @return api response
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDestinationWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDestination");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/destination";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes Alert rule
   * 
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRule(String id) throws ApiException {

    deleteRuleWithHttpInfo(id);
  }

  /**
   * Deletes Alert rule
   * 
   * @param id id (required)
   * @return api response
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRuleWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRule");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/rule";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Gets all Action Chain (Correlation) Alert rules in the organization
   * 
   * @return List&lt;ActionChainAlertRule&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ActionChainAlertRule> getActionChainAlertRules() throws ApiException {
    return getActionChainAlertRulesWithHttpInfo().getData();
      }

  /**
   * Gets all Action Chain (Correlation) Alert rules in the organization
   * 
   * @return ApiResponse&lt;List&lt;ActionChainAlertRule&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ActionChainAlertRule>> getActionChainAlertRulesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/alerts/actionChainRules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<ActionChainAlertRule>> localVarReturnType = new GenericType<List<ActionChainAlertRule>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets all Alert destinations in the organization
   * 
   * @return List&lt;AlertDestination&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AlertDestination> getAlertDestinations() throws ApiException {
    return getAlertDestinationsWithHttpInfo().getData();
      }

  /**
   * Gets all Alert destinations in the organization
   * 
   * @return ApiResponse&lt;List&lt;AlertDestination&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AlertDestination>> getAlertDestinationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/alerts/destinations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<AlertDestination>> localVarReturnType = new GenericType<List<AlertDestination>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets all Alert rule runs in the organization
   * 
   * @return List&lt;AlertRuleRun&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AlertRuleRun> getAlertRuleRuns() throws ApiException {
    return getAlertRuleRunsWithHttpInfo().getData();
      }

  /**
   * Gets all Alert rule runs in the organization
   * 
   * @return ApiResponse&lt;List&lt;AlertRuleRun&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AlertRuleRun>> getAlertRuleRunsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/alerts/runs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<AlertRuleRun>> localVarReturnType = new GenericType<List<AlertRuleRun>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets all Alert rules in the organization
   * 
   * @return List&lt;AlertRule&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AlertRule> getAlertRules() throws ApiException {
    return getAlertRulesWithHttpInfo().getData();
      }

  /**
   * Gets all Alert rules in the organization
   * 
   * @return ApiResponse&lt;List&lt;AlertRule&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AlertRule>> getAlertRulesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/alerts/rules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<AlertRule>> localVarReturnType = new GenericType<List<AlertRule>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getRulesByApplication
   * 
   * @param applicationId applicationId (required)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   */
  public List<UUID> getRulesByApplication(UUID applicationId) throws ApiException {
    return getRulesByApplicationWithHttpInfo(applicationId).getData();
      }

  /**
   * getRulesByApplication
   * 
   * @param applicationId applicationId (required)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<UUID>> getRulesByApplicationWithHttpInfo(UUID applicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getRulesByApplication");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/application-rule-mapping";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "applicationId", applicationId));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates Action Chain (Correlation) Alert Rule
   * 
   * @param id id (required)
   * @param rule rule (required)
   * @return ActionChainAlertRule
   * @throws ApiException if fails to make API call
   */
  public ActionChainAlertRule updateActionChainRule(String id, ActionChainAlertRule rule) throws ApiException {
    return updateActionChainRuleWithHttpInfo(id, rule).getData();
      }

  /**
   * Updates Action Chain (Correlation) Alert Rule
   * 
   * @param id id (required)
   * @param rule rule (required)
   * @return ApiResponse&lt;ActionChainAlertRule&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ActionChainAlertRule> updateActionChainRuleWithHttpInfo(String id, ActionChainAlertRule rule) throws ApiException {
    Object localVarPostBody = rule;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateActionChainRule");
    }
    
    // verify the required parameter 'rule' is set
    if (rule == null) {
      throw new ApiException(400, "Missing the required parameter 'rule' when calling updateActionChainRule");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/actionChainRule";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ActionChainAlertRule> localVarReturnType = new GenericType<ActionChainAlertRule>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates Alert destination. Type cannot be changed
   * 
   * @param id id (required)
   * @param request request (required)
   * @return AlertDestination
   * @throws ApiException if fails to make API call
   */
  public AlertDestination updateDestination(String id, AlertDestinationRequest request) throws ApiException {
    return updateDestinationWithHttpInfo(id, request).getData();
      }

  /**
   * Updates Alert destination. Type cannot be changed
   * 
   * @param id id (required)
   * @param request request (required)
   * @return ApiResponse&lt;AlertDestination&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AlertDestination> updateDestinationWithHttpInfo(String id, AlertDestinationRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateDestination");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling updateDestination");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/destination";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<AlertDestination> localVarReturnType = new GenericType<AlertDestination>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates Alert rule. Type is ST_DEV or FIXED. Aggregation type is COUNT, AVG or SUM
   * 
   * @param id id (required)
   * @param request request (required)
   * @return AlertRule
   * @throws ApiException if fails to make API call
   */
  public AlertRule updateRule(String id, AlertRuleRequest request) throws ApiException {
    return updateRuleWithHttpInfo(id, request).getData();
      }

  /**
   * Updates Alert rule. Type is ST_DEV or FIXED. Aggregation type is COUNT, AVG or SUM
   * 
   * @param id id (required)
   * @param request request (required)
   * @return ApiResponse&lt;AlertRule&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AlertRule> updateRuleWithHttpInfo(String id, AlertRuleRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateRule");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling updateRule");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/rule";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<AlertRule> localVarReturnType = new GenericType<AlertRule>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates the working hours for the organization
   * 
   * @param workingHoursDto workingHoursDto (required)
   * @throws ApiException if fails to make API call
   */
  public void updateWorkingHours(WorkingHoursDto workingHoursDto) throws ApiException {

    updateWorkingHoursWithHttpInfo(workingHoursDto);
  }

  /**
   * Updates the working hours for the organization
   * 
   * @param workingHoursDto workingHoursDto (required)
   * @return api response
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateWorkingHoursWithHttpInfo(WorkingHoursDto workingHoursDto) throws ApiException {
    Object localVarPostBody = workingHoursDto;
    
    // verify the required parameter 'workingHoursDto' is set
    if (workingHoursDto == null) {
      throw new ApiException(400, "Missing the required parameter 'workingHoursDto' when calling updateWorkingHours");
    }
    
    // create path and map variables
    String localVarPath = "/api/alerts/updateWorkingHours";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
