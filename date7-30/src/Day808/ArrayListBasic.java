package Day808;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list2);
        System.out.println(list1);
        list2.add(200);
        list2.add(300);
        System.out.println(list2.get(1));
    }
}
