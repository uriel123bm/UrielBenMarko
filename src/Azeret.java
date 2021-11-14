import java.util.Enumeration;
import java.util.Scanner;

public class Azeret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert num");

        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("The number not good");
        }
        int result = num;
        for (int i = num - 1; i > 0; i--) {
            result = result * i;

        }
        System.out.println("The result is " + result );
    }
}