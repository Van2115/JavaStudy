public class MyMathTest {
    public static void main(String[] args){
        int value = MyMath.abs(-5);
        System.out.println(value);

        //MyMath m = new MyMath(); //이렇게되면 메모리 낭비가됨, private 했을 시 생성자를 만들 수가 없다.
    }
}
