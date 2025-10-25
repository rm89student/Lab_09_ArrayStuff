import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        // Task 1: Declare an array of type int named points
        int[] dataPoints = new int[100];

        // Task 2: Code a regular for loop that iterates through the dataPoint array and
        // intializes each element to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: DCode a second loop that displays the dataPointw values separated by a |
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Task 4: Code a loop that calculates the sum and average
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = sum / (double) dataPoints.length;

        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);

        // Task 5: Code to prompt an input and int value between 1 and 100

        int userValue = SafeInput.getRangedInt(in, "Enter an integer between 1 and 100", 1, 100);

        // Task 6: Code a loop that iterates through the entire dataPoints array and counts how many times
        // the user's value is found
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the array.");

        // Task 7: Code a loop that iterates through the dataPoints array checking each value
        // to see if it matches user input
        userValue = SafeInput.getRangedInt(in, "Enter another integer between 1 and 100", 1, 100);
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {

            if (dataPoints[i] == userValue) {
                System.out.println("The value " + userValue + " was found at array index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        // Task 8: Write a loop to scan for the min and max values in the dataPoints
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) min = dataPoints[i];
            if (dataPoints[i] > max) max = dataPoints[i];
        }

        System.out.println("Minimum value in dataPoints: " + min);
        System.out.println("Maximum value in dataPoints: " + max);

        // Task 9: Write static method which takes an array of double values and returns the average and test it

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

      public static double getAverage(int values[]) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
}










