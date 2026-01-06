package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3, 3, 3);
        Shape square = new Square(1, 1, 4);
        Shape rectangle = new Rectangle(2, 2, 3, 6);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

        System.out.println("=======================");


        Shape[] shapes = {
                new Circle(0, 0, 5),
                new Circle(2, 3, 3),
                new Square(1, 1, 4),
                new Circle(10, 10, 7),
                new Square(5, 5, 6),
                new Circle(8, 8, 2.5)
        };
        double totalArea1 = AreaCalculator.sumAllAreas(shapes);
        System.out.println("Общая площадь всех фигур: " +
                String.format("%.2f", totalArea1));
    }
}
