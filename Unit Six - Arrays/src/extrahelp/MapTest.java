package extrahelp;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<String, Integer>();

        test.put("one", 1);
        test.put("two", 2);

        for (String key : test.keySet()) {
            System.out.println(key + ": " + test.get(key));
        }
    }
}
