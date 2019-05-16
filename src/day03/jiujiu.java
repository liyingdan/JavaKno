package day03;


class TestJiuJiu{
    public static void main(String[] args){
 /*
1 * 1 = 1
2 * 1 = 2  2 * 2 = 4
...
9 * 1 = 9   ....    9 * 9 = 81
*/

        /*for(int i = 1;i <= 9;i++){//一共有9行
            for(int j = 1;j <= i;j++){//每行有i个等式
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }*/



        /*输出100以内所有的质数*/
        /*方法1*/
       /* boolean flag = false;
        for(int i = 2;i <= 100;i++){//实现100以内的自然数的遍历
            //如何判断i是否为一个质数
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i);
            }
            flag = false;
        }*/

        label:for(int i = 2;i <= 100;i++){//实现100以内的自然数的遍历
            //如何判断i是否为一个质数
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    continue label;
                }
            }
            System.out.println(i);
        }





    }
}

