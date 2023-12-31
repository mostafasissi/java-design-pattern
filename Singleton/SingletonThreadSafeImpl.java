// implementing thread safe using synchronized method 

public class SingletonThreadSafeImpl {
    private static SingletonThreadSafeImpl instance;

    private SingletonThreadSafeImpl() {
    }

    public static SingletonThreadSafeImpl getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafeBlockImpl.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafeImpl();
                }
            }
        }
        return instance;
    }
}