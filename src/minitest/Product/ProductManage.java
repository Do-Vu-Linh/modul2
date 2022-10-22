package minitest.Product;

import java.util.Scanner;

public class ProductManage {
    private Product[] products = new Product[100];
    static int index=0;


    ProductManage() {

    }
    Scanner sc = new Scanner(System.in) ;
    public Product input() {

        System.out.println( " nhập tên :");
       String name = sc.nextLine();
        System.out.println( " nhập giá : ");
        int price = sc.nextInt();
        System.out.println("nhập mô tả");
        sc.nextLine();
        String des = sc.nextLine();
        Product product = new Product(name,price,des);

        return  product;
    }
    public void addProduct (){
   products [index] = input();
   index++;
    }

public void deleteProduct(){
    System.out.println("nhập vị trí cần xóa");
    int indexdelete = sc.nextInt() ;
    for(int i = indexdelete;i<index;i++) {
        products[i]=products[i+1] ;

    }

}
public  void editProduct(){
    System.out.println("nhập ví trí cần sửa : ");
    int indexedit = sc.nextInt();
    products[indexedit] = input();

}
public void displayProduct(){
        for(int i =0; i<index;i++) {
            if (products[i] != null) {
                System.out.println("tên : " + products[i].getName() + "Giá : " + products[i].getPrice() + "mô tả : " + products[i].getDesription());
            }
        }
}
public void Maxprice(){

        int max = products[0].getPrice();
        int imax = 0;
                for(int i=0;i<index;i++){
                    if(max < products[i].getPrice()){
                        max = products[i].getPrice();
                        imax = i;
                    }

                }
    System.out.println("sản phẩm giá cao nhất là :" + products[imax]);

}

}
