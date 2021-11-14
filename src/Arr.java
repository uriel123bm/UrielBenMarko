import java.util.Scanner;

public class Arr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        int[] numbers = printCosts(a, b);
        printArray(numbers);

    }

    public static int[] fillArray(int size, int value) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
        }
        return numbers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static int[] printCosts(int size, int firstNumber) {
        int[] numbers = new int[size];
        int currenNumber = firstNumber;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = currenNumber;
            firstNumber++;
        }
        return numbers;
    }
}
