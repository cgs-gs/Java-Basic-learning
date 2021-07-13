package Day818;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;



public class Demo01Calendar {
    public static void main(String[] args) {
        /*Calendar cal = Calendar.getInstance();
        System.out.println(cal);*/
        demo02();
        demo01();
    }

    private static void demo02() {
        Calendar cal = Calendar.getInstance();
        cal.set(8888,7,20);
        demo01();
    }

    private static void demo01() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int month = cal.get(Calendar.MONTH);
        System.out.println(month);
        int day = cal.get(Calendar.DATE);
        System.out.println(day);
    }
}
