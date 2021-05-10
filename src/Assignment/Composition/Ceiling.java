package Assignment.Composition;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor){
        height = height;
        paintedColor = paintedColor;
    }

    public int getHeight(){
        return this.height; 
    }

    public int getPaintedColor(){
        return this.paintedColor;
    }
}
