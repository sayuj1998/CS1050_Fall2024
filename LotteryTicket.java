import java.util.Scanner;
import java.util.Random;

public class LotteryTicket {

    public static void main(String[] args) {

        char repeat = 'Y';
        while (repeat == 'Y') {
            Scanner input = new Scanner(System.in);
            Random random = new Random();

            final int ROWS = 10;
            final int COLS = 6;

            int[][] lotteryCard = new int[ROWS][COLS];

            int lotteryRow = validNumber(input, "How many tickets do you want? ");
            if (lotteryRow == 0) {
                System.out.println("No problem.");
                break;
            }

            repeat = repeat(input).charAt(0);
            repeat = Character.toUpperCase(repeat);
        }

        System.out.println("See you next time!");
    }

    public static int validNumber(Scanner input, String output) {
        int number = -1;
        while (number < 0 || number > 10) {
            System.out.println(output);
            number = input.nextInt();
            if (number < 0 || number > 10) {
                System.out.println("Enter a number 1 to 10.");
            }
        }
        return number;
    }

    public static String repeat(Scanner input) {
        System.out.println("Do you want more?");
        System.out.println("Enter y for yes or n for no");
        return input.next();
    }

}
