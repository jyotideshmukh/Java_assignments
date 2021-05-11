package Assignment.Composition;

//import Assignment.Composition.Ceiling;
//import Assignment.Composition.Wall;
//import Assignment.Composition.Bed;
//import Assignment.Composition.Lamp;
//import Assignment.Composition.Bedroom;
public class TestMain {

    public static void mainTest(String args[]){
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("classic",false,75);
        Bedroom bedroom = new Bedroom("Jyoti", wall1, wall2, wall3, wall4, bed, ceiling, lamp);
        bedroom.makeBed();

    }
}
