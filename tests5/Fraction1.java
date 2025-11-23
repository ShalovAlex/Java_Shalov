public class Fraction1 {
    // Приватные final поля - состояние не может изменяться
    private final int numerator;        //числитель (numerator): целое число
    private final int denominator;      //знаменатель (denominator): целое число

    // Конструктор только с числителем (знаменатель = 1)
    public Fraction1(int numerator) {
        this(numerator, 1);
    }

    // Конструктор с числителем и знаменателем
    public Fraction1(int numerator, int denominator) {
        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // Строковое представление
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    // Нахождение наибольшего общего делителя (НОД)
    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // Сокращение дроби
    private Fraction1 reduce() {
        int gcd = gcd(numerator, denominator);
        return new Fraction1(numerator / gcd, denominator / gcd);
    }
    // Сложение с другой дробью (возвращает новую дробь)
    public Fraction1 sum(Fraction1 other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction1(newNumerator, newDenominator).reduce();
    }
    // Сложение с целым числом (возвращает новую дробь)
    public Fraction1 sum(int number) {
        return sum(new Fraction1(number));
    }

    // Вычитание другой дроби
    public Fraction1 minus(Fraction1 other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction1(newNumerator, newDenominator).reduce();
    }

    // Вычитание целого числа
    public Fraction1 minus(int number) {
        return minus(new Fraction1(number));
    }
}