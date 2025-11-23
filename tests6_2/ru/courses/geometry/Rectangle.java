package ru.courses.geometry;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(Point position, double width, double height) {
        super(position);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth1() { return width; }
    public void getHeight() {
    }

    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public String toString() {
        return String.format("Rectangle at %s [width=%.2f, height=%.2f]",
                position, width, height);
    }
}
