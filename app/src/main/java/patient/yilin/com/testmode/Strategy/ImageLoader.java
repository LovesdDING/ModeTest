package patient.yilin.com.testmode.Strategy;

/**
 * ImageLoader 类 使用到 cacheStrategy的地方
 * Created by Administrator on 2017/9/7.
 */

public class ImageLoader {
    public void setCache(CacheStrategy cacheStrategy){
        if (cacheStrategy != null) {
            cacheStrategy.cache();
        }
    }
}
