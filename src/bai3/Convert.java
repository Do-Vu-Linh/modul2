package bai3;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f, c;
        int choice;
        do {
            System.out.println("Nhập lưa chọn: ");
            System.out.println("1 Chuyển từ F sang C ");
            System.out.println("2 Chuyển từ C sang F ");
            System.out.println("0 Thoát ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("nhập số F");
                    f = sc.nextInt();
                    System.out.println("nhiệt độ c là " +FtoC(f));
                    break;}
                case 2:{
                    System.out.println("nhập số C");
                    c = sc.nextInt();
                    System.out.println("nhiệt độ F là " +CtoF(c));
                    break;}
                case 3:
                    System.exit(0);
            }
         } while (choice != 0);
        }

    public static double FtoC (double f) {
       double c =(5.0/9)*(f-32);
       return c ;
    }public static double CtoF (double c) {
       double f=(9/5) *c+32 ;
       return f ;
    }
}

