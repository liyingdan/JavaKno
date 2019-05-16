package day03;

/*
break:使用在switch-case中或者循环中
如果使用在循环中，表示：结束"当前"循环

continue:使用在循环结构中
表示：结束"当次"循环

关于break和continue中标签的使用。（理解）
*/
class TestBreakContinue{
    public static void main(String[] args) {
		/*
		for(int i = 1;i <= 10;i++){
			if(i % 4 == 0){
				//break;
				continue;
			}

			System.out.println(i);
		}
		*/
        label:for(int i = 1;i < 5;i++){
            for(int j = 1;j <= 10;j++){
                if(j % 4 == 0){
                    //break;
                    //continue;
                    //break label;
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

