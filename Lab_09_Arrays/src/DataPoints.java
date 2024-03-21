import java.util.Random;
import java.util.Scanner;
public class DataPoints {
    public static void main(String[] args) {
        // Create an array of int value between 1-100
        int[] dataPoints = new int[100];
        // Make each integer in the array a random value
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        // Display | in between each integer
        System.out.print("DataPoints values: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
        // Calculate the sum of the integers randomized in the array
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        // Display the sum and average
        System.out.printf("The sum of the random array dataPoints is: %d%n", sum);
        System.out.printf("The average of the random array DataPoints is: %.2f%n", average);

        Scanner in = new Scanner(System.in);
        // Prompt the user for an integer between 1-100
        int userValue = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100:", 1, 100);
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The users value was found " + count + " times in the dataPoints array.");
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                position = i; // store the integer one found
                break; // Break the loop once the integer is found
            }
        }
        // Display the results
        if (position != -1) {
            System.out.println("The value " + userValue + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + userValue + " was not found in the dataPoints array.");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value in the dataPoints is: " + min);
        System.out.println("Maximum value in the dataPoints is: " + max);

        System.out.println("Average of dataPoints is: " +getAverage(dataPoints));
        in.close();
    }
    public static double getAverage(int[] values) {
        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
