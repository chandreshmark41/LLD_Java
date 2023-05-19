package design_patterns.creational.singleton;

public class SingletonFactory {

    SingletonInterface getInstanceFromFacotry(SingletonEnum singletonEnum){

        if(singletonEnum == SingletonEnum.LAZY_SINGLETON){
            return LazySingleton.getInstance();
        }
        if(singletonEnum == SingletonEnum.SYNCHRONIZED_SINGLETON){
            return SynchronizedSingleton.getInstance();
        }
        if(singletonEnum == SingletonEnum.DOUBLE_LOCK_SINGLETON){
            return DoubleLockSingleton.getInstance();
        }
        return Singleton.getInstance();

    }
}
