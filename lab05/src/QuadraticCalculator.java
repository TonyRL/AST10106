import java.util.Scanner;
public class QuadraticCalculator
{
	public static void main(String[] args) 
	{
		double a, b, c, x1, x2, d;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Welcome to use Quadratic Calculator\n");
		System.out.print("Please enter the value of a: ");
		a = sc.nextDouble();
		
		System.out.print("Please enter the value of b: ");
		b = sc.nextDouble();
		
		System.out.print("Please enter the value of c: ");
		c = sc.nextDouble();
		
		d = Math.pow(b, 2) - 4 * a * c;
		x1 = (-b + Math.sqrt(d) ) / (2 * a);
		x2 = (-b - Math.sqrt(d) ) / (2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.print("x2 = " + x2);
	}

}
