package patient.yilin.com.testmode.singleton;

/**
 *  静态内部类单例模式
 *
 *  这种方式只有在的第一次调用getInstance()方法时，虚拟机才会加载SingletonHolder类，并初始化instance实例，即保证了线程同步，
 *  也能保证单例的唯一性，相对双重检查锁定单例模式简单了许多，推荐使用这种方式来实现单例模式
 *
 *
 * Created by Administrator on 2017/9/7.
 */

public class Singleton2 {

    private Singleton2(){}
    private static Singleton2 getInstance(){
        return SingletonHolder.instance ;
    }

    public static class SingletonHolder{
        private static final Singleton2 instance = new Singleton2() ;
    }
}
