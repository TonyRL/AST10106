import java.util.Scanner;

public class CrossTheRiver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//Variables
		int numCannibalsLeft = 0, numCannibalsRight = 3;
		int numMissionariesLeft = 0, numMissionariesRight = 3;
		boolean boatOnRight = true;
		int round = 0;
		
		while (true) {
		
			//Show inital situation
			System.out.println("Round: " + round);
			System.out.print("Left: ");
			for(int i=0; i< numCannibalsLeft; i++) System.out.print("C"); 
			for(int i=0; i< numMissionariesLeft; i++) System.out.print("M"); 
			System.out.println("\t");
			System.out.print("Right: ");
			for(int i=0; i< numCannibalsRight; i++) System.out.print("C"); 
			for(int i=0; i< numMissionariesRight; i++) System.out.print("M"); 
			System.out.println();		
			System.out.println("Boat: " + (boatOnRight?"right":"left"));
			
			//Make move
			if (boatOnRight) {
				System.out.print("First passenager (C/M) on the boat: ");
				char firstPassenger = sc.next().charAt(0);
				switch (firstPassenger) {
					case 'C':
					case 'c': if (numCannibalsRight > 0) { numCannibalsLeft++; numCannibalsRight--; } break;
					case 'M':
					case 'm': if (numMissionariesRight > 0) { numMissionariesLeft++; numMissionariesRight--; } break;
					default: 
						System.out.println("Invalid Input! Try again.");
						continue;
				}
				System.out.print("Second passenager (C/M/n) on the boat: ");
				char secondPassenger = sc.next().charAt(0);
				switch (secondPassenger) {
					case 'C':
					case 'c': if (numCannibalsRight > 0) { numCannibalsLeft++; numCannibalsRight--; } break;
					case 'M':
					case 'm': if (numMissionariesRight> 0) { numMissionariesLeft++; numMissionariesRight--; } break;
					case 'N':
					case 'n': break;
					default: 
						System.out.println("Invalid Input! Try again.");
						continue;
				}
			} 
			if (!boatOnRight) {
				System.out.print("First passenager (C/M) on the boat: ");
				char firstPassenger = sc.next().charAt(0);
				switch (firstPassenger) {
					case 'C':
					case 'c': if (numCannibalsLeft > 0) { numCannibalsLeft--; numCannibalsRight++; } break;
					case 'M':
					case 'm': if (numMissionariesLeft > 0) { numMissionariesLeft--; numMissionariesRight++; } break;
					default: 
						System.out.println("Invalid Input! Try again.");
						continue;
				}
				System.out.print("Second passenager (C/M/n) on the boat: ");
				char secondPassenger = sc.next().charAt(0);
				switch (secondPassenger) {
					case 'C':
					case 'c': if (numCannibalsLeft > 0) { numCannibalsLeft--; numCannibalsRight++; } break;
					case 'M':
					case 'm': if (numMissionariesLeft > 0) { numMissionariesLeft--; numMissionariesRight++; } break;
					case 'N':
					case 'n': break;
					default: 
						System.out.println("Invalid Input! Try again.");
						continue;
				}
			} 
			
			//Check win?
			if (numCannibalsLeft == 3 && numMissionariesLeft == 3) {
			
				System.out.println("Congratulations! You win the game in " + round + " rounds!");
				System.exit(0);
			}

			//Check lose?
			if ( (numCannibalsLeft > numMissionariesLeft && numMissionariesLeft > 0) || 
			     (numCannibalsRight > numMissionariesRight && numMissionariesRight > 0) ) {
			
				System.out.println("Ooh! Missionaries are eaten by the Cannibals!");
				System.exit(0);
			}
			
			round++;
			boatOnRight = !boatOnRight;
		}
	}
}





