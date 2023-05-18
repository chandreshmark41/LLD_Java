package design_patterns.creational.singleton;

public class DoubleLockSingleton implements SingletonInterface {
    public static DoubleLockSingleton doubleLockSingleton;
    // object is defined not instantiated

    private DoubleLockSingleton(){

        System.out.println("instance created doubleLockSingleton");
        // instantiated in the constructor
    }


    public static  DoubleLockSingleton  getInstance(){ // not write choice for multithreaded application
        if(doubleLockSingleton == null){
            synchronized (DoubleLockSingleton.class){
                if(doubleLockSingleton == null){
                    doubleLockSingleton = new DoubleLockSingleton();
                }
            }

        }
        return doubleLockSingleton;
    }
}
