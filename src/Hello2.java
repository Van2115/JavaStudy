public class Hello2 {
    static  int i;
    static {
        i= 600;
        System.out.println("staic block"); // 원래는 static field를 초기화 한다.

    }
    public static void main(String[] args){
        System.out.println("Hello");
    }
}

//javac Hello2.java -> 컴파일 할때
//java Hello2 -> 실행할때