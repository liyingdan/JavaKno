package day15_common_class.dateFormat;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * jdk 8中日期时间API的测试
 *
 * @author shkstart
 * @create 2019 下午 2:44
 */
public class JDK8DateTimeTest {

    @Test
    public void testDate(){
        //偏移量
        Date date1 = new Date(2020 - 1900,9 - 1,8);
        System.out.println(date1);//Tue Sep 08 00:00:00 GMT+08:00 2020
    }
    /*
    LocalDate、LocalTime、LocalDateTime 的使用
    说明：
        1.LocalDateTime相较于LocalDate、LocalTime，使用频率要高
        2.类似于Calendar
     */
    @Test
    public void test1(){
        //now():获取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate); //2019-05-30
        System.out.println(localTime); //14:49:30.247
        System.out.println(localDateTime);  //2019-05-30T14:49:30.248

        //of():设置指定的年、月、日、时、分、秒。没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
        System.out.println(localDateTime1); //2020-10-06T13:23:43

        //getXxx()：获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());//30
        System.out.println(localDateTime.getDayOfWeek());//THURSDAY
        System.out.println(localDateTime.getMonth()); //MAY
        System.out.println(localDateTime.getMonthValue());//5
        System.out.println(localDateTime.getMinute()); //49

        //体现不可变性
        //withXxx():设置相关的属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate); //2019-05-30
        System.out.println(localDate1); //2019-05-22

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime); //2019-05-30T14:49:30.248
        System.out.println(localDateTime2); //2019-05-30T04:49:30.248

        //不可变性
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime); //2019-05-30T15:08:41.330
        System.out.println(localDateTime3); //2019-08-30T15:08:41.330

        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime); //2019-05-30T15:08:41.330
        System.out.println(localDateTime4); //2019-05-24T15:08:41.330
    }

    /*
    Instant的使用
    类似于 lambda.util.Date类
now() 静态方法，返回默认UTC时区的Instant类的对象
ofEpochMilli(long epochMilli) 静态方法，返回在1970-01-01 00:00:00基础上加上指定毫秒 数之后的Instant类的对象
atOffset(ZoneOffset offset) 结合即时的偏移来创建一个 OffsetDateTime
toEpochMilli() 返回1970-01-01 00:00:00到当前时间的毫秒数，即为时间戳

     */
    @Test
    public void test2(){
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2019-05-30T07:27:27.946Z

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2019-05-30T15:27:27.946+08:00

        //toEpochMilli():获取自1970年1月1日0时0分0秒（UTC）开始的毫秒数  ---> Date类的getTime()
        long milli = instant.toEpochMilli();
        System.out.println(milli); //1559201247946

        //ofEpochMilli():通过给定的毫秒数，获取Instant实例  -->Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1559201247946L);
        System.out.println(instant1); //2019-05-30T07:27:27.946Z
    }

    /*
    DateTimeFormatter:格式化或解析日期、时间
    类似于SimpleDateFormat
     */
    @Test
    public void test3(){
//        方式一：预定义的标准格式。如：ISO_LOCAL_DATE_TIME; ISO_LOCAL_DATE;  ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化:日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime); //2019-05-30T15:59:32.563
        System.out.println(str1);//2019-05-30T15:59:32.563

        //解析：字符串 -->日期
        TemporalAccessor parse = formatter.parse("2019-02-18T15:42:18.797");
        System.out.println(parse); //{},ISO resolved to 2019-02-18T15:42:18.797

//        方式二：
//        本地化相关的格式。如：ofLocalizedDateTime()
//        FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于LocalDateTime
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);//2019年5月30日 下午03时59分32秒

//      本地化相关的格式。如：ofLocalizedDate()
//      FormatStyle.FULL / FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT : 适用于LocalDate
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        //格式化
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3);//2019-5-30

//       重点： 方式三：自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);//2019-05-30 03:59:32
        //解析
        TemporalAccessor accessor = formatter3.parse("2019-02-18 03:52:09");
        System.out.println(accessor); //{SecondOfMinute=9, MicroOfSecond=0, MilliOfSecond=0, MinuteOfHour=52, HourOfAmPm=3, NanoOfSecond=0},ISO resolved to 2019-02-18

        /*
ZoneId：该类中包含了所有的时区信息，一个时区的ID，如 Europe/Paris
ZonedDateTime：一个在ISO-8601日历系统时区的日期时间，如 2007-1203T10:15:30+01:00 Europe/Paris。
 其中每个时区都对应着ID，地区ID都为“{区域}/{城市}”的格式，例如： Asia/Shanghai等
Clock：使用时区提供对当前即时、日期和时间的访问的时钟。
持续时间：Duration，用于计算两个“时间”间隔
日期间隔：Period，用于计算两个“日期”间隔
TemporalAdjuster : 时间校正器。有时我们可能需要获取例如：将日期调整 到“下一个工作日”等操作。
TemporalAdjusters : 该类通过静态方法 (firstDayOfXxx()/lastDayOfXxx()/nextXxx())提供了大量的常用 TemporalAdjuster 的实现
*/
    }

}
