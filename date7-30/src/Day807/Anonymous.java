package Day807;
//用匿名对象来进行传参

import java.util.Scanner;

public class Anonymous {
    public static void main(String[] args) {
        scannerPara(new Scanner(System.in));
        Scanner sc = methodReturn();
        String num1 = sc.next();
        System.out.println("输入的字符是 " + num1);
    }

    public static void scannerPara(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是： " + num);

    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
