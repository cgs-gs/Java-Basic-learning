package Day818;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pratice01 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期 ");
        String birth = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date BirthdayDate = sdf.parse(birth);
        long time1 = BirthdayDate.getTime();
        long time2 = new Date().getTime();
        long l = time2 - time1;
        System.out.println(l/60/24/60/1000);



    }
}
