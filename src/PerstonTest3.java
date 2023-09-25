public class PerstonTest3 {
    public static void main(String[] args){
        System.out.println(Person.count);
        Person.printCount();
        //       System.out.println(Person.name); //static하지 않은 필드는 클래스명.필드 사용 할 수 없음

//        Person p1 = new Person();
//        p1.name = "홍길동";
//
//        p1.printName();
//        Person.printCount();
//
//        Person.count++;
//        Person.printCount();
    }
}
