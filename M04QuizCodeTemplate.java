import java.util.Scanner;

public class M04QuizCodeTemplate
{

    public static void main(String[] args)
    {
        double circumference = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius");
        double radius = input.nextDouble();

        // Write Code Below to call method and then print out circumference
        circumference = calculateCircumference(radius);
        System.out.println("Circumference: " + circumference);

        input.close();
    }

    //write method below to calculate circumference
    public static double calculateCircumference(double radius) {
        double pi = 3.14;
        return 2 * pi * radius;
    }

}