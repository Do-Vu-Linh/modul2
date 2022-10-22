import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra:");
        int year;
        year = scanner.nextInt();
        Boolean isleapyear = false;
        Boolean isdivisible4 = year % 4 == 0;
        if (isdivisible4) {
            Boolean isdivisible100 = year % 100 == 0;
            if (isdivisible100) {
                Boolean isdivisible400 = year % 400 == 0;
                if (isdivisible400) {
                    isleapyear = true;
                }
            } else {
                isleapyear = true;
            }
        }
        if (isleapyear) {
            System.out.println(year + "là năm nhuận");

        } else {
            System.out.printf("không phải là năm nhuân" + year);
        }
    }
}

