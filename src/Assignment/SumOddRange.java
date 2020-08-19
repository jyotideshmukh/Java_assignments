package Assignment;

public class SumOddRange {

    public static boolean isOdd(int num){
        if(num >0){

            if(num % 2 !=0)
                return true;
            else
                return false;

        }
        else
            return false;
    }

    public static int sumOdd(int start, int end){

        if(end < start  || start <0 || end < 0)
        return -1;
        
        int sum =0;
        for(int i = start; i <= end; i++)
        {

            if(isOdd(i)){
                //System.out.println(i);
                sum+=i;
                
            }
        
        }

        return sum;

    }
    
}