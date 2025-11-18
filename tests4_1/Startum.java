public class Startum {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        Stack s2 = new Stack(10);
        s1.push(1);
        s2.push(2);
        s1.push(3);
        System.out.println(s2.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
