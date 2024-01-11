// Define the Shape interface
interface Shape {
    double pi = 3.14; // Constant data member

    double calculateArea(); // Abstract method
}

// Implement the Circle class that implements the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea method from the Shape interface
    @Override
    public double calculateArea() {
        return pi * radius * radius;
    }
}

// Main class to demonstrate the program
public class ShapeExample {
    public static void main(String[] args) {
        // Create an instance of Circle with a specific radius
        Circle circle = new Circle(5.0);

        // Calculate and print the area of the circle
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}
