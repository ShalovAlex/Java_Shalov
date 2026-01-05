package EmployeeTest;

public class Department {
    String name;
    Employee boss;

    public Department(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "отделе " + name + ", в котором босс " + boss.name;
    }
}
