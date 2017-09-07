package patient.yilin.com.testmode.abstractFactory;

import android.util.Log;

/**
 * Created by Administrator on 2017/9/7.
 */

public class Iphone7Plus extends Iphone {
    @Override
    public void camera() {
        Log.i("Iphone7Plus", "Iphone7Plus的双摄");
    }

    @Override
    public void screen() {
        Log.i("Iphone7Plus", "Iphone7Plus的5.5寸屏");
    }
}
