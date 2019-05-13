package collections;

import java.util.Map;

public class MapInForEach {

    private void test(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
        }

        for (String key : map.keySet()) {
            map.get(key);
        }


    }
}
