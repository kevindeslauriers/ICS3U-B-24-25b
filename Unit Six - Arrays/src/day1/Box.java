package day1;

public class Box {
    private int width;
    private int length;

    public Box (int w, int l){
        this.width = w;
        this.length = l;
    }

    public void setWidth(int w){
        this.width = w;
    }

    public void setLength(int l){
        this.length = l;
    }

    public int getArea(){
        return width * length;
    }

    public String toString(){
        return "Width: " + width + " Length: " + length + " Area: " + getArea();
    }

}
