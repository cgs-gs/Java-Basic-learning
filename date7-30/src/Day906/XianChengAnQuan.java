package Day906;
//解决线程安全问题的第一种方法：同步锁

public class XianChengAnQuan {
    public static void main(String[] args) {
        Object obj = new Object();
        Runnable run = new Runnable(){
            private int ticket = 100;
            @Override
            public void run() {
                synchronized (obj){
                    while(true){
                        if(ticket >0){
                            System.out.println(Thread.currentThread().getName() + "---" + "出售第 " + ticket + "张票");
                            ticket--;
                        }
                    }
                }
            }
        };
        Thread th0 = new Thread(run);
        Thread th1 = new Thread(run);
        Thread th2 = new Thread(run);
        th0.start();
        th1.start();
        th2.start();
    }
}
