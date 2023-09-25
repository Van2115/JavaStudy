import java.util.Arrays;

public class MathBeanTest {
    public static void main(String[] args){
        MathBean math = new MathBean(); // 인스턴스는 heap 메모리에 올라간다.
        //TV 리모컨 = new TV();

        math.printCalssName();

        math.printNumber(5000);

        int x = math.getOne();
        System.out.println(x);

        int value = math.plus(2,3);
        System.out.println(value);



    }
}
