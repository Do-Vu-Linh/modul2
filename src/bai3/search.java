package bai3;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        String[] student = {"one", "two", "three", "four", "five"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String input_name = sc.nextLine();
        boolean isExit = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.println("vị trí sinh viên " + input_name + " là " + i);
                isExit=true;
                break;
            }

        }
        if(!isExit){
            System.out.println("không tìm thấy nhé");
        }
    }
}
