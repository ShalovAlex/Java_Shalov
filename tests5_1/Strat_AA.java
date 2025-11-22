public class Strat_AA {
    public static void main(String[] args) {
        BB b = new BB();
        AA a = new AA();
        System.out.println(b.x);
        System.out.println(b.y);
        b.m();                      // Вызов наследуемого метода из класса АА,
                                    // который переопределяется в BB
        System.out.println(a.w);
        System.out.println(b.w);
    }
}
