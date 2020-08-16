package Assignment;
public class SpeedConverter {
    // write your code here
    
    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour >= 0) {

        return Math.round( kilometersPerHour * 0.621371);

        }
        return -1;
    }

    /**
     * @param kilometersPerHour
     */
    public static void printConversion(double kilometersPerHour){

        long miles = toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour >= 0) {

            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
        else
        {
            System.out.println("Invalid Value");

        }

    }
}