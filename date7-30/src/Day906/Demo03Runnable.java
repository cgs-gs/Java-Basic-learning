package Day906;

public class Demo03Runnable {
    public static void main(String[] args) {
        RunnableImpl imp = new RunnableImpl();
        Thread t = new Thread(imp);
        t.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName() + "--- " + i);
        }

    }
}
