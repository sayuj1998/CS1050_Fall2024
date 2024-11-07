import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program demonstrates a two-dimensional array.
 */

public class CorpSales {
    public static void main(String[] args) {
        final int DIVS = 3; // Three divisions in the company
        final int QTRS = 4; // Four quarters

        // Create an array to hold the sales for each
        // division, for each quarter.
        double[][] sales = new double[DIVS][QTRS];

        double totalSales = 0;

        System.out.println("The number of rows in sales array is " + sales.length);
        System.out.println("The number of columns is " + sales[0].length);

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Display an introduction.
        System.out.println("This program will calculate the "
                + "total sales of");
        System.out.println("all the company's divisions for each quarter. ");
        System.out.println("Enter the following sales data:");


        // Nested loops to fill the array with quarterly
        // sales figures for each division.

        //Iterate through each division row
        for (int divRow = 0; divRow < DIVS; divRow++) {
            //iterate through each quarter column
            for (int qtrCol = 0; qtrCol < QTRS; qtrCol++) {
                System.out.print("Division " + (divRow + 1)
                        + ", Quarter " + (qtrCol + 1)
                        + ": $");
                sales[divRow][qtrCol] = keyboard.nextDouble();
            }
        }


        //call method to display 2d array
        display2DArray(sales);

        //call method to calculate array sum of all sales
        double total = calculateArraySum(sales);

        // Display the total sales.
        System.out.println("Total sales: "+ total);

        keyboard.close();
    }


    //Write method to display2DArray
    public static void display2DArray(double[][] sales) {
        System.out.println("Sales data for each division and quarter:");

        for (int indexRow = 0; indexRow < sales.length; indexRow++) {
            System.out.println("Division " + (indexRow + 1) + ":");

            for (int indexCol = 0; indexCol < sales[indexRow].length; indexCol++) {
                System.out.println("  Quarter " + (indexCol + 1) + ": $" + sales[indexRow][indexCol]);
            }
        }
    }

    //write method calculateArraySum

    public static double calculateArraySum(double[][] sales) {
        double sum = 0.00;
        for (int indexRow = 0; indexRow < sales.length; indexRow++) {
            for (int indexCol = 0; indexCol < sales[indexRow].length; indexCol++) {
                sum += sales[indexRow][indexCol];
            }
        }
        return sum;
    }
}
