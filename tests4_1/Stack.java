public class Stack {
    int[] stack;                    // Поля
    int cur;                        // Поля

    public Stack(int size) {
        stack = new int[size];      // Конструктор
    }

    public void push(int x) {
        stack[cur++] = x;            // Методы
    }

    public int pop() {
        return stack[--cur];        // Методы
    }
}
