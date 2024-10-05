import java.util.Scanner;

public class ShresthaSayujM02Quiz
{
    public static void main(String[] args)
    {
        double grade;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        grade = input.nextDouble();

        if (grade >= 90 && grade <= 100)
        {
            System.out.println("A");
        }
        else if (grade >= 80 && grade < 90)
        {
            System.out.println("B");
        }
        else if (grade >= 70 && grade < 80)
        {
            System.out.println("C");
        }
        else if (grade >= 60 && grade < 70)
        {
            System.out.println("D");
        }
        else if (grade >= 0  && grade < 60)
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("Invalid grade");
        }

        input.close();

    } // end main
} // end class
