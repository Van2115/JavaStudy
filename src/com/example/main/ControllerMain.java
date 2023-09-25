package com.example.main;

import com.example.fw.Controller;
import com.example.myproject.FristController;

public class ControllerMain {
    public static void main(String[] args){
        Controller c1 = new FristController();
        c1.execute();

        // public void init(){
        //        System.out.println("초기화 하는 코드");
        //    }
        //    public 일때 c1.init(); c1.cloesd 등 다 나옴
        //execute만 나오게 하고 싶다능 해당 public -> protected로 변경
    }
}
