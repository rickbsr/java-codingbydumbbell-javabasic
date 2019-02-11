package collections;

import java.util.Map;
import java.util.HashMap;

public class MapPutRetrurn {

    public static void main(String[] args) {
        Map map = new HashMap<String, String>();

        System.out.println(map.put("A", "A"));
        System.out.println(map.put("A", 10));
        System.out.println(map.put("A", 'A'));

        System.out.println(map.put('B', true));
        System.out.println(map.put('B', new Object()));
        System.out.println(map.put('B', 'B'));
    }
}
