
// the instance is created in class loading time
public class SingletonEagerInitializing {
    // instance type Singleton -private static-
    private static SingletonEagerInitializing instance = new SingletonEagerInitializing();

    // private constructor
    private SingletonEagerInitializing() {
    }

    // public mehtod for returning the instance
    public SingletonEagerInitializing getInstance() {
        return instance;
    }

}