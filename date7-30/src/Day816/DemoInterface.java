package Day816;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> result = addname(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String> addname(List<String> list){
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        return list;

    }
}
