import java.util.Scanner;
public class SumASCIICode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 4-character string: ");
		String usrInput = sc.nextLine();
		
		int sum = 0;
		
		// Adding value of each character
		for (int i = 0; i < usrInput.length(); i++)
			sum += usrInput.charAt(i);
		
		System.out.println("Sum: " + sum);
	}

}
