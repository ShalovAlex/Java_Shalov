import java.util.Arrays;

public class OOP_5_3 {
    public static void main(String[] args) {
        // Создание студента только с именем
        Student student1 = new Student("Иван Петров");
        System.out.println(student1);

        // Добавление оценок по одной
        student1.addGrade(5);
        student1.addGrade(4);
        student1.addGrade(5);
        System.out.println("После добавления оценок: " + student1);

        // Создание студента с начальными оценками
        int[] initialGrades = {5, 4, 3, 5};
        Student student2 = new Student("Мария Сидорова", initialGrades);
        System.out.println(student2);

        // Получение всех оценок
        int[] allGrades = student2.getGrades();
        System.out.println("Все оценки Марии: " + Arrays.toString(allGrades));
    }
}
