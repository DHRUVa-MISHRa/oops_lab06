package labsheet06.question07;

abstract class Shape {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA)
                * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class Question07ShapeMeasurements {
    public static void main(String[] args) {
        Shape circle = new Circle(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}