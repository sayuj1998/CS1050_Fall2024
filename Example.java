import java.util.Scanner;

import java.util.Scanner;

public class BodyMassIndex
{
    public static void main(String[] args)
    {

//        final int BMI_US_FACTOR = 703; //factor formula in pounds
//
//        double weight;
//        double height;
//        double bmi;
//        char repeat;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("This program will calculate your body mass index.");
//
//        do
//        {
//            weight = 0;
//            height = 0;
//
//            System.out.print("Enter your name: ");
//            String name = input.nextLine();
//
//            while (weight <= 0 || height <= 0)
//            {
//                System.out.print("Enter your weight, in pounds: ");
//                weight = input.nextDouble();
//
//                System.out.print("Enter your height, in inches: ");
//                height = input.nextDouble();
//
//                if (weight <= 0 || height <= 0)
//                {
//                    System.out.println("Not valid. Please enter valid positive values.");
//                } // end if
//            } // end while loop
//
//            System.out.printf("Name: %s\n", name);
//
//            bmi = weight * BMI_US_FACTOR / (height * height);
//            System.out.printf("Body mass (BMI): %.1f\n", bmi);
//
//            if (bmi <= 18.4) {
//                System.out.println("Category: Underweight");
//            } else if (bmi >= 18.5 && bmi <= 24.9) {
//                System.out.println("Category: Normal");
//            } else if (bmi >= 25.0 && bmi <= 39.9) {
//                System.out.println("Category: Overweight");
//            } else {
//                System.out.println("Category: Obese");
//            } // end multiway if
//
//            System.out.print("Would you like to calculate again? (Y/N): ");
//            repeat = input.next().charAt(0);
//
//        } // do while
//        while (Character.toUpperCase(repeat) == 'Y'); // end of do/while loop
//
//        if (Character.toUpperCase(repeat) == 'N')
//        {
//            System.out.println("Thank you!");
//        }
//
//        input.close();

        Scanner input = new Scanner(System.in);
        double weight = getDouble(input, "Enter weight:");
        double height = getDouble(input, "Enter height:");



    }

    public static double getDouble(Scanner input,String output) {
        double num = 0;

        while (num <= 0)
        {

            System.out.print(output);
            num = input.nextDouble();
        }
        return num;
    }


}

