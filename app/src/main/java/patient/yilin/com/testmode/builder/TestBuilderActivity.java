package patient.yilin.com.testmode.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import patient.yilin.com.testmode.R;

/**
 * 将初始的构建过程和最终的表示相互隔离，降低它们之间的耦合性，
 * 方便各自的扩展。同时使代码具有良好的封装性，将具体的实现细节隐藏，易于对外操作。
 */
public class TestBuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_builder);

        test() ;
    }

    private void test() {
            //dstObject  Builder的调用
        new DstObject.Builder().setA("haha").setB("hehe").setC('Y').create().show();

        ImageConfig config = new ImageConfig.Builder()
                                .setA("you")
                                .setB("are")
                                .setC('m')
                                .create() ;

        ImageLoader.getInstance().init(config);
    }
}
