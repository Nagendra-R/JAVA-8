package functionalInerface;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = new FunctionalInterface();
       String catSound = functionalInterface.catSound();
        System.out.println(catSound);
    }
}
