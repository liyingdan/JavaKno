package day03;
/*
嵌套循环：循环中还可以声明循环。相当于内层循环的整体充当外层循环的循环体
for(;;){
	for(;;){

	}
}
或者
while(){
	for(;;){}
}
*/

class TestForFor{

	public static void main(String[] args) {
		/*
		 *****
		 *****
		 *****
		 *****
		 */
		/*for(int j = 0;j < 4;j++){//外层循环控制行数
			for(int i = 0;i < 5;i++){//内层循环控制列数
				System.out.print("*");
			}
			System.out.println();
		}*/

		/*
		 *
		 **
		 ***
		 ****
		 */
		/*for (int j = 0; j < 4; j++){
			for (int i = 0; i < j+1; i++){
				System.out.print("*");
			}
			System.out.println();
		}*/

		/*
		 ***** j=0,
		 ****
		 ***
		 **
		 *
		 */
		/*for (int j = 0; j < 5; j++){
			for (int i = 5; i > j; i--){
				System.out.print("*");
			}
			System.out.println();
		}*/

		/*
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 */
		/*for (int j = 0; j < 4; j++){
			for (int i = 0; i < j+1; i++){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = 0; j < 5; j++){
			for (int i = 5; i > j; i--){
				System.out.print("*");
			}
			System.out.println();
		}*/


		/*
----*
---* *
--* * *
-* * * *
* * * * *
-* * * *
--* * *
---* *
----*

*/
		for (int j = 0; j < 5; j++){
			for( int k = 4; k > j; k--){
				System.out.print(" ");
			}
			for( int i = 0; i < j+1; i++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int j = 0; j < 4; j++){
			for( int k = 0; k < j+1; k++){
				System.out.print(" ");
			}
			for( int i = 4; i >j; i--){
				System.out.print("* ");
			}

			System.out.println();
		}











	}
}
