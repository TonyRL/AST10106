public class WelcomeString
{
    public static void main(String[] args)
    {
        String welcomeString = "Welcome! This is AST10106 Introduction to Programming";

        String upperCase = welcomeString.toUpperCase();
        System.out.println("Upper case string: " + upperCase);

        String lowerCase = welcomeString.toUpperCase();
        System.out.println("Lower case string: " + lowerCase);

        int strLegth = welcomeString.length();
        System.out.println("Length of string: " + strLegth);

        int indexProgramming = welcomeString.indexOf("Programming");
        System.out.println("Index of word Programming: " + indexProgramming);



        /**System.out.println("Upper case string: " + str.toUpperCase());
        System.out.println("Lower case string: " + str.toLowerCase());
        System.out.println("Length of string: " + str.length());
        System.out.println("Index of word Programming: " + str.indexOf("Programming"));
         */

    }

}
