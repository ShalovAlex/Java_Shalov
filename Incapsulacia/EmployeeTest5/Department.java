package EmployeeTest5;

public class Department {
    String name;
    Employee boss;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getBoss() {
        return boss;
    }

    void setBoss(Employee boss) {
        if (this.boss != null && this.boss != boss) {
            this.boss.department = null;
        }

        this.boss = boss;
        if (boss != null && boss.department != this) {
            boss.department = this;
        }
    }

    void clearBoss() {
        if (boss != null) {
            boss.department = null;
            boss = null;
        }
    }

    @Override
    public String toString() {
        if (boss != null) {
            return name + " начальник которого " + boss.getName();
        } else {
            return name + " (босс не назначен)";
        }
    }
}