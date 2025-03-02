public class sumOfMatrix {
    public static void main(String[] args) {
        System.out.println("program to add to matrices");
        int [][] mat1 = new int[2][2];
        int [][] mat2 = new int[2][2];
        int [][] result = new int[2][2];

        mat1[0][0] = 2;
        mat1[0][1] = 3;
        mat1[1][0] = 4;
        mat1[1][1] = 5;

        mat2[0][0] = 6;
        mat2[0][1] = 7;
        mat2[1][0] = 8;
        mat2[1][1] = 9;
        
        result[0][0] = 0;
        result[0][1] = 0;
        result[1][0] = 0;
        result[1][1] = 0;

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            System.out.print(result[i][j]);
            System.out.print(" ");
           }
           System.out.printf("\n");
        }
        

    }
}
