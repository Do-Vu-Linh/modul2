import java.util.Scanner;

public class DayMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you wanto count day ?");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("Month 2 has 28 or 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("'the month" + month + "has a 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("the month" + month + "has a 30 day");
                break;
            default:
                System.out.println("invalid input!");
                break;

        }
    }
}
