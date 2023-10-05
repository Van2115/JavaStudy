import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam2 {
    public static void main(String[] args){
        Set<Mydata> mySet = new HashSet<>();
        mySet.add(new Mydata("kim", 500));
        mySet.add(new Mydata("lee", 200));
        mySet.add(new Mydata("hong", 700));
        mySet.add(new Mydata("hong", 700)); //중복되어 나옴, 제네릭(Generic)과 컬렉션 프레임워크(Collection Framework) 참고
        //hashcode가 같은 버킷에 equals로 비교하여 없을 경우에만 넣어줌 Mydata클래스에는 hashcode와 equals라는게 없기 때문에 Object꺼를 사용 하기 때문에 비교 하는게 없음
        // 그렇기 때문에 MyData에 hashCode,equals를 넣어줘야함
        Iterator<Mydata> iterator = mySet.iterator();
        while (iterator.hasNext()){
            Mydata mydata = iterator.next();
            System.out.println(mydata);
        }
    }
}

class Mydata{ //불변 객체
    private String name;
    private int value;

    public Mydata(String name, int value) { //생성자에서 값을 받아드림
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Mydata{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        System.out.println("equlas");
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Mydata mydata = (Mydata) object;
        return getValue() == mydata.getValue() && Objects.equals(getName(), mydata.getName());
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode");
        return Objects.hash(getName(), getValue());
    }
}
