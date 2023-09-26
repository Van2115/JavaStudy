package com.example;

/*
 1. 1~45 까지 써있는 ball을 로또 기계에 넣는다
 2. 로또 기계에 있는 ball들을 섞는다.
 3. 섞인 ball중에서 6개를 꺼낸다.
*/

public interface LottoMachine {

    int Max_Ball_COUNT = 45;
    int RETURN_Ball_COUNT = 6;
    public void setBalls(Ball[] balls); // Ball[]  ball이 여러개를 받겟다. option+enter -> 없는 클래스를 생성해주는게 나옴
    public void  mix(); // 자기가 가지고 있는 ball들을 섞는다.
    public Ball[] getBalls(); //6개의 ball을 반환핟다.
}
