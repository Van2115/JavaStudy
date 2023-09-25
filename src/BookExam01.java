public class BookExam01 {

    public static void main(String[] agrs){
        Book b1 = new Book();
//        b1.price = 100; // private field는 접급 금
//        System.out.println(b1.price);
        b1.setPrice(500);
        System.out.println(b1.getPrice());


        b1.setTitle("반희빈의 즐거운 자바");
        System.out.println(b1.getTitle());

    }


}
