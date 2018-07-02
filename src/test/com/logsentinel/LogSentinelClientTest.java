package com.logsentinel;
import com.logsentinel.client.model.*;
import org.bouncycastle.asn1.*;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import org.bouncycastle.crypto.util.PrivateKeyFactory;

import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;

public class LogSentinelClientTest {
    private String applicationId = "38773350-6a64-11e8-a7b3-cfa432063561";
    private String organizationId = "387648f0-6a64-11e8-a7b3-cfa432063561";
    private String secret = "bedaac15925a2e46eed80d5b5276fd91764d3ea4fb5ac2b44bd6e06e4c83be87";

    @Test
    public void getVerificationActions() {
        LogSentinelClientBuilder builder = LogSentinelClientBuilder
                .create(applicationId, applicationId, secret);
        LogSentinelClient client = builder.build();

        try {
            LogInfo logInfo = client.getVerificationActions().getMerkleTreeInfoUsingGET();

            Assert.assertNotNull(logInfo);
            Assert.assertEquals("2.16.840.1.101.3.4.2.3", logInfo.getLeafHashAlgorithmOid());
            Assert.assertEquals("2.16.840.1.101.3.4.2.1", logInfo.getHashAlgorithmOid());
            Assert.assertEquals("1.2.840.113549.1.1.13", logInfo.getTimestampAlgorithmOid());

            TreeHead treeHead = client.getVerificationActions().getLatestTreeHeadUsingGET(applicationId);

            Assert.assertNotNull(treeHead);
            Assert.assertTrue(treeHead.getTreeSize() > 0);
            Assert.assertNotEquals(treeHead.getTimestampToken(), "");
            Assert.assertNotEquals(treeHead.getRootHash(), "");

            List<AuditLogEntry> logEntries = client.getVerificationActions().getEntriesBetweenHashesUsingGET("",
                    "", applicationId);

            Assert.assertNotNull(logEntries);
            Assert.assertTrue(logEntries.size() > 0);

            for (AuditLogEntry entry : logEntries) {
                Assert.assertNotNull(entry.getHash());
                Assert.assertNotNull(entry.getTimestampTime());
                Assert.assertNotNull(entry.getPreviousEntryId());
                Assert.assertNotNull(entry.getEntityId());
            }

            InclusionProof inclusionProof = client.getVerificationActions().getInclusionProofUsingGET(
                    "7CVj0TceYdKTAa2P16noGeqZLm_HN7NL5g1J-WHBcJjgA44-4zQW0rUaQlu8SiUJoSp8mabN0Zza5g6c6MIq_Q==",
                    applicationId);

            Assert.assertNotNull(inclusionProof);
            Assert.assertNotEquals(inclusionProof.getHash(), "");
            Assert.assertEquals("7CVj0TceYdKTAa2P16noGeqZLm_HN7NL5g1J-WHBcJjgA44-4zQW0rUaQlu8SiUJoSp8mabN0Zza5g6c6MIq_Q==",
                    inclusionProof.getHash());
            Assert.assertTrue(inclusionProof.getIndex() >= 0);
            Assert.assertTrue(inclusionProof.getPath().size() > 0);
            Assert.assertTrue(inclusionProof.getTreeSize() > 0);
            Assert.assertNotEquals(inclusionProof.getRootHash(), "");

            ConsistencyProof consistencyProof = client.getVerificationActions().getConsistencyProofUsingGET(
                    "7CVj0TceYdKTAa2P16noGeqZLm_HN7NL5g1J-WHBcJjgA44-4zQW0rUaQlu8SiUJoSp8mabN0Zza5g6c6MIq_Q==",
                    applicationId, "");

            Assert.assertNotNull(consistencyProof);
            Assert.assertNotEquals(consistencyProof.getFirstHash(), "");
            Assert.assertEquals("7CVj0TceYdKTAa2P16noGeqZLm_HN7NL5g1J-WHBcJjgA44-4zQW0rUaQlu8SiUJoSp8mabN0Zza5g6c6MIq_Q==",
                    consistencyProof.getFirstHash());
            Assert.assertNotEquals(consistencyProof.getSecondHash(), "");
            Assert.assertEquals("", consistencyProof.getSecondHash());
            Assert.assertTrue(consistencyProof.getFirstTreeSize() > 0);
            Assert.assertTrue(consistencyProof.getSecondTreeSize() > 0);
            Assert.assertTrue(consistencyProof.getPath().size() > 0);

            /*
            try {
                byte[] publicKey = Base64.getUrlDecoder().decode(result.getPublicKey());

                ByteArrayInputStream bIn = new ByteArrayInputStream(publicKey);
                ASN1InputStream aIn = new ASN1InputStream(bIn);

                ASN1ObjectIdentifier c = new ASN1ObjectIdentifier("1.2.840.113549.1.1.1");
                AlgorithmIdentifier alg = new AlgorithmIdentifier(c);
                SubjectPublicKeyInfo subk = new SubjectPublicKeyInfo(alg, aIn.readObject());

                X509EncodedKeySpec spec =
                        new X509EncodedKeySpec(subk.parsePublicKey().getEncoded());
                KeyFactory kf = KeyFactory.getInstance("RSA");

                Assert.assertNotNull(kf.generatePublic(spec));
            }
            catch (NoSuchAlgorithmException|InvalidKeySpecException|IOException e) {
                System.err.println("Exception when importing public key");
                e.printStackTrace();
            }
            */
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogControllerApi#logAuthAction");
            e.printStackTrace();
        }
    }
}