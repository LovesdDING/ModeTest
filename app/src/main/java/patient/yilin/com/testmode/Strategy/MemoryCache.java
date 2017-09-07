package patient.yilin.com.testmode.Strategy;

import android.util.Log;

/**
 *
 * 定义 内存缓存类
 * Created by Administrator on 2017/9/7.
 */

public class MemoryCache implements CacheStrategy{

    @Override
    public void cache() {
        Log.i("CacheStrategy", "cache: MemoryCache");
    }
}
