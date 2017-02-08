package com.maxlong.study.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class AccBusiWithdrawJnl implements Serializable{

    private String busiSerial;

    private String recordId;

    private String tranAttribute;

    private String busiKind;

    private String busiType;

    private String stat;

    private String orgSerial;

    private String reverseFlag;

    private String cancelFlag;

    private String contractId;

    private String orderId;

    private String accBatch;

    private String wdBatch;

    private String wdProductCode;

    private String wdInsticode;

    private String wdTranUserId;

    private String wdTranDatetime;

    private String wdTranAccountNo;

    private String wdTranId;

    private String wdTranType;

    private String stlType;

    private String wtdrwMode;

    private BigDecimal wdTranAmt;

    private BigDecimal wdTranFeeAmt;

    private String wdTranCurrency;

    private String wdTranFeeType;

    private String wdTranApyDatetime;

    private String wdTranSignature;

    private String pvdRhgAccountNo;

    private String pvdRhgBankName;

    private String pvdRhgAccountFlag;

    private String pvdRhgAccname;

    private String pvdRhgCnaps;

    private String wdTranCmpDatetime;

    private String payGroup;

    private String payPriority;

    private String combineFlag;

    private String epayId;

    private String orgEpayId;

    private String insertO;

    private String insertTime;

    private String updateTime;

    private String additional1;

    private String additional2;

    private String batchDate;

    private String prxInsti;

    private String prxProduct;

    private String wdUserName;

    private String wdUserName2;

    private BigDecimal wdOtranFeeAmt;

    private String payAccountNo;

    private String payAccname;

    private String payBankName;

    private String payCnaps;

    private String wdAccSelect;

    private String wdChannelSelect;

    private String sourceSerial;

    public String getBusiSerial() {
        return busiSerial;
    }

    public void setBusiSerial(String busiSerial) {
        this.busiSerial = busiSerial == null ? null : busiSerial.trim();
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getTranAttribute() {
        return tranAttribute;
    }

    public void setTranAttribute(String tranAttribute) {
        this.tranAttribute = tranAttribute == null ? null : tranAttribute.trim();
    }

    public String getBusiKind() {
        return busiKind;
    }

    public void setBusiKind(String busiKind) {
        this.busiKind = busiKind == null ? null : busiKind.trim();
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat == null ? null : stat.trim();
    }

    public String getOrgSerial() {
        return orgSerial;
    }

    public void setOrgSerial(String orgSerial) {
        this.orgSerial = orgSerial == null ? null : orgSerial.trim();
    }

    public String getReverseFlag() {
        return reverseFlag;
    }

    public void setReverseFlag(String reverseFlag) {
        this.reverseFlag = reverseFlag == null ? null : reverseFlag.trim();
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag == null ? null : cancelFlag.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getAccBatch() {
        return accBatch;
    }

    public void setAccBatch(String accBatch) {
        this.accBatch = accBatch == null ? null : accBatch.trim();
    }

    public String getWdBatch() {
        return wdBatch;
    }

    public void setWdBatch(String wdBatch) {
        this.wdBatch = wdBatch == null ? null : wdBatch.trim();
    }

    public String getWdProductCode() {
        return wdProductCode;
    }

    public void setWdProductCode(String wdProductCode) {
        this.wdProductCode = wdProductCode == null ? null : wdProductCode.trim();
    }

    public String getWdInsticode() {
        return wdInsticode;
    }

    public void setWdInsticode(String wdInsticode) {
        this.wdInsticode = wdInsticode == null ? null : wdInsticode.trim();
    }

    public String getWdTranUserId() {
        return wdTranUserId;
    }

    public void setWdTranUserId(String wdTranUserId) {
        this.wdTranUserId = wdTranUserId == null ? null : wdTranUserId.trim();
    }

    public String getWdTranDatetime() {
        return wdTranDatetime;
    }

    public void setWdTranDatetime(String wdTranDatetime) {
        this.wdTranDatetime = wdTranDatetime == null ? null : wdTranDatetime.trim();
    }

    public String getWdTranAccountNo() {
        return wdTranAccountNo;
    }

    public void setWdTranAccountNo(String wdTranAccountNo) {
        this.wdTranAccountNo = wdTranAccountNo == null ? null : wdTranAccountNo.trim();
    }

    public String getWdTranId() {
        return wdTranId;
    }

    public void setWdTranId(String wdTranId) {
        this.wdTranId = wdTranId == null ? null : wdTranId.trim();
    }

    public String getWdTranType() {
        return wdTranType;
    }

    public void setWdTranType(String wdTranType) {
        this.wdTranType = wdTranType == null ? null : wdTranType.trim();
    }

    public String getStlType() {
        return stlType;
    }

    public void setStlType(String stlType) {
        this.stlType = stlType == null ? null : stlType.trim();
    }

    public String getWtdrwMode() {
        return wtdrwMode;
    }

    public void setWtdrwMode(String wtdrwMode) {
        this.wtdrwMode = wtdrwMode == null ? null : wtdrwMode.trim();
    }

    public BigDecimal getWdTranAmt() {
        return wdTranAmt;
    }

    public void setWdTranAmt(BigDecimal wdTranAmt) {
        this.wdTranAmt = wdTranAmt;
    }

    public BigDecimal getWdTranFeeAmt() {
        return wdTranFeeAmt;
    }

    public void setWdTranFeeAmt(BigDecimal wdTranFeeAmt) {
        this.wdTranFeeAmt = wdTranFeeAmt;
    }

    public String getWdTranCurrency() {
        return wdTranCurrency;
    }

    public void setWdTranCurrency(String wdTranCurrency) {
        this.wdTranCurrency = wdTranCurrency == null ? null : wdTranCurrency.trim();
    }

    public String getWdTranFeeType() {
        return wdTranFeeType;
    }

    public void setWdTranFeeType(String wdTranFeeType) {
        this.wdTranFeeType = wdTranFeeType == null ? null : wdTranFeeType.trim();
    }

    public String getWdTranApyDatetime() {
        return wdTranApyDatetime;
    }

    public void setWdTranApyDatetime(String wdTranApyDatetime) {
        this.wdTranApyDatetime = wdTranApyDatetime == null ? null : wdTranApyDatetime.trim();
    }

    public String getWdTranSignature() {
        return wdTranSignature;
    }

    public void setWdTranSignature(String wdTranSignature) {
        this.wdTranSignature = wdTranSignature == null ? null : wdTranSignature.trim();
    }

    public String getPvdRhgAccountNo() {
        return pvdRhgAccountNo;
    }

    public void setPvdRhgAccountNo(String pvdRhgAccountNo) {
        this.pvdRhgAccountNo = pvdRhgAccountNo == null ? null : pvdRhgAccountNo.trim();
    }

    public String getPvdRhgBankName() {
        return pvdRhgBankName;
    }

    public void setPvdRhgBankName(String pvdRhgBankName) {
        this.pvdRhgBankName = pvdRhgBankName == null ? null : pvdRhgBankName.trim();
    }

    public String getPvdRhgAccountFlag() {
        return pvdRhgAccountFlag;
    }

    public void setPvdRhgAccountFlag(String pvdRhgAccountFlag) {
        this.pvdRhgAccountFlag = pvdRhgAccountFlag == null ? null : pvdRhgAccountFlag.trim();
    }

    public String getPvdRhgAccname() {
        return pvdRhgAccname;
    }

    public void setPvdRhgAccname(String pvdRhgAccname) {
        this.pvdRhgAccname = pvdRhgAccname == null ? null : pvdRhgAccname.trim();
    }

    public String getPvdRhgCnaps() {
        return pvdRhgCnaps;
    }

    public void setPvdRhgCnaps(String pvdRhgCnaps) {
        this.pvdRhgCnaps = pvdRhgCnaps == null ? null : pvdRhgCnaps.trim();
    }

    public String getWdTranCmpDatetime() {
        return wdTranCmpDatetime;
    }

    public void setWdTranCmpDatetime(String wdTranCmpDatetime) {
        this.wdTranCmpDatetime = wdTranCmpDatetime == null ? null : wdTranCmpDatetime.trim();
    }

    public String getPayGroup() {
        return payGroup;
    }

    public void setPayGroup(String payGroup) {
        this.payGroup = payGroup == null ? null : payGroup.trim();
    }

    public String getPayPriority() {
        return payPriority;
    }

    public void setPayPriority(String payPriority) {
        this.payPriority = payPriority == null ? null : payPriority.trim();
    }

    public String getCombineFlag() {
        return combineFlag;
    }

    public void setCombineFlag(String combineFlag) {
        this.combineFlag = combineFlag == null ? null : combineFlag.trim();
    }

    public String getEpayId() {
        return epayId;
    }

    public void setEpayId(String epayId) {
        this.epayId = epayId == null ? null : epayId.trim();
    }

    public String getOrgEpayId() {
        return orgEpayId;
    }

    public void setOrgEpayId(String orgEpayId) {
        this.orgEpayId = orgEpayId == null ? null : orgEpayId.trim();
    }

    public String getInsertO() {
        return insertO;
    }

    public void setInsertO(String insertO) {
        this.insertO = insertO == null ? null : insertO.trim();
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime == null ? null : insertTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getAdditional1() {
        return additional1;
    }

    public void setAdditional1(String additional1) {
        this.additional1 = additional1 == null ? null : additional1.trim();
    }

    public String getAdditional2() {
        return additional2;
    }

    public void setAdditional2(String additional2) {
        this.additional2 = additional2 == null ? null : additional2.trim();
    }

    public String getBatchDate() {
        return batchDate;
    }

    public void setBatchDate(String batchDate) {
        this.batchDate = batchDate == null ? null : batchDate.trim();
    }

    public String getPrxInsti() {
        return prxInsti;
    }

    public void setPrxInsti(String prxInsti) {
        this.prxInsti = prxInsti == null ? null : prxInsti.trim();
    }

    public String getPrxProduct() {
        return prxProduct;
    }

    public void setPrxProduct(String prxProduct) {
        this.prxProduct = prxProduct == null ? null : prxProduct.trim();
    }

    public String getWdUserName() {
        return wdUserName;
    }

    public void setWdUserName(String wdUserName) {
        this.wdUserName = wdUserName == null ? null : wdUserName.trim();
    }

    public String getWdUserName2() {
        return wdUserName2;
    }

    public void setWdUserName2(String wdUserName2) {
        this.wdUserName2 = wdUserName2 == null ? null : wdUserName2.trim();
    }

    public BigDecimal getWdOtranFeeAmt() {
        return wdOtranFeeAmt;
    }

    public void setWdOtranFeeAmt(BigDecimal wdOtranFeeAmt) {
        this.wdOtranFeeAmt = wdOtranFeeAmt;
    }

    public String getPayAccountNo() {
        return payAccountNo;
    }

    public void setPayAccountNo(String payAccountNo) {
        this.payAccountNo = payAccountNo == null ? null : payAccountNo.trim();
    }

    public String getPayAccname() {
        return payAccname;
    }

    public void setPayAccname(String payAccname) {
        this.payAccname = payAccname == null ? null : payAccname.trim();
    }

    public String getPayBankName() {
        return payBankName;
    }

    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName == null ? null : payBankName.trim();
    }

    public String getPayCnaps() {
        return payCnaps;
    }

    public void setPayCnaps(String payCnaps) {
        this.payCnaps = payCnaps == null ? null : payCnaps.trim();
    }

    public String getWdAccSelect() {
        return wdAccSelect;
    }

    public void setWdAccSelect(String wdAccSelect) {
        this.wdAccSelect = wdAccSelect == null ? null : wdAccSelect.trim();
    }

    public String getWdChannelSelect() {
        return wdChannelSelect;
    }

    public void setWdChannelSelect(String wdChannelSelect) {
        this.wdChannelSelect = wdChannelSelect == null ? null : wdChannelSelect.trim();
    }

    public String getSourceSerial() {
        return sourceSerial;
    }

    public void setSourceSerial(String sourceSerial) {
        this.sourceSerial = sourceSerial == null ? null : sourceSerial.trim();
    }
}