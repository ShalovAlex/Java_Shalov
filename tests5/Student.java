import java.util.Arrays;

public class Student {
    private final String name;          // Имя (name): строка
    private int[] grades;               // Оценки (grades): массив целых чисел

    // Конструктор только с именем (оценки не указаны)
    public Student(String name) {
        this.name = name;
        this.grades = new int[0];           // Пустой массив если оценки не указаны
    }
    // Конструктор с именем и начальным набором оценок
    public Student(String name, int[] initialGrades) {
        this.name = name;
        if (initialGrades != null) {
            // Проверяем все оценки на валидность
            for (int grade : initialGrades) {
                validateGrade(grade);
            }
            this.grades = initialGrades.clone();
        }
        else {
            this.grades = new int[0];
        }
    }
    // Валидация оценки (должна быть от 2 до 5)
    private void validateGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5: " + grade);
        }
    }
    // Добавление одной оценки
    public void addGrade(int grade) {
        validateGrade(grade);
        int[] newGrades = new int[grades.length + 1];
        System.arraycopy(grades, 0, newGrades, 0, grades.length);
        newGrades[grades.length] = grade;
        grades = newGrades;
    }
    // Получение всех оценок (возвращаем копию для защиты данных)
    public int[] getGrades() {
        return grades.clone();
    }

    // Текстовое представление вида "Имя: [оценка1, оценка2,…,оценкаN]"
    @Override
    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }

    // Геттер для имени
    public String getName() {
        return name;
    }
}
