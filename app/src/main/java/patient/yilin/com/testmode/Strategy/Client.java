package patient.yilin.com.testmode.Strategy;

/**
 *
 *   策略模式定义了一系列算法，并将每一个算法封装起来，而且使它们可以相互替换。策略模式让算法独立于使用它的客户端独立变化。
 *  使用场景：
 *
 *当我们处理问题时，如果需要根据不同的条件来选择不同的解决方案，最简单的方式就是用if-else，
 * 但每增加一种方案，就要修改原来的代码，而且容易出现错误，最终导致代码臃肿、耦合性高、难维护等，
 * 同时也违背了开放封闭原则，所以就需要使用策略模式来解决这样的问题。
 *
 *
 *当需要增加新的缓存策略时就不用修改ImageLoader类了，只需要通过CacheStrategy接口来扩展新的缓存策略，而不会影响原来的业务逻辑。
 *
 * Created by Administrator on 2017/9/7.
 */

public class Client {
        public static  void test(){
            ImageLoader imageLoader = new ImageLoader() ;
            imageLoader.setCache(new DiskCache());
        }
}
