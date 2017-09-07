package patient.yilin.com.testmode.Strategy;

import android.util.Log;

/**
 * 磁盘缓存类
 * Created by Administrator on 2017/9/7.
 */

public class DiskCache implements  CacheStrategy {
    @Override
    public void cache() {

        Log.i("CacheStrategy", "cache:DiskCache ");
    }
}
