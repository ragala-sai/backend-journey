import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Sai");
        names.add("Ravi");
        names.add("Kumar");

        names.forEach(name -> System.out.println(name));
    }
}
