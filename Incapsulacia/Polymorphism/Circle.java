package Polymorphism;

public class Circle implements Shape {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        validateRadius(radius);
        this.radius = radius;
    }

    public Circle(double centerX, double centerY, double radius) {
        this(new Point(centerX, centerY), radius);
    }

    private void validateRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
