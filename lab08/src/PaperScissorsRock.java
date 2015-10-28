/**
 * Created by Tony on 29/10/2015.
 */
import java.util.Scanner;
import java.util.Random;
public class PaperScissorsRock
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Paper, Scissors, Rock");
        System.out.print("Enter 0 for paper, 1 for scissors, or 2 for rock (-1 to quit): ");
        int playerOption = input.nextInt();

        if(playerOption ==-1)
            System.exit(0);
        else if(playerOption == 0)
            System.out.println("Player picks paper");
        else if(playerOption == 1)
            System.out.println("Player picks scissors");
        else if(playerOption == 2)
            System.out.println("Player picks rock");
        else
        {
            System.out.println("Invalid input");
            System.exit(0);
        }

        Random randomGen = new Random();
        int compOption = randomGen.nextInt(3);

        if(compOption == 0)
            System.out.println("Computer picks paper");
        else if(compOption == 1)
            System.out.println("Computer picks scissors");
        else if(compOption == 2)
            System.out.println("Computer picks rock");

        if((playerOption >= compOption) && (playerOption !=0 || playerOption != compOption))
            System.out.println("Player wins");
        else if((playerOption == 0 && compOption == 2) && playerOption != compOption)
            System.out.println("Player wins");
        else if((compOption >= playerOption) && (compOption !=0 || playerOption != compOption))
            System.out.println("Computer wins");
        else if((compOption == 0 && playerOption == 2) && playerOption != compOption)
            System.out.println("Computer wins");
        else if(compOption == playerOption)
            System.out.println("Draw");




    }

}

