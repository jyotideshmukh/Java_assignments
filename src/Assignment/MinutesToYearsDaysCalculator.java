package Assignment;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){

        if(minutes >= 0 ){
        
        if(minutes ==0 ) {
            System.out.println(minutes+" min = 0 y and 0 d");
        } 
        else{
             long years =  minutes/(365*24*60);

              long remainingMins = minutes % (365*24*60);
              
              long days = remainingMins/(24*60);

              System.out.println(minutes+" min = "+years+" y and "+days+" d");
            
        }
       
        }
        else{
             System.out.println("Invalid Value");
        }
    }
        
    
}