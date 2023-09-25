public class Car2Exam02 {
    public static void main (String[] args){
       // Car2 c = new Car2("usrss"); //Car2가 abstract 이면 Car2 c = new Car2(); 하면 에러뜸
//        Bus2 b = new Bus2();
//        b.run();
//
//        SuperCar s1 = new SuperCar();
//        s1.run();
//
//        Car2 c = new Bus2(); //생성자에 부모가 추상 클래스 이기 때문에 new Car(); 될 수 없음, 자식 또는 자손만 가능
//        c.run();

        Car2[] array = new Car2[2]; // Car2를 2개 참조 할 수 있는 배열을 선언.
        array[0] = new Bus2(); // 배열의 0번째는 Bus2를 참조
        array[1] = new SportCar("sportCar!!");// 배열의 1번째는 SuperCar 참조
        for(Car2 c2 : array){ //array에 하나씩 꺼내서 c2에 담는것
            c2.run();
        }

    }
}
