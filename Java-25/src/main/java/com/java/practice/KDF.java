package com.java.practice;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

public class KDF {
    void main() throws NoSuchAlgorithmException, InvalidKeySpecException {

        // 1.) Password provided by the user
        char[] password = "Lavish".toCharArray();

        // 2.) Generate a random salt for extra security
        byte[] salt = new byte[16];
        new SecureRandom().nextBytes(salt);

        // 3.) PBKDF2 parameters: password, salt, iteration, key length
        PBEKeySpec spec = new PBEKeySpec(password,salt,2000,256);

        // 4.) Create the key factory and generate the derived key
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        SecretKey derivedKey = factory.generateSecret(spec);

        // 5.) Show results
        System.out.println("Derived key (hex): " + bytesToHex(derivedKey.getEncoded()));
        System.out.println("Salt used (hex): " + bytesToHex(salt));

    }

    // Helper method to convert bytes to hex string
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
