package day02;
/*
三元运算符：(条件表达式)?  表达式1 : 表达式2;
要求：表达式1与表达式2为同种数据类型。
	   既然是运算符，就一定会有运算的结果,结果的数据类型与表达式1,2的类型一致。
三元运算符在一定程度上可以与if-else互换。（三元运算符一定可以转换为if-else，反之不成立。）
*/
class TestSanYuan {
	public static void main(String[] args){
		int i = 20;
		int j = 20;
		//此时max记录了i与j的较大值
		int max = (i > j)? i : j;

		//String str = (i > j)? "i大" : "j大";
		String str = (i > j)? "i大" : (i == j)? "相等" : "j大";

		//String str1 = (i > j)? i : "j大";
		System.out.println(max);
		System.out.println(str);

		//互换
		if(i >= j){
			System.out.println("较大值为：" + i);
		}else{
			System.out.println("较大值为：" + j);
		}


		//练习：如何使用三元运算符，输出三个数中的较大值。
		int m = 12;
		int n = 23;
		int k = -9;
		int max1 = (m > n)? m : n;
		int max2 = (max1 > k)? max1 : k;
		System.out.println(max2);
	}
}
