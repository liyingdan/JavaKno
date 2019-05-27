package day10;
/*
 * 类的第四个成员：初始化块（或代码块）
 * 1.代码块如果有修饰的话，那么只能使用static。
 * 2.分类：
 * 静态代码块：
 * 1.里面可以有输出语句
 * 2.随着类的加载而加载，而且只被加载一次
 * 3.多个静态代码块之间按照顺序结构执行
 * 4.静态代码块的执行要早于非静态代码块的执行。
 * 5.静态的代码块中只能执行静态的结构(类属性，类方法)
 *
 * 非静态代码块：
 * 1.可以对类的属性(静态的 & 非静态的)进行初始化操作，同时也可以调用本类声明的方法(静态的 & 非静态的)
 * 2.里面可以有输出语句
 * 3.一个类中可以有多个非静态的代码块，多个代码块之间按照顺序结构执行
 * 4.每创建一个类的对象，非静态代码块就加载一次。
 * 5.非静态代码块的执行要早于构造器
 *
 * 关于属性赋值的操作：①默认的初始化②显式的初始化或代码块初始化(此处两个结构按照顺序执行) ③构造器中；④通过方法对对象的相应属性进行修改
 */
public class TestOrder {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1);

        System.out.println();

        Order o2 = new Order();
        System.out.println(o2);
    }
}

class Order {

    private String orderName;
    private int orderId = 1001;
    private static String orderDesc;
    public Order() {
        super();
        System.out.println("我是Order类的空参的构造器");
    }
    //非静态的初始化块
    {
        orderId = 1002;
        orderName = "AA";
        System.out.println("我是非静态代码块1");
        orderDesc = "ORDER";
        show1();
        show2();
    }
    {
        orderId = 1003;
        System.out.println("我是非静态代码块2");
    }
    //静态的代码块
    static{
        System.out.println("静态代码块2");
        orderDesc = "我是一个Order";
//		orderId = 1000;
//		show1();
        show2();
    }
    static{
        System.out.println("静态代码块1");
    }

    public Order(int orderId, String orderName) {
        super();
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderName=" + orderName + "]";
    }
    public void show1(){

    }
    public static void show2(){

    }


    /*
         1.蓝灯（网址）
         JVM线程共享区（线程之间的 有多个线程）
    *     2.基本数据类型与string有何区别？
    *     3.截图敲一遍（报错，继承与实现的基本原理，继承的细节！！！）
    *     4.abstcact interface（接口 抽象方法）
    *     5.JVM 垃圾回收机制(复制 粘贴 )
    *     6.Java的引用，类的持有引用，强软虚若（怎么声明，怎么表示） 类初始化
    *     7.Map，ArrayList,lingedList谁快（区别） new HashMap（原理） 增删查改 与HashSetHashTable 区别 concart网址（282）
    *     8.线程   lock 并发！！
    *     线程池（每个 demo）
    *     9.泛型（昨天的那个问题）
    *
    *
    *
    *      大话说句结果 数据结构Java实现  链表 数组 二叉树  平衡二叉树  leeCode刷题（简单的都会 Blankj那个网址，easy的题都会背！！）
    *      那本书 （数据集合 不看  看多线程 类加载 类声明）
    *
    *
    *
    *
    *
    *
    *
    * */

}
