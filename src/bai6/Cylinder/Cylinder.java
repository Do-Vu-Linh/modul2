package bai6.Cylinder;

public class Cylinder extends Circle {
    private double height ;

    Cylinder () {
    }
    Cylinder (double height) {

    }
    Cylinder(double height, double radius, String color) {
        super(radius , color );
        this.height = height;

   }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getCapacity (){
        return super.getArea()*height;
    }

    @Override

    public String toString() {
        return "Cylinder{" +
                "height=" + height + "đáy là màu : " + super.getColor()+ "có bán kính là" + super.getRadius()+
                '}';
    }
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        Circle cylinder1 = new Cylinder(3.4,2.3,"red") ;
        System.out.println(cylinder1);
        Cylinder cylinder2 = ((Cylinder) cylinder1) ;
        System.out.println("thể tích hình trụ la :" + cylinder2.getCapacity() );
    }
}

