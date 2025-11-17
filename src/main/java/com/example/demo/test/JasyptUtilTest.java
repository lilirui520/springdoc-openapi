package com.example.demo.test;

import com.example.demo.uitil.Demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JasyptUtilTest {
    @Test
    public void test() {
        String pw = "EADVGtEOnoEEE";
        String plainText = "2P761gZfY-9rHe12";
        String encryptedText = Demo.encrypt(plainText,pw);
        System.out.println(encryptedText);
//        System.out.println(Demo.decrypt(encryptedText,pw));
    }
    @Test
    public void test2() {
        String pw = "EADVGtEOnoEEE";
        String user = "8SXAapnk/QmhNOKsHjXVdg==";
        String encryptedText = Demo.decrypt(user,pw);
        System.out.println(encryptedText);

        String mima = "OyMooamXL9dcAPLS4ifwrVXad1M4+QzIOY/MWpW8GDc=";
        String encryptedText1 = Demo.decrypt(mima,pw);
        System.out.println(encryptedText1);
    }
}
