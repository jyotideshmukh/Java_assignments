package Assignment;

public class SharedDigit {

    public static boolean  hasSharedDigit(int number1, int number2) {

        int unitDigitNum = 0;

        boolean sharedDigit = false;

        if(number1 < 10 || number1 > 99 || number2 < 10  || number2 > 99 ){
            
            return false;
        }

        while(number1 >  0){

            unitDigitNum =  number1 % 10;

            int tempNumber = number2;

            while( number2 >  0){
                 
                //System.out.println("Unitdigit =" +unitDigitNum + "number 2 unit digit="+(number2 % 10));

                if(unitDigitNum == number2 % 10){

                    return true;
                   
                }

                number2 = number2 / 10;

                                
            }
            number2 = tempNumber;
            number1 = number1 / 10;


        }
        return sharedDigit;

    }
    
}