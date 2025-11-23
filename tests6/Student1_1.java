public class Student1_1 {
    public static void main(String[] args) {
        Student1 st1 = new Student1("Pete", new RuleChet());     //или
        Student1 st2 = new Student1("Alex", x->x>=2 && x<5); //или
    }
}

class RuleChet implements Student1.Rule {
    public boolean check(int x) {
        return x % 2 == 0;
    }
}