package javaCodes.day13;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("1", 100);
        map.put("2", 300);
        map.put("3", 300);

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}