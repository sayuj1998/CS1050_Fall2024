/*
 * Name: Sayuj Shrestha
 * This program will calculate students' final grades using category, weights and scale.
 */

import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        displayCourseGrading();
        char repeat = 'Y';
        while (repeat == 'Y')
        {
            double participation = enterValidGrade(input, "Enter the Class Participation Grade: ");
            double exploration = enterValidGrade(input, "Enter the Guided Exploration Grade: ");
            double quizzes = enterValidGrade(input, "Enter the Module Quizzes Grade: ");
            double project = enterValidGrade(input, "Enter the Project Iterations Grade: ");
            double exam = enterValidGrade(input, "Enter the Final Exam Grade: ");

            double finalGrade = (participation * 0.12)+(exploration * 0.22)+(quizzes * 0.22)+(project * 0.22)+(exam * 0.22);
            System.out.printf("Final percentage: %.2f%%\n", finalGrade);

            char letterGrade = determineLetterGrade(finalGrade);
            System.out.println("Final Letter Grade: " + letterGrade);

            repeat = repeat(input).charAt(0);
            repeat = Character.toUpperCase(repeat);

       }
        System.out.println("Exiting grade calculator");
    }


    public static double enterValidGrade(Scanner input, String output) {
        double grade = -1;
        while (grade < 0 || grade > 105)
        {
            System.out.print(output);
            grade = input.nextDouble();
            if (grade < 0 || grade > 105) {
                System.out.println("Enter a value from 0 to 105.");
            }
        }
        return grade;
    }

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
    }

    public static String repeat(Scanner input) {
        System.out.println("Do you want to calculate another student's grade?");
        System.out.println("Enter y for yes or n for no");
        return input.next();
    }

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
    }
}
