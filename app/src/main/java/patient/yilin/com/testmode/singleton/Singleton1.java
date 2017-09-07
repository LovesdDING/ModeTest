package patient.yilin.com.testmode.singleton;

/**
 * 双重检查锁定单例模式
 *
 * 在JDK1.5后，只要这样声明instance实:private volatile static Singleton instance;即添加volatile修饰符，
 * 这样就可以保证instance每次都从主内存读取，避免了上边的问题，但会略影响性能。
 * 这种单例模式也是在第一次执行getInstance()时创建单例，但第一次反映稍慢。


 * Created by Administrator on 2017/9/7.
 */

public class Singleton1 {
    private volatile static Singleton1 instance ;  //volatile修饰符，这样就可以保证instance每次都从主内存读取
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (instance == null) {
            synchronized (Singleton1.class){
                if (instance == null) {
                    instance = new Singleton1() ;
                }
            }
        }
        return instance ;
    }
}
