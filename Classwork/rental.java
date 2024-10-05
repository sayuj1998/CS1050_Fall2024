import java.util.Scanner;

public class rental {
    public static void main(String[] args)
    {
        int options;
        int bikes;

        Scanner input = new Scanner(System.in);

        System.out.print("Select rental option 1, 2 or 3: ");

        options = input.nextInt();

        if (options >= 1 && options <= 3)
        {
            System.out.println("How many bikes do you want to rent?");
            System.out.print("The limit is 4: ");
            bikes = input.nextInt();
            if (bikes >= 1 && bikes < 5)
            {
                System.out.printf("Rental option %d and %d bikes", options, bikes);
            }
            else
            {
                System.out.print("Invalid number of bikes.");
            }
        }
        else
        {
            System.out.println("Invalid rental option. Quitting Program");
        }
        input.close();

    }
}
