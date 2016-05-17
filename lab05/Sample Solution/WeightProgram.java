import java.util.Scanner;

public class WeightProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare mass of apple and mass of mango as constants
		final int APPLE_MASS = 103;
		final int MANGO_MASS = 110;
		
		int numApple, numMango, totalWeight;
		
		// create an Scanner class instance for handling user input 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Weight program");
		
		// prompt user for input # of apples and mangos
		System.out.print("Enter number of apples to buy: ");
		numApple = sc.nextInt();
		
		System.out.print("Enter number of mango to buy: ");
		numMango = sc.nextInt();
		
		// computing total weight
		totalWeight = numApple * APPLE_MASS + numMango * MANGO_MASS;
		
		// compute and print weights needed
		System.out.println("100g-weight: " + totalWeight / 100);
		
		// Extract the remainder for computing # of 50g weight needed
		totalWeight = totalWeight % 100;
		System.out.println("50g-weight: " + totalWeight / 50);
		
		// Extract the remainder for computing # of 20g weight needed
		totalWeight = totalWeight % 50;
		System.out.println("20g-weight: " + totalWeight / 20);
		
		// Extract the remainder for computing # of 10g weight needed
		totalWeight = totalWeight % 20;
		System.out.println("10g-weight: " + totalWeight / 10);

		// Extract the remainder for computing # of 5g weight needed
		totalWeight = totalWeight % 10;
		System.out.println("5g-weight: " + totalWeight / 5);
		
		// Extract the remainder for computing # of 1g weight needed
		totalWeight = totalWeight % 5;
		System.out.println("1g-weight: " + totalWeight);
	}

}
