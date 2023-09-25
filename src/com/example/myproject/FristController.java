package com.example.myproject;

import com.example.fw.Controller;

public class FristController extends Controller {
    @Override
    public void run() {
        System.out.println("별도로 동작하는 코드 11111");
    }
    //서로 다른 패키지더라도 상속을 받게 되어 public -> protected로 변경해도됨



}
