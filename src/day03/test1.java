package day03;

public class test1 {
    public static void main(String[] args) {
        /*输出所有的水仙花数，所谓水仙花数是指一个3
            位数，其各个位上数字立方和等于其本身。
            例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
*/
        for(int i = 100; i<= 999; i++){ //456
            int a = i / 100; //得到百位数
            int b = (i / 10) % 10; //得到十位数  = (i - a *100)/10
            int c = i % 10;  //得到个位数
            if(i == a*a*a + b*b*b + c*c*c){
                System.out.println("哈哈"+i);
            }
        }
        /* 结果： 153  370  371  407*/








        /*编写程序FooBizBaz.lambda，从1循环到150并在每行打印一个值，
        另外在每个3的倍数行上打印出“foo”,
        在每个5的倍数行上打印“biz”,
        在每个7的倍数行上打印输出“baz”。
         */
        /*for(int i = 1; i <= 150; i++){
            System.out.print(i+" ");
            if( i % 3 == 0){
                System.out.print("foo ");
            }
            if( i % 5 == 0){
                System.out.print("biz ");
            }
            if( i % 7 == 0){
                System.out.print("baz ");
            }
            System.out.println();
        }*/
    }
}
