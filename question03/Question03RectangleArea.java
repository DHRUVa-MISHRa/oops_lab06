package labsheet06.question03;

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class Question03RectangleArea {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8.0, 5.0);
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}