package com.xx.fun;

import com.xx.fun.runner.Runner;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 *
 * Created by Alex on 2016/10/25.
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(9);
        Thread t1 = new Thread(new Runner(1,"way",countDownLatch));
        Thread t2 = new Thread(new Runner(2,"高田坡",countDownLatch));
        Thread t3 = new Thread(new Runner(3,"老北",countDownLatch));
        Thread t4 = new Thread(new Runner(4,"老宋",countDownLatch));
        Thread t5 = new Thread(new Runner(5,"油条",countDownLatch));
        Thread t6 = new Thread(new Runner(6,"失业",countDownLatch));
        Thread t7 = new Thread(new Runner(7,"君陌",countDownLatch));
        Thread t8 = new Thread(new Runner(8,"老徐",countDownLatch));
        Thread t9 = new Thread(new Runner(9,"夏沫",countDownLatch));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        //countDownLatch.await(); //这个是无限期等待
        countDownLatch.await(1, TimeUnit.SECONDS);  //最长等待多长时间
        System.out.println("over");
    }
}
