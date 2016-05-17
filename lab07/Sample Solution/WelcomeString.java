
public class WelcomeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String welcomeString = "Welcome! This is AST10106 Introduction to Programming.";
		
		// Convert string to upper case
		String upperCase = welcomeString.toUpperCase();
		System.out.println("Upper case string: " + upperCase);
		
		// Convert string to lower case
		String lowerCase = welcomeString.toLowerCase();
		System.out.println("Lower case string: " + lowerCase);
		
		// Count length of welcomeString
		int strLength = welcomeString.length();
		System.out.println("Length of String: " + strLength);
		
		// Show index of the word Programming
		int indexProgramming = welcomeString.indexOf("Programming");
		System.out.println("Index of word Programming: " + indexProgramming);
	}

}

