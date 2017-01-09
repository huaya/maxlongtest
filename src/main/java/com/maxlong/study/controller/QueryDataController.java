package com.maxlong.study.controller;

import com.maxlong.study.dto.WebResponseBean;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/1/6 17:59
 *          类说明
 */
@Controller
@RequestMapping("/data")
public class QueryDataController {

    private final static Logger logger = LoggerFactory.getLogger(QueryDataController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/querydatapage")
    public String querydatapage(){
        return "data/querydatapage";
    }

    @RequestMapping("/getdata")
    @ResponseBody
    public WebResponseBean getdata(HttpServletRequest request, HttpServletResponse response){
        WebResponseBean webResponseBean = new WebResponseBean();
        String sql = request.getParameter("sql");
        List<Map<String,Object>> dataList = jdbcTemplate.queryForList(sql);
        webResponseBean.setData(dataList);
        webResponseBean.setRespCode("000000");
        webResponseBean.setSuccess(true);
        return webResponseBean;
    }
}
