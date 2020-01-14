package com.logsentinel;

import com.logsentinel.api.AlertsApi;
import com.logsentinel.api.ApplicationsApi;
import com.logsentinel.api.GdprLoggingApi;
import com.logsentinel.api.GdprRegisterApi;
import com.logsentinel.api.HashApi;
import com.logsentinel.api.LogHealthcareApi;
import com.logsentinel.api.LogSpecialApi;
import com.logsentinel.api.LoggingApi;
import com.logsentinel.api.OrganizationUsersApi;
import com.logsentinel.api.PartnersApi;
import com.logsentinel.api.SavedSearchesApi;
import com.logsentinel.api.SearchApi;
import com.logsentinel.api.VerificationApi;

/**
 * Main entry point for interacting with LogSentinel APIs
 */
public class LogSentinelClient {

    private LoggingApi auditLogActions;
    private HashApi hashActions;
    private OrganizationUsersApi userActions;
    private ApplicationsApi applicationActions;
    private SearchApi searchActions;
    private VerificationApi verificationActions;
    private LogHealthcareApi healthcareActions;
    private GdprLoggingApi gdprLoggingActions;
    private GdprRegisterApi gdprRegisterActions;
    private AlertsApi alertsActions;
    private LogSpecialApi logSpecialActions;
    private PartnersApi partnersActions;
    private OrganizationUsersApi organizationsActions;
    private SavedSearchesApi savedSearchesActions;
    
    public LogSentinelClient(LoggingApi auditLogActions, HashApi hashActions, OrganizationUsersApi userActions,
            ApplicationsApi applicationActions, SearchApi searchActions, VerificationApi verificationActions,
            LogHealthcareApi healthcareActions, GdprLoggingApi gdprLoggingActions, GdprRegisterApi gdprRegisterActions,
            AlertsApi alertsActions, LogSpecialApi logSpecialActions, PartnersApi partnersActions,
            OrganizationUsersApi organizationsActions, SavedSearchesApi savedSearchesActions) {
        super();
        this.auditLogActions = auditLogActions;
        this.hashActions = hashActions;
        this.userActions = userActions;
        this.applicationActions = applicationActions;
        this.searchActions = searchActions;
        this.verificationActions = verificationActions;
        this.healthcareActions = healthcareActions;
        this.gdprLoggingActions = gdprLoggingActions;
        this.gdprRegisterActions = gdprRegisterActions;
        this.alertsActions = alertsActions;
        this.logSpecialActions = logSpecialActions;
        this.partnersActions = partnersActions;
        this.organizationsActions = organizationsActions;
        this.savedSearchesActions = savedSearchesActions;
    }
    
    public LoggingApi getAuditLogActions() {
        return auditLogActions;
    }
    public HashApi getHashActions() {
        return hashActions;
    }
    public OrganizationUsersApi getUserActions() {
        return userActions;
    }
    public ApplicationsApi getApplicationActions() {
        return applicationActions;
    }
    public SearchApi getSearchActions() {
        return searchActions;
    }
    public VerificationApi getVerificationActions() {
        return verificationActions;
    }
    public LogHealthcareApi getHealthcareActions() {
        return healthcareActions;
    }
    public GdprLoggingApi getGdprLoggingActions() {
        return gdprLoggingActions;
    }
    public GdprRegisterApi getGdprRegisterActions() {
        return gdprRegisterActions;
    }
    public AlertsApi getAlertsActions() {
        return alertsActions;
    }
    public LogSpecialApi getLogSpecialActions() {
        return logSpecialActions;
    }
    public PartnersApi getPartnersActions() {
        return partnersActions;
    }
    public OrganizationUsersApi getOrganizationsActions() {
        return organizationsActions;
    }
    public SavedSearchesApi getSavedSearchesActions() {
        return savedSearchesActions;
    }
}
