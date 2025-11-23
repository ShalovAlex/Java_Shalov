package ru.courses.geometry;

public class Triangle extends Shape {
    private Point vertex2;
    private Point vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        super(vertex1);
        this.vertex2 = new Point(vertex2.getX(), vertex2.getY());
        this.vertex3 = new Point(vertex3.getX(), vertex3.getY());
    }

    @Override
    public double getArea() {
        double a = position.distanceTo(vertex2);
        double b = vertex2.distanceTo(vertex3);
        double c = vertex3.distanceTo(position);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        double a = position.distanceTo(vertex2);
        double b = vertex2.distanceTo(vertex3);
        double c = vertex3.distanceTo(position);
        return a + b + c;
    }

    public Point getVertex1() { return getPosition(); }
    public Point getVertex2() { return new Point(vertex2.getX(), vertex2.getY()); }
    public Point getVertex3() { return new Point(vertex3.getX(), vertex3.getY()); }

    public void setVertex2(Point vertex2) { this.vertex2 = new Point(vertex2.getX(), vertex2.getY()); }
    public void setVertex3(Point vertex3) { this.vertex3 = new Point(vertex3.getX(), vertex3.getY()); }

    @Override
    public void move(double dx, double dy) {
        super.move(dx, dy);
        vertex2.move(dx, dy);
        vertex3.move(dx, dy);
    }

    @Override
    public String toString() {
        return String.format("Triangle [v1=%s, v2=%s, v3=%s]", position, vertex2, vertex3);
    }
}
