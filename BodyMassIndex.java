import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("This program will calculate your body mass index.");

        char repeat = 'Y';
        while (repeat == 'Y') {
            String name = getString(input, "Enter name: ");
            double weight = getPositiveNum(input, "Enter weight (lbs): ");
            double height = getPositiveNum(input, "Enter height (inches): ");

            System.out.printf("Name: %s\n", name);
            double bmi = calculateBMI(weight, height);
            System.out.printf("Body mass (BMI): %.1f\n", bmi);
            String category = getCategory(bmi);
            System.out.println("Category: " + category);

            repeat = getString(input, "Do you want to enter another? (Y/N)").charAt(0);
            repeat = Character.toUpperCase(repeat);

        }
        System.out.println("Thank you");
    }

    public static double getPositiveNum(Scanner input, String output) {
        double num = 0;
        while (num <= 0) {

            System.out.print(output);
            num = input.nextDouble();
            if (num <= 0) {
                System.out.println("Invalid. Enter positive values.");
            }
        }
        return num;
    }

    public static String getString(Scanner input, String output) {
        System.out.print(output);
        return input.next();

    }

    public static double calculateBMI(double weight, double height) {
        final int BMI_US_FACTOR = 703;
        return weight * BMI_US_FACTOR / (height * height);

    }

    public static String getCategory(double bmi) {

        String category;

        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            category = "Normal";
        } else if (bmi >= 25.0 && bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        return category;
    }
}
