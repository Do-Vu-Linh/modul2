package bai3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập giá trị phần tử thay thế : ");
        int num = sc.nextInt();
        int index = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (num == array[i]) {
                index = i ;
                break;
            }
        }
        int j = index;
        int [] newarr = array;
        for(j=index;j<array.length-1;j++){
            newarr[j] = array[index++];

        }
        newarr[array.length-1]=0 ;
        System.out.println(Arrays.toString(newarr));
    }
}