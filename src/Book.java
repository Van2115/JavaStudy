public class Book {
    private String title;
    //public int price; // 필드를 직접 접근하면 안 좋기 때문에 public -> private으로 변경
    private int price;// 필드 price, 필드의 값을 수정 하고 얻기 위한 메소드를 만든다 -> setter, getter
    //setter, getter -> 프로퍼티(property) 현재는 price 프로퍼티라고 한다.
    public int getPrice() {
        return price; // 헷갈리면 this. 해주면 됨 그러면 내 자신의 인스턴스를 참조하는 예약어
    }

    public void setPrice(int price) {// 지역변수 price
        this.price = price; // 매개변수로 받은 지역 변수 price를 필드 price로 변환해준다.
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
