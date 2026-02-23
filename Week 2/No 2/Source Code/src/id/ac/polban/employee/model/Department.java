package id.ac.polban.employee.model;

public class Department {

    private String name;

    public Department(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}