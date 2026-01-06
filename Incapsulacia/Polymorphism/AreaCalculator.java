package Polymorphism;

public class AreaCalculator {

    /**
     * Метод для расчета общей площади всех фигур в наборе
     * @param shapes массив фигур, реализующих интерфейс Shape
     * @return общая площадь всех фигур
     */
    public static double sumAllAreas(Shape[] shapes) {
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }

    /**
     * Вторая версия метода с использованием varargs
     * @param shapes переменное количество фигур
     * @return общая площадь всех фигур
     */
    public static double sumAllAreasVarargs(Shape... shapes) {
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }

    /**
     * Версия метода для работы с коллекциями
     * @param shapes коллекция фигур
     * @return общая площадь всех фигур
     */
    public static double sumAllAreasCollection(java.util.Collection<? extends Shape> shapes) {
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}