package design_patterns.creational.singleton;

public class LazySingleton {
    // Better than normal singleton but good for multithreading scenario

    public static LazySingleton lazySingletonObject;
    // object is defined not instantiated

    private LazySingleton(){
        System.out.println("instance created");
        // instantiated in the constructor
    }

    public static  LazySingleton getInstance(){
        if(lazySingletonObject == null){
            lazySingletonObject = new LazySingleton();
        }
        return lazySingletonObject;
    }

    public static synchronized LazySingleton getInstanceSynchronized(){ // not write choice for multithreaded application
        if(lazySingletonObject == null){
            lazySingletonObject = new LazySingleton();
        }
        return lazySingletonObject;
    }

}
