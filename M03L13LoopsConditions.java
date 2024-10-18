import java.util.Scanner;

public class M03L13LoopsConditions
{
    public static void main(String[] args)
    {
        System.out.println("2.1.1 Test case to find the sum of numbers 1 to 5");
        final int test_case = 5;
        int sum = 0;
        for (int num = 1; num <= test_case; num++)
        {
            sum += num;
            System.out.printf(" | %d", sum);
        }
        System.out.println();


        System.out.println("2.1.2 Code to sum the numbers from 1 to a max using a for loop");
        final int ForLoopMax = 5;
        int forLoopSum = 0;
        for (int num = 1; num <= ForLoopMax; num++)
        {
            forLoopSum += num;
            System.out.printf(" | %d", forLoopSum);
        }
        System.out.println();


        System.out.println("2.1.3 Code to sum the numbers from 1 to a max using a while loop");
        final int whileLoopMax = 5;
        int whileLoopSum = 0;
        int num = 1;
        while (num <= whileLoopMax)
        {
            whileLoopSum += num;
            num++;
            System.out.printf(" | %d", whileLoopSum);
        }
        System.out.println();


        System.out.println("2.1.4 Code to sum the odd numbers from 1 to max");
        final int oddNumberMax = 5;
        int oddSum = 0;
        for (int i = 1; i <= oddNumberMax; i += 2)
        {
           oddSum += i;
           System.out.printf(" | %d", oddSum);
        }
        System.out.println();


       System.out.println("2.1.5 Code to ask user for age. Repeat until valid age.");
       Scanner input = new Scanner(System.in);
       int age = 0;

       while (age <= 0)
       {
           System.out.print("Enter your age: ");
           age = input.nextInt();
       }

       System.out.println("Your age is: " + age);
       System.out.println();


       System.out.println("2.1.6 Calling the method");
       int total = sumNumber(5); // Enter the max here
       System.out.println("Sum of 1 to max: " + total);

    } // end main

    public static int sumNumber(int number)
    {
        int sum = 0;
        for (int num = 1; num <= number; num++)
        {
            sum += num;
        }
        return sum;

    } // end sumNumber

} // end class
