package Day827;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",18);
        map.put("周星驰",19);
        map.put("章子怡",23);
        map.put("胡歌",24);

        //遍历map接口的第一种方法，通过Entry对象，使用map.keyset()方法
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer in = map.get(key);
            System.out.println(key + "= " + in);
        }
        System.out.println("================");
        for (String s : set) {
            Integer in = map.get(s);
            System.out.println(s + "= " + in);
        }
        System.out.println("================");
        //遍历map接口的第二种方法，map.entryset()方法
        Set<Map.Entry<String, Integer>> set1 = map.entrySet();
        for (Map.Entry<String, Integer> entry : set1) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "= " + value);

        }


    }
}
