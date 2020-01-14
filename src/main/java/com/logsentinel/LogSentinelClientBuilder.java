package com.logsentinel;

import java.security.PrivateKey;

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
 * Builder used to create an instance of the LogSentinel client.
 *
 * @author bozho
 */
public class LogSentinelClientBuilder {

    private String applicationId;
    private String organizationId;
    private String secret;

    private byte[] encryptionKey;
    private PrivateKey signingKey;
    private BodySerializer bodySerializer;
    private String basePath;
    private EncryptingKeywordExtractor encryptingKeywordExtractor;
    private boolean async;

    public static LogSentinelClientBuilder create(String applicationId, String organizationId, String secret) {
        LogSentinelClientBuilder builder = new LogSentinelClientBuilder();
        return builder.setApplicationId(applicationId)
                .setOrganizationId(organizationId)
                .setSecret(secret);
    }

    public LogSentinelClient build() {
        ApiClient apiClient = new ApiClient();
        if (basePath != null) {
            apiClient.setBasePath(basePath);
        }
        apiClient.setUsername(organizationId.trim());
        apiClient.setPassword(secret.trim());


        if (applicationId != null) {
            apiClient.addDefaultHeader("Application-Id", applicationId.trim());
        }

        BodySerializer serializer = bodySerializer != null ? bodySerializer : new JsonBodySerializer(apiClient.getJSON());
        if (encryptionKey != null) {
            serializer = new EncryptingBodySerializer(encryptionKey, serializer);
        }
        BodySigner signer = null;
        if (signingKey != null) {
            signer = new BodySigner(signingKey);
        }

        LoggingApi auditLogApi = new LoggingApi(apiClient, serializer, signer, encryptingKeywordExtractor);
        HashApi hashApi = new HashApi(apiClient, serializer, signer, encryptingKeywordExtractor);
        OrganizationUsersApi userApi = new OrganizationUsersApi(apiClient);
        ApplicationsApi applicationApi = new ApplicationsApi(apiClient);
        SearchApi searchApi = new SearchApi(apiClient);
        VerificationApi verificationApi = new VerificationApi(apiClient);
        GdprRegisterApi registerApi = new GdprRegisterApi(apiClient);
        GdprLoggingApi gdprLoggingApi = new GdprLoggingApi(apiClient);
        AlertsApi alertsApi = new AlertsApi(apiClient);
        LogHealthcareApi healthcareApi = new LogHealthcareApi(apiClient);
        LogSpecialApi logSpecialApi = new LogSpecialApi(apiClient);
        PartnersApi partnersApi = new PartnersApi(apiClient);
        SavedSearchesApi savedSearchApi = new SavedSearchesApi(apiClient);

        LogSentinelClient client = new LogSentinelClient(auditLogApi, hashApi, userApi,
                applicationApi, searchApi, verificationApi, healthcareApi, gdprLoggingApi, 
                registerApi, alertsApi, logSpecialApi, partnersApi, userApi, savedSearchApi);
        return client;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public LogSentinelClientBuilder setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public LogSentinelClientBuilder setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public LogSentinelClientBuilder setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public byte[] getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the (symmetric) key used to encrypt outgoing messages. If not set, messages are
     * set unencrypted. Also sets encrypting keyword extractor and so enable encrypted search.
     * Refer to the LogSentniel documentation to get more
     * information on when and why you should encrypt the requests
     *
     * @param keyBytes The key. Must be 16 or 32 bytes (128/256 bit)
     * @return the builder
     */
    public LogSentinelClientBuilder setEncryptionKey(byte[] keyBytes) {
        validateEncryptionKeyBytesLength(keyBytes);
        this.encryptionKey = keyBytes;
        this.encryptingKeywordExtractor = new LuceneEncryptingKeywordExtractor(encryptionKey);
        return this;
    }

    public BodySerializer getBodySerializer() {
        return bodySerializer;
    }

    /**
     * Sets a custom body serializer. If none is specified, JSON serializer is used for the body
     *
     * @param bodySerializer an implementation of body serializer
     * @return the builder
     */
    public LogSentinelClientBuilder setBodySerializer(BodySerializer bodySerializer) {
        this.bodySerializer = bodySerializer;
        return this;
    }

    public String getBasePath() {
        return basePath;
    }

    /**
     * Sets a custom base path for the API, other than logsentinel.com. Should
     * be used when running a local/hosted instance rather than using the cloud
     * one
     *
     * @param basePath the root url of the logsentinel installation
     * @return the builder
     */
    public LogSentinelClientBuilder setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * Sets a signing key for this client. The signing key is used to sign request details in order
     * to make sure no attacker can insert fake records if they gain control on a logging server
     *
     * @param signingKey the private key to use for request body signing
     * @return the builder
     */
    public LogSentinelClientBuilder setSigningKey(PrivateKey signingKey) {
        this.signingKey = signingKey;
        return this;
    }

    private void validateEncryptionKeyPhraseLength(String keyPhrase) {
        if (keyPhrase.length() != 8 && keyPhrase.length() != 16) {
            throw new IllegalArgumentException("Illegal key phrase length: " + keyPhrase.length()
                    + ". Must be 8 or 16");
        }
    }

    private void validateEncryptionKeyBytesLength(byte[] keyBytes) {
        if (keyBytes.length != 16 && keyBytes.length != 32) {
            throw new IllegalArgumentException("Illegal key length: " + keyBytes.length
                    + ". Must be 16 or 32");
        }
    }

    public LogSentinelClientBuilder setAsync(boolean async) {
        this.async = async;
        return this;
    }
    
    

}
