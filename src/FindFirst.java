import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring", "boot");

        String first = String.valueOf(names.stream()
                .filter(s->s.length()>2)
                .findFirst());

        System.out.println(first);
//        System.out.println();

    }
}
