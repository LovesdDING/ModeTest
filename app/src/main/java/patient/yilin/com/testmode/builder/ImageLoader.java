package patient.yilin.com.testmode.builder;

/**
 *
 * Builder 模式  ：  初始化 配置 和使用 分离
 * Created by Administrator on 2017/9/7.
 */

public class ImageLoader {
    private ImageConfig mConfig ;

    private ImageLoader(){}

    public static ImageLoader getInstance(){
        return SingletonHolder.instance ;
    }

    private static class SingletonHolder{
        private static final ImageLoader instance = new ImageLoader() ;
    }

    public void init(ImageConfig config){
        mConfig = config ;
    }

    public void load(){
            //start load img
    }
}
