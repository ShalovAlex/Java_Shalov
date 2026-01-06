package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3, 3, 3);
        Shape square = new Square(1, 1, 4);
        Shape rectangle = new Rectangle(2, 2, 3, 6);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }
}
