package Day1003;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程创建");
    }
}
