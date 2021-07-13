package Day820;

import java.util.ArrayList;

public class Demo01Foreach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String s: list
             ) {
            System.out.println(s);

        }
    }

    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int a:arr) {
            System.out.println(a);

        }
    }

}
