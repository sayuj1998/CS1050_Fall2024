import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        // Declaring and initializing a 2D array of size 5x5
        int[][] num = new int[5][5];

        // Initializing array using a nested for loop
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = i + j;
            }
        }

    }
}









