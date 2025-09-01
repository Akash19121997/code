package singleton;

public class Example {
    public static void main(String[] args) {
        //Lazy
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        Samosa s2 = Samosa.getSamosa();
        System.out.println(s2.hashCode());
        //Eager
        Jalebi j1 = Jalebi.getInstance();
        Jalebi j2 = Jalebi.getInstance();
        System.out.println(j1.hashCode());
        System.out.println(j2.hashCode());
        //Bill Puch
        Vada v1 = Vada.getInstance();
        Vada v2 = Vada.getInstance();
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
    }
}
