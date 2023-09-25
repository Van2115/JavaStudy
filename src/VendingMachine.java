public class VendingMachine {
    //field (가지는 것들 , 돈통, 상품케이스)
    //생성자
    //method(기능,행위 들)

    //접근제한자 //리턴type //메소드명       //매개변수
    public     String pushProductButton(int menuId){
        System.out.println(menuId+"를 전달 받았습니다.");
        return "콜라";
    }
    public static void printVersion(){
        System.out.println("v1.0");
    };

}
