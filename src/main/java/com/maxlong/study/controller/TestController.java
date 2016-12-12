package com.maxlong.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2016/11/18 14:53
 *          类说明
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/boostrap")
    public String boostrap(){
        logger.info("boostrap页面");
        return "test/boostrap";
    }

    @RequestMapping("/fullcalendar")
    public String fullcalendar(){
        logger.info("fullcalendar页面");
        return "test/fullcalendar";
    }
}
