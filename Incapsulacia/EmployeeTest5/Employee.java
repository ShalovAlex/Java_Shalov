package EmployeeTest5;

public class Employee {
    String name;
    Department department;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Department department) {
        this.name = name;
        setDepartment(department);
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    // Устанавливаем отдел и обновляем информацию о начальнике
    void setDepartment(Department newDepartment) {
        if (this.department != null && this.department != newDepartment) {
            // Если был начальником в старом отделе, снимаем с должности
            if (this.equals(this.department.boss)) {
                this.department.clearBoss();
            }
        }

        this.department = newDepartment;

        // Если в новом отделе нет начальника, назначаем этого сотрудника начальником
        if (newDepartment != null && newDepartment.boss == null) {
            newDepartment.setBoss(this);
        }
    }

    // Метод для назначения начальником
    void setAsBoss() {
        if (department != null) {
            department.setBoss(this);
        }
    }

    @Override
    public String toString() {
        if (department != null && this.equals(department.boss)) {
            return name + " начальник отдела " + department.getName();
        } else if (department != null) {
            return name + " работает в отделе " + department;
        } else {
            return name + " (без отдела)";
        }
    }
}