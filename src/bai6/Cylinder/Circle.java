package bai6.Cylinder;

public class Circle {
    private double radius ;
    private String color ;

    Circle(){

    }
    Circle(double radius,String color){
        this.color = color;
        this.radius = radius;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea () {
        return radius*radius*Math.PI;
    }
    public double getCapacity (){
        return this.getArea() ;}

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(2.3,"red") ;
        System.out.println(circle1);
        System.out.println("dien tich hinhf tron la :"+ circle1.getArea());
    }
}
