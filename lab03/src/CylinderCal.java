import java.util.Scanner;
public class CylinderCal
{
	public static void main(String[] args)
	{
		int rad, height;
		double sArea, vol;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of cylinder: ");
		rad = sc.nextInt();
		System.out.print("Enter height of cylinder: ");
		height = sc.nextInt();
		
		System.out.println("Surface area is " + (2 * Math.PI * rad * height));
		System.out.println("volume is "+ (Math.PI * Math.pow(rad, 2) * height));
	}
}