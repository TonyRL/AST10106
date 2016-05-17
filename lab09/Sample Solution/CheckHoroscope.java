import java.util.Scanner;

public class CheckHoroscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean cont = false;
		do{
		System.out.print("Enter your birth year: ");
		int year = sc.nextInt();
		
			switch(year%12){
			case 0:
				System.out.println("Your horoscope sign: Monkey");
				break;
			case 1:
				System.out.println("Your horoscope sign: Roster");
				break;
			case 2:
				System.out.println("Your horoscope sign: Dog");
				break;
			case 3:
				System.out.println("Your horoscope sign: Pig");
				break;
			case 4:
				System.out.println("Your horoscope sign: Rat");
				break;
			case 5:
				System.out.println("Your horoscope sign: Cow");
				break;
			case 6:
				System.out.println("Your horoscope sign: Tiger");
				break;
			case 7:
				System.out.println("Your horoscope sign: Rabbit");
				break;
			case 8:
				System.out.println("Your horoscope sign: Dragon");
				break;
			case 9:
				System.out.println("Your horoscope sign: Snake");
				break;
			case 10:
				System.out.println("Your horoscope sign: Horse");
				break;
			case 11:
				System.out.println("Your horoscope sign: Goat");
				break;
			}
			// These 3 statements are optional.  Not required in the assignment.
			System.out.print("Do you want to continue (1 for yes, other numbers for no)? ");
			int temp = sc.nextInt();
			cont = (temp==1? true:false);
		}while (cont);
		System.out.print("Thank you for using the Check Horoscope Application");
	}
}
