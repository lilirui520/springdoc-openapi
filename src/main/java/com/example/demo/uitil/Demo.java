package com.example.demo.uitil;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;


public  class Demo {

    /**
     * 基础加密
     */
    public static String encrypt(String plainText,String password ) {
        String algorithm = "PBEWithMD5AndDES";
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(password);
        encryptor.setAlgorithm(algorithm);
        return encryptor.encrypt(plainText);
    }
    /**
     * 基础解密
     */
    public static String decrypt(String encryptedText, String password) {
        String algorithm = "PBEWithMD5AndDES";
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(password);
        encryptor.setAlgorithm(algorithm);
        return encryptor.decrypt(encryptedText);
    }


}
