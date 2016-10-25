package com.xx.fun;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 *
 * Created by Alex on 2016/10/25.
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        final Semaphore semaphore = new Semaphore(2);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0; i<10; i++){
            final int index = i;
            executorService.execute(new Runnable(){
                public void run() {
                    try {
                        semaphore.acquire();
                        for(int j=0; j<20; j++){
                            System.out.print(index);
                        }
                        System.out.println();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        semaphore.release();
                    }
                }
            });
        }
        executorService.shutdown();
    }
}
