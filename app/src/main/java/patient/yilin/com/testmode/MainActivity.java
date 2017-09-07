package patient.yilin.com.testmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import patient.yilin.com.testmode.abstractFactory.TestabsFactoryActivity;
import patient.yilin.com.testmode.stateMode.TestModeStateActivity;

/**
 *   开发模式的学习
 *   状态模式
 *   Builder  建造者模式
 *   单例模式
 *   工厂方法模式
 *   策略模式
 *   抽象工厂模式
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TestModeStateActivity.class));
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TestabsFactoryActivity.class));
            }
        });
    }
}
