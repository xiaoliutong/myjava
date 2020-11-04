package base.function.program.day02;

import java.util.Date;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * 函数式接口
 * java.util.function 旨在提供一组完整的接口，使得我们一般情况下不需再定义自己的接口
 * 这样做的好处是我们不用在自己重新创建接口，也无需考虑命名的问题。
 * 各个函数式接口作用和名称参考文档
 * https://github.com/LingCoder/OnJava8/blob/master/docs/book/13-Functional-Programming.md
 *
 */
public class FunctionInterface {
    static void get(Function<ConstructorReference,Date> a){
       a.apply(new ConstructorReference());
    };
    public static void main(String[] args) {
        IntFunction intFunction = a -> new ConstructorReference();
        //高阶函数测试
        InputHigherFunctionInterface functionInterface = ()-> System.out.println("我是输入函数");
        HigherFunctionInterface higherFunctionInterface = (a)-> a.sout();
        higherFunctionInterface.write(functionInterface);
    }


}

/**
 * 高阶函数 产生函数和消费函数
 */
interface HigherFunctionInterface{
    void write(InputHigherFunctionInterface functionInterface);

}


interface  InputHigherFunctionInterface{
    void sout();
}