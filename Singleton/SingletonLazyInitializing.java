public class SingletonLazyInitializing {

    private static SingletonLazyInitializing instance;

    private SingletonLazyInitializing() {
    }

    public SingletonLazyInitializing getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInitializing();
        }
        return instance;
    }
}
