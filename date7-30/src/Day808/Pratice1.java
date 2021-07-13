package Day808;

import java.util.ArrayList;
import java.util.Random;

public class Pratice1 {
    //生成6个1-33之间的随机整数，将其添加到集合，并遍历集合
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> jihe = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            jihe.add(ran.nextInt(33) + 1);
        }
        System.out.println(jihe);
        for(int i = 0; i < jihe.size(); i++){
            System.out.println(jihe.get(i));
        }

    }
}
