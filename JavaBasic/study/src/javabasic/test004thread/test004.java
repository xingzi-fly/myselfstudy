package learn001.test004thread;

import java.util.concurrent.*;

public class test004 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService pools =Executors.newFixedThreadPool(3);

        pools.execute(new MyRunnable());
        pools.execute(new MyRunnable());
        pools.execute(new MyRunnable());
        pools.execute(new MyRunnable());


    }
}

