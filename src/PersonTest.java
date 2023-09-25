public class PersonTest {

    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name ="홍길동"; //문자열은 new를 사용하지 않고 인스턴스를 사용 할 수 있다. 되도록 new를 사용하지 말자(String 사용할땐)
        p2.name="조조";
        p1.address ="바뀐 주소";


        System.out.println(Person.count);//static 필드를 호출하고 싶을 경우, 이렇게 적는게 좋음

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        //System.out.println(p1.address.length()); //adress가 현재 참조하는게 없어 에러가 뜸,
        System.out.println(p1.isVip);

        System.out.println("----------------------");

        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);

        System.out.println(Person.count);
    }
}
