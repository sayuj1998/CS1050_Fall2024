
/**
 * Add comments
 */

public class TestShapesInheritance
{

    public static void main(String[] args) {
        CircleFromSimpleGeometricShape circle =
                new CircleFromSimpleGeometricShape(1);
        System.out.println("circle toString: " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.printf("The radius is  %.2f \n", circle.getRadius());
        System.out.printf("The area is  %.2f \n", circle.getArea());
        System.out.printf("The diameter is  %.2f \n", circle.getDiameter());

        circle.toString();

        RectangleFromSimpleGeometricShape rectangle1 = new RectangleFromSimpleGeometricShape();
        RectangleFromSimpleGeometricShape rectangle2 = new RectangleFromSimpleGeometricShape(20.0, 30.0);
        RectangleFromSimpleGeometricShape rectangle3 = new RectangleFromSimpleGeometricShape(50.0, 100.0, "pink", true);

        System.out.println("Rectangle 1 area: " + rectangle1.getArea());
        System.out.println("Rectangle 1 perimeter: " + rectangle1.getPerimeter());
        System.out.println("Rectangle 1 color: " + rectangle1.getColor());
        System.out.println("Rectangle 1 filled: " + rectangle1.isFilled());
        System.out.println();

        System.out.println("Rectangle 2 area: " + rectangle2.getArea());
        System.out.println("Rectangle 2 perimeter: " + rectangle2.getPerimeter());
        System.out.println("Rectangle 2 color: " + rectangle2.getColor());
        System.out.println("Rectangle 2 filled: " + rectangle2.isFilled());
        System.out.println();

        System.out.println("Rectangle 3 area: " + rectangle3.getArea());
        System.out.println("Rectangle 3 perimeter: " + rectangle3.getPerimeter());
        System.out.println("Rectangle 3 color: " + rectangle3.getColor());
        System.out.println("Rectangle 3 filled: " + rectangle3.isFilled());
        System.out.println();

        // Modifying using setter for rectangle 1
        rectangle1.setWidth(15);
        rectangle1.setHeight(25);

        // Printing width/height/area/perimeter for new rectangle using getters
        System.out.println("New Rectangle 1 width: " + rectangle1.getWidth());
        System.out.println("New Rectangle 1 height: " + rectangle1.getHeight());
        System.out.println("New Rectangle 1 area: " + rectangle1.getArea());
        System.out.println("New Rectangle 1 perimeter: " + rectangle1.getPerimeter());


    }//end main

}//end TestShapeInheritance Class



/**
 * Simple Geometric Shape Superclass
 */
class SimpleGeometricShape {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    /**
     * Construct a default geometric object
     */
    public SimpleGeometricShape() {
        dateCreated = new java.util.Date();
    }


    /**
     * Construct a geometric object with the specified color and filled
     * @param String color
     * @param boolean filled
     */
    public SimpleGeometricShape(String color, boolean filled) {
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
class CircleFromSimpleGeometricShape
        extends SimpleGeometricShape {
    private double radius;

    /**
     * Construct a default circle object
     */
    public CircleFromSimpleGeometricShape() {
    }

    /**
     *
     * @param radius
     */
    public CircleFromSimpleGeometricShape(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricShape(double radius,
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
        System.out.println("In CircleFromSimpleGeometricShape toString method ");
        return super.toString() + " radius: " + radius;
    }

}//end CircleFromSimpleGeometricShape class

class RectangleFromSimpleGeometricShape extends SimpleGeometricShape {
    private double width;
    private double height;

    public RectangleFromSimpleGeometricShape () {
    }

    public RectangleFromSimpleGeometricShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricShape(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    // getter
    public double getWidth() {
        return width;
    }

    // setter
    public void setWidth(double width) {
        this.width = width;
    }

    // getter
    public double getHeight() {
        return height;
    }

    // setter
    public void setHeight(double height) {
        this.height = height;
    }

    // getter and calculate area
    public double getArea() {
        return width * height;
    }

    // setter and calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

} //end RectangleFromSimpleGeometricShape class
