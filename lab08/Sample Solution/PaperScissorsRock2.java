import java.util.Random;
import javax.swing.JOptionPane;

public class PaperScissorsRock2
{
	public static void main(String[] args)
	{
		
		Object[] options = {"Paper", "Scissors", "Rock"};
		Random randomGen = new Random();
		
		int playerOption = JOptionPane.showOptionDialog(null, 
								"Which one would you like to choose",
								"Paper, Scissors & Rock",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								options,
								options[randomGen.nextInt(3)]);
		
		int compOption = randomGen.nextInt(3);
		
		if (playerOption == -1) 
			System.exit(0);
		
		if (compOption == playerOption) {
		
			JOptionPane.showMessageDialog(null, 
					"Your option is " + options[playerOption] + "\n" +
					"Computer option is " + options[compOption] + "\n\n" +
					"Draw!!!",
					"Paper, Scissors & Rock",
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		
		if ( (compOption - playerOption == 1) || (compOption == 0 && playerOption == 2) ) {
		
			JOptionPane.showMessageDialog(null, 
					"Your option is " + options[playerOption] + "\n" +
					"Computer option is " + options[compOption] + "\n\n" +
					"Computer Win!!!",
					"Paper, Scissors & Rock",
					JOptionPane.WARNING_MESSAGE);
		} else {
		
			JOptionPane.showMessageDialog(null, 
					"Your option is " + options[playerOption] + "\n" +
					"Computer option is " + options[compOption] + "\n\n" +
					"You Win!!!",
					"Paper, Scissors & Rock",
					JOptionPane.ERROR_MESSAGE);	
		}
		
		/*
		// print out computer's option
		if(compOption == 0)
		   System.out.println("Computer picks paper"); 
   		else if(compOption == 1) 
    	   System.out.println("Computer picks scissors");
		else if(compOption == 2) 
 	       System.out.println("Computer picks rock");				
		
		// print results (either "Draw", "Computer Wins", or "Player Wins") 	
	    if(compOption == playerOption) 
		   System.out.println("Draw");
		else {
		   if(compOption == 2 && playerOption == 1)
		      System.out.println("Computer Wins"); 
		   else if(compOption == 1 && playerOption == 0) 
		      System.out.println("Computer Wins");
		   else if(compOption == 0 && playerOption == 2)
			  System.out.println("Computer Wins");
		   else
			  System.out.println("Player Wins");
		}		
		*/
	}
}