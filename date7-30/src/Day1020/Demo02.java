package Day1020;

public class Demo02 {
    public static void main(String[] args) {
        int c = cheng(5);
        System.out.println(c);
    }
    public static int cheng(int n){
        if(n == 1){
            return 1;
        }
        return n*cheng(n-1);
    }
}
