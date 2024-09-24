import java.util.Scanner;

public class Example
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        char initialFirstName = firstName.charAt(0);
        char initialLastName = lastName.charAt(0);

        System.out.printf("Your initials are: %s.%s", initialFirstName, initialLastName);


    }
}
