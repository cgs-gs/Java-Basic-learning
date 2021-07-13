package Day823;

import java.util.HashSet;
import java.util.Set;

/*
    java.util.Set接口 extends Collection类
    特点：
    1.不允许存储重复的元素
    2.没有索引
    java.util.HashSet   implements Set接口
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        for (Integer in : set) {
            System.out.println(in);
        }
    }
}
