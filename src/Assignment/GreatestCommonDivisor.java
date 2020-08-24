package Assignment;

public class GreatestCommonDivisor {
    

    public static int getGreatestCommonDivisor(int number1, int number2){

        if(number1 < 10 )
        return -1;
        
        
           
            int greatestCommonDivser =1;
            int i =2;
            
            if(number2 < 0){
                greatestCommonDivser = -1;
                i = number2;
            }
            
            int smallNum = number1;

            if(number1 > number2 ){
                
                smallNum =number2;

            }
                
                for(;i <= smallNum; i++){

                    if(number1 % i ==0 && number2 % i ==0 ){
                        
                        greatestCommonDivser = i ;

                    }
                }
                return greatestCommonDivser;
                
       }
    
}