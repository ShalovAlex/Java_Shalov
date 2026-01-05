package EmployeeTest;

class Employee {
    String name;
    Department dep;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Department dep) {
        this.name = name;
        this.dep = dep;
    }

    public String toString() {
        if(this == dep.boss) return "Сотрудник " + name + " работает в отделе " + dep.name;
        return "Сотрудник " + name + " работает в " + dep;
    }
}
