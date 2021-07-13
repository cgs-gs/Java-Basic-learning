package Day906;

public class MyThread extends Thread {
    //重写run方法，设置线程任务
    @Override
    public void run() {
        /*for (int i = 0; i <20 ; i++) {
            System.out.println("run " + i);*/
        String name = getName();
        System.out.println(name);
        Thread t = currentThread();
        String name1 = t.getName();
        System.out.println(name1);

    }
}
