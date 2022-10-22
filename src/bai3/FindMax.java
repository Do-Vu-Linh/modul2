package bai3;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("nhập số lượng tỉ phú: ");
         size = sc.nextInt();
        if(size>20)
            System.out.println("nhập lại đi bạn ơi");
        } while (size>20);
        int[] array = new int[size] ;
        int j = 0;
        while (j<size){
            System.out.println("nhập giá trị của các tỉ phú " + (j+1)+ " là :");
            array[j] = sc.nextInt();
            j++;
        }
        int max = array[0];
        int index = 1;
        for (int i =0;i<size;i++){
            if(max<array[i]){
                max =array[i];
                index= i+1 ;
            }

        }
        System.out.println("số tiền lớn nhất là : "+ max + "ở vị trí: " + index);

    }
}
