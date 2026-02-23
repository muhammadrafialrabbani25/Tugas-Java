package id.ac.polban.employee.service;

import java.util.HashMap;
import java.util.Map;
import id.ac.polban.employee.model.Employee;

public class EmployeeService {

    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }

    public Employee findEmployee(int id) {
        return employees.get(id);
    }

    public void increaseSalary(int id, double percent) {
        Employee emp = employees.get(id);
        if (emp != null) {
            emp.raiseSalary(percent);
        }
    }

    public void displayAllEmployees() {
        for (Employee emp : employees.values()) {
            System.out.println(emp);
        }
    }
}