package Assignment;

public class OverLoading {

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches){

        double centimeters;

        if(feet >=0 && (inches >= 0 && inches <= 12)){

            centimeters = (feet * 12 * 2.54) + (inches * 2.54);

            System.out.println(feet+" feet and "+inches+" inches = "+ centimeters+"cm");

            return centimeters;
        }
        else
        {
            return -1;
        }

    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {

            double feet = (int) inches / 12;

            double remainingInches = inches % 12;

            System.out.println(inches + " inches = " + feet + " feet =" + remainingInches + "inches");

            return calculateFeetAndInchesToCentimeters(feet, remainingInches);

        }
        return -1;

    }

}