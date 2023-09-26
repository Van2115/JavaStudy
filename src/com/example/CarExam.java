package com.example;

public class CarExam {
    public static void main(String[] args){
        //Car를 상속받긴 하지만 클래스를 만들고 싶지 않을때
        Car c1 = new Car(){
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a()메소드 오버라이딩 ");
            }
        }; //현재 Car는 인스턴스가 될 수없음 추상클래스 이기 때문에

        c1.a();
        //Car c2 = new Bus();
    }
}
