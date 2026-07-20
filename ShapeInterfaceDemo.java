// Shape Interface
interface Shape {

    // Abstract method
    double calculateArea();
}

// Circle Class
class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle Class
class Rectangle implements Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

// Main Class
public class ShapeInterfaceDemo {

    public static void main(String[] args) {

        // Array of Shape interface references
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 5)
        };

        // Runtime Polymorphism
        for (Shape shape : shapes) {
            System.out.printf("Area: %.2f%n", shape.calculateArea());
        }
    }
}
