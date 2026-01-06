package EmployeeTest5;

public class Main {
    public static void main(String[] args) {
        Department d_qa = new Department("Тестирования");
        Department d_dev = new Department("Разработки");
        Department d_ca = new Department("Аналитики");

        Employee e = new Employee("Alex", d_qa);
        Employee d = new Employee("Anna", d_dev);

        Employee e2 = new Employee("Tom", d_qa);
        Employee e3 = new Employee("Pete", d_qa);
        Employee d2 = new Employee("Sveta", d_dev);
        Employee d3 = new Employee("Inna", d_dev);

        d_qa.setBoss(e);
        d_dev.setBoss(d);

        System.out.println(e);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);


        System.out.println("---Перевод сотрудников---");
        e2.setDepartment(d_dev);
        System.out.println(e2 + " переведен из отдела " + d_qa);
        d3.setDepartment(d_ca);
        System.out.println(d3 + " переведен из отдела " + d_dev);

    }
}