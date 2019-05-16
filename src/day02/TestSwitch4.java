package day02;
import java.util.Scanner;

class TestSwitch4 {
	public static void main(String[] args) {
		/*编写程序：从键盘上输入2014年的“month”和“day”，要求通过程序输出输入的日期为2014年的第几天*/
		Scanner s = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = s.nextInt();
		System.out.println("请输入月份：");
		int month = s.nextInt();
		System.out.println("请输入日期：");
		int day = s.nextInt();
		int sum = 0;//用来记录month月day日是2014年第几天
		//使用switch-case
		switch(month){
			case 12:
				sum += 30;//30:十一月份的总天数
			case 11:
				sum += 31;
			case 10:
				sum += 30;
			case 9:
				sum += 31;
			case 8:
				sum += 31;
			case 7:
				sum += 30;
			case 6:
				sum += 31;
			case 5:
				sum += 30;
			case 4:
				sum += 31;
			case 3:
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
					sum += 29;
				}else {
					sum += 28;
				}
			case 2:
				sum += 31;//31:是一月份的天数
			case 1:
				sum += day;

		}
		System.out.println(sum);
	}
	/*   注：判断一年是否是闰年的标准：（此代码中没考虑）
       1）可以被4整除，但不可被100整除
       2）可以被400整除
*/
}
