import java.util.Scanner;

public class ExerciseZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Open in 10:00-20:00");
        System.out.println("What the time?");
        int huor = scanner.nextInt();
        if (huor >= 10 && huor < 20) {
            System.out.println("You can in the safari " + (20 - huor) + " huors");
        } else
            System.out.println("The safari is close");


    }
}
