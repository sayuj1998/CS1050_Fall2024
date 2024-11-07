// 1 Fix the way the class is implemented and how the variables are being accessed in main
// 2 Generate Comments  and update with information
// 3 Troubleshoot the problem with the output for area and perimeter


public class TestArrayRectangle {

    public static void main(String[] args) {

        System.out.println("Number of rectangles: " + BasicRectangle.getNumberOfRectangles());

        // First rectangle
        BasicRectangle rectangle1 = new BasicRectangle();

        // Setter
        rectangle1.setLength(8.5);
        rectangle1.setWidth(5.2);

        System.out.printf("Rectangle width: %.1f and height: %.1f\n",
                rectangle1.getWidth(), rectangle1.getLength());


        System.out.println("The area of the rectangle 1 is " + rectangle1.getArea());
        System.out.println("The perimeter of the rectangle 1 is " + rectangle1.getPerimeter());
        System.out.println("Number of rectangles: " + BasicRectangle.getNumberOfRectangles());

        // Second Rectangle
        BasicRectangle rectangle2 = new BasicRectangle(4, 5);
        System.out.println("The area of the rectangle 2 is " + rectangle2.getArea());
        System.out.println("The perimeter of the rectangle 2 is " + rectangle1.getPerimeter());
        System.out.println("Number of rectangles: " + BasicRectangle.getNumberOfRectangles());

        //5 In the  code declare a third rectangle
        BasicRectangle rectangle3 = new BasicRectangle();
        //6 Declare an array called rectangles  to store 3 SimpleRectangle’s
        BasicRectangle[] rectangles = new BasicRectangle[3];
        //7 Assign rectangle1 to index 0, rectangle2 to index 1 and rectangle 3 to index 2.
        rectangles[0] = rectangle1;
        rectangles[1] = rectangle2;
        rectangles[2] = rectangle3;
        //8 Use the array index to set the width of rectangle3 length to 10.4
        // I'm not sure if this wanted me to set the width or the length to 10.4, so I chose width
        rectangles[2].setWidth(10.4);
        //9 Use the array index to display the area of rectangle3.
        System.out.println("The area of the rectangle 2 is " + rectangles[2].getArea());

        //10 Create a method iterate through the array to print the perimeter of each rectangle
        getPerimeters(rectangles);

        //11 Create a method to find  the  index of the rectangle with the largest length
        int largestIndex = findLargestIndex(rectangles);

        //12 Print the area of the rectangle with the largest length
        System.out.println("The area of the rectangle with the largest length is " + rectangles[largestIndex].getArea());

    }// end main

    // Method to iterate and print the perimeter
    /* My ide tells me "Class 'BasicRectangle' is exposed outside its defined visibility scope"
       I can't seem to figure out how to fix this
    */
    public static void getPerimeters(BasicRectangle[] rectangles) {
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Perimeter of rectangle " + (i + 1) + " is " + rectangles[i].getPerimeter());
        }
    }
    // Method to find the index with the largest length
    public static int findLargestIndex(BasicRectangle[] rectangles) {
        int largestIndex = 0;
        double largestLength = rectangles[0].getLength();
        for (int i = 1; i < rectangles.length; i++) {
            if (rectangles[i].getLength() > largestLength) {
                largestLength = rectangles[i].getLength();
                largestIndex = i;
            }
        }
        return largestIndex;
    }


} //end TestBasicRectangle Class

class BasicRectangle {

    // Made variables private and used getters and setters for length and width
    private double length = 1;
    private double width = 1;

    // Keeps track of number of rectangles created
    private static int numberOfRectangles = 0;

    // Constructor
    BasicRectangle() {
        numberOfRectangles++;
    }


    // Constructor
    BasicRectangle(double length, double width) {
        this.length  = length;
        this.width  = width;
        numberOfRectangles++;
    }

    // Method for getting area
    double getArea() {
        return length * width;
    }

    // Method for getting perimeter
    double getPerimeter() {
        return 2* (width + length);
    }


    // Method for getting the number of rectangles created
    static int getNumberOfRectangles() {
        return numberOfRectangles;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }


}// BasicRectangle Class