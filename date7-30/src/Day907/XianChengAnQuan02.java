package Day907;
//解决线程安全问题的第二种方法：同步方法

public class XianChengAnQuan02 {
    public static void main(String[] args) {

        Runnable run = new Runnable(){
            private int ticket = 100;
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while(true){
                    payTicket();
                }

            }
            public synchronized void payTicket(){

                if(ticket >0){
                    System.out.println(Thread.currentThread().getName() + "---" + "出售第 " + ticket + "张票");
                    ticket--;
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
