package Assignment;



public class DigitSumChallenge {

    public static int sumDigits(int num){
        if(num < 0)
            return -1;
        if(num <10)
            return num;


       int sum =0;
       int unitDigit =0;
       boolean isFinished =false;;
        do{
           
            unitDigit =(int)(num % 10) ;

            sum += unitDigit;
           // System.out.println("unit digit="+unitDigit);
            //System.out.println("Sum="+sum);

            num = num / 10;
            //System.out.println("num="+num);

            if(num < 10){
                sum += num;
                isFinished =true;
                
            }
            //System.out.println("num="+num);
           

        }while(!isFinished);
     
        return sum;

    }
    
}