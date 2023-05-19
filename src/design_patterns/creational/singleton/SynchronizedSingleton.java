package design_patterns.creational.singleton;

public class SynchronizedSingleton implements SingletonInterface{

    public static SynchronizedSingleton synchronizedSingleton;
    // object is defined not instantiated

    private SynchronizedSingleton(){

        System.out.println("instance created synchronized");
        // instantiated in the constructor
    }


    public static synchronized SynchronizedSingleton  getInstance(){ // not write choice for multithreaded application
        if(synchronizedSingleton == null){
            synchronizedSingleton = new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }
}
