package patient.yilin.com.testmode.stateMode;

import android.content.Context;
import android.content.Intent;

/**
 * 未登录状态  实现UserState
 * Created by Administrator on 2017/9/7.
 */

public class LogoutState implements UserState {
    @Override
    public void buy(Context context) {
        context.startActivity(new Intent(context,LoginActivity.class));
    }
}
