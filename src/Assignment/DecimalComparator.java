package Assignment;


public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){

         number1 = (int)(number1 * 1000d);

         number2 = (int) (number2 * 1000d);
        
         System.out.println("number1 ="+number1 +"number 2="+number2);
         
         if(number1 == number2){
            
            return true;
         }
         
         return false;
          

    }

    
    
}