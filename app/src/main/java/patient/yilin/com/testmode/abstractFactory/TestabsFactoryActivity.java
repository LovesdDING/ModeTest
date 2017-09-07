package patient.yilin.com.testmode.abstractFactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import patient.yilin.com.testmode.R;

/**
 *   工厂方法模式：
 *        定义一个用于创建对象的接口，让子类决定实例化那个类。在需要生成复杂对象的地方，都可以使用工厂方法模式。
 *  实现：
 *工厂方法模式一般有四大模块：

 抽象产品类，工厂方法所创建的产品的父类
 具体的产品类，实现了抽象产品类的具体产品
 抽象工厂类，工厂方法模式的核心
 具体的工厂类，实现具体的产品生产业务逻辑

 *　　　
 *
 * 　以　　生产iphone 为例  iphone7和iphone7P  有共性  区别在于 7p的屏幕大 双摄像头
 */
public class TestabsFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testabs_factory);

        test() ;
    }

    private void test() {
        NewPhoneFactory factory = new NewPhoneFactory() ;
        Iphone7 iphone7 = factory.createPhont(Iphone7.class) ;
        iphone7.camera();
        iphone7.screen();

        Iphone7Plus  iphone7plus = factory.createPhont(Iphone7Plus.class) ;
        iphone7plus.camera();
        iphone7plus.screen();
    }
}
