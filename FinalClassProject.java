import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FinalClassProject {

    public static void main(String[] args) {

        // Array categories and percentage weights for CS1050
        final int TOTAL_CATEGORIES_1050 = 5;
        String[] categories1050 = { "Class Participation", "Guided Exploration", "Quizzes", "Project Percent", "Final Exam" };
        double[] percentWeights1050 = { .12, .22, .22, .22, .22 };
        int MAX_STUDENTS_1050 = 10;

        Course course1050 = new Course("CS1050", categories1050, percentWeights1050, MAX_STUDENTS_1050);

        try {
            System.out.println("\nSetting up course " + course1050.getCourseName());
            courseSetUp(course1050, TOTAL_CATEGORIES_1050, "course1050.txt");
            System.out.println("\nTotal Students in " + course1050.getCourseName() + ": " + course1050.getNumberStudents());
            course1050.displayCourseGrading();
            course1050.PostFinalGrades();
            course1050.displayCourseSummary();
            course1050.writeSummaryToFile();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Can't Upload course information" + e.getMessage());
        }

        // Array categories and percentage weights for CS2040
        final int TOTAL_CATEGORIES_2040 = 4;
        String[] categories2040 = { "Class Participation", "Homework", "Midterm", "Final Exam" };
        double[] percentWeights2040 = { .15, .25, .3, .3 };
        int MAX_STUDENTS_2040 = 4;

        Course course2040 = new Course("CS2040", categories2040, percentWeights2040, MAX_STUDENTS_2040);

        try {
            System.out.println("\nSetting up course " + course2040.getCourseName());
            courseSetUp(course2040, TOTAL_CATEGORIES_2040, "course2040.txt");
            System.out.println("\nTotal Students in " + course2040.getCourseName() + ": " + course2040.getNumberStudents());
            course2040.displayCourseGrading();
            course2040.PostFinalGrades();
            course2040.displayCourseSummary();
            course2040.writeSummaryToFile();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Can't Upload course information" + e.getMessage());
        }

    } // end of main

    public static void courseSetUp(Course course, int totalCategories, String fileName) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(fileName));

        // Read and set the instructor
        if (fileScanner.hasNextLine()) {
            String[] instructorLine = fileScanner.nextLine().split(" ", 2); // Split into two parts: name and email
            String instructorName = instructorLine[0] + " " + instructorLine[1].substring(0, instructorLine[1].lastIndexOf(' '));
            String instructorEmail = instructorLine[1].substring(instructorLine[1].lastIndexOf(' ') + 1);
            Instructor instructor = new Instructor(instructorName, instructorEmail);
            course.setInstructor(instructor);
        }

        // Read students
        while (fileScanner.hasNextLine()) {
            String[] studentLine = fileScanner.nextLine().split(" ");
            String studentName = studentLine[0] + " " + studentLine[1];
            String studentEmail = studentLine[2];
            double[] grades = new double[totalCategories];
            for (int i = 0; i < totalCategories; i++) {
                grades[i] = Double.parseDouble(studentLine[3 + i]);
            }
            Student student = new Student(studentName, studentEmail, grades);
            course.addStudent(student);
        }
        fileScanner.close();
    }

} // end of FinalClassProject

class Instructor {
    private String name;
    private String email;

    public Instructor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return name + " " + email;
    }
}

class Student {
    private String name;
    private String email;
    private double[] grades;
    private double finalGrade;

    public Student(String name, String email, double[] grades) {
        this.name = name;
        this.email = email;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void calculateFinalGrade(double[] weights) {
        double total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i] * weights[i];
        }
        finalGrade = total;
    }

    public String getLetterGrade() {
        if (finalGrade >= 90) return "A";
        if (finalGrade >= 80) return "B";
        if (finalGrade >= 70) return "C";
        if (finalGrade >= 60) return "D";
        return "F";
    }

    public String toString() {
        return name + ": " + String.format("%.2f", finalGrade) + "  " + getLetterGrade();
    }
}

class Course {
    private String courseName;
    private Instructor instructor;
    private Student[] students;
    private int studentCount = 0;
    private String[] categories;
    private double[] weights;

    public Course(String courseName, String[] categories, double[] weights, int maxStudents) {
        this.courseName = courseName;
        this.categories = categories;
        this.weights = weights;
        students = new Student[maxStudents];
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberStudents() {
        return studentCount;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Course is full. Couldn't add student: " + student.getName());
        }
    }

    public void PostFinalGrades() {
        for (Student student : students) {
            if (student != null) {
                student.calculateFinalGrade(weights);
            }
        }
    }

    public void displayCourseGrading() {
        System.out.println("\n**********************************");
        System.out.println(courseName + " Final Grade Calculator");
        System.out.println("Instructor Name:" + instructor);
        System.out.println("**********************************");
        System.out.println("------------------------------");
        System.out.println("Category:Percent");
        System.out.println("------------------------------");
        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i] + " Grade: " + weights[i]);
        }
        System.out.println("\n-------------------------------");
        System.out.println("Letter Grade Range");
        System.out.println("-------------------------------");
        System.out.println("A: 90 to 100\nB: 80 to < 90\nC: 70 to < 80\nD: 60 to < 70\nF: < 60");
    }

    public void displayCourseSummary() {
        System.out.println("\n***** " + courseName + " Final Grades *******");
        System.out.println("Instructor Name:" + instructor + "\n");
        double total = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
                double grade = student.getFinalGrade();
                total += grade;
                min = Math.min(min, grade);
                max = Math.max(max, grade);
            }
        }

        double average = total / studentCount;
        System.out.printf("\nClass average: %.2f\nClass min: %.2f\nClass max: %.2f\n", average, min, max);
    }

    public void writeSummaryToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(courseName + "_summary.txt");
        writer.println("***** " + courseName + " Final Grades *******");
        writer.println("Instructor Name:" + instructor + "\n");
        for (Student student : students) {
            if (student != null) {
                writer.println(student);
            }
        }
        writer.close();
        System.out.println("\nFile located at " + new java.io.File(courseName + "_summary.txt").getAbsolutePath());
    }
}
