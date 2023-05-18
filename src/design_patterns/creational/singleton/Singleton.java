package design_patterns.creational.singleton;

public class Singleton {

    static Singleton singleton = new Singleton();
    // Instantiate a static object of the class

    private Singleton(){ // making constructor as private

    }

    static Singleton getInstance(){ // writing a method to get the static object.
        return singleton;
    }


}



class Execute{
    public static void main(String a[]){

        // Normal Singleton
//         singletonObject1 = Singleton.getInstance();
//        Singleton singletonObject2 = Singleton.getInstance();
//        System.out.println(singletonObject1);
//        System.out.println(singletonObject2);

        //Lazy Singleton
//        LazySingleton lazySingletonObject1 = LazySingleton.getInstance();
//        LazySingleton lazySingletonObject2 = LazySingleton.getInstance();
//
//        System.out.println(lazySingletonObject1);
//        System.out.println(lazySingletonObject2);

        //Synchronized Singleton
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        LazySingleton lazySingletonObject1 = LazySingleton.getInstanceSynchronized();
                    }
                }
        );
        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        LazySingleton lazySingletonObject1 = LazySingleton.getInstanceSynchronized();
                    }
                }
        );

        t1.start();
        t2.start();
    }
}

