package patient.yilin.com.testmode.abstractFactory;

/**
 *   具体工厂类
 *    通过反射 去创建产品对象
 *
 *    也可以分别针对产品 创建具体的工厂类
 *     当只有一个工厂类时 可以简化吊抽象工厂类 直接在具体的工厂类中使用静态方法
 *     public static Iphone creatPhone(){return new Iphone7Plus()}
 * Created by Administrator on 2017/9/7.
 */

public class NewPhoneFactory  extends IphoneFactory{

    @Override
    public <T extends Iphone> T createPhont(Class<T> clz) {
        Iphone iphone = null ;
        try {
            iphone = (Iphone) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) iphone;
    }
}
