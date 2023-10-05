import java.util.ArrayList;

public class ListExam01 { //제네릭을 사용 하지 않고 arrayList 사용 하기
    public static void main(String[] args){

        //자료구조객체들은 제네릭을 사용하지 않으면 , Object타입을 저장함
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("lee");
        list.add("van");

        String str1 = (String)list.get(0); //꺼내올때
        String str2 = (String)list.get(1);
        String str3 = (String)list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
