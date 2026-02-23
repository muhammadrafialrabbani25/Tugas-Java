package id.ac.polban.employee.model;

public class Employee {

    private static int totalEmployee = 0;
    private static int nextId = 1;

    private int id;
    private String name;
    private Department department;        // Aggregation
    private EmploymentType type;          // Aggregation
    private double salary;

    public Employee(String name, Department department, EmploymentType type, double salary) {
        this.id = nextId++;
        this.name = name;
        this.department = department;
        this.type = type;
        this.salary = salary;
        totalEmployee++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public EmploymentType getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }

    public static int getTotalEmployee() {
        return totalEmployee;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Name: " + name +
                " | Dept: " + department +
                " | Type: " + type +
                " | Salary: " + salary;
    }
}