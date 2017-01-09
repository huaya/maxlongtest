package com.maxlong.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/1/6 17:59
 *          类说明
 */
@Controller
@RequestMapping("/data")
public class QueryDataController {

    private final static Logger logger = LoggerFactory.getLogger(QueryDataController.class);

    @RequestMapping("/querydatapage")
    public String querydatapage(){
        return "data/querydatapage";
    }
}
