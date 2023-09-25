public class Bus2 extends Car2{
    //생성자를 만들지 않으면 기본으로 만들어줌

    public Bus2(){
        super("Bus!!!");// 부모가 기본생성자가 없으면, 자식에서 생성자에선 직접 super을 사용하여 포출해야함
        //super();//자동으로 만들어줌, 부모의 기본 생성자를 호출하는 코드가 자동으로 사입됨
        System.out.println("Bus2 기본 생성자");
    }

    //부모가 가지고 있는 추상메소드는 자식에서 반드시 구현을 해줘야 함, command+n -> override method 선택하여 아래의 오버라이드 메소드 만들어줘야함
    @Override
    public void run() {
        System.out.println("후륜구동으로 동작한다.");
    }
}
