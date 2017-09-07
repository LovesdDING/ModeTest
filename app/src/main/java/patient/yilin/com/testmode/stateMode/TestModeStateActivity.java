package patient.yilin.com.testmode.stateMode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import patient.yilin.com.testmode.R;

/**
 * APP 中对于用户登录与否的状态 有着不同的操作处理
 *   比如 淘宝 如果没有登录，点击商品 就要去登录
 *             如果已经登录 点击商品 进行购买操作
 *
 *             将用户登录与否的状态 封装在一个类中  这样 就省去了 大量的if判断
 *             如果要添加状态 只需要增加state  实现类即可
 */
public class TestModeStateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mode_state);

        findViewById(R.id.activity_test_mode_state_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginContext.getInstance().buy(TestModeStateActivity.this);
            }
        });


        findViewById(R.id.activity_test_mode_state_btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginContext.getInstance().setState(new LogoutState());
                Toast.makeText(TestModeStateActivity.this, "用户一退出登录", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
