package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.LogResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogHealthcareApi {
  private ApiClient apiClient;

  public LogHealthcareApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogHealthcareApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Logs a DICOM audit message
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param dicomAuditEvent dicomAuditEvent (required)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logDicomEvent(String applicationId, String dicomAuditEvent) throws ApiException {
    return logDicomEventWithHttpInfo(applicationId, dicomAuditEvent).getData();
      }

  /**
   * Logs a DICOM audit message
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param dicomAuditEvent dicomAuditEvent (required)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logDicomEventWithHttpInfo(String applicationId, String dicomAuditEvent) throws ApiException {
    Object localVarPostBody = dicomAuditEvent;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logDicomEvent");
    }
    
    // verify the required parameter 'dicomAuditEvent' is set
    if (dicomAuditEvent == null) {
      throw new ApiException(400, "Missing the required parameter 'dicomAuditEvent' when calling logDicomEvent");
    }
    
    // create path and map variables
    String localVarPath = "/api/dicom/log";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Logs a FHIR audit event in order to help with HIPAA compliance
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param fhirAuditEvent A record of an FHIR event made for purposes of maintaining a security log. See https://www.hl7.org/fhir/auditevent.html (required)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logFhirEvent(String applicationId, String fhirAuditEvent) throws ApiException {
    return logFhirEventWithHttpInfo(applicationId, fhirAuditEvent).getData();
      }

  /**
   * Logs a FHIR audit event in order to help with HIPAA compliance
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param fhirAuditEvent A record of an FHIR event made for purposes of maintaining a security log. See https://www.hl7.org/fhir/auditevent.html (required)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logFhirEventWithHttpInfo(String applicationId, String fhirAuditEvent) throws ApiException {
    Object localVarPostBody = fhirAuditEvent;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logFhirEvent");
    }
    
    // verify the required parameter 'fhirAuditEvent' is set
    if (fhirAuditEvent == null) {
      throw new ApiException(400, "Missing the required parameter 'fhirAuditEvent' when calling logFhirEvent");
    }
    
    // create path and map variables
    String localVarPath = "/api/fhir/log";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Logs an IHE audit message
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param iheAuditEvent iheAuditEvent (required)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logIheEvent(String applicationId, String iheAuditEvent) throws ApiException {
    return logIheEventWithHttpInfo(applicationId, iheAuditEvent).getData();
      }

  /**
   * Logs an IHE audit message
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param iheAuditEvent iheAuditEvent (required)
   * @return ApiResponse&lt;LogResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LogResponse> logIheEventWithHttpInfo(String applicationId, String iheAuditEvent) throws ApiException {
    Object localVarPostBody = iheAuditEvent;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logIheEvent");
    }
    
    // verify the required parameter 'iheAuditEvent' is set
    if (iheAuditEvent == null) {
      throw new ApiException(400, "Missing the required parameter 'iheAuditEvent' when calling logIheEvent");
    }
    
    // create path and map variables
    String localVarPath = "/api/ihe/log";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
