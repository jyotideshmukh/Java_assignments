package Assignment;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        
        int unitDigit = 0;
        int sum = 0; 

        if(number < 0)
        return -1;

        while(number > 0){

            unitDigit = number % 10;

            if(unitDigit % 2 == 0)
            {
                sum+=unitDigit;
            }
            number = number/10;

        }

        return sum;

    }
    
}