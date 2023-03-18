package Dsa;

public class Pattern {

    static void printPascleTringle(int rows){

        int n = 1;
        for(int i = 1; i < rows; i++){
            for(int j= 1; j<= i; j++){
                System.out.print(n+" ");
                ++n;
            }
            System.out.println("\n");

        }

    }
}
