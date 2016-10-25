package com.xx.fun;

import com.xx.fun.runner.Runner;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * Created by Alex on 2016/10/25.
 */
public class CyclicBarrierTest {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable(){

            public void run() {
                System.out.println("************************************");
            }
        });
        Thread t1 = new Thread(new Runner(1,"way",cyclicBarrier));
        Thread t2 = new Thread(new Runner(2,"高田坡",cyclicBarrier));
        Thread t3 = new Thread(new Runner(3,"老北",cyclicBarrier));
        Thread t4 = new Thread(new Runner(4,"老宋",cyclicBarrier));
        Thread t5 = new Thread(new Runner(5,"油条",cyclicBarrier));
        Thread t6 = new Thread(new Runner(6,"失业",cyclicBarrier));
        Thread t7 = new Thread(new Runner(7,"君陌",cyclicBarrier));
        Thread t8 = new Thread(new Runner(8,"老徐",cyclicBarrier));
        Thread t9 = new Thread(new Runner(9,"夏沫",cyclicBarrier));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        System.out.println("over");
    }
}
