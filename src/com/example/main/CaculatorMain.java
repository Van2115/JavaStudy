package com.example.main;

import com.example.util.Caculator;

public class CaculatorMain {
    public static void main(String[] agrs){
        Caculator cal = new Caculator();
        int value = cal.pulss(50,100);
        System.out.println(value);

        com.example.util2.Caculator cal2 = new com.example.util2.Caculator(); //똑같은 클래스명이여서 패키지 명이 나오는 것
        int valu2 = cal2.divide(100,50);
        System.out.println(valu2);
    }
}
