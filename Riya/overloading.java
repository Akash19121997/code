package Riya;

public class overloading {

    public static void main(String[] args) {
        System.out.println(calculate(10,20));
        System.out.println(calculate(10,20,30));
    }

    public static int calculate(int x, int y){
        return x + y;
    }
    public static int calculate(int x, int y, int z){
        return x + y;
    }
}
