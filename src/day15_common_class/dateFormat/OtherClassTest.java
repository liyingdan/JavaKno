package day15_common_class.dateFormat;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 其他常用类的使用
 * 1.System
 * 2.Math
 * 3.BigInteger 和 BigDecimal
 *
 * @author shkstart
 * @create 2019 下午 6:23
 */
public class OtherClassTest {
/*
 System类代表系统，系统级的很多属性和控制方法都放置在该类的内部。 该类位于java.lang包。
 由于该类的构造器是private的，所以无法创建该类的对象，也就是无法实 例化该类。其内部的成员变量和成员方法都是static的，所以也可以很方便 的进行调用。
 成员变量
 System类内部包含in、out和err三个成员变量，分别代表标准输入流 (键盘输入)，标准输出流(显示器)和标准错误输出流(显示器)。
 成员方法
 native long currentTimeMillis()： 该方法的作用是返回当前的计算机时间，时间的表达格式为当前计算机时 间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数。
 void exit(int status)： 该方法的作用是退出程序。其中status的值为0代表正常退出，非零代表 异常退出。使用该方法可以在图形界面编程中实现程序的退出功能等。
*/
    @Test
    public void test1() {
        String javaVersion = System.getProperty("lambda.version");
        System.out.println("java的version:" + javaVersion); //java的version:1.8.0_31

        String javaHome = System.getProperty("lambda.home");
        System.out.println("java的home:" + javaHome); //java的home:C:\Program Files\Java\jdk1.8.0_31\jre

        String osName = System.getProperty("os.name");
        System.out.println("os的name:" + osName); //os的name:Windows 8.1

        String osVersion = System.getProperty("os.version");
        System.out.println("os的version:" + osVersion); //os的version:6.3

        String userName = System.getProperty("user.name");
        System.out.println("user的name:" + userName);//user的name:lyd20

        String userHome = System.getProperty("user.home");
        System.out.println("user的home:" + userHome); //user的home:C:\Users\lyd20

        String userDir = System.getProperty("user.dir");
        System.out.println("user的dir:" + userDir); //user的dir:E:\Idea的项目呀\JavaKno

    }

    @Test
    public void test2() {
        BigInteger bi = new BigInteger("1243324112234324324325235245346567657653");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);
//         System.out.println(bd.divide(bd2));
        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 25, BigDecimal.ROUND_HALF_UP));
    }
}
