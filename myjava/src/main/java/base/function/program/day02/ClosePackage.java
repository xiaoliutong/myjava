package base.function.program.day02;

/**
 * 闭包的外部变量问题
 */
public class ClosePackage {
    private  int a  = 1;

    public void get(){
        int b = 2;
        MethodInterface methodInterface =  new MethodInterface() {
            @Override
            public void call(MethodReference methodReference, String msg) {
                a++;
                //b++编译错误 默认为final
            }
        };
    }
}
