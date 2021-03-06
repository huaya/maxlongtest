package com.maxlong.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2016/12/8 11:11
 *          类说明
 */
@Controller
@RequestMapping("/")
public class WelcomeController {

    private final static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @RequestMapping("/")
    public String index(){
        logger.info("首页");
        return "forward:/main";
    }

    @RequestMapping("/main")
    public String main(){
        logger.info("首页");
        return "index";
    }

    @RequestMapping("/main1")
    public String main1(){
        logger.info("首页");
        return "index1";
    }

    @RequestMapping("/myext")
    public String myext(){
        logger.info("myext");
        return "myext";
    }
}
