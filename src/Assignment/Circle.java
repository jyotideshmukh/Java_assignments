package Assignment;
import java.lang.Math;
public class Circle {
    
    public double radius;
   

    public Circle(double radius){
        if(radius < 0) {
            this.radius = radius = 0;
        } else{
            this.radius = radius;
        }

    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }


}
