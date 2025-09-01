package FunctionalInterface;

public class Main {

    public static void main(String[] args) {
        FunctionalInterfaceDemo demo = (a, b) -> a + b;
        System.out.println(demo.add(1, 2));
    }
}
