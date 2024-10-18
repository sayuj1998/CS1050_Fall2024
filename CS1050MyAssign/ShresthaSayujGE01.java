package CS1050MyAssign;/*
 * Name: Sayuj Shrestha
 * Class: CS1050 (T/TH)
 * Due Date: 08/31/2024
 * Assignment #1
 * This program will calculate the final grade on the weights from the syllabus.
 */

import java.util.Scanner; // Importing the Scanner class for user inputs

public class ShresthaSayujGE01 {

    public static void main(String[] args) {

        // Weights for grades
        final double CLASS_PARTICIPATION = 0.12;
        final double GUIDED_EXPLORATIONS = 0.22;
        final double MODULE_QUIZZES = 0.22;
        final double PROJECTS = 0.22;
        final double FINAL_EXAM = 0.22;

        // Scores
        Scanner input = new Scanner(System.in);

        System.out.print("Input your Class Participation Grade: ");
        double classParticipation = input.nextDouble();

        System.out.print("Input your Guided Exploration Grade: ");
        double guidedExplorations = input.nextDouble();

        System.out.print("Input your Module Quizzes Grade: ");
        double moduleQuizzes = input.nextDouble();

        System.out.print("Input your Projects Grade: ");
        double projects = input.nextDouble();

        System.out.print("Input your Final Exam Grade: ");
        double finalExam = input.nextDouble();

        // Formula for calculating final grade
        double finalGrade = (classParticipation * CLASS_PARTICIPATION) + (guidedExplorations * GUIDED_EXPLORATIONS) + (moduleQuizzes * MODULE_QUIZZES) + (projects * PROJECTS) + (finalExam * FINAL_EXAM);

        System.out.printf("Your final grade is: %.3f", finalGrade);

    }

} //Class GE01

//

