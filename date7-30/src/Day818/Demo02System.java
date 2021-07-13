package Day818;

public class Demo02System {
    public static void main(String[] args) {
        demo01();
    }
    public static void demo01(){
        long s = System.currentTimeMillis();
        System.out.println("i love you");
        System.out.println("i love you");
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }

}
