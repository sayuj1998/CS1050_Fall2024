import java.util.Scanner;

public class AgeCategorizer {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 0)
        {
            System.out.println("You're not born silly!");
        }
        else if (age < 1)
        {
            System.out.println("You're a baby!");
        }
        else if ((age > 3) && (age <= 18))
        {
            System.out.println("You're a kid!");
        }
        else if ((age >= 19) && (age <= 39))
        {
            System.out.println("You're an young adult!");
        }
        else if ((age >= 40) && (age <= 59))
        {
            System.out.println("You're an middle aged adult!");
        }
        else if ((age >= 60) && (age <= 120))
        {
            System.out.println("You're an old adult!");
        }
        else
        {
            System.out.println("How are you still alive!?");
        }

    }
}