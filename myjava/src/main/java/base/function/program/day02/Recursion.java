package base.function.program.day02;

/**
 * @Description 使用函数式编程进行递归
 */
public interface Recursion {

    public void call(int i);

}

/**
 * 这是我第一版本的递归代码
 */
class RecursionImplement {
    public static void myCall(int i) {
        if (i == 0) {
            return;
        } else {
            myCall(i--);
        }
    }

    public static void main(String[] args) {
        Recursion recursion = RecursionImplement::myCall;
        recursion.call(100);
    }

}


class Java8RecursionImplement {
    /**
     * 注意这个必须要写到方法外部
     */
    Recursion recursion;


    public void mycall(int i) {
        recursion = (i1) -> {
            if (i1 == 0) {
                return;
            } else {
                recursion.call(i1--);
            }
        };

        recursion.call(i);

        Recursion recursion4;
        /**
         *说明:为什么 在匿名内部类中不可以使用 其外部的引用
         * recursion1 不能在其内部类里面被调用这是因为recursion1是没有被初始化的
         * 这是因为我们在方法中不可以使用那些没有被初始化的变量，这里recursion1 就是做为
         * 未被初始化的变量来对待 所以会出现编译错误。
         */
       /*Recursion recursion1 =    new Recursion(){
            @Override
            public void call(int i) {
                System.out.println(recursion4);;
                recursion1.call(i);
            }
        };*/
    }

}
