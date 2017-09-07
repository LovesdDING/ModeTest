package patient.yilin.com.testmode.builder;

import android.os.Build;
import android.util.Log;

/**
 *
 * Builder  模式
 *将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *  使用场景

 主要用于创建一些复杂的对象，将其内部的构建细节隐藏起来，
 使用者只需要按照约定好的规则做相应的配置来完成构建，然后将配置好的对象表示出来即可，
 构建和展示的过程相对独立。同时不同的配置会影响具体的构建过程，最终影响目标对象。

 最常见的例子 就是Dialog的 使用 Builder....链式 配置
 * Created by Administrator on 2017/9/7.
 */

public class DstObject {
        String a ;
    String b ;
    char c;

    public void show(){
        Log.i("DstObject", "show: "+a+b+c);
    }

    public static class Builder{
        String a ;
        String b ;
        char c ;

        public Builder setA(String a){
            this.a = a ;
            return this ;
        }

        public Builder setB(String b){
            this.b = b ;
            return this ;
        }

        public Builder setC(char c){
            this.c = c ;
            return this ;
        }

        public DstObject create(){
            DstObject dstObject = new DstObject() ;
            dstObject.a = a ;
            dstObject.b = b ;
            dstObject.c = c ;
            return dstObject ;
        }

    }
}
