// implementing thread safe using synchronized block : Lazy initialization with double-checked locking
public class SingletonThreadSafeBlockImpl {
    private static SingletonThreadSafeBlockImpl instance;

    private SingletonThreadSafeBlockImpl() {
    }

    public static SingletonThreadSafeBlockImpl getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafeBlockImpl.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafeBlockImpl();
                }
            }
        }
        return instance;
    }
}
