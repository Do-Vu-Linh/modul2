package bai2;

import java.util.Scanner;

public class Laisuat {
    public static void main(String[] args) {
        double money, interest_rate ;
        int month ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số tiền gửi :");
        money = sc.nextDouble();
        System.out.println(" nhập lãi suất hàng năm :");
        interest_rate = sc.nextDouble();
        System.out.println("nhập số tháng gửi :");
        month = sc.nextInt();
        double totalInterest ;
        totalInterest = money*interest_rate*month/12 ;
        System.out.println("số tiền lãi là :" + totalInterest);
    }
}
