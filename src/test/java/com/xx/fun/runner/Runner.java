package com.xx.fun.runner;

import com.xx.fun.util.Constant;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * Created by Alex on 2016/10/25.
 */
public class Runner implements Runnable, Constant{

    private int id;

    private String name;

    private CountDownLatch countDownLatch;

    private CyclicBarrier cyclicBarrier;

    public Runner(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Runner(int id, String name, CountDownLatch countDownLatch) {
        this(id, name);
        this.countDownLatch = countDownLatch;
    }

    public Runner(int id, String name, CyclicBarrier cyclicBarrier) {
        this(id, name);
        this.cyclicBarrier = cyclicBarrier;
    }

    /**
     * CountDownLatchTest
     */
//    public void run() {
//        System.out.print(String.format(START_INFO, id, name));
//        for(int i=0; i<100; i++){
//            System.out.print(STEP);
//        }
//        System.out.println(END);
//        countDownLatch.countDown();
//    }

    /**
     * CyclicBarrierTest
     */
    public void run() {
        System.out.print(String.format(START_INFO, id, name));
        for(int i=0; i<40; i++){
            System.out.print(1);
        }
        try {
            cyclicBarrier.await();
            for(int i=0; i<60; i++){
                System.out.print(2);
            }
            System.out.println(END);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
