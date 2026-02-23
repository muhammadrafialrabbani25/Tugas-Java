import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class Main {

    public static void main(String[] args) {

        Department it = new Department("IT");
        Department hr = new Department("HR");

        EmploymentType fulltime = new EmploymentType("Full Time");
        EmploymentType parttime = new EmploymentType("Part Time");

        Employee emp1 = new Employee("Rafi", it, fulltime, 5000000);
        Employee emp2 = new Employee("Budi", hr, parttime, 4000000);

        EmployeeService service = new EmployeeService();

        service.addEmployee(emp1);
        service.addEmployee(emp2);

        service.increaseSalary(emp1.getId(), 10);

        System.out.println("=== Data Employee ===");
        service.displayAllEmployees();

        System.out.println("\nTotal Employee: " + Employee.getTotalEmployee());
    }
}