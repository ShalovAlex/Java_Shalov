package ru.courses.geometry;

public abstract class Shape {
    protected Point position;

    public Shape(Point position) {
        this.position = new Point(position.getX(), position.getY());
    }

    public Shape(double x, double y) {
        this.position = new Point(x, y);
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public Point getPosition() {
        return new Point(position.getX(), position.getY());
    }

    public void setPosition(Point position) {
        this.position = new Point(position.getX(), position.getY());
    }

    public void move(double dx, double dy) {
        position.move(dx, dy);
    }

    @Override
    public abstract String toString();
}
