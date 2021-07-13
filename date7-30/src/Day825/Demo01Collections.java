package Day825;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();

        Collections.addAll(list01,1,2,5,3,7,4);
        System.out.println(list01);
//        Collections.sort(list01);
//        System.out.println(list01);
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });


    }
}
