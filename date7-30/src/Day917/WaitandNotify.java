package Day917;

public class WaitandNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    //保证等待和唤醒的线程只有一个执行，需要同步技术
                    synchronized (obj){
                        System.out.println("告诉老板包子的种类和数量");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println( "包子已经做好了，可以吃");
                    }
                }
            }
        }.start();
    }
}
