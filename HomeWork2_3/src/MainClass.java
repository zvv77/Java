import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        String[] arr = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Five", "Seven", "Two", "Five"};
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        List<String> l = new ArrayList<>(Arrays.asList(arr));
        for (String s : set) {
            System.out.print(s + " --- ");
            System.out.println(Collections.frequency(l, s));
        }

        System.out.println();

        PhoneCataloge people = new PhoneCataloge();
        people.add("Ivanov", "11111111");
        people.add("Sergeev", "222222222");
        people.add("Popov", "33333333");
        people.add("Ivanov", "44444444");
        people.add("Sidorov", "55555555");
        people.add("Petrov", "6666666666");
        people.add("Ivanov", "777777777");

        people.get("Ivanov");
    }
}
