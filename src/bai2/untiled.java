package bai2;

import java.util.Scanner;

public class untiled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra : ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + "không phải số ngto");
        } else {
            int i = 2;
            Boolean flag = true;
            for (i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.println("là số nguyên tố");
            } else {
                System.out.println("không là số nguyeen tố");
            }
        }
    }
}
