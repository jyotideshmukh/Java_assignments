package Assignment;

public class DurationString {

    public static String getDurationString(long mins, long seconds){
        int hours =0;
        long remainingMins = 0;

        if(mins > 0  &&  (seconds >= 0 && seconds <=59 )){
            
            if(mins!=0){
                 hours = (int)mins/60;
                 remainingMins = mins % 60;
            }
         
            System.out.println(hours+"h "+remainingMins+"m "+seconds+"s");
            return (hours+"h "+remainingMins+"m "+seconds+"s");

        }
        else
        System.out.println("Invalid value");

        return "Invalid value";

    
    }

    public static String getDurationString(long seconds){
        long mins =0;
        long remainingSeconds = 0;

        if(seconds >0 ){

            mins = (int)seconds/60;
            
            remainingSeconds = mins % 60;
                     
            return getDurationString(mins, remainingSeconds);

        }
        else
        System.out.println("Invalid value");
        return "Invalid value";

    
    }
    
}