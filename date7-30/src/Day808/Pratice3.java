package Day808;
//题目
//定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
public class Pratice3 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        String str = pingjie(array);
        System.out.println(str);
    }
    public static String pingjie(int[] array){
        String str1 = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                str1 += "word" + array[i] + "]";
            }else{
            str1 += "word" + array[i] + "#";

            }
        }
        return str1;
    }
}
