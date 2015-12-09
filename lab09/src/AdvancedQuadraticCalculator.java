import java.util.Scanner;

public class AdvancedQuadraticCalculator {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        a = sc.nextDouble();

        if (a == 0) {
            System.out.print("Invalid input");
            System.exit(0);
        }

        System.out.print("Enter coefficient b: ");
        b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        c = sc.nextDouble();

        System.out.println("Solving " + a + "x^2 + " + b + "x + " + c + " = 0");

        d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            System.out.println("Two distinct solutions:");
            System.out.println("x = " + (-b + Math.sqrt(d)) / (2 * a));
            System.out.println("x = " + (-b - Math.sqrt(d)) / (2 * a));
        }

        if (d == 0)
            System.out.println("Repeated solution: x = " + (-b) / (2 * a));

        if (d < 0) {
            System.out.println("There is no real solution");
        }
    }
}
