package singleton;
// Lazy Initialization
public class Samosa {

    private static Samosa instance;

    //Step 1 : Make private constructor
    private Samosa() {
        //to get saved form reflection API
        if(instance != null){
            throw new RuntimeException("You are trying to break Singleton Pattern");
        }
    }

    //Step 2 : Make public static method to return instance
    public static Samosa getSamosa() {
        if (instance == null) {
            //Lasy way of Creating Singleton Object
            instance = new Samosa();
        }
        return instance;
    }
}
