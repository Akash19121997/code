package singleton;
// Eager Initialization
public class Jalebi {
    private static Jalebi instance = new Jalebi();
    private Jalebi() {}
    public static Jalebi getInstance() {
        return instance;
    }
}
