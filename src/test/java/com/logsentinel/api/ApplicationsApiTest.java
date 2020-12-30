/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/en/latest/index.html
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.model.Application;
import java.util.UUID;
import com.logsentinel.model.ApplicationRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationsApi
 */
@Ignore
public class ApplicationsApiTest {

    private final ApplicationsApi api = new ApplicationsApi();

    
    /**
     * Create a new application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createApplicationTest() throws ApiException {
        ApplicationRequest application = null;
        Application response = api.createApplication(application);

        // TODO: test validations
    }
    
    /**
     * Delete an existing application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteApplicationTest() throws ApiException {
        UUID applicationId = null;
        Application response = api.deleteApplication(applicationId);

        // TODO: test validations
    }
    
    /**
     * Get all applications of an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApplicationsTest() throws ApiException {
        List<UUID> response = api.getApplications();

        // TODO: test validations
    }
    
    /**
     * Update an existing application
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateApplicationTest() throws ApiException {
        ApplicationRequest application = null;
        Application response = api.updateApplication(application);

        // TODO: test validations
    }
    
}
