public class Exam01 {
    public static void main(String[] args){
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();

        System.out.println("-----------------");

        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();

        System.out.println("-----------------");

        Parent p2 = new Child(); // Child는 Parent의 후손이다. 혹은 자식이다.
        System.out.println(p2.i); //필드는 부모 타입을 따라간다.
        p2.printI();// 오버라이딩된 메소드는 무조건 자식것을 사용한다.
        p2.printII();
    }
}
