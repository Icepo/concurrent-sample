### CountDownLatch

```java
//构造函数
CountDownLatch(int count);
//主要方法
//1.释放锁
countDownLatch.countDown();
//2.等待执行 （2个方法)
countDownLatch.await();
countDownLatch.await(5, TimeUtil.SECONDS);
```



latch: 闩，从上往下计数的门闩，可以理解成初始化一个门，门上N把锁（构造函数的 int 参数），在一个线程中指定的位置锁上门（await），然后在其它其它线程中约定好到达某个位置开锁（countDown），等所都打开，门就开了。

### TimeUnit

通过枚举的方式提供多种时间单位，解决原生只有毫秒单位的问题。

### CyclicBarrier

```java
//构造函数 设定卡的线程数量和满足数量后执行的动作（可选）
CyclicBarrier(int parties);
CyclicBarrier(int parties, Runnable barrierAction);
//主要方法
cyclicBarrier.await();
```



回环栅栏，所谓回环就是可以复用的意思。栅栏就是在线程中的某一点设置一个断点（await），线程在这里等待，等到有满足约定数量（构造函数的int参数）的线程同时等待的时候再同时往下进行，可以在同时启动前插入额外的逻辑（构造函数的第2个参数Runnable）。

### Semaphore

```java
//构造函数
Semaphore(int permits);
Semaphore(int permits, boolean fair); 
```



信号量，线程调度的经典概念。需要注意的是信号量只是控制了访问量，对竞争资源仍然存在线程安全问题，如果把 `permits` 初始化为1，就和 `synchronized` 类似。