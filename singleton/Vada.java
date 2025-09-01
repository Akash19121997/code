package singleton;

public class Vada {
    //Bill Puch Solution
    private Vada() {}

    //nested class. with this it will be loaded when application loads like eager.
    private static class VadaHelper{
        private static final Vada instance = new Vada();
    }
    public static Vada getInstance(){
        return VadaHelper.instance;
    }
}
