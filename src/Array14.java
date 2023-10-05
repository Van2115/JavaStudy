public class Array14 {
    public static void main(String[] agrs){
        int[] copyFrom = {1,2,3};

        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length); //Arrays.copyOf를 사용하였기 때문에 다른 메모리를 사용하기 때문에 같지 않다.
        if(copyTo == copyFrom){
            System.out.println("copyTo == copyFrom");
        }else {
            System.out.println("copyTo /= copyForm");
        }

        for(int c : copyTo){
            System.out.println(c);
        }

        System.out.println("--------------------------");

        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);

        for(int c : copyTo2){
            System.out.println(c);
        }

        System.out.println("--------------------------");

        int[] copy3 = copyFrom;
        for(int c : copy3){
            System.out.println(c);
        }
    }
}

//깊은 복사 vs 얕은 복사