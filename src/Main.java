import java.util.Scanner;

public class Main {
    private static final double PI = Math.PI;

    private static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }

    private static double circumference(double radius) {
        return 2 * PI * radius;
    }

    private static void displayResults(double radius) {
        System.out.println("The area of the circle is " + area(radius));
        System.out.println("The circumference of the circle is " + circumference(radius));
    }

    private static void inputRadius() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double radius = scanner.nextDouble();

        displayResults(radius);
    }

    public static void main(String[] args) {
        inputRadius();
    }
}