package com.maxlong.study.controller;

import com.maxlong.study.dao.AccBusiWithdrawJnlMapper;
import com.maxlong.study.model.AccBusiWithdrawJnl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2016/11/18 14:53
 *          类说明
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private AccBusiWithdrawJnlMapper accBusiWithdrawJnlMapper;

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

    @RequestMapping("/getdata")
    @ResponseBody
    public AccBusiWithdrawJnl getByPrimaryKey(){
        AccBusiWithdrawJnl accBusiWithdrawJnl = accBusiWithdrawJnlMapper.selectByPrimaryKey("16122102000100010001");
        return accBusiWithdrawJnl;
    }
}
