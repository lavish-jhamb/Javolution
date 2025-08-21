package com.java.practice;

import javax.crypto.KeyAgreement;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class KEMDemo {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        KeyPair kp = kpg.generateKeyPair();

        KeyAgreement agreement = KeyAgreement.getInstance("X25519");
        // (simplified demo – real use involves encapsulation & decapsulation steps)
    }
}