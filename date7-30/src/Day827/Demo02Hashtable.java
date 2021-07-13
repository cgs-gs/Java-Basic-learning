package Day827;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo02Hashtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c :str.toCharArray()){
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        Set<Character> set = map.keySet();
        for (Character ch : set) {
            System.out.println(ch + "= " + map.get(ch));
        }

    }
}
