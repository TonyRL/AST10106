
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Leap Year Calculation");
        System.out.print("Enter the year: ");
        int Leap = sc.nextInt();

        if (Leap < 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        int condition1A = Leap % 4, condition1B = Leap % 100, conditon2 = Leap % 400;

        if ((condition1A == 0 && condition1B != 0) || conditon2 == 0) {
            System.out.println(Leap + " is a leap year.");
            System.out.println("The number of days in " + Leap + " is 366.");
        } else {
            System.out.println(Leap + " is NOT a leap year.");
            System.out.println("The number of days in " + Leap + " is 365.");
        }
    }

}
