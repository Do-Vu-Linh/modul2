package bai3;

public class FindMax2 {
    public static void main(String[] args) {
        int[][]arr ={
                {1,2,3,4,5,5,6,7},
                {5,6,7,8,9,9},
                {10,11,12,13,14,25,24,54}
        };
        int i = 0 ;
        int j = 0 ;
        int max=  arr[0] [0] ;
        for (i=0;i< arr.length ;i++) {
            for(j =0;j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max =arr[i][j] ;
                }
            }
        }
        System.out.println(max + " tại vị trí arr" +i+" "+ j );
    }
}
