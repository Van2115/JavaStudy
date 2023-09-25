public abstract class Car2 {
    public  Car2(String name){ //생성자는 리턴관련된게 없어야함 매개변수가 없는게 기본생성자인데 매개변수를 넣으면 더이상 기본 생성자가 아님
        super();//자동으로 들어감 , 기본생성자가
        System.out.println("Car2() 생성자 호출");
    }

    //추상메소드. 구현이 안되어 있는 것. Car2를 만드는 사람은 run()이라는 메소드가 필요하다고 생각함
    // run()은 자동차마다 다르게 구현할 것 같다.라고 생각함

    public abstract void run();
}
