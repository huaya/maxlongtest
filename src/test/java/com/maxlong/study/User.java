package com.maxlong.study;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/2/22 16:55
 *          类说明
 */
@Setter
@Getter
public class User {

    public User(String name,BigDecimal amt) {
        this.name = name;
        this.amt = amt;
    }

    private String name;

    private BigDecimal amt;
}
