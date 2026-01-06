package Polymorphism;


public class AreaCalculator {
    public static double sumAllAreas(Shape[] shapes) {
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}
