import shape.Square;
import shape.Triangle;
import shape.Circle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        Triangle triangle = new Triangle(3, 4);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        Circle circle = new Circle(2.5);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Circumference: " + circle.getPerimeter());
    }
}
