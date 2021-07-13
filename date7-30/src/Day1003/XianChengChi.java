package Day1003;
//java.util.concurrent.Executors :生产线程池的一个类
//static ExecutorService newFixedThreadPool(int nThreads)


public class XianChengChi {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();

        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程创建");
            }
        };
        new Thread(r).start();

    }

}
