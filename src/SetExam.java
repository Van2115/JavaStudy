import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("hello");
        boolean flag1 = set.add("hello");
        set.add("hi");
        set.add("hong");
        set.add("hong");

        System.out.println(flag1);

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
