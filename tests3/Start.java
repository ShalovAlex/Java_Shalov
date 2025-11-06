public class Start {
    public static void main(String[] args) {
        Department d= new Department("Accounting");
        Employee e = new Employee("Alex",d);
        Employee e2 = new Employee("Tom",d);
        Employee e3 = new Employee("Pete",d);
        d.boss=e;
        System.out.println(e);
        System.out.println(e2);
        System.out.println(e3);
    }
}