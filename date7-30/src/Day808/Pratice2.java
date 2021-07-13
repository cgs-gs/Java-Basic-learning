package Day808;

import java.util.ArrayList;
import java.util.Random;

public class Pratice2 {
    //用一个大集合存入20个随机数字，然后刷选其中的偶数元素，放到小集合当中，用自定义方法进行帅选
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(ran.nextInt());
        }
        System.out.println(list);
        shuaiXuan(list);
    }
    public static ArrayList<Integer> shuaiXuan(ArrayList<Integer> list){
        ArrayList<Integer> list2= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                list2.add(list.get(i));

            }

        }
        System.out.println(list2);
        return list2;
    }
}
