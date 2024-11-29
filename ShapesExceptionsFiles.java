
/**
 * Add comments
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class ShapesExceptionsFiles
{

    public static void main(String[] args) {

        int maxCircles = 10; // Define the maximum number of circles
        CircleShape[] circles = new CircleShape[maxCircles];

        int numCircles = readCirclesFromFile("circleData.txt", circles);


        // Display details of each circle stored in the array
        for (int i = 0; i < numCircles; i++) {
            System.out.println("\nCircle details from file:");
            System.out.println("Color: " + circles[i].getColor());
            System.out.println("Filled: " + circles[i].isFilled());
            System.out.printf("Radius: %.2f\n", circles[i].getRadius());
            System.out.printf("Area: %.2f\n", circles[i].getArea());
            System.out.printf("Diameter: %.2f\n", circles[i].getDiameter());
        }



    }//end main
    /**
     * Reads circle data from a file and stores them in the provided array.
     * Each line in the file should contain color, filled status, and radius separated by commas.
     *
     * @param filename the name of the file containing circle data
     * @param circles the array to store CircleFromSimpleGeometricShape objects
     * @return the number of CircleFromSimpleGeometricShape objects successfully created and stored
     */
    public static int readCirclesFromFile(String filename, CircleShape[] circlesData) {
        int count = 0;
        Scanner fileScanner;

        try{
            fileScanner= new Scanner(new File(filename));
            while (fileScanner.hasNextLine() && count < circlesData.length)
            {
                String color = fileScanner.next().trim();
                boolean filled = Boolean.parseBoolean(fileScanner.next().trim());
                double radius = Double.parseDouble(fileScanner.next().trim());

                circlesData[count] = new CircleShape(radius, color, filled);
                count++;


            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

        return count;
    }


}//end TestShapeInheritance Class



/**
 * Add comments
 */
class GeometricShape {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    /**
     * Construct a default geometric object
     */
    public GeometricShape() {
        dateCreated = new java.util.Date();
    }


    /**
     * Construct a geometric object with the specified color and filled
     * @param String color
     * @param boolean filled
     */
    public GeometricShape(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * get current color
     * @return String color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set new color
     * @param String color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Since filled is boolean,
     *    its get method is named isFilled
     * get current filled value
     * @return boolean filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set a new filled
     * @param boolean filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    /**
     * Get dateCreated
     * @return dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        System.out.println("In SimpleGeometricSahpe toString method ");
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }



}//end SimpleGeometricShape class


/**
 * Add comments
 */
class CircleShape
        extends GeometricShape {
    private double radius;

    /**
     * Construct a default circle object
     */
    public CircleShape() {

    }

    /**
     *
     * @param radius
     */
    public CircleShape(double radius) {
        this.radius = radius;
    }

    /**
     * Construct Circle given
     * @param radius
     * @param color
     * @param filled
     */
    public CircleShape(double radius,
                       String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }


    /**
     * Get radius
     * @return double radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     *  Set a new radius
     * @param double radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get Area
     * @return double
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Get Diameter
     * @return double
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Get Perimeter
     * @return double
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        System.out.println("In CircleShape toString method ");
        return super.toString() + " radius: " + radius;
    }


}//end CircleFromSimpleGeometricShape class

/**
 * Add Rectangle Class
 */
class RectangleShape
        extends SimpleGeometricShape {
    private double width;
    private double height;

    public RectangleShape() {
    }

    public RectangleShape( double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleShape( double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        System.out.println("In RectangleShape toString method ");
        return super.toString() + " width: " + width + " height: " + height;
    }

}//end RectangleFromSimpleGeometricShape class
