import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneCataloge {

    private static List<Map> list = new ArrayList<>();
    public void add(String name, String phone){
        Map<String, String> map = new HashMap<>();
        map.put(name, phone);
        list.add(map);
    }

    public void get(String name){

        System.out.println(name + ":");
        for (Map map : list) {
            if (map.containsKey(name)){
                System.out.println(map.get(name));
            }
        }

    }
}
