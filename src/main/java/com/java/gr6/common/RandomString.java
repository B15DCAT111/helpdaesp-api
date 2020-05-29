package com.java.gr6.common;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString {

    public static String randomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return RandomStringUtils.random(8, characters);
    }
    public static void main(String[] args) {
        RandomString randomString = new RandomString();
        String s = randomString.randomPassword();
        System.out.println(s);
    }
}
