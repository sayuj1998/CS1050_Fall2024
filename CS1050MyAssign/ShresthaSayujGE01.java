/*
 * Name: Sayuj Shrestha
 * Class: CS1050 (T/TH)
 * Due Date: 08/31/2024
 * Assignment #1
 * This program will print a couple paragraphs about my passion and interests.
 * This program will calculate the final grade on the weights from the syllabus.
 * This program will ask for the user's age.
 */

import java.util.Scanner; // Importing the Scanner class for inputting user's age

public class ShresthaSayujGE01
{
    public static void main(String[] args)
    {

        System.out.println("Hi! My name is Sayuj Shrestha. I'm from Nepal and I love traveling. I'm currently a sophomore majoring in Computer Science.");
        System.out.println("I'm passionate about programming, drawing, and basketball. I love exploring different cultures and lifestyles.");

        System.out.println("My current goal is to learn and find internships. My future goal is to become a software developer.");
        System.out.println("In my free time, I enjoy watching Basketball, Anime, and Coding.");

        // Weights for grades
        final double CLASS_PARTICIPATION = 0.10;
        final double GUIDED_EXPLORATIONS = 0.20;
        final double PROFESSIONAL_COMMUNICATIONS = 0.10;
        final double MODULE_QUIZZES = 0.20;
        final double PROJECTS = 0.20;
        final double FINAL_EXAM = 0.20;

        // Scores
        double classParticipation = 92.0;
        double guidedExplorations = 82.0;
        double professionalCommunications = 88.0;
        double moduleQuizzes = 87.0;
        double projects = 93.0;
        double finalExam = 85.0;

        // Formula for calculating final grade
        double finalGrade = (classParticipation * CLASS_PARTICIPATION) + (guidedExplorations * GUIDED_EXPLORATIONS) + (professionalCommunications * PROFESSIONAL_COMMUNICATIONS) + (moduleQuizzes * MODULE_QUIZZES) + (projects * PROJECTS) + (finalExam * FINAL_EXAM);

        System.out.println("My final grade is: " + finalGrade + "%");

        // Scanner class to get user input
        Scanner myObject = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = myObject.nextInt();
        System.out.println("You're " + age + " years young!");

    }//main

} //Class GE01

// Resource used to learn about user input: https://www.w3schools.com/java/java_user_input.asp

