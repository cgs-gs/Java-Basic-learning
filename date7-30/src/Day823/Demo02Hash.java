package Day823;

public class Demo02Hash {
    public static void main(String[] args) {
        String str = new String();
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("bcd");
        int i = str.hashCode();
        System.out.println(i);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
}
