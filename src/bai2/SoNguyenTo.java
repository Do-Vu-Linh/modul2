package bai2;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng số nguyên tố cần hiển thị : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int prime = 2;
        while (count < number) {
            boolean flag = true;
            if (prime < 2) {
                flag = false;
            } else {
                for (int i = 2; i < prime-1; i++) {
                    if (prime % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(" " + prime);
               prime++;
               count++;

            } else {
                prime++;
            }

        }
    }
}