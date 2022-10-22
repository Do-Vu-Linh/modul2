package bai2;

import java.util.Scanner;

public class Artis {
    public static void main(String[] args) {
        int choice ;

        while (true){
            System.out.println("Nhập choice");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. vẽ tam giác cân");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            choice= sc.nextInt();
            switch (choice) {
                case 1 :
                    for(int i =5; i>0;i--){
                        for(int j=0;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                }
                    break;
                case 2:
                    for(int i = 5; i>0;i--){
                        for(int j=0;j<5;j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int i = 3; i>0;i--){
                        for(int j=0;j<5;j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4 :
                    for(int i =0; i<6;i++){
                        for(int j=i;j<6;j++){
                            System.out.print(" ");
                        }
                        for (int j = 6-i; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();

                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice");


            }
        }
    }
}
