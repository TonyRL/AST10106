import java.util.Scanner;
public class CourseSplitter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course string: ");

        String str = sc.nextLine();

        System.out.println("Division: " + str.substring(0,3));
        System.out.println("Course Code: " + str.substring(4,10));
        System.out.println("Course Description: " + str.substring(10));

    }
}
