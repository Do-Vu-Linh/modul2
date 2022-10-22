package bai2;

import java.util.Scanner;

public class Greast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a");
        int a = sc.nextInt();
        System.out.println("nhập số b");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a != 0 || b != 0) {
            for (int i = b; i > 0; i--) {
                if (b % i == 0 && a % i == 0) {
                    System.out.println("Ước chung lớn nhất là " + i);
                    break;
                }

            }

        } else {
            System.out.println("không có ước chung lớn nhất");
        }
    }
}

