package Classwork;//
// ADD CODE to import Scanner class

import java.util.Scanner;

public class BodyMassIndex
{
	public static void main(String[] args)
	{
		//constants
		final int BMI_US_FACTOR = 703; //factor formula in pounds
		// Variables
		double weight; // The user's weight
		double height; // The user's height
		double bmi; // The user's BMI

		// Create a Scanner object for scanning  input from keyboard
		Scanner input = new Scanner(System.in);

		// Tell the user what the program will do.
		System.out.println("This program will calculate your " + "body mass index, or BMI.");

		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
		weight = input.nextDouble();

		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// ADD CODE input next double for height
		height = input.nextDouble();

		// Calculate the user's body mass index.
		bmi = weight * BMI_US_FACTOR / (height * height);

		// Display the user's BMI.
		System.out.printf("Your body mass index (BMI) is %.1f\n", bmi);

		if (bmi <= 18.4)
		{
			System.out.println("Category: Underweight");
		}
		else if (bmi >= 18.5 && bmi <= 24.9)
		{
			System.out.println("Category: Normal");
		}
		else if (bmi >= 25.0 && bmi <= 39.9)
		{
			System.out.println("Category: Overweight");
		}
		else
		{
			System.out.println("Obese");
		}
		input.close();
	}
}
