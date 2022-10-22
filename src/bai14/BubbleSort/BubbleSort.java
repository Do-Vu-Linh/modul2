package bai14.BubbleSort;

import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mảng danh sách của bạn: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("nhập " + size + " phần tử của list");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Danh sách của bạn là : ");

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        boolean need = true;
        int i = 0;
        while (i < list.length && need) {
            need = false;
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    System.out.println("\n đổi chỗ phần tử " + list[j] + "thành phần tử " + list[j-1]);
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    need = true;
                }
            }
            i++;
        }
        if (!need) {
            System.out.println("Dãy của bạn đã được sắp xếp");
        }
             for (int j : list) {
            System.out.print(j + "\t ");
        }
    }
}


