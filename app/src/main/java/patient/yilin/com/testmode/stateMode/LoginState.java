package patient.yilin.com.testmode.stateMode;

import android.content.Context;
import android.widget.Toast;

/**
 *
 * 登录状态 实现UserState
 * Created by Administrator on 2017/9/7.
 */

public class LoginState implements UserState{


    @Override
    public void buy(Context context) {
        Toast.makeText(context, "购买成功", Toast.LENGTH_SHORT).show();
    }
}
