package patient.yilin.com.testmode.stateMode;

import android.content.Context;

/**
 * 定义接口   包含一个购买方法
 *   然后在 登录 与 未登录状态下 分别实现这个方法
 * Created by Administrator on 2017/9/7.
 */

public interface UserState {
        void buy(Context context) ;
}
