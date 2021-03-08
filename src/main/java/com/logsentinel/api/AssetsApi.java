package com.logsentinel.api;

import com.logsentinel.*;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Api class for managing assets
 */

public class AssetsApi {
    private ApiClient apiClient;

    public AssetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AssetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return this.apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }


    /**
     * Creates Asset
     * Asset details:
     * @param ip             (required)
     * @param port           (required)
     * @param protocol       - TCP/UDP(required)
     * @param serviceName    (required)
     * @param sourceCategory
     * @param riskLevel
     * End Asset details
     * @throws ApiException if fails to make API call
     */
    public ApiResponse<Void> insertAsset(String ip, int port, String protocol, String serviceName,
                                         String sourceCategory, Integer riskLevel)
            throws ApiException {
        if (ip == null || protocol == null || port == 0) {
            throw new ApiException("Missing the required parameter/s when calling inserAsset");
        } else {
            String localVarPath = "/api/assets/insert";

            List<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("ip", ip));
            queryParams.add(new Pair("port", String.valueOf(port)));
            queryParams.add(new Pair("protocol", protocol));
            queryParams.add(new Pair("serviceName", serviceName));
            if (sourceCategory != null) {
                queryParams.add(new Pair("sourceCategory", sourceCategory));
            }
            if (riskLevel != null) {
                queryParams.add(new Pair("riskLevel", String.valueOf(riskLevel)));
            }

            Map<String, String> localVarHeaderParams = new HashMap();
            Map<String, Object> localVarFormParams = new HashMap();


            final String[] localVarAccepts = new String[]{
                    "*/*", "application/json"
            };

            final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);

            final String[] localVarContentTypes = new String[]{
                    "application/json", "*/*"
            };

            final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);

            final String[] localVarAuthNames = new String[]{
                    "basicAuth"
            };

            return this.apiClient.invokeAPI(localVarPath, "POST", queryParams, null, localVarHeaderParams, localVarFormParams,
                    localVarAccept, localVarContentType, localVarAuthNames, (GenericType) null);
        }
    }

    /**
     * Checks if Asset exists
     * Asset details:
     * @param ip       (required)
     * @param port     (required)
     * @param protocol - TCP/UDP(required)
     * End Asset details
     * @throws ApiException if fails to make API call
     */
    public ApiResponse<Boolean> assetExists(String ip, int port, String protocol) throws ApiException {
        String localVarPath = "/api/assets/exists";

        List<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("ip", ip));
        queryParams.add(new Pair("port", String.valueOf(port)));
        queryParams.add(new Pair("protocol", protocol));

        Map<String, String> localVarHeaderParams = new HashMap();
        Map<String, Object> localVarFormParams = new HashMap();

        String[] localVarAccepts = new String[]{
                "*/*", "application/json"
        };

        String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        String[] localVarContentTypes = new String[]{
                "application/json", "*/*"
        };

        String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        String[] localVarAuthNames = new String[]{
                "basicAuth"
        };
        GenericType<Boolean> localVarReturnType = new GenericType<>() {
        };

        return this.apiClient.invokeAPI(localVarPath, "GET", queryParams, null, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
