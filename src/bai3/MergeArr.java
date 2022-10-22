package bai3;

import java.util.Arrays;

public class MergeArr {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = { 6,7,8,9};
        int [] arr3 = new int[9];
        for (int i =0;i<arr1.length;i++){
            arr3[i] = arr1[i] ;
        }
        int j = 5 ;
        int t = 0;
        for (j=5;j<arr3.length;j++){
            arr3[j] = arr2[t++] ;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
