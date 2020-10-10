package base.function.program.day02;

/**
 * @author 方法的引用，1.方法的引用分为静态和非静态
 * 静态方法的引用     可以直接通过类来使用
 * 非静态方法的引用    则需要通过对象来使用
 */
public class MethodReference {
    public void myCall() {
        System.out.printf("2000");
    }



}

interface MethodInterface {
    void call(MethodReference methodReference);
    public static void main(String[] args) {
        //注意:这里可以直接调用非静态的方法是因为接口里面的参数接受的是MethodReference类型的实例对象
        //这里会通过这个对象找到myCall方法继而调用。
        MethodInterface methodInterface = MethodReference::myCall;
    }
}