import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.util.Scanner;

public class CrossTheRiver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCannibalsLeft = 3, numCannibalsRight = 0;
        int numMissionariesLeft = 3, numMissionariesRight = 0;
        boolean boatOnLeft = true;
        int round = 0;

        System.out.println("Crossing the river");
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("Round " + round + ":");

            System.out.print("Left");
            System.out.print("\t");
            System.out.print("Right\n ");
            for (int i = 0; i < numCannibalsLeft; i++)
                System.out.print("C");
            for (int i = 0; i < numMissionariesLeft; i++)
                System.out.print("M");

            System.out.print("\t");
            //System.out.print("Right ");
            for (int i = 0; i < numCannibalsRight; i++)
                System.out.print("C");
            for (int i = 0; i < numMissionariesRight; i++)
                System.out.print("M");

            System.out.println();
            //System.out.println("Boat: " + (boatOnLeft?"left":"right"));
            System.out.println(boatOnLeft ? "-------\n\\-----/" : "\t\t-------\n\t\t\\-----/");


            if (boatOnLeft) {
                System.out.print("First passenger (c for cannibal,  m for missionary): ");
                char firstPassenger = sc.next().charAt(0);
                switch (firstPassenger) {
                    case 'C':
                    case 'c':
                        if (numCannibalsLeft > 0) {
                            numCannibalsRight++;
                            numCannibalsLeft--;
                        }
                        break;

                    case 'M':
                    case 'm':
                        if (numMissionariesLeft > 0) {
                            numMissionariesRight++;
                            numMissionariesLeft--;
                        }
                        break;
                    default:
                        System.out.println("Illegal input!");
                        continue;
                }
                System.out.print("Second passenger (c for cannibal,  m for missionary, n for none): ");
                char secondPassenger = sc.next().charAt(0);
                switch (secondPassenger) {
                    case 'C':
                    case 'c':
                        if (numCannibalsLeft > 0) {
                            numCannibalsRight++;
                            numCannibalsLeft--;
                        }
                        break;

                    case 'M':
                    case 'm':
                        if (numMissionariesLeft > 0) {
                            numMissionariesRight++;
                            numMissionariesLeft--;
                        }
                        break;
                    case 'n':
                    case 'N':
                        break;
                    default:
                        System.out.println("Illegal input!");
                        continue;
                }
            }

            if (!boatOnLeft) {
                System.out.print("First passenger (c for cannibal,  m for missionary): ");
                char firstPassenger = sc.next().charAt(0);
                switch (firstPassenger) {
                    case 'C':
                    case 'c':
                        if (numCannibalsRight > 0) {
                            numCannibalsRight--;
                            numCannibalsLeft++;
                        }
                        break;

                    case 'M':
                    case 'm':
                        if (numMissionariesRight > 0) {
                            numMissionariesRight--;
                            numMissionariesLeft++;
                        }
                        break;
                    default:
                        System.out.println("Illegal input!");
                        continue;
                }

                System.out.print("Second passenger (c for cannibal,  m for missionary, n for none): ");
                char secondPassenger = sc.next().charAt(0);

                switch (secondPassenger) {
                    case 'C':
                    case 'c':
                        if (numCannibalsRight > 0) {
                            numCannibalsRight--;
                            numCannibalsLeft++;
                        }
                        break;

                    case 'M':
                    case 'm':
                        if (numMissionariesRight > 0) {
                            numMissionariesRight--;
                            numMissionariesLeft++;
                        }
                        break;
                    case 'n':
                    case 'N':
                        break;
                    default:
                        System.out.println("Illegal input!");
                        continue;
                }
            }

            if (numCannibalsRight == 3 && numMissionariesRight == 3) {
                round++;
                System.out.println("----------------------------------");
                System.out.println("Round " + round + ":");
                System.out.print("Left\t");
                System.out.print("Right\n");
                System.out.print("\t\t");
                System.out.print("MMMMCCC\n");
                System.out.print("\t\t-------" + "\n\t\t\\-----/\n");
                System.out.println("Congratulations! You win the game in " + round + " rounds!");
                System.exit(0);
            }

            if ((numCannibalsLeft > numMissionariesLeft && numMissionariesLeft > 0) || (numCannibalsRight > numMissionariesRight && numMissionariesRight > 0)) {
                System.out.println("Missionaries eaten by cannibals! You lose!");
                System.exit(0);
            }

            round++;
            boatOnLeft = !boatOnLeft;

        }
    }
}
