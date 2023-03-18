package Dsa;

public class TransposeMatrix {

    static void tranpose(int[][] mat)
    {
        for(int i =0; i< mat.length; i++){
            for(int j=0; j<mat.length;)
            System.out.print(mat[i][j]);
        }
    }
}
