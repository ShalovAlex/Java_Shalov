public class A1 {
    int x = 1;
    void met() {
        System.out.println("A1");
    }
    static void staticmet() {
        System.out.println("Static A1");
    }
}

class B1 extends A1 {
    int x = 2;
    void met() {
        System.out.println("B1");
    }
    static void staticmet() {
        System.out.println("Static B1");
    }
}

