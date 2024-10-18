 /*
  *  add comments
  */

 import java.util.Scanner;

 public class ArraysCode {

     public static void main(String[] args) {
         // Examples of processing arrays
         final int TOTAL_NUMBERS = 5;
         // Declaring numbers as an array of total numbers so it's [0, 0, 0, 0, 0]
         int[] numbers = new int[TOTAL_NUMBERS];

         // numbersLength gets the length of numbers
         int numbersLength = numbers.length;

         // 1. Explain
         System.out.println("Asks user to input values based on length of total number");
         Scanner input = new Scanner(System.in);
         System.out.println("Enter " + numbersLength + " values: ");
         for (int index = 0; index < numbersLength; index++) {
             System.out.printf("Enter value #%d: ", index + 1);
             numbers[index] = input.nextInt();
         }

         // 2. Explain
         System.out.println("Prints index of each number given by user");
         for (int index = 0; index < numbersLength; index++) {
             System.out.println("numbers[" + index + "] = " + numbers[index]);
         }

         // 3. Explain
         System.out.println("Adding the numbers given by user");
         int badNameVar = 0;
         for (int index = 0; index < numbers.length; index++) {
             badNameVar = badNameVar + numbers[index];
         }
         System.out.println("Update badNameVar = " + badNameVar);

         // 4. Explain
         System.out.println("Printing the highest number");
         int badNameVar2 = numbers[0];
         for (int index = 1; index < numbers.length; index++) {
             if (numbers[index] > badNameVar2) {
                 badNameVar2 = numbers[index];
             }
         }
         System.out.println("Update badNameVar2 = " + badNameVar2);

         // 5. Declare new array called randomNumbers
         int[] randomNumbers;

         // 6. Write Code to fill the array with random numbers from 1 to 10
         randomNumbers = new int[10];
         for (int index = 0; index < randomNumbers.length; index++)
             randomNumbers[index] = index + 1;

         // 7. Write Code to find the index containing the smallest number in the randomNumbers array
         int smallestNum = randomNumbers[0];
         int displayIndex = 0;

         for (int index = 1; index < randomNumbers.length; index++) {
             if (randomNumbers[index] < smallestNum) {
                 smallestNum = randomNumbers[index];
                 displayIndex = index;
             }
         }

         // 8. write code to display the index and value of the smallest number
         System.out.println("Smallest number is: " + smallestNum);

         int display = getIndex(displayIndex);
         System.out.println("Index of smallest num: " + display);

         input.close();

         BiggestNumberInArray biggestNum = new BiggestNumberInArray();
         biggestNum.print();
//
//        int biggestIndex = getBiggestIndex(showIndex);
//        System.out.println("Index of smallest num: " + showIndex);


     } // main

     // 9. write a method to return the index containing the smallest number in the randomNumber array
     public static int getIndex(int displayIndex) {
         return displayIndex;
     }



     private static class BiggestNumberInArray {
         private int value;
         private int index;

         public BiggestNumberInArray() {
             int[] num = new int[20];
             int biggestNum = num[0];
             this.index = 0;

             for (int index = 0; index < num.length; index++) {
                 num[index] = index + 1;
             }

             for (int index = 1; index < num.length; index++) {
                 if (num[index] > biggestNum) {
                     biggestNum = num[index];
                     this.index = index;
                 }
             }
             this.value = biggestNum;
         }

         public void print() {
             System.out.println("Biggest num: " + this.value);
             System.out.println("Biggest num index: " + this.index);
         }
     }

     private static int getBiggestIndex(int showIndex) {
         return showIndex;
     }


 }// end class
