package bai6;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    Rectangle() {

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return (width * height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "with width=" + width +
                ",and height=" + height + "which is a subclass of" + super.toString();

    }
}
