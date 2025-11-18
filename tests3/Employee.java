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
        if(this == dep.boss) return "Employee " + name + " is boss in " + dep.name;
        return "Employee " + name + " working in " + dep;
    }
}

