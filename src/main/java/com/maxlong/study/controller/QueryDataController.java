package com.maxlong.study.controller;

import com.maxlong.study.dto.DatatableBean;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSetMetaData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

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
    public DatatableBean getdata(HttpServletRequest request, HttpServletResponse response){
        DatatableBean datatableBean = new DatatableBean();
        List<Map<String,String>> columns = new ArrayList<>();
        List<List<Object>> order = new ArrayList<>();

        String sql = request.getParameter("sql");
        List<Map<String,Object>> dataList = jdbcTemplate.queryForList(sql);
        if(dataList.size()>0){
            datatableBean.setData(dataList);

            Map<String,Object> columnMap = dataList.get(0);
            Set<String> keySet = columnMap.keySet();
            Iterator<String> iterator =   keySet.iterator();
            while (iterator.hasNext()){
                Map<String,String> col = new HashMap<>();
                String colName = iterator.next();
                col.put("data",colName);
                col.put("title",colName);
                columns.add(col);
            }
            datatableBean.setColumns(columns);
        }

        return datatableBean;
    }
}
