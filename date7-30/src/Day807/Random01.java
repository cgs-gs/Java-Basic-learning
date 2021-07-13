package Day807;

import java.util.Random;

public class Random01 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(3);
        System.out.println("随机数是" + num);
    }

}
