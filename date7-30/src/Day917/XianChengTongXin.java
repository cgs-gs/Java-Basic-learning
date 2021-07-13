package Day917;

//等待唤醒案例：线程之间的通信
public class XianChengTongXin {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    //保证等待和唤醒的线程只有一个执行，需要同步技术
                    synchronized (obj){
                        System.out.println("告诉老板包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println( "包子已经做好了，可以吃");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("包子做好了");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
