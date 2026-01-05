package lamdbaexpression;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Add addition = (a, b) -> a + b;

        int result = addition.add(10, 20);

        System.out.println("Sum is: " + result);

    }
}
