package Dsa;

public class RichestMan {

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i= 0; i< accounts.length; i++){
            int sumAmt  = 0;
            for(int j=0; j< accounts[i].length;j++){
                sumAmt+=accounts[i][j];
            }
            if(max< sumAmt){
                max = sumAmt;
            }
        }
        return max;
    }
}
