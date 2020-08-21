package Assignment;


public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        int sum =0;
        if(number < 0 )
            return -1;

        int cnt = 0;
        int prevNumber =0;
        int unitDigit =0;

        while(number > 0){ 

            unitDigit =(int)(number % 10) ;

            if(cnt == 0){
                sum = unitDigit;
               // System.out.println("First time sum or last digit ="+sum);

            }
            number = number/10;
            //System.out.println("Number ="+number);
            
            if(number == 0  && cnt> 0){
                sum+=prevNumber;  
                //System.out.println("Previous number ="+prevNumber);
                //System.out.println("Sum at last step ="+prevNumber);
            }
            else if(number == 0  && cnt == 0){
                sum+=sum;
            }
            prevNumber = number;
            //System.out.println("Previous Number ="+prevNumber);
            cnt++;
            
        }

        return sum;

    }
    
}