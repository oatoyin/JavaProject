//Name: Arrays and Averages
//Author: Toyin Awosanya
//Date: 10/4/19
//Purpose: To Write a test program that
//         prompts the user to enter 10 double values,
//         and invoke the average method to display the average value.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];

        System.out.print("Enter ten values of double type: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        System.out.println("The average value: " + average(values));
    }

    public static int average(int[] array) {
        int average = 0;
        for (int i: array)
            average += i;
        return average / array.length;
    }

    public static double average(double[] array) {
        double average = 0;
        for (double i: array)
            average += i;
        return average / array.length;
    }
}
