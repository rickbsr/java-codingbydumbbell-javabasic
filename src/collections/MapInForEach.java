package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInForEach {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "星期一");
        map.put("2", "星期二");
        map.put("3", "星期三");
        map.put("4", "星期四");
        map.put("5", "星期五");
        map.put("6", "星期六");
        map.put("7", "星期七");

        // By entrySet
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%s=%s\n", key, value);
        }

        // By keySet
        for (String key : map.keySet()) {
            System.out.printf("%s=%s\n", key, map.get(key));
        }

        // By Iterator
        Iterator entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) entryIterator.next();
            System.out.println(entry);
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%s=%s\n", key, value);
        }

        Iterator keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next().toString();
            String value = map.get(key);
            System.out.printf("%s=%s\n", key, value);
        }

        for (Iterator it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            System.out.println(entry);
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%s=%s\n", key, value);
        }

        for (Iterator it = map.keySet().iterator(); it.hasNext(); ) {
            String key = it.next().toString();
            String value = map.get(key);
            System.out.printf("%s=%s\n", key, value);
        }
    }
}
