package EmployeeTest;

class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (department != null && this.equals(department.getBoss())) {
            return "Сотрудник " + name + " работает в отделе " + department.getName();
        } else if (department != null) {
            return "Сотрудник " + name + " работает в " + department;
        } else {
            return "Сотрудник " + name + " (без отдела)";
        }
    }
}