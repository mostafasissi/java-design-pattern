// implementing thread safe using synchronized block 
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
