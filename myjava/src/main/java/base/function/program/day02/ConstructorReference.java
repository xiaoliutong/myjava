package base.function.program.day02;

/**
 * 构造函数的引用
 * 可以通过捕捉构造函数的引用来调用相应的构造函数
 */
public class ConstructorReference {
    public String age;
    public String name;

    public ConstructorReference(String age) {
        this.age = age;
    }

    public ConstructorReference(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public ConstructorReference() {
    }

    @Override
    public String toString() {
        return "ConstructorReference{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 通过调用相应的方法，来调用相应的构造函数
     */

    public interface CatchConstructorReference {
        ConstructorReference getObject();

    }

    public interface CatchConstructorReference1 {
        ConstructorReference getObject(String age);

    }

    public interface CatchConstructorReference2 {
        ConstructorReference getObject(String age, String name);

    }

    //这里可以看到得到的对象是不同的，这是因为编译器根据getObject方法来调用相应的构造函数
    public static void main(String[] args) {
        CatchConstructorReference catchConstructorReference = ConstructorReference::new;
        CatchConstructorReference1 catchConstructorReference1 = ConstructorReference::new;
        CatchConstructorReference2 catchConstructorReference2 = ConstructorReference::new;
        System.out.println("第一个对象->{}" + catchConstructorReference.getObject());
        System.out.println("第二个对象->{}" + catchConstructorReference1.getObject("12"));
        System.out.println("第三个对象->{}" + catchConstructorReference2.getObject("22","王妍妍"));

    }
}
