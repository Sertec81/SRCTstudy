package Day20_Hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class JavaHashMapTask14 {
    //14. print
    // Apple Lemon Peach Melon Berry
    // 100 200 150 145 250
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 150);
        map.put("Melon", 145);
        map.put("Berry", 250);

        // Hint: use as many loop as you like
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String keys = entry.getKey(); // or e.getValue
            System.out.println(keys + " ");
        }
        System.out.println();
        for(Map.Entry<String, Integer> entry1 : map.entrySet()){
            int values = entry1.getValue();
            System.out.println(values +" ");
        }
        }
    }
