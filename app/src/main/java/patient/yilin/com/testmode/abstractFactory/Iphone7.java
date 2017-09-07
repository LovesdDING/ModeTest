package patient.yilin.com.testmode.abstractFactory;

import android.util.Log;

/**
 * 具体产品类 Iphone7
 * Created by Administrator on 2017/9/7.
 */

public class Iphone7 extends Iphone{


    @Override
    public void camera() {
        Log.i("Iphone7", "Iphone7的单摄");
    }

    @Override
    public void screen() {
        Log.i("Iphone7", "Iphone7的4.7寸屏幕");
    }
}
