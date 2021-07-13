package Day822;
/*
java.util.List接口 extends Collections 接口
特点:
1.有序的集合
2.有索引
3.允许存储有序的元素
 */

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("a");
        System.out.println(list);
        list.add(3,"iloveyou");
        System.out.println(list);
        String a = list.remove(3);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //使用迭代器来遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //使用增强for循环
        for (String s:list) {
            System.out.println(s);

        }
        for (String s : list) {
            System.out.println(s);

        }





    }
}
