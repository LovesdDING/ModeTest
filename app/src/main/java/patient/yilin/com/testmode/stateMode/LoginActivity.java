package patient.yilin.com.testmode.stateMode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import patient.yilin.com.testmode.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.activity_login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    LoginContext.getInstance().setState(new LoginState());
                Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}
