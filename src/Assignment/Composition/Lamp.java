package Assignment.Composition;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean isBattery, int globRating){
        style = style;
        battery = battery;
        globRating = globRating;
    }

    public String getStyle(){
        return this.style;
    }

    public boolean isBattery(){
        return this.battery;
    }

    public int getGlobRating(){
        return this.globRating;
    }
     public void turnOn(){
         System.out.println("Lamp is being turning On");
     }
}
