import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args){
        Collection<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("van");
        collection.add("lee");

        System.out.println(collection.size());
        // 상속받고 있는 메소드만 사용 가능 List의 get 메소드 사용 불가
        Iterator<String> iter = collection.iterator();//collection에 있는 모든 것을 꺼내기 위해 interator를 사용, 위에 String으로 들어가져 있기 때문에 꺼낼 때도 String으로 타입 지정 해줘야 함
        while (iter.hasNext()){ //hasNext 꺼낼게 있는냐
            String str = iter.next(); // next 꺼내기
            System.out.println(str);
        }

    }
}
