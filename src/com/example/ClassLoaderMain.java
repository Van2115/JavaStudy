package com.example;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] agrs) throws Exception{

        //a() 메소드를 가지고 있는 클래스가 있다.
        // 이 클래스 이름이 아직 무엇인지 모르겠음
        // 나중에 이 클래스 이름을 알려주겠다.
        // a()메소드가 실행 할 수 있도록 코드를 작성해라



        //        Bus b1 = new Bus();
        //        b1.a();


        //className에 해당하는 클래스 정보를 Classpath에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다.
        // Car c = new Bus
        String className = "com.example.MyHome";// 바꾸고 싶은 클래스 이름 넣으면됨
        Class  clazz = Class.forName(className);
        Object o = clazz.newInstance(); // == Bus b1 = new Bus();
        //만약 상속으로 처리한 Car,Bus말고 다른 MyHome을 써야 할 경우 String ClassName = "com.example.~"
        Method m =  clazz.getDeclaredMethod("a",null);//a()메소드 정보를 가지고 있는 메소드Method를 반환하라
        m.invoke(o,null); //Object o가 참조하는 객체의 m 메소드를 실행 하라

        //Bus b = (Bus)o; // 만약 String className = "com.example.SuperCar"로 바뀌면 형 변환한 이곳에 에러가 뜸 이유는 (Bus)이렇게 형 현봔 했는데
        //Car b = (Car)o; // 만약 Bus, SuperCar를 둘다 a를 쓰고 싶을때, 이렇게 변경 해주면 됨.
        //당연히 다른 타입인디.. 맞을리가 ㅎㅎ
        //b.a();
//        Method[] declaredMethods  =  clazz.getDeclaredMethods();
//        for(Method m : declaredMethods){
//            System.out.println(m.getName());
//        }

    }
}
