package design_patterns.creational.singleton;

public class Singleton implements SingletonInterface {

    static Singleton singleton = new Singleton();
    // Instantiate a static object of the class

    private Singleton(){
        System.out.println("Instance created normal singleton");;// making constructor as private

    }
    static Singleton getInstance(){ // writing a method to get the static object.
        return singleton;
    }
}



class Execute{
    public static void main(String a[]){

        SingletonFactory singletonFactory = new SingletonFactory();

        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        SingletonInterface singleton = singletonFactory.getInstanceFromFacotry(SingletonEnum.LAZY_SINGLETON);

                    }
                }
        );
        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        SingletonInterface singleton = singletonFactory.getInstanceFromFacotry(SingletonEnum.LAZY_SINGLETON);
                    }
                }
        );

        t1.start();
        t2.start();
    }
}

