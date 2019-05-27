package day10;
/*
 * final:最终的 ，可以用来修饰类、属性、方法
 *
 * 1.final修饰类：这个类就不能被继承。如：String类、StringBuffer类、System类
 *
 * 2.final修饰方法：不能被重写。如：Object类的getClass()
 *
 * 3.final修饰属性：此属性就是一个常量，一旦初始化后，不可再被赋值。习惯上，常量用大写字符表示。
 * 此常量在哪里赋值：①此常量不能使用默认初始化 ②可以显式的赋值、代码块、构造器。
 *
 * 变量用static final修饰：全局常量
 *
 * >与finally finalize()区分开
 *
 */
public class TestFinal {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getClass());
        System.out.println(Math.PI);
    }
}

class D{
    final int I = 12;
    final double PI;
    final String NAME;

    public void m1(){
        System.out.println(I);
//		I = 10;

    }
    {
        PI = 3.14;
    }

    public D(){
        NAME = "DD";
    }
    public D(String name){
        this();
        //NAME = name;
    }
}

//class SubString extends String{
//
//}
final class A{

}
/*class B extends A{

}*/
class C{
    public final void method1(){
        System.out.println("method1");
    }
}

class E extends C{
	/*public void method1(){
		System.out.println("method1...");
	}*/
}
