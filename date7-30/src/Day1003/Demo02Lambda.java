package Day1003;

public class Demo02Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程创建");
            }
        }).start();
        new Thread(() -> { System.out.println(Thread.currentThread().getName() + "线程创建"); }).start();
    }
}
