package Assignment.Composition;

public class Bed {
    private String style;
    private int height;
    private int sheets;
    private int quilt;
    private int pillows;

    public Bed(String style, int pillows, int height, int sheets, int quilt){
        style = style;
        pillows = pillows;
        height = height;
        sheets = sheets;
        quilt = quilt;
    }

    public void make(){
        System.out.println("The Bed is being made ");
    }

    public String getStyle(){
        return this.style;
    }

    public int getHeight(){
        return this.height;
    }

    public int getPillows(){
        return this.pillows;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getQuilt(){
        return this.quilt;
    }
}
