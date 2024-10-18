import java.util.Scanner;

public class Example {

        public static void main(String[] args) {
            int age = 1;

            for (int i = 0; i < 2; i++) {
                age = age + 1; // Age increments by 1 for each iteration (total +2)
            }

            System.out.println("In main age = " + age); // Outputs the current age
            singTheSong("Jill", age); // Calls the singTheSong method with age
            System.out.println("In main age = " + age); // Outputs the current age

            int numCakes = 3;

            while (numCakes >= 3) {
                numCakes = eatCakeAndIceCream(); // Calls eatCakeAndIceCream, which returns 1
                System.out.println("While loop, numCakes = " + numCakes); // Outputs numCakes
                numCakes = numCakes - 1; // Decrements numCakes by 1
            }

            singTheSong("Jack", 1); // Calls singTheSong method with age 1
        }

        public static void singTheSong(String name, int age) {
            while (age > 1) { // Loops while age is greater than 0
                System.out.println("Happy Birthday"); // Prints "Happy Birthday"
                age--; // Decreases age by 1
            }
            System.out.println("Dear " + name); // Prints the name
        }

        public static int eatCakeAndIceCream() {
            System.out.println("Eating cake and ice cream"); // Prints this statement
            int numCakes = 1; // numCakes is set to 1
            return numCakes; // Returns numCakes
        }
    }









