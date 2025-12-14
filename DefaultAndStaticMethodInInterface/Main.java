package DefaultAndStaticMethodInInterface;

public class Main {

    static class ABC implements demo{

    }

    static class BCD implements demo{
        @Override
        public void show() {
            System.out.println("Overriding Default Method");
        }

    }
    static class CDEF implements demo, DiamondProblem{
        // here must override because both interface have same method signature
        @Override
        public void show() {
            System.out.println("Overriding default Method");
        }
    }

    static class EFG {
        public void show() {
            System.out.println("Third rule of Java");
        }
    }

    static class GHI extends EFG implements demo{}

    public static void main(String[] args) {
        demo.display(); // Static method. No need to create object
        ABC abc = new ABC();
        abc.show(); // default method without implementation so overriding
        BCD bcd = new BCD();
        bcd.show(); // Here default method overridden with class implementation
        EFG efg = new EFG();
        efg.show(); // Class method has more priority then default method

    }
}
