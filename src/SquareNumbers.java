import java.util.Arrays;
import java.util.List;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream()
                .map(n->n*n)
                .forEach(i-> System.out.println(i));
    }
}
