import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Sai");
        map.put(2, "Ravi");
        map.put(1, "Kumar");  // overwrites value

        System.out.println(map);
        System.out.println(map.get(2));

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
