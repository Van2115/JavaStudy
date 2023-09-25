public class Person {
    //클래스 정보 자체는 정적이다
    //초기값을 설정 하지 않았기 때문에 각각 맞는 기본값을 가지게됨
    String name; //인스턴스 필드
    String address = "어쩌구 저쩌";
    boolean isVip;
    static int count; // 클래스 필드

    static { //클래스 필드는 static 블록에서 초기화 가능
        count =100;
    }

    public void printName(){ //인스턴스 메소드
        System.out.println("내 이름은" + name);
    }
    public static void printCount(){//클래스 메소
        //System.out.println(name); //static한 메소드에서는 인스턴스 필드나, 인스턴스 메소드를 사용 할 수 없음
        System.out.println("count : " + count);
    }

}
