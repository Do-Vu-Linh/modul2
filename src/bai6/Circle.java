package bai6;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius =radius;
    }
    public  Circle(String color, boolean fill,double radius){
        super(color,fill);
        this.radius = radius;
    }
    public void setRadius (double radius){
        this.radius =radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getAre(double radius){
        return 3.14*Math.pow(2,radius);
    }
    public double getPerimeter(){
        return 2*radius*Math.PI ;
    }

    @Override
    public String toString() {
        return "Circle with radius" +
             getRadius() + ",which is a subslass of"
                +super.toString();
    }

}
