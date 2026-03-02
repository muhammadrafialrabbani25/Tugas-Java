public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("Budi",2000000,2020);
        Employee e2 = new Employee("Andi",3000000,2019);

        System.out.println("Hasil compare = " + e1.compare(e2));

    }

}