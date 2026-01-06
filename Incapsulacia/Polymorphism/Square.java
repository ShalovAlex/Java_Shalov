package Polymorphism;

public class Square implements Shape {
    private final Point topLeft;
    private final double side;

    public Square(Point topLeft, double side) {
        this.topLeft = topLeft;
        validateSide(side);
        this.side = side;
    }

    public Square(double x, double y, double side) {
        this(new Point(x, y), side);
    }

    private void validateSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона должна быть положительной");
        }
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
