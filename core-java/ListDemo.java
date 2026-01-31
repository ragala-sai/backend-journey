import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Sai");
        names.add("Ravi");
        names.add("Sai");   // duplicate allowed

        System.out.println(names);
        System.out.println(names.get(1));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
