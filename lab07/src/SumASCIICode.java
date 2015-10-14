import java.util.Scanner;
public class SumASCIICode
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-character string: ");
        String str = sc.next();

        int Sum = str.charAt(0)+str.charAt(1)+str.charAt(2)+str.charAt(3);
        System.out.println("Sum: " + Sum);

    }
}
