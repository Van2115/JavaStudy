import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] agrs){
        Map<String, String>map = new HashMap<>(); //key값이 유일 해야하기 때문에 Map에 hashcode,equlas 구현되어 있어야 함
        map.put("k1","hello");
        map.put("k2","hi");
        map.put("k3","안녕");
        map.put("k3","안녕하세요."); //덮어씌움

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));
    }
}
