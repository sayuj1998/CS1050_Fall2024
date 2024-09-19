package Classwork;

import java.util.Scanner;
public class M02L07ifElse {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a char");
        char someChar = input.next().charAt(0);

        if ((someChar >= 'A') && (someChar <= 'Z'))
        {
            System.out.printf ("Uppercase letter was entered with ascii value: %d", (int)someChar);
        }
        else if ((someChar >= 'a') && (someChar <= 'z'))
        {
            System.out.printf ("Lowercase letter was entered with ascii value: %d", (int)someChar);
        }
        else if ((Character.isDigit(someChar)))
        {
            System.out.printf ("Numeric character was entered with ascii value: %d", (int)someChar);
        }
        if (someChar == '5')
        {
            System.out.printf("chars are the same");
        }


    } //end main
} // end class
