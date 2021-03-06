package com.maxlong.study;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2016/12/6 9:34
 *          类说明
 */
public class TheadPoolTest {

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

    @Test
    public void test_call(){
        List<User> list = new ArrayList<>();
        User user1 = new User("aaaa", BigDecimal.valueOf(2.55));
        User user2 = new User("bbbb",BigDecimal.valueOf(35.65));
        list.add(user1);
        list.add(user2);
        System.out.println(JSONObject.toJSONString(list));
    }

    @Test
    public void test_call2() throws IOException {

        String path = "D:\\Program Files\\workspace-sand\\abacus\\abacus-service-pay-bootstrap\\src\\main\\resources\\";
        Properties property = System.getProperties();
        property.setProperty("user.dir", path);
        System.out.println(System.getProperty("user.dir"));
        File directory = new File("");//设定为当前文件夹
        System.out.println(directory.getCanonicalPath());//获取标准的路径
        System.out.println(directory.getAbsolutePath());//获取绝对路径
    }
}
