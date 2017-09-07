package patient.yilin.com.testmode.singleton;

/**
 * 懒汉单例模式
 *
 * 懒汉单例模式只有在第一次使用时才会初始化单例，一定程度上能节约资源，
 * 但反应会稍慢；通过synchronized关键字，保证了在多线程情况下单例的唯一性，但是在单例被第一次初始化后，
 * 再调用getInstance()方法还需要进行同步操作，这样会造成不必的系统开销。
 *
 * 如果是 饿汉式  单例模式  singleton类加载就会创建intance 实例
 * 这就需要提前开销一部分 系统资源 。 如果该实例在后期未使用 浪费系统资源
 * Created by Administrator on 2017/9/7.
 */

public class Singleton {
    private static Singleton instance ;
    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton() ;
        }
        return instance ;
    }
}
