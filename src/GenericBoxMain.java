public class GenericBoxMain {
    public static void main(String[] agrs){
        GenericBox<String> genericBox = new GenericBox<>(); // 뒤의 <>은 앞의 <>의 타입을 그대로 사용 하겠다는 뜻
        genericBox.add("van");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        //인티져를 넣은것을 하겠다면
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(new Integer(5));
        Integer intValue = intBox.get();
        System.out.println(intValue);

        //Generic을 아까 Object 처럼 사용 할 수 있음 단, 형변환은 꼭 해줘야 함
        GenericBox<Object> objtecBox = new GenericBox<>();
        objtecBox.add("h");
        String str2 = (String)objtecBox.get();
        System.out.println(str2);

    }
}
