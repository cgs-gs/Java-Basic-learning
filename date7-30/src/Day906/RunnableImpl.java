package Day906;

public class RunnableImpl implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
            if(ticket >0){
                System.out.println(Thread.currentThread().getName() + "---" + "出售第 " + ticket + "张票");
                ticket--;
            }
        }
    }
}
