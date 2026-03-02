class Employee extends Sortable {

    private String name;
    private double salary;
    private int hireyear;

    public Employee(String n, double s, int y) {
        name = n;
        salary = s;
        hireyear = y;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireyear);
    }

    public int hireYear() {
        return hireyear;
    }

    public void raiseSalary(double percent) {
        salary = salary + salary * percent / 100;
    }

    public int compare(Sortable b) {
        Employee e = (Employee) b;

        if(salary < e.salary)
            return -1;
        else if(salary > e.salary)
            return 1;
        else
            return 0;
    }

}