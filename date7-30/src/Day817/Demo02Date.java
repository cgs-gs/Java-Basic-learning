package Day817;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        SimpleDateFormat ab = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
        Date date = new Date();
        String cs = ab.format(date);
        System.out.println(date);
        System.out.println(cs);
    }

    public static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }
    public static void demo02(){
        Date date = new Date(1597632471210L);
        System.out.println(date);

    }
}
