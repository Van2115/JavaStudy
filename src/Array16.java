import java.util.Arrays;

public class Array16 {
    public static void main(String[] agrs){
        int[] array1 = {1,2,3,4,5};
        //int[] array2 = {1,2,3,4,5};
        //int[] array2 = {1,2,3,4,6};
        int[] array2 = {1,2,3,4,4};


        //비교할때 양수, 0 , 음수
        // x - y = 결과 양수가 나왔다면? x > y 라는 뜻
        int compare = Arrays.compare(array1,array2);

        System.out.println(compare);

    }
}
