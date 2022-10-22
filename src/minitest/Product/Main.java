package minitest.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManage productManage1 = new ProductManage();

        int choice;
        do {
            System.out.println("1 :Thêm sản phẩm");
            System.out.println("2 :Sửa sản phẩm");
            System.out.println("3 :xóa sản phẩm");
            System.out.println("6 :hiển thị sản phẩm");
            System.out.println("4 :sản phẩm giá cao nhất");
            System.out.println("5 :Thoát");
            System.out.println("0 nhập lựa chọn");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    productManage1.addProduct();
                    break;
                case 2:
                    productManage1.editProduct();
                    break;
                case 3:
                    productManage1.deleteProduct();
                    break;
                case 4:
                    productManage1.Maxprice();
                    break;
                case 6:
                    productManage1.displayProduct();
                    break;
                case 0:
                    System.exit(0);

            }
        } while (true);
    }
}