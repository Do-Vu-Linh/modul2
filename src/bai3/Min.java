package bai3;

public class Min {
    public static void main(String[] args) {
        int [] array =  {1,2,3,4,5,6};
        int index = displayMin(array);
        System.out.println("Phần tử nhỏ nhất của mảng đã cho là " +array[index]);


    }

    public static int displayMin(int[] arr) {
        int min = arr[0];
        int index =0;
        for(int i = 0;i<arr.length;i++ ){
            if (min>arr[i]){
                 index = i ;
            }
        }
        return index;

    }
}
