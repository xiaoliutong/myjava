package base.function.program.day02;

/**
 * @author 方法的引用，1.方法的引用分为静态和非静态
 * 静态方法的引用  (绑定的方法引用)   可以直接通过类来使用
 * 非静态方法的引用 （未绑定的方法引用）   则需要通过对象来使用
 */
public class MethodReference {
    public void myCall(String a) {
        System.out.printf("2000");
    }



}

interface MethodInterface {
    void call(MethodReference methodReference,String msg);
    public static void main(String[] args) {
        //注意:这里可以直接调用非静态的方法是因为接口里面的参数接受的是MethodReference类型的实例对象
        //这里会通过这个对象找到myCall方法继而调用。
        //我们这里要做好一个心理准备,在使用未绑定的方法引用的时候接口的方法和引用方法签名参数无需一致
        //这是因为 call（）方法知道第一个参数为MethodReference 对象通过这个对象可以调用未绑定的方法引用myCall。
        MethodInterface methodInterface = MethodReference::myCall;
    }
}