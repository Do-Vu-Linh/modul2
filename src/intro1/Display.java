import java.util.Scanner;

public class Display {
    public static void main(String[] args) {

        System.out.println("Nhập tên :");
Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("Hello" + name );
    }
}
