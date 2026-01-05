package foreach;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4);

        nums.forEach(System.out::println);
    }
}
