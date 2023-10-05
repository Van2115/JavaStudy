import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String[] args){
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dart", 2000);

        //sort[Object[]) - Object 모든 객체의 조상이기 때문에 어떤 객체의 배열이든 올 수 있다.
        //Arrays.sort(items);

       // Arrays.sort(items, new ItmeSorter()); -> 람다! 더 간결하게 아래처럼 사용
//        Arrays.sort(items, new Comparator<Item>() {
//            @Override
//            public int compare(Item o1, Item o2) {
//                Item item1 = (Item)o1;
//                Item item2 = (Item)o2;
//                return item1.getName().compareTo(item2.getName());
//            }
//        }); -> 더 줄이기
//        Arrays.sort(items, (Item o1, Item o2) -> {
//                    Item item1 = (Item)o1;
//                    Item item2 = (Item)o2;
//                    return item1.getName().compareTo(item2.getName());
//                }
//        ); -> 더 줄이기

//        Arrays.sort(items, (item1, item2) -> {
//                return item1.getName().compareTo(item2.getName());
//            }
//        ); ->더 줄이기

        Arrays.sort(items,(item1, item2) -> item1.getName().compareTo(item2.getName()));

        for(Item itme : items){
            System.out.println(itme);
        }
    }
}

class ItmeSorter implements Comparator{
    // o1 - o2
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 =  (Item)o2;
        return item1.getName().compareTo(item2.getName());
    }
}

//Comparabe는 어떤 Item이 큰지, 작은지 기준을 정하는 interface
class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name, int price) { //생성자
        this.name = name;
        this.price = price;
    }

    //파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    //compareTo에는 Object를 받아들이도록 했지만 실제로는 Item이 들어온다.
    //홍길동, 고길동 들어오는 값이 더 크면 음수가 나옴
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//        return this.name.compareTo(d.name); // 양수 , 0 , 음수
//    }

    @Override
    public int compareTo(Object o) {
        System.out.println(o + "o 들어온 값");
        Item d = (Item)o;
        System.out.println(this.price+ "this.price 값");
        System.out.println(this.price - d.price + "이건 값");
        return this.price - d.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
