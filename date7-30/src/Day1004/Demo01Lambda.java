package Day1004;

public class Demo01Lambda {
    public static void main(String[] args) {
        invocook(()->{
            System.out.println("chiganle");
        });
    }
    public static void invocook(Cook cook1){
        cook1.cook();
    }
}
