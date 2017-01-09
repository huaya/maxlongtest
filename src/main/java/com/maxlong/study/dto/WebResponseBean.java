package com.maxlong.study.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/1/9 16:47
 *          类说明
 */
@Getter
@Setter
public class WebResponseBean implements Serializable{

    private static final long serialVersionUID = 1L;

    private int draw;

    private String respCode;

    private String respMsg;

    private int totalCnt;

    private Object data;

    private boolean success;

}
