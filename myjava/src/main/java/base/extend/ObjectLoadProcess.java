package base.extend;

import javax.xml.ws.FaultAction;

/**
 * @author
 */
public class ObjectLoadProcess {
    public static void main(String[] args) {
        Son son =new Son();
    }

}


class Father{
    public  int a = 22;
    public Father(){
        System.out.println(this);
        System.out.printf("父类构造器被调用");
    }

}


class Son extends Father{
    private int a;
    public Son(){
        super();
        System.out.println(this.a);
        System.out.printf(super.a+"");
        System.out.printf("子类构造器被调用");
    }
}
/**
 * 接口中也有<clinit>方法，但是接口中不允许有静态代码块
 * 但是接口中的<clinit>方法 不会在其实现类初始化的执行。
 * 而是在其子类使用接口的常量（注意接口不允许有变量）
 * warning: 接口可以被多继承
 * */
interface FatherInt  extends Cloneable {
   static final int a=10;


}



abstract class  AbstractFather implements FatherInt{
    public  AbstractFather(){

    }
}


enum ExtendEnum {
AA(200,"成功"),BB;
private int code;
private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ExtendEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    ExtendEnum() {
    }


    public static void main(String[] args) {
        System.out.println(ExtendEnum.AA.code);;
        System.out.println(ExtendEnum.BB.code);
    }
}