package com.jackiew.jdk.encryption;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestDemo {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        byte[] plainText = "This is a test!".getBytes("UTF8");
        //
        // get a message digest object using the MD5 algorithm
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        //
        // print out the provider used
        System.out.println("\n" + messageDigest.getProvider().getInfo());
        //
        // calculate the digest and print it out
        messageDigest.update(plainText);
        System.out.println("\nDigest: ");
        System.out.println(new String(messageDigest.digest(), "UTF8"));
    }
}
