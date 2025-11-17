package com.example.demo.test;



@SpringBootTest

public class XuexiSteamTest {
    @Test
    public void test() {
        String str = "1,2,3,4,5,6,7,8,9,10";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
