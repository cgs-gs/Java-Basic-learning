package Day901;

import java.util.Scanner;

public class Demo01Register {
    static String[] usernames = {"王思聪","高渐离","公孙离"};

    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        checkName(username);

    }
    public static void checkName(String username) throws RegisterException {
        for (String s : usernames) {
            if(s.equals(username)){
                throw new RegisterException("输入的用户名已存在");

            }

        }
        System.out.println("注册成功");
    }
}
