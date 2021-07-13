package Day819;

public class Exchange {
    public static void main(String[] args) {
        int a = 100;
        String str = a + "";
        System.out.println(str + 200);

        String s = Integer.toString(500);
        System.out.println(s + "sbc");

        String s1 = String.valueOf(36.2);
        System.out.println(s1 + 20);

        int i = Integer.parseInt(str);
        System.out.println(i-10);
        double v = Double.parseDouble(s1);
        System.out.println(v);

    }
}
