package patient.yilin.com.testmode.abstractFactory;

/**
 *   抽象工厂类
 * Created by Administrator on 2017/9/7.
 */

public abstract class IphoneFactory {
    public abstract <T extends Iphone> T createPhont(Class<T> clz) ;
}
