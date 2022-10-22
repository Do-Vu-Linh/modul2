package bai13.AlgorithmComplexityTest;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        int[] array1 = {1, 5,3,3,9,3,23};
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] < array1[i]) {
                    int temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }


            }


        }System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        System.out.println(array1[5]);
        System.out.println(array1[6]);
    }
}
