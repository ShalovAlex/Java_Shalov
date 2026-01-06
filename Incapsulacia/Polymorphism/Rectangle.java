package Polymorphism;

public class Rectangle implements Shape {
    private final Point topLeft;
    private final double width;
    private final double height;

    public Rectangle(Point topLeft, double width, double height) {
        this.topLeft = topLeft;
        validateSize(width, "ширина");
        validateSize(height, "высота");
        this.width = width;
        this.height = height;
    }

    public Rectangle(double x, double y, double width, double height) {
        this(new Point(x, y), width, height);
    }

    private void validateSize(double size, String name) {
        if (size <= 0) {
            throw new IllegalArgumentException(name + " должна быть положительной");
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
