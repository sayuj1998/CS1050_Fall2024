/*
 * Name: Sayuj Shrestha
 * Class: CS1050 (T/TH)
 * Due Date: 11/11/2024
 * Project #1 Iteration 2
 * This program calculates final grades for students based on five categories.
 * Each category has a specific weight, and the program calculates the final grade, letter grade, min, max, and average.
 * Grading Scale: A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: <60.
 */

import java.util.*;

public class FinalGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] categoryNames = {"Class Participation", "Guided Exploration", "Module Quizzes", "Project Iterations", "Final Exam"};
        double[] categoryWeights = {0.12, 0.22, 0.22, 0.22, 0.22};

        int minGrade = 0;
        int maxGrade = 105;

        displayCourseGrading();

        System.out.println("How many students are in the class? ");
        int numOfStudents = input.nextInt();

        // 2D array for storing grades for each student
        double[][] studentGrades = new double[numOfStudents][categoryNames.length];

        //1D array to store final grades
        double[]finalGrades = new double[numOfStudents];

        // For loop for each student
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter grades for student " + (i +1));

            for (int j = 0; j < categoryNames.length; j++) {
                System.out.printf("Enter the %s grade \n", categoryNames[j]);
                studentGrades[i][j] = getValidGrade(input, minGrade, maxGrade);
            }

            // Calling the method to calculate the final grade
            double finalGrade = calculateClassFinalGrade(studentGrades[i], categoryWeights);

            System.out.println("------------------------------");
            System.out.printf("Student %d Final Percentage: %.2f\n", i + 1, finalGrade);
            char letterGrade = determineLetterGrade(finalGrade);
            System.out.println("Final Letter Grade: " + letterGrade);
            System.out.println("------------------------------");

            // Store final grades for calculating avg, min, and max
            finalGrades[i] = finalGrade;
        } // end For loop

        // Class average
        double average = calculateClassAverage(finalGrades);

        // Class min
        double min = calculateClassMin(finalGrades);

        // Class max
        double max = calculateClassMax(finalGrades);

        // Displaying the results
        System.out.println("****** Class Final Grades ******");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.printf("Student %d: %.2f  %c\n", i + 1, finalGrades[i], determineLetterGrade(finalGrades[i]));
        }

        System.out.printf("\nClass average: %.2f\n", average);
        System.out.printf("Class Min: %.2f\n", min);
        System.out.printf("Class Max: %.2f\n", max);

        System.out.println("Exiting grade calculator");
    } // end main

    // Takes user input and ensures it's within the valid range
    public static double getValidGrade(Scanner input, int minGrade, int maxGrade) {
        double grade = -1;
        do {
            try {
                System.out.printf("Enter a value from %d to %d: \n", minGrade, maxGrade);
                grade = input.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.printf("Error: Enter a value from %d to %d\n", minGrade, maxGrade);
                input.nextLine();
            }
        } while (grade < minGrade || grade > maxGrade); // Ensure valid input within range
        return grade;
    } // end getValidGrade

    // Method to calculate the final grade
    public static double calculateClassFinalGrade(double[] studentGrades, double[] categoryWeights) {
        double finalGrade = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            finalGrade += studentGrades[i] * categoryWeights[i];
        }
        return finalGrade;
    } // end calculateClassFinalGrade

    // Method to calculate the class average
    public static double calculateClassAverage(double[] finalGrades) {
        double sum = 0;
        for (int i = 0; i < finalGrades.length; i++) {
            sum += finalGrades[i];
        }
        return sum/finalGrades.length;
    } // end calculateClassAverage

    // Method to calculate the class minimum
    public static double calculateClassMin(double[] finalGrades) {
        double min = finalGrades[0];
        for (int i = 1; i < finalGrades.length; i++) {
            if (finalGrades[i] < min) {
                min = finalGrades[i];
            }
        }
        return min;
    } // end calculateClassMin

    // Method to calculate the class maximum
    public static double calculateClassMax(double[] finalGrades) {
        double max = finalGrades[0];
        for (int i = 1; i < finalGrades.length; i++) {
            if (finalGrades[i] > max) {
                max = finalGrades[i];
            }
        }
        return max;
    } // end calculateClassMax

    // Determines the letter grade based on the final grade percentage
    public static char determineLetterGrade(double finalGrade) {
        char letterGrade;
        if (finalGrade >= 90) {
            letterGrade = 'A';
        } else if (finalGrade < 90 && finalGrade >= 80) {
            letterGrade = 'B';
        } else if (finalGrade < 80 && finalGrade >= 70) {
            letterGrade = 'C';
        } else if (finalGrade < 70 && finalGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    } // end determineLetterGrade

    // Displays the course grading categories and letter grade ranges
    public static void displayCourseGrading() {

        System.out.println("**********************************");
        System.out.println("CS1050 Final Grade Calculator");
        System.out.println("**********************************");

        System.out.println("------------------------------");
        System.out.println("Category: Percent");
        System.out.println("------------------------------");

        System.out.println("Class Participation: 12%");
        System.out.println("Guided Exploration: 22%");
        System.out.println("Module Quizzes: 22%");
        System.out.println("Project Iterations: 22%");
        System.out.println("Final: 22%");

        System.out.println("------------------------------");
        System.out.println("Letter Grade Range");
        System.out.println("------------------------------");

        System.out.println("A: 90 to 100");
        System.out.println("B: 80 to < 90");
        System.out.println("C: 70 to < 80");
        System.out.println("D: 60 to < 70");
        System.out.println("F: < 60");
        System.out.println();
    }// end displayCourseGrading

} // end class
