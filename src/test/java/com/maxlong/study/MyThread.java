package com.maxlong.study;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/2/21 16:54
 *          类说明
 */
public class MyThread extends Thread{

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "-" + System.currentTimeMillis() + "执行中。。。");
            sleep(1000);
            System.out.println(Thread.currentThread().getName() + "-" + System.currentTimeMillis() + "执行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
