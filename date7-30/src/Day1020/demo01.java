package Day1020;

public class demo01 {
    public static void main(String[] args) {
        int s = sum(100);
        System.out.println(s);
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
