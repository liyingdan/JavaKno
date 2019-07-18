package day15_common_class.dateFormat;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * jdk 8之前的日期时间的API测试
 * 1. System类中currentTimeMillis();
 * 2. lambda.util.Date和子类java.sql.Date
 * 3. SimpleDateFormat
 * 4. Calendar
 *
 * @author shkstart
 * @create 2019 上午 11:35
 */
public class DateTimeTest {
    /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析

    1.两个操作：
    1.1 格式化：日期 --->字符串
    1.2 解析：格式化的逆过程，字符串 ---> 日期

    2.SimpleDateFormat的实例化

     */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化：日期 --->字符串
        Date date = new Date();
        System.out.println(date); //Thu May 30 10:28:42 CST 2019

        String format = sdf.format(date);
        System.out.println(format); //19-5-30 上午10:28

        //解析：格式化的逆过程，字符串 ---> 日期
        String str = "19-12-18 上午11:43";
        Date date1 = sdf.parse(str);
        System.out.println(date1); //Wed Dec 18 11:43:00 CST 2019

        //*************按照指定的方式格式化和解析：调用带参的构造器*****************
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);//2019-05-30 10:28:42
        //解析:要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数体现),
        //否则，抛异常
        Date date2 = sdf1.parse("2020-02-18 11:48:27");
        System.out.println(date2); //Tue Feb 18 11:48:27 CST 2020
    }

    /*
    练习一：字符串"2020-09-08"转换为java.sql.Date
     */
    @Test
    public void testExer() throws ParseException {
        String birth = "2020-09-08";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);
//        System.out.println(date);
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }

    /*练习二："三天打渔两天晒网"   1990-01-01  xxxx-xx-xx 打渔？晒网？

    举例：2020-09-08 ？ 总天数

    总天数 % 5 == 1,2,3 : 打渔
    总天数 % 5 == 4,0 : 晒网

    总天数的计算？
    方式一：( date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) + 1
    方式二：1990-01-01  --> 2019-12-31  +  2020-01-01 -->2020-09-08
    */
    public void fish(String date1, String date2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date beginDate = simpleDateFormat.parse(date1);
        Date endDate = simpleDateFormat.parse(date2);
        //得到毫秒数
        long beginDate1 = beginDate.getTime();
        long endDate1 = endDate.getTime();
        if(endDate1 > beginDate1 ){
            //得到差值
            int d = (int) ((endDate1 - beginDate1)/(1000*60*60*24)+1);
            switch (d % 5){
                case 1:
                case 2:
                case 3:
                    System.out.println("打渔");
                    break;
                case 4:
                case 0:
                    System.out.println("晒网");
                    break;
            }
        }
    }
    @Test
    public void fishTest() throws ParseException {
        String date1 = "1990-01-01";
        String date2 = "1990-01-10";
        fish(date1, date2);
    }


    /*
    Calendar日历类(抽象类）的使用

     */
    @Test
    public void testCalendar(){
        //1.实例化
        //方式一：创建其子类（GregorianCalendar）的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days); //30
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); //150

        //set()
        //calendar可变性
        calendar.set(Calendar.DAY_OF_MONTH,22); //把第几天改成了22
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days); //22

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,-3); //在Calendar.DAY_OF_MONTH的基础上加（减 -3）了3天
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days); //19

        //getTime():日历类---> Date
        Date date = calendar.getTime();
        System.out.println(date); //Sun May 19 12:49:47 CST 2019

        //setTime():Date ---> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days); //30

    }
}
