package com.maxlong.study.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/1/4 19:37
 *          类说明
 */
@Order(1)
public class UCApplicationInitializer implements WebApplicationInitializer {

    private static  final Logger logger = LoggerFactory.getLogger(UCApplicationInitializer.class);

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        logger.info("web工程初始化中。。。。。。");
    }
}
