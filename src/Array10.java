public class Array10 {
    public static void main(String[] args){
        int[][] array = new int[2][]; //가변이차원
        array[0] = new int[2];
        array[1] = new int[3];

        // -> 더 간략하게 바뀌기
        // int[][] array = {{0,1),{2,3,4}};

        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 4;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
