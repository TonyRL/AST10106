import java.util.Scanner;

public class QuadraticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, x1, x2, delta;
		
		// Create Scanner class instance to handle user input
		Scanner sc = new Scanner(System.in);
		
		// "\n" represents new line
		System.out.println("Welcome to use Quadratic Calculator\n"); // "\n" represents new line
		
		// Prompt user for value a, b, and c
		System.out.print("Please enter the value of a: ");
		a = sc.nextDouble();
		
		System.out.print("Pleae enter value of b: ");
		b = sc.nextDouble();
		
		System.out.print("Please enter value of c: ");
		c = sc.nextDouble();
		
		// Computing roots
		delta = Math.pow(b, 2) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		// Print roots
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);
	}

}
