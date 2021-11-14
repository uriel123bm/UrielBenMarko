import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your fibonnaci sequence: ");
        int num = scanner.nextInt();
        int num1 = 0;
     //   System.out.print (0 + " ");
        int num2 = 1;
        if (num > 1){
      //      System.out.print (1 + " ");
        }

        for (int i = 0; i < num; i++) {

           int nextFibo = num1 + num2;
            num1 = num2;
           num2 = nextFibo;
            System.out.print(nextFibo + " ");
        }
    }
}