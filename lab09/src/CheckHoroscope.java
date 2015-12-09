
import java.util.Scanner;

public class CheckHoroscope {
    public static void main(String[] args) {
        int birthYear, result;
        Scanner sc = new Scanner(System.in);
        String[] HoroscopeSign = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Cow", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat"};

        System.out.print("Enter your birth year: ");
        birthYear = sc.nextInt();

        result = birthYear % 12;

        System.out.println("Your horoscope sign: " + HoroscopeSign[result]);



        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = sc.nextInt();

        switch (year%12){
            case 0:
                System.out.println("Your horoscope sign: Monkey");
                break;
            case 1:
                System.out.println("Your horoscope sign: Rooster");
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
        */

    }
}
