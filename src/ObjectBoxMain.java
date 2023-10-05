public class ObjectBoxMain {
    public static void main(String[] agrs){
        ObjectBox box = new ObjectBox();
        box.set("van");
        String str = (String)box.get(); // 원래 object를 가져와 야 하는ㄷ뎅 String으로 넣어줬기때문에 String으로 형변환해줌
        System.out.println(str.toUpperCase());

        box.set(new Integer(5));//Integer로 넣어줌
        Integer i = (Integer)box.get();// Integer 형변환
        System.out.println(i.intValue());
    }
}

//Object타입변환하는것에 번거로움이 있어 Generic이 있음