package Day906;

public class Demo02Thread {
    public static void main(String[] args) {
        for (int i = 1; i <= 60 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
