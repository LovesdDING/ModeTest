package patient.yilin.com.testmode.builder;

/**
 * Created by Administrator on 2017/9/7.
 */

public class ImageConfig {
    String a = "a" ;
    String b = "b" ;
    char c = 'c' ;

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

        public ImageConfig create(){
            ImageConfig config = new ImageConfig() ;
            config.a = a ;
            config.b =b ;
            config.c = c ;
            return config ;
        }

    }


}
