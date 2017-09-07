package patient.yilin.com.testmode.stateMode;

import android.content.Context;

/**
 * LoginCOntext  维护用户当前的登录状态
 * Created by Administrator on 2017/9/7.
 */

public class LoginContext {
    //默认 未登录
    private UserState currentState = new LogoutState() ;

    private LoginContext(){}

    //单例获取 LoginContext
    public static  LoginContext getInstance(){
        return SingletonHolder.instance ;
    }


    private static class SingletonHolder{
        private static final LoginContext instance = new LoginContext() ;
    }

    //设置登录状态
    public void setState(UserState state){
        currentState = state ;
    }

    //购买操作
    public void buy(Context context){
        currentState.buy(context);
    }

}
