package minitest.Product;

public class Product {
    private String name ;
    private int price ;
    private  String desription;
    Product(){
    }
    Product(String name,int price,String desription) {
       this.name =name ;
       this.price =price;
       this.desription =desription;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDesription() {
        return desription;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }
}