package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.AuditLogEntry;
import com.logsentinel.model.ConsistencyProof;
import com.logsentinel.model.EthereumData;
import com.logsentinel.model.InclusionProof;
import com.logsentinel.model.MerkleTreeInfo;
import com.logsentinel.model.ResolvedVerificationFailureResponse;
import com.logsentinel.model.TreeHead;
import java.util.UUID;
import com.logsentinel.model.Verification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VerificationApi {
  private ApiClient apiClient;

  public VerificationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VerificationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get consistency proof for an application merkle tree. Async operation, as the generation may be slow
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param firstTreeHash firstTreeHash (required)
   * @param secondTreeHash secondTreeHash (optional, default to -1)
   * @return ConsistencyProof
   * @throws ApiException if fails to make API call
   */
  public ConsistencyProof getConsistencyProof(UUID applicationId, String firstTreeHash, String secondTreeHash) throws ApiException {
    return getConsistencyProofWithHttpInfo(applicationId, firstTreeHash, secondTreeHash).getData();
      }

  /**
   * Get consistency proof for an application merkle tree. Async operation, as the generation may be slow
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param firstTreeHash firstTreeHash (required)
   * @param secondTreeHash secondTreeHash (optional, default to -1)
   * @return ApiResponse&lt;ConsistencyProof&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsistencyProof> getConsistencyProofWithHttpInfo(UUID applicationId, String firstTreeHash, String secondTreeHash) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getConsistencyProof");
    }
    
    // verify the required parameter 'firstTreeHash' is set
    if (firstTreeHash == null) {
      throw new ApiException(400, "Missing the required parameter 'firstTreeHash' when calling getConsistencyProof");
    }
    
    // create path and map variables
    String localVarPath = "/api/verification/merkle/proofs/consistency";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstTreeHash", firstTreeHash));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "secondTreeHash", secondTreeHash));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<ConsistencyProof> localVarReturnType = new GenericType<ConsistencyProof>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all entries between two hashes
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param endHash endHash (required)
   * @param startHash startHash (required)
   * @return List&lt;AuditLogEntry&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AuditLogEntry> getEntriesBetweenHashes(UUID applicationId, String endHash, String startHash) throws ApiException {
    return getEntriesBetweenHashesWithHttpInfo(applicationId, endHash, startHash).getData();
      }

  /**
   * Get all entries between two hashes
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param endHash endHash (required)
   * @param startHash startHash (required)
   * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AuditLogEntry>> getEntriesBetweenHashesWithHttpInfo(UUID applicationId, String endHash, String startHash) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getEntriesBetweenHashes");
    }
    
    // verify the required parameter 'endHash' is set
    if (endHash == null) {
      throw new ApiException(400, "Missing the required parameter 'endHash' when calling getEntriesBetweenHashes");
    }
    
    // verify the required parameter 'startHash' is set
    if (startHash == null) {
      throw new ApiException(400, "Missing the required parameter 'startHash' when calling getEntriesBetweenHashes");
    }
    
    // create path and map variables
    String localVarPath = "/api/verification/entries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endHash", endHash));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startHash", startHash));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<AuditLogEntry>> localVarReturnType = new GenericType<List<AuditLogEntry>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetch all hashes pushed to Ethereum for a given application
   * 
   * @param applicationId applicationId (required)
   * @return List&lt;EthereumData&gt;
   * @throws ApiException if fails to make API call
   */
  public List<EthereumData> getEthereumEntries(UUID applicationId) throws ApiException {
    return getEthereumEntriesWithHttpInfo(applicationId).getData();
      }

  /**
   * Fetch all hashes pushed to Ethereum for a given application
   * 
   * @param applicationId applicationId (required)
   * @return ApiResponse&lt;List&lt;EthereumData&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<EthereumData>> getEthereumEntriesWithHttpInfo(UUID applicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getEthereumEntries");
    }
    
    // create path and map variables
    String localVarPath = "/api/verification/ethereumEntries";

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

    GenericType<List<EthereumData>> localVarReturnType = new GenericType<List<EthereumData>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get inclusion proof for the application merkle tree. Async operation, as the generation may be slow
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param hash Hash of the entry to verify (required)
   * @return InclusionProof
   * @throws ApiException if fails to make API call
   */
  public InclusionProof getInclusionProof(UUID applicationId, String hash) throws ApiException {
    return getInclusionProofWithHttpInfo(applicationId, hash).getData();
      }

  /**
   * Get inclusion proof for the application merkle tree. Async operation, as the generation may be slow
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param hash Hash of the entry to verify (required)
   * @return ApiResponse&lt;InclusionProof&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InclusionProof> getInclusionProofWithHttpInfo(UUID applicationId, String hash) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getInclusionProof");
    }
    
    // verify the required parameter 'hash' is set
    if (hash == null) {
      throw new ApiException(400, "Missing the required parameter 'hash' when calling getInclusionProof");
    }
    
    // create path and map variables
    String localVarPath = "/api/verification/merkle/proofs/inclusion";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hash", hash));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<InclusionProof> localVarReturnType = new GenericType<InclusionProof>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get latest tree head of the application merkle tree. Async operation, as the operation may be slow
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @return TreeHead
   * @throws ApiException if fails to make API call
   */
  public TreeHead getLatestTreeHead(UUID applicationId) throws ApiException {
    return getLatestTreeHeadWithHttpInfo(applicationId).getData();
      }

  /**
   * Get latest tree head of the application merkle tree. Async operation, as the operation may be slow
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @return ApiResponse&lt;TreeHead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TreeHead> getLatestTreeHeadWithHttpInfo(UUID applicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getLatestTreeHead");
    }
    
    // create path and map variables
    String localVarPath = "/api/verification/merkle/latestTreeHead";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<TreeHead> localVarReturnType = new GenericType<TreeHead>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get general info about merkle tree parameters
   * 
   * @return MerkleTreeInfo
   * @throws ApiException if fails to make API call
   */
  public MerkleTreeInfo getMerkleTreeInfo() throws ApiException {
    return getMerkleTreeInfoWithHttpInfo().getData();
      }

  /**
   * Get general info about merkle tree parameters
   * 
   * @return ApiResponse&lt;MerkleTreeInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MerkleTreeInfo> getMerkleTreeInfoWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/verification/merkle/info";

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

    GenericType<MerkleTreeInfo> localVarReturnType = new GenericType<MerkleTreeInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all resolved verification failures
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @return List&lt;ResolvedVerificationFailureResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ResolvedVerificationFailureResponse> getResolvedVerificationFailures(UUID applicationId) throws ApiException {
    return getResolvedVerificationFailuresWithHttpInfo(applicationId).getData();
      }

  /**
   * Get all resolved verification failures
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @return ApiResponse&lt;List&lt;ResolvedVerificationFailureResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ResolvedVerificationFailureResponse>> getResolvedVerificationFailuresWithHttpInfo(UUID applicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getResolvedVerificationFailures");
    }
    
    // create path and map variables
    String localVarPath = "/api/verification/resolved-failures";

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
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<ResolvedVerificationFailureResponse>> localVarReturnType = new GenericType<List<ResolvedVerificationFailureResponse>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verify whether a given hash is present, indicating that the log is intact
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param hash Hash of the entry to verify (required)
   * @return Verification
   * @throws ApiException if fails to make API call
   */
  public Verification verify(String applicationId, String hash) throws ApiException {
    return verifyWithHttpInfo(applicationId, hash).getData();
      }

  /**
   * Verify whether a given hash is present, indicating that the log is intact
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param hash Hash of the entry to verify (required)
   * @return ApiResponse&lt;Verification&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Verification> verifyWithHttpInfo(String applicationId, String hash) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling verify");
    }
    
    // verify the required parameter 'hash' is set
    if (hash == null) {
      throw new ApiException(400, "Missing the required parameter 'hash' when calling verify");
    }
    
    // create path and map variables
    String localVarPath = "/api/verification/verify";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hash", hash));

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

    GenericType<Verification> localVarReturnType = new GenericType<Verification>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verify whether a given entry&#39;s hash is present, indicating that the log is intact
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return Verification
   * @throws ApiException if fails to make API call
   */
  public Verification verifyEntry(String applicationId, String entryId) throws ApiException {
    return verifyEntryWithHttpInfo(applicationId, entryId).getData();
      }

  /**
   * Verify whether a given entry&#39;s hash is present, indicating that the log is intact
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return ApiResponse&lt;Verification&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Verification> verifyEntryWithHttpInfo(String applicationId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling verifyEntry");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling verifyEntry");
    }
    
    // create path and map variables
    String localVarPath = "/api/verification/verifyEntry";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entryId", entryId));

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

    GenericType<Verification> localVarReturnType = new GenericType<Verification>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
