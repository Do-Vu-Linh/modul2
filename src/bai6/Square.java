package bai6;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side, String color, boolean fill) {
        super(side, side, color, fill);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }public void setHeight (double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(10);
        System.out.println(square.getWidth());
        System.out.println(square.getHeight());
        square.setWidth(5);
        System.out.println(square.getWidth());
        System.out.println(square.getHeight());
    }


}
