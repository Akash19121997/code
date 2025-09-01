package singleton;
// Lazy Initialization
public class SamosaMT {
    // Volatile for memory issue. If two threads t1 and t2 are there, say t1 crated object and stored in l1 cache of core 1,
    // t2 running on core 2 checks it's l1 cache, there is no sync up between l1 cache of t1 and l2 cache of t2, now it will go in memory
    //and check and get the value as null. so again it will create one more object.
    // to fix this issue, we use volatile because with it's use object will directly get created in memory, not L1 cache.
    private static volatile SamosaMT instance;

    //Step 1 : Make private constructor
    private SamosaMT() {
    }

    //Step 2 : Make public static method to return instance
    public static SamosaMT getSamosa() {
        if (instance == null) {
            //Lasy way of Creating Singleton Object
            synchronized (SamosaMT.class) {
                if (instance == null) {
                    instance = new SamosaMT();
                }
            }
        }
        return instance;
    }
}
