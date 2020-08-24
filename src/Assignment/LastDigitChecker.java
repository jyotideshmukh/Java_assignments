package Assignment;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3){

        if(!isValid(number1) || !isValid(number2)  ||  !isValid(number3) ){
            
            return false;
        }
        if(number1 % 10 == number2 % 10  || number1 % 10 == number3 % 10 || number2 % 10 == number3 % 10 ) 
            return true;

        else
            return false;


    }

    public static boolean isValid(int number){

        if(number < 10 || number > 1000 )
            return false;
        else
            return true;

    }
    
}