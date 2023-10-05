import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args){
        //ArrayList<String> list = new ArrayList<>(); -> 이케 하지말고
        List<String> list = new ArrayList<>(); //이케 바꿔서 써라!!

        list.add("kim");
        list.add("lee");
        list.add("van");

        String str1 = list.get(0); //꺼내올때
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
