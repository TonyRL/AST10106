// Lab #04: SeparateDigits
import java.util.Scanner;

public class SeparateDigits
{
  public static void main(String[] args)
  {
     Scanner input = new Scanner( System.in );
     int number;	// number input by user
     int digit1;	// first digit
     int digit2;	// second digit
     int digit3;	// third digit
     int digit4;	// fourth digit
     int digit5;	// fifth digit

     System.out.print("Enter a five digit integer: "); // prompt
     number = input.nextInt();	// read number from keyboard

     // determine the 5 digits
     digit1 = number / 10000;
     digit2 = number % 10000 / 1000;
     digit3 = number % 10000 % 1000 / 100;
     digit4 = number % 10000 % 1000 % 100 / 10;
     digit5 = number % 10000 % 1000 % 100 % 10;

     // display the individual digits
     System.out.print("Digits in " + number + " are ");
     System.out.print(digit1 + " " + digit2 + " " + digit3 + " ");
     System.out.print(digit4 + " " + digit5);
  }
}
