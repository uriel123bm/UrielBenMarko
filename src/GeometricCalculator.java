import java.util.Scanner;

public class GeometricCalculator {
    public static void main(String[] args) {
        printMenu();
        int userInput = chooseOption();
        switch (userInput) {
            case 1:
                double result = calculateDistance();
                System.out.println("The distance is " + result);
                break;
            case 2:
                double hypotenuse = calculateHypotenuse();
                System.out.println("The hypotenuse size is " + hypotenuse);
                break;
            case 3:
                spcoeAndAreaCircle();
                break;
            case 4:
                squareArea();
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }

    public static void printMenu() {
        System.out.println("Choose an option: ");
        System.out.println("1 - Distance");
        System.out.println("2 - Hipotenuse");
        System.out.println("3 - Circle");
        System.out.println("4 - Square");
        System.out.println("5 - Rectangle");
        System.out.println("6 - Exit");
    }

    public static int chooseOption() {
        Scanner scanner = new Scanner(System.in);
        int selectedOption;
        do {
            System.out.println("Enter your choice (1-6): ");
            selectedOption = scanner.nextInt();
        } while (selectedOption < 1 || selectedOption > 6);
        return selectedOption;
    }

    public static double calculateDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1");
        int y1 = scanner.nextInt();
        System.out.println("Enter x2");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2");
        int y2 = scanner.nextInt();
        double distance = calculateDeterminent(x1 - x2, y1 - y2);
        return distance;
    }

    public static double calculateHypotenuse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("Enter side 2: ");
        int side2 = scanner.nextInt();
        double hypotenuse = calculateDeterminent(side1, side2);
        return hypotenuse;
    }

    public static double calculateDeterminent(int number1, int number2) {
        double result = Math.sqrt(Math.pow(number1, 2) + Math.pow(number2, 2));
        return result;
    }

    public static  void spcoeAndAreaCircle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        int radius = scanner.nextInt();
       double scope = 2*3.14*radius;
       double area = 3.14 * Math.pow(radius , 2);
        System.out.println( "The scope is " + scope);
        System.out.println("the area is " + area);
    }
    public static void squareArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the square ");
        double square = scanner.nextInt();
        double SquareArea = Math.pow(square , 2);
        System.out.println( " The square area is " + SquareArea);
    }
    public static int whitespace (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        int width = scanner.nextInt();
        System.out.println("Enter the height");
        int height = scanner.nextInt();

return height;
    }
}