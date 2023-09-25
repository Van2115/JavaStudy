public class SportCar extends Car2{

    //부모가 기본생성자가 없기 때문에,반드시 super()을 호출한다.

    public SportCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("사륜구동으로 동작한다.");
    }
}
