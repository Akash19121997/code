package DefaultAndStaticMethodInInterface;

public interface demo {
    static void display(){
        System.out.println("Static Method");
    }
    default void show(){
        System.out.println("Default Method");
    }
//    Below will give error -> Default method 'equals' overrides a member of 'java.lang.Object'
//    default boolean equals(Object obj) {
//        return false;
//    }
}
