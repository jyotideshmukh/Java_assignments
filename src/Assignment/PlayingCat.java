package Assignment;


    /*
    * cat playing assignment - if summer cat can play within temp 25 to 45
    * cat playing if not summer but temp range is 25 to 35
    */
   public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){

        if(summer && (temperature >=25 && temperature <=45))
            return true;
        else if(!summer && (temperature >=25 && temperature <=35))
            return true;
        
        return false;
        

    }
    
}