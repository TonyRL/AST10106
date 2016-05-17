// Lab #04: CylinderCal
import java.util.Scanner;

public class CylinderCal
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      // prompt and obtain radius
      System.out.print("Enter radius of cylinder: ");
      double radius = sc.nextDouble();
      // prompt and obtain height
      System.out.print("Enter height of cylinder: ");
      double height = sc.nextDouble();

      // compute surface area and volume
      double surfaceArea = 2 * Math.PI * radius * height;
      double volume = Math.PI * radius * radius * height;

      // display result
      System.out.println("Surface area is " + surfaceArea);
      System.out.println("Volume is " + volume);
   }
}