package Day922;
//线程池的使用步骤：

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class XianChengChi {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);//返回的是线程池的实现类
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.shutdown();
    }
}
