package base.function.program;

/**
 * @author  刘壮壮
 * @Description 函数式编程更多的是做为匿名内部类的替代品来做，不过这种方式的话更加简洁和高效
 * 高效：我们不用再重头编写一些代码
 *
 * 然而，使用代码以某种方式操纵其他代码的想法也很有趣，只要能保证它更安全。从代码创建，维护和可靠性的角度来看，
 * 这个想法非常吸引人。我们不用从头开始编写大量代码，而是从易于理解、充分测试及可靠的现有小块开始，
 * 最后将它们组合在一起以创建新代码。难道这不会让我们更有效率，同时创造更健壮的代码吗？
 *
 * 这就是函数式编程（FP）的意义所在。通过合并现有代码来生成新功能而不是从头开始编写所有内容，
 * 我们可以更快地获得更可靠的代码。至少在某些情况下，这套理论似乎很有用。在这一过程中，
 * 函数式语言已经产生了优雅的语法，这些语法对于非函数式语言也适用。
 */
public class NewAndOld {
   static  void getOwn(String a){
         System.out.println(a);;
    }

  static   String getString(String c){
       return "200";
  }
    public  static FuctionInterface get(){
        //在这里左侧是参数，右侧是函数返回的表达式
      return   (a)->{
          System.out.printf(
                  a
          );
      };
    }

    public  static FuctionInterface get1(){
        //在这里::左侧是代表类，右侧是方法这个语法不用写明参数
        // 等同于 (a)->{NewAndOld::getOwn}

        return    NewAndOld::getOwn;
    }



    public static void main(String[] args) {
        get().print("sss");
        get1().print("own own");

    }
}
