package Day820;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String[] color = {"♥", "♠", "♣", "♦"};
        String[] value = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        for (String str : color) {
            for (String str1 : value) {
                poker.add(str + str1);
            }
        }
        //2.洗牌
        Collections.shuffle(poker);
        //3.发牌
        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if(i >= 51){
                diPai.add(poker.get(i));
            }else if(i % 3 == 0){
                play01.add(poker.get(i));
            }else if(i % 3 == 1){
                play02.add(poker.get(i));
            }else if(i % 3 == 2){
                play03.add(poker.get(i));
            }
        }
        //4.看牌
        Scanner scr = new Scanner(System.in);
        System.out.println("玩家1 id");
        scr.next();
        System.out.println("刘德华" + play01);

        System.out.println("玩家2 id");
        scr.next();
        System.out.println("周润发" + play02);

        System.out.println("玩家3 id");
        scr.next();
        System.out.println("周星驰" + play03);

        scr.next();
        System.out.println("底牌" + diPai);
    }
}
