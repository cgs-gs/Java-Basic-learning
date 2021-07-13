package Day820;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        ArrayList list = new ArrayList();
        list.add("abcd");
        list.add(123);
        list.add(true);

        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            /*String str =(String)obj;
            System.out.println(str.length());*/
        }
    }
}
