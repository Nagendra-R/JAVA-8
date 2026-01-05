import java.util.Arrays;
import java.util.List;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring", "boot");

        names.stream()
                .map(ss->ss.toUpperCase())
                .forEach(System.out::println);


    }
}
