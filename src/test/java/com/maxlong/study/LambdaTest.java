package com.maxlong.study;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/5/18 17:42
 *          类说明
 */
public class LambdaTest {

    @Test
    public void test_call(){

        List<String> list = Arrays.asList("A","B","C");
        String x = "X";
        list.forEach(e -> hhh(e,x));

    }

    @Test
    public void test_call2(){
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );
    }

    public void hhh(String e,String x){
        x = x + e;
        System.out.println(x);
    }
}
