import java.util.Scanner;

import java.util.regex.Pattern;

public class SafeInput {
    //Part A
    public static String getNonZeroLenString(Scanner pipe, String prompt) {

        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    //Part B

    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;

            } else {
                String trash = pipe.nextLine();
                System.out.println("Error: \"" + trash + "\" is not an integer.");
            }

        } while (!done);

        return retVal;
    }

    //Part C

    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0.0;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;

            } else {
                String trash = pipe.nextLine();
                System.out.println("Error: \"" + trash + "\" is not a double.");
            }

        } while (!done);
        return retVal;
    }



    //Part D

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;

                } else {
                    System.out.println("Error: " + retVal + " is not in range.");
                }

            } else {
                String trash = pipe.nextLine();
                System.out.println("Error: \"" + trash + "\" is not an integer.");
            }
        } while (!done);
        return retVal;
    }

    //Part E

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0.0;
        boolean done = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;

                } else {
                    System.out.println("Error: " + retVal + " is out of range.");
                }

            } else {
                String trash = pipe.nextLine();
                System.out.println("Error: \"" + trash + "\" is not a double.");
            }
        } while (!done);
        return retVal;
    }

    // Part F

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                return true;
            } else if (response.equalsIgnoreCase("N")) {
                return false;

            } else {
                System.out.println("Error: Enter Y or N only.");
            }
        } while (!done);
        return false; // should never reach here
    }

    //Part G
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
            if (Pattern.matches(regEx, retString)) {
                done = true;

            } else {
                System.out.println("Error: Input does not match required pattern.");
            }
        } while (!done);
        return retString;
    }

    // Part H

    public static void prettyHeader(String msg) {
        int width = 60;
        int stars = 3;
        int msgLength = msg.length();
        int spaces = width - (stars * 2) - msgLength;
        int padLeft = spaces / 2;
        int padRight = spaces - padLeft;

        // Top
        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();

        // Message
        for (int i = 0; i < stars; i++) System.out.print("*");
        for (int i = 0; i < padLeft; i++) System.out.print(" ");
        System.out.print(msg);
        for (int i = 0; i < padRight; i++) System.out.print(" ");
        for (int i = 0; i < stars; i++) System.out.print("*");
        System.out.println();

        // Bottom
        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();
    }
}
