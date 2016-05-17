import java.util.Scanner;

public class AdvQuadraticEq {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//obtain input from user
		System.out.print("Enter coeficient a:");
		double a = sc.nextDouble();
		//situation for a = 0 
		if (a == 0)
		{
			System.out.println("invalid output");
			System.exit(0);
		}
		System.out.print("Enter coeficient b:");
		double b = sc.nextDouble();
		System.out.print("Enter coeficient c:");
		double c = sc.nextDouble();
		
		//process
		double delta = b*b - 4*a*c;
		double x1 = (-b + Math.sqrt(delta))/2*a;
		double x2 = (-b - Math.sqrt(delta))/2*a;
		System.out.println(x1 + ", " + x2);

		//result
		System.out.println("Solving " + a + "x^2 + " + b + "x + " + c +" = 0");
		
		if (delta < 0)
			System.out.println("There is no real solution");
		if (delta == 0)
			{
			System.out.print("Repeated solution: ");
			System.out.printf("x = %.4f\n", x1);
			}
		if (delta > 0)
			{
			System.out.println("Two distinct solutions");
			System.out.printf("x1 = %.4f&\n",x1 );
			System.out.printf("x2 = %.4f\n",x2);
			}
	}

}