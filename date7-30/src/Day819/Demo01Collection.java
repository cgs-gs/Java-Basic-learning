package Day819;
/*java.util.Collection接口的方法
    public boolean add(E e)： 把给定的对象添加到当前集合中 。
    public void clear() :清空集合中所有的元素。
    public boolean remove(E e) : 把给定的对象在当前集合中删除。
    public boolean contains(E e) : 判断当前集合中是否包含给定的对象。
    public boolean isEmpty() : 判断当前集合是否为空。
    public int size() : 返回集合中元素的个数。
    public Object[] toArray() : 把集合中的元素，存储到数组中。
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);
        coll.add("科比永垂不朽");
        coll.add("爱过");
        coll.add("神级珂");

        Iterator<String> iter = coll.iterator();
        while (iter.hasNext()){
        boolean b = iter.hasNext();
        System.out.println(b);
        String a = iter.next();
        System.out.println(a);

        }

    }

}
