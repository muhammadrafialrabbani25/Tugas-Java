import id.ac.polban.employee.model.Department;

public class MainTest {

    public static void main(String[] args) {

        Department deptTest = new Department("Public Relation");

        System.out.println("Berhasil memanggil department: "
                + deptTest.getName()
                + " dari file JAR!");
    }
}