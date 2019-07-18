package day15_common_class.pratice;

import org.junit.Test;

public class TestString {
    /*2. 将一个字符串进行反转。将字符串中指定部分进行反转。
    比如将“abcdefg"反转为"abfedcg”*/
    public String reserve(String str, int start, int end){
        if(str != null){
            //方法1
            /*char[] chars = str.toCharArray();
            for (int i = start,j = end; i < j; i++,j--) {
                char temp = chars[i];
                chars[i]  =chars[j];
                chars[j] = temp;
            }
            return new String(chars);*/

            //方法2
            StringBuffer stringBuffer = new StringBuffer(str.length());
            //String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
            //char charAt(int index)： 返回某索引处的字符return value[index]
            //分成3段，先把第一段不反转的添加到stringBuffer中
            stringBuffer.append(str.substring(0,start));
            for(int i = end; i >= start; i--){
                stringBuffer.append(str.charAt(i));
            }
            stringBuffer.append(str.substring(end+1));
            return stringBuffer.toString();

        }
        return null;
    }

    @Test
    public void reserveTest(){
        String str = "abcdefg";
        String reserve = reserve(str, 2, 5);
        System.out.println(reserve);
    }


    /*3. 获取一个字符串在另一个字符串中出现的次数。
    比如:获取“ab"在“abkkcadkabkebfkabkskab"中出现的次数*/
    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int index = 0;
        int count = 0;
        if(mainLength >= subLength) {
            //方式一：
//            while((index = mainStr.indexOf(subStr)) != -1){
//                count++;
//                mainStr = mainStr.substring(index + subStr.length());
//            }
            //方式二：对一的改进
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subLength;
            }
            return count;
        }
        return 0;
    }

    @Test
    public void getCountTest(){
        String mainStr = "abkkcadkabkebfkabkskab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }

    /*获取两个字符串中最大相同子串。比如：
   str1 = "abcwerthelloyuiodefabcdef";str2 = "cvhellobnm"
   提示：将短的那个串进行长度依次递减的子串与较长的串比较。*/
    public String getMaxSameString(String str1,String str2){
        if(str1 != null && str2 != null){
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int len = minStr.length();
            //方法1
            /*for(int i = 0; i<len; i++){
                for(int x=0,y=len-i; y<=len; x++,y++){
                    String subStr = minStr.substring(x, y);
                    if(maxStr.contains(subStr)){
                        return subStr;
                    }
                }
            }*/
            //方法2
            for(int i = len; i >= 1; i-- ){
                for (int x = 0,y = i; y <= len; x++,y++){
                    String subStr = minStr.substring(x, y);
                    if(maxStr.contains(subStr)){
                        return subStr;
                    }
                }
            }
        }
        return null;
    }

    @Test
    public void getMaxSameStringTest(){
        String str1 = "abcwerthello1yuiodefabcdef";
        String str2 = "cvhellbnm";
        String maxSameString = getMaxSameString(str1, str2);
        System.out.println(maxSameString);
    }

}
