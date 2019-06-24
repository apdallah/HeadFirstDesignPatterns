package com.example.headfirstdesignpatterns.SingleToneDp;

public class ChocoletFactory {
    private ChocoletFactory() {
    }

    /*Approach 1
        - used when we are sure that the app will alowys use our singletone
     */
    private static ChocoletFactory uniqueInstance = new ChocoletFactory();

    public static ChocoletFactory getInstance() {
        return uniqueInstance;
    }

    /*Approach 2
        -is used when we want to use synchornized the first time we call getInstance onley
        -the key word volatile allow improper access to the instance
            in case of multi thredding in java 1.4 and erliar
        - volatile ensures that multiple threads handle uniuqe instance correctlly
          when it's being intialized
        - it makes variable thread safe if one thread modifies the object the other threads knows
           about that change
     */
    private volatile static ChocoletFactory uniqueInstanceDoubleCheck = null;

    public static ChocoletFactory getUniqueInstanceDoubleCheck() {
        if (uniqueInstanceDoubleCheck == null) {
            synchronized (ChocoletFactory.class) {
                if (uniqueInstanceDoubleCheck == null)
                    uniqueInstanceDoubleCheck = new ChocoletFactory();
            }
        }
        return uniqueInstanceDoubleCheck;
    }

    /*Approach 3
        - we use it when performance is not an issue
     */

    private static ChocoletFactory syncedInstance = null;

    public static synchronized ChocoletFactory getSyncedInstance() {
        if (syncedInstance == null) syncedInstance = new ChocoletFactory();
        return syncedInstance;
    }
}
