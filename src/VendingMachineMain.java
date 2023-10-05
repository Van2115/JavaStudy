import java.util.Arrays;

public class VendingMachineMain {

    public static void main(String[] args) {
        VendingMachine.printVersion();// static 메소드 하고 호출하고 싶으면, 클래스명.메소드명이라고 해야함
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();


        String product = vm1.pushProductButton(100);
        //vm1.printVersion();// static한 메소드는 레퍼런스변수명.static메소드()할 수있음 -> 그러나 바람칙하지 않다.
        System.out.println(product);

        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);
    }
}

//javac Hello.java
//Hello.java Hello.class
//java Hello
//정답 ) Classpath 경로에서 hello클래스를 찾아서 실행함. CLASSPTH=. 이라고 잡혀있다고 생각하자 .은 현재 파일

//javac VendingMachine.java
//javac VendingMachineMain.java
//java VendingMachineMain
//vendingMachineMain을 어디서 찾아서 실행할까요?