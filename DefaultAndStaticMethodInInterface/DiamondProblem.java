package DefaultAndStaticMethodInInterface;

public interface DiamondProblem {
    default void show() {
        System.out.println("Default Method");
    }
}
