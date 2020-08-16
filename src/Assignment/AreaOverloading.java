package Assignment;
public class AreaOverloading {

    public static final int INVALID_VALUE =-1;

    public static double area(double radius){

        if(radius < 0){
            return INVALID_VALUE;
        }

        return radius * radius * Math.PI;

    } 

    public static double area(double length, double width){

        if(length < 0 || width < 0){
            return INVALID_VALUE;
        }

        return length * width;

    } 
    
}