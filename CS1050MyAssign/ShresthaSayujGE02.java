package CS1050MyAssign;/*
 * Name: Sayuj Shrestha
 * Class: CS1050 (T/TH)
 * Due Date: 09/21/2024
 * Assignment #2
 * This program will print two students' initials in order.
 */

import java.util.Scanner;

public class ShresthaSayujGE02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student 1 first name: ");
        String student1FirstName = input.next();

        System.out.print("Enter Student 1 last name: ");
        String student1LastName = input.next();

        System.out.print("Enter Student 2 first name: ");
        String student2FirstName = input.next();

        System.out.print("Enter Student 2 last name: ");
        String student2LastName = input.next();

        // Gets the first initials of both students
        char initialStudent1FirstName = student1FirstName.charAt(0);
        char initialStudent1LastName = student1LastName.charAt(0);
        char initialStudent2FirstName = student2FirstName.charAt(0);
        char initialStudent2LastName = student2LastName.charAt(0);

        // Compares the last name initials for ordering
        if (initialStudent1LastName > initialStudent2LastName)
        {
            System.out.printf("Student 1: %s.%s.\n", initialStudent2FirstName, initialStudent2LastName);
            System.out.printf("Student 2: %s.%s.\n", initialStudent1FirstName, initialStudent1LastName);
        }
        else
        {
            System.out.printf("Student 1: %s.%s.\n", initialStudent1FirstName, initialStudent1LastName);
            System.out.printf("Student 2: %s.%s.\n", initialStudent2FirstName, initialStudent2LastName);
        }

        input.close();

    } // end of main
} // end of class
