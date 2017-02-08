package com.maxlong.study.dao;

import com.maxlong.study.model.AccBusiWithdrawJnl;

public interface AccBusiWithdrawJnlMapper {
    int deleteByPrimaryKey(String busiSerial);

    int insert(AccBusiWithdrawJnl record);

    int insertSelective(AccBusiWithdrawJnl record);

    AccBusiWithdrawJnl selectByPrimaryKey(String busiSerial);

    int updateByPrimaryKeySelective(AccBusiWithdrawJnl record);

    int updateByPrimaryKey(AccBusiWithdrawJnl record);
}