import java.util.Arrays;
import java.util.List;

public class NumberCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        long count = list.stream()
//                .filter(n -> n > 5)
                .count();

        System.out.println(count);

    }
}
