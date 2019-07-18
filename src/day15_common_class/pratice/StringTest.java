package day15_common_class.pratice;

/**
 * 一道面试题
 */
public class StringTest {

    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[]) { //两个都是传地址值
        str = "test ok";
        ch[0] = 'b';
    }
    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);//good  //string是不可变性
        System.out.println(ex.ch);//best
    }
}

