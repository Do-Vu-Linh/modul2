package bai3;

import javax.xml.transform.Source;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị thay thế : ");
        int num = sc.nextInt();
        System.out.println("nhập vị trí index cần thay : ");
        int index = sc.nextInt();
        int[] newarr = new int[11] ;
        if (index >= 0 && index < arr.length) {
            newarr[index] = num;
            int i = 0 ;
            for (i = 0; i < index;  i++) {
                newarr[i] = arr[i];}
          for(int j = index+1; j<newarr.length;j++) {
              newarr[j] =arr[j-1] ;
          }
                System.out.println(Arrays.toString(newarr));
        }else {
            System.out.println("nhập lại số khác đi bạn ơi : ");
        }
    }
}
