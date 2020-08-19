package Assignment;

public class NumberPalindrome {


    public static boolean isPalindrome(int number){
        
        int reverseNumber = 0;
        int unitDigit = 0;
      
        if(number < 0){

            number = -(number);
        }
      
        int tempNum = number;
        while(number > 0){

            unitDigit =(int)(number % 10) ;
           

            number = number / 10;
            //System.out.println("Place value="+placeValue+" Unit digit ="+unitDigit);
                        
            reverseNumber=(reverseNumber * 10)+unitDigit;
           
            System.out.println("Reverse number ="+reverseNumber);
           
        }

        //System.out.println("Number="+tempNum+ " reverse number ="+reverseNumber);
        if(tempNum == reverseNumber)
            return true;
        else         
             return false;
        

    } 

    
}