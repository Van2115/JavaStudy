package com.example;

public class LottoMachineMain {
    public static void main(String[] agrs){


//        Ball b1 = new Ball(1);
//        Ball b2 = new Ball(2);
//        변수가 45개 필요하다. Ball인스턴스를 45개 참조 할 수 있는 배열이 만들어짐
        Ball[] balls = new Ball[LottoMachine.Max_Ball_COUNT];
        for(int i = 0 ; i < LottoMachine.Max_Ball_COUNT; i++){
            balls[i] = new Ball(i+1);
        }

        //LottoMachine인스턴스가 생성됨
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result =  lottoMachine.getBalls();

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i].getNumber());
        }
    }
}
