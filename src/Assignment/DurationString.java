package Assignment;

public class DurationString {

    public static void getDurationString(long mins, long seconds){
        int hours =0;
        long remainingMins = 0;

        if(mins > 0  &&  (seconds >= 0 && seconds <=59 )){
            
            if(mins!=0){
                 hours = (int)mins/60;
                 remainingMins = mins % 60;
            }
         
            System.out.println(hours+"h "+remainingMins+"m "+seconds+"s");

        }
        else
        System.out.println("Invalid value");

    
    }

    public static void getDurationString(long seconds){
        long mins =0;
        long remainingSeconds = 0;

        if(seconds >0 ){

            mins = (int)seconds/60;
            
            if(mins!=0){
                remainingSeconds = mins % 60;
            }
         
            getDurationString(mins, remainingSeconds);

        }
        else
        System.out.println("Invalid value");

    
    }
    
}