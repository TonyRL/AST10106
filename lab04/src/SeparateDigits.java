import java.util.Scanner;
public class SeparateDigits {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a five digit integer: ");
		int fiveNum = sc.nextInt();
		int fifDigi, forDigi, treDigi, twoDigi, oneDigi;
		
		fifDigi = fiveNum / 10000;
		forDigi = fiveNum % 10000 / 1000;
		treDigi = fiveNum % 1000 / 100;
		twoDigi = fiveNum % 100 / 10;
		oneDigi = fiveNum % 10;
		
		System.out.print("Digits in "+fiveNum+" are "+fifDigi+"   "+forDigi+"   "+treDigi+"   "+twoDigi+"   "+oneDigi);
	}

}
