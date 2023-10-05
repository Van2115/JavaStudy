import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam2 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("k1","hello");
        map.put("k2","hi");
        map.put("k3","안녕");

        Set<String> keySet = map.keySet(); //map에 있는 key 모든 데이터를 접근 하고 싶을 때 Set객체가 나옴
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }
    }
}
