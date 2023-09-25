public class LabelExam2 {
    public static void main(String[] args){
//        outter:
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if( i == 0 && j == 2)
//                    continue outter;
//                System.out.println(i + " , "+j);
//
//            }
//        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 2 )
                    System.out.println(i + " , " + j);
            }
        }
    }
}
