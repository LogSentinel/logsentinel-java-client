package com.logsentinel.util;

import org.apache.commons.codec.digest.DigestUtils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Random;

/**
 * Utility class for encrypting with AES. Uses CBC mode with static IV and random block appended
 * at the beginning of the encrypted data. This way there is no need to know IV when decrypting,
 * but first block must be removed in order to recreate original data.
 */
public class EncryptUtil {

    private static final byte[] IV = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static byte[] encrypt(String data, byte[] encryptionKey, boolean appendRandomBlock)
            throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidKeyException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {

        Key key = new SecretKeySpec(encryptionKey, "AES");
        Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(IV));
        byte[] bytes = data.getBytes();
        byte[] encValue;
        if (appendRandomBlock) {
            //using same IV with random beginning block of bytes is as secure as using random IV
            byte[] withRandomStart = appendRandomBeginning(bytes, 16);
            encValue = c.doFinal(withRandomStart);

        } else {
            encValue = c.doFinal(bytes);
        }
        return encValue;
    }

    public static byte[] hash(byte[] input) {
        return DigestUtils.sha256(input);
    }

    public static String base64Encode(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    private static byte[] appendRandomBeginning(byte[] original, int lenght) {
        byte[] random = new byte[lenght];
        new Random().nextBytes(random);

        byte[] result = new byte[random.length + original.length];
        System.arraycopy(random, 0, result, 0, random.length);
        System.arraycopy(original, 0, result, random.length, original.length);

        return result;
    }
}
