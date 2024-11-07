/*
 * Name: Sayuj Shrestha
 * Class: CS1050 (T/TH)
 * Due Date: 11/11/2024
 * Project #1 Iteration 2
 * This program calculates final grades for students based on five categories.
 * Each category has a specific weight, and the program calculates the final grade, letter grade, min, max, and average.
 * Grading Scale: A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: <60.
 */

import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] categoryNames = {"Class Participation", "Guided Exploration", "Module Quizzes", "Project Iterations", "Final Exam"};
        double[] categoryWeights = {0.12, 0.22, 0.22, 0.22, 0.22};

        double minGrade = 0;
        double maxGrade = 105;

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
                studentGrades[i][j] = getValidGrade(input, "Enter the " + categoryNames[j] + " grade: ", minGrade, maxGrade);
            } // end Nested for loop

            // Calling the method to calculate the final grade
            double finalGrade = calculateFinalGrade(studentGrades[i], categoryWeights);

            System.out.println("------------------------------");
            System.out.printf("Student %d Final Percentage: %.2f\n", i + 1, finalGrade);
            char letterGrade = determineLetterGrade(finalGrade);
            System.out.println("Final Letter Grade: " + letterGrade);
            System.out.println("------------------------------");

            // Store final grades for calculating avg, min, and max
            finalGrades[i] = finalGrade;
        } // end For loop

        // Class average
        double average = calculateAverage(finalGrades);

        // Class min
        double min = calculateMin(finalGrades);

        // Class max
        double max = calculateMax(finalGrades);

        // Displaying the results
        System.out.println("***** Class Final Grades *******");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.printf("Student %d: %.2f  %c\n", i + 1, finalGrades[i], determineLetterGrade(finalGrades[i]));
        }

        System.out.printf("\nClass average: %.2f\n", average);
        System.out.printf("Class Min: %.2f\n", min);
        System.out.printf("Class Max: %.2f\n", max);

        System.out.println("Exiting grade calculator");
    } // end main

    // Takes user input and ensures it's within the valid range
    public static double getValidGrade(Scanner input, String output, double minGrade, double maxGrade) {
        double grade = -1;
        while (grade < minGrade || grade > maxGrade)
        {
            System.out.print(output);
            grade = input.nextDouble();
            if (grade < minGrade || grade > maxGrade) {
                System.out.println("Enter a value from 0 to 105.");
            }
        }
        return grade;
    } // end enterValidGrade

    // Method to calculate the final grade
    public static double calculateFinalGrade(double[] studentGrades, double[] categoryWeights) {
        double finalGrade = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            finalGrade += studentGrades[i] * categoryWeights[i];
        }
        return finalGrade;
    } // end calculateFinalGrade

    // Method to calculate the class average
    public static double calculateAverage(double[] finalGrades) {
        double sum = 0;
        for (int i = 0; i < finalGrades.length; i++) {
            sum += finalGrades[i];
        }
        return sum/finalGrades.length;
    } // end calculateAverage

    // Method to calculate the class minimum
    public static double calculateMin(double[] finalGrades) {
        double min = finalGrades[0];
        for (int i = 1; i < finalGrades.length; i++) {
            if (finalGrades[i] < min) {
                min = finalGrades[i];
            }
        }
        return min;
    } // end calculateMin

    // Method to calculate the class maximum
    public static double calculateMax(double[] finalGrades) {
        double max = finalGrades[0];
        for (int i = 1; i < finalGrades.length; i++) {
            if (finalGrades[i] > max) {
                max = finalGrades[i];
            }
        }
        return max;
    } // end calculateMax

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
        System.out.println("Calculate Student's Grade");
    }// end displayCourseGrading

} // end class
