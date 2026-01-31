import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(5);

        numbers.stream()
               .filter(n -> n > 10)
               .forEach(n -> System.out.println(n));
    }
}
