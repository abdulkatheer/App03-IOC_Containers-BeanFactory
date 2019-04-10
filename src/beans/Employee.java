package beans;

public class Employee {
    private int empid;
    private String name;
    private double salary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%-10s: %s\n%-10s: %d\n%-10s: %.2f\n", "Name", this.getName(), "Emp ID", this.getEmpid(), "Salary", this.getSalary());
    }
}
