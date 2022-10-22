package bai6;

public class Shape {
    private String color ="green";
    private boolean fill = true;
    Shape(){

    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.fill = filled;
    }
    public void setFill (boolean fill){
        this.fill = fill;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return  this.color;
    }
    public boolean isgetfill(){
        return this.fill;
    }
    public String toString () {
        return "A shape with color of " + getColor() + " and " + (isgetfill()? " filed " : " not filled");
    }
}
