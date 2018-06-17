package com.maxlong.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/3/20 10:20
 *          类说明
 */
public class ExtClasspathLoderTest {

    /** URLClassLoader的addURL方法 */
    private static Method addURL = initAddMethod();

    private static URLClassLoader classloader = (URLClassLoader) ClassLoader.getSystemClassLoader();

    private static Method initAddMethod() {
        try {
            Method add = URLClassLoader.class.getDeclaredMethod("addURL", new Class[] { URL.class });
            add.setAccessible(true);
            return add;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void addURL(File file) {
        try {
            addURL.invoke(classloader, new Object[] { file.toURI().toURL() });
        }
        catch (Exception e) {
        }
    }

    public static void loadClasspath() {
        String config = "D:\\Program Files\\workspace-sand\\abacus\\abacus-service-pay-bootstrap\\src\\main\\resources";

        List<String> resFiles = new ArrayList<>();
        resFiles.add(config);

        for (String r : resFiles) {
            File file = new File(r);
            loopDirs(file);
        }
    }

    private static void loopDirs(File file) {
        if (file.isDirectory()) {
            addURL(file);
            File[] tmps = file.listFiles();
            for (File tmp : tmps) {
                loopDirs(tmp);
            }
        }
    }

    public static void main(String[] args) throws MalformedURLException, InvocationTargetException, IllegalAccessException {
//       ExtClasspathLoderTest.loadClasspath();

        File file1 = new File("D:\\Program Files\\workspace-sand\\abacus\\abacus-service-pay-bootstrap\\src\\main\\resources");
        addURL.invoke(classloader, new Object[] { file1.toURI().toURL() });
        File file3 = new File("D:\\Program Files\\workspace-sand\\abacus\\abacus-jdbc-dao\\src\\main\\resources");
        addURL.invoke(classloader, new Object[] { file3.toURI().toURL() });
        File file2 = new File("D:\\Program Files\\workspace-sand\\abacus\\abacus-service-pay-bootstrap\\src\\main\\resources\\config");
        addURL.invoke(classloader, new Object[] { file2.toURI().toURL() });


        String springConfig = "classpath*:META-INF/service/*.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springConfig.split("[,\\s]+"));

    }
}
