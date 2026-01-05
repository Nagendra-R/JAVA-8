package optional;

import java.util.Optional;

public class OPtionalClass {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("nagendra");

        name.ifPresent(n -> System.out.println(n));

    }
}
