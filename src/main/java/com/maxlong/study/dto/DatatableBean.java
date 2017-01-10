package com.maxlong.study.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/1/9 19:43
 *          类说明
 */
@Setter
@Getter

public class DatatableBean<T>{

    private List<T> data;

    //private List<List<Object>> order;

    private List<Map<String,String>> columns;

}
