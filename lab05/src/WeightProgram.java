import java.util.Scanner;
public class WeightProgram
{
	public static void main(String[] args)
	{
		final int APPLE_MASS = 103;
		final int MANGO_MASS = 110;
		int numApple, numMango, totalWeight;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Weight Program");
		System.out.print("Enter number of apples to buy: ");
		numApple = sc.nextInt();
		System.out.print("Enter number of mangos to buy: ");
		numMango = sc.nextInt();
		
		totalWeight = numApple * APPLE_MASS + numMango * MANGO_MASS;
		
		System.out.println("100g-weight: " + totalWeight /100);
		totalWeight  = totalWeight % 100;
		
		System.out.println("50g-weight: " + totalWeight /50);
		totalWeight = totalWeight % 50;
		
		System.out.println("20g-weight: " + totalWeight /20);
		totalWeight  = totalWeight % 20;
		
		System.out.println("10g-weight: " + totalWeight /10);
		totalWeight = totalWeight % 10;
		
		System.out.println("5g-weight: " + totalWeight /5);
		totalWeight  = totalWeight % 5;
		
		System.out.println("1g-weight: " + totalWeight /1);
		totalWeight = totalWeight % 1;
		
	}

}
