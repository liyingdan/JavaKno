package day07;
/*
 * package:声明源文件所在的包，写在程序的第一行。
 *   每“.”一次，表示一层文件目录。
 *   包名都要小写。
 *
 * import:
 * 1)显式导入指定包下的类或接口
 * 2)写在包的声明和源文件之间
 * 3)如果需要引入多个类或接口，那么就并列写出
 * 4)如果导入的类是java.lang包下的，如：System String Math等，就不需要显式的声明。
 * 5)理解.*的概念。比如java.util.*;
 * 6)如何处理同名类的导入。如：在util包和sql包下同时存在Date类。
 * 7)import static 表示导入指定类的static的属性或方法
 * 8)导入java.lang.*只能导入lang包下的所有类或接口，不能导入lang的子包下的类或接口
 */
//import lambda.util.Scanner;
//import lambda.util.Date;
//import lambda.util.List;
//import lambda.util.ArrayList;
import java.lang.reflect.Field;
import java.util.*;
import static java.lang.System.*;
public class TestPackageImport {
    public static void main(String[] args) {
        out.println("helloworld");
        Scanner s = new Scanner(System.in);
        s.next();

        Date d = new Date();
        List list = new ArrayList();

        java.sql.Date d1 = new java.sql.Date(522535114234L);

        Field f = null;
    }
}

