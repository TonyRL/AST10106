
import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args)
	{
		System.out.println("Leap Year Calculation");
		System.out.print("Enter the year: ");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year < 0)
			System.out.println("Invalid input");
		else
		{
			if((year % 4 == 0 && year % 100 != 0) ||
			   (year % 400 == 0))
			{
				System.out.println(year + " is a leap year");
				System.out.println("The number of days in " + year + " is 366");			
			}
			else
			{
				System.out.println(year + " is NOT a leap year");
				System.out.println("The number of days in " + year + " is 365");				
			}
		}
	}
}
