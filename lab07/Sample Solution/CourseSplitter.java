import java.util.Scanner;

public class CourseSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Prompt user for string input
		System.out.print("Enter course string: ");
		String courseString = sc.nextLine();
		
		// substring (x, y) x=>beginning index (inclusive); y=>end index (exclusive)
		String divTitle = courseString.substring(0, 3);
		String courseCode = courseString.substring(4, 9);
		String courseDesc = courseString.substring(10);
		
		System.out.println("Division: " + divTitle);
	    System.out.println("Course code: " + courseCode);
	    System.out.println("Course Description: " + courseDesc);
	}

}
