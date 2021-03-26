import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        createArray();
    }

    public static void createArray(){
        Employee[] arrayEmpl = new Employee[5];
        arrayEmpl[0] = new Employee("Ivan Ivanov", "accounter", "123@mail.ru", "123-45-67", 45);
        arrayEmpl[1] = new Employee("Olga Petrova", "economist", "abc@mail.ru", "111-22-33", 23);
        arrayEmpl[2] = new Employee("Petr Sergeev", "director", "111@mail.ru", "777-77-77", 52);
        arrayEmpl[3] = new Employee("Irina Chernova", "assistent", "555@mail.ru", "222-44-44", 34);
        arrayEmpl[4] = new Employee("Sergey Guskov", "driver", "ddd@mail.ru", "987-55-67", 42);
        for (Employee e: arrayEmpl
             ) {
            e.getInfo(e);
        }
    }
}
