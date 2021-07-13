package Day808;

public class String01 {
    //字符串是常量
    public static void main(String[] args) {
        String str1 = "zbc";
        String str2 = "zbc";
        char[] charArray = {'z','b','c'};
        String str3 = new String(charArray);
        byte[] byteArray = {96, 97, 98};
        String str4 = new String(byteArray);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

        System.out.println(str1.equals("zbc"));
        String stra = "abc";
        String strb = "ABc";
        System.out.println(stra.equals(strb));
        System.out.println(stra.equalsIgnoreCase(strb));

        String str5 = "how do you do?";
        System.out.println(str5);
        String str6 = str5.replace("o", "p");
        System.out.println(str6);
    }
}
