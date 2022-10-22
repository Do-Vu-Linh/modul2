package minitest.Product.lan2;

public class Product {
   private String name;
  private   int price ;
   private String desc ;

    public Product(String name, int price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }
    public Product(){

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

