import java.util.SortedMap;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String name, String position, String email, String phone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public void getInfo(Employee employee){
        if (employee.age > 40) {
            System.out.println("Name:     " + employee.name);
            System.out.println("Position: " + employee.position);
            System.out.println("Email:    " + employee.email);
            System.out.println("Phone:    " + employee.phone);
            System.out.println("Age:      " + employee.age);
            System.out.println("--------------------------");
        }
    }
}
