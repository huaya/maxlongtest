package com.maxlong.study;

import org.junit.Test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2016/12/6 9:34
 *          类说明
 */
public class AppTest {

    @Test
    public void test_singlethread_call() throws InterruptedException {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        //将线程放入池中并执行
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        //关闭
        Thread.sleep(10000);
        pool.shutdown();
    }

    @Test
    public void test_fixedthread_call() throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        //将线程放入池中并执行
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        //关闭
        Thread.sleep(10000);
        pool.shutdown();
    }

    @Test
    public void test_cachedthread_call() throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        //将线程放入池中并执行
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        //关闭
        Thread.sleep(10000);
        pool.shutdown();
    }
}
