// Import the Scanner class
import java.util.Scanner;

public class Example
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of day: ");
        int day = input.nextInt(); // Gets day number
        switch (day)
        {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;

        }


    }
}
