public class TestSimpleRectangle {

    public static void main(String[] args) {

        // Rectangle with width and height of 1
        SimpleRectangle rectangle1 = new SimpleRectangle();
        System.out.println("Area of rectangle of width " + rectangle1.width + " and height " + rectangle1.height + " is " + rectangle1.getArea());

        // Rectangle with width of 20 and height of 10
        SimpleRectangle rectangle2 = new SimpleRectangle(20, 10);
        System.out.println("Area of rectangle of width " + rectangle2.width + " and height " + rectangle2.height + " is " + rectangle2.getArea());

        // Modifying rectangle width and height
        rectangle2.width = 100;
        rectangle2.height = 50;
        System.out.println("Area of rectangle of width " + rectangle2.width + " and height " + rectangle2.height + " is " + rectangle2.getArea());

        // Getting perimeter for modified circle 2
        System.out.println("Perimeter of rectangle of width " + rectangle2.width + " and height " + rectangle2.height + " is " + rectangle2.getPerimeter());

    } // main
} // TestSimpleRectangle

class SimpleRectangle {
    double width;
    double height;

    SimpleRectangle() {
        width = 1;
        height = 1;
    }

    SimpleRectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

}// SimpleRectangle
