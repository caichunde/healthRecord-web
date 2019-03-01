package com.dchb.model.mrhp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 住院病案首页-住院费用(电子病历)
 * </p>
 *
 * @author caichunde
 * @since 2018-11-29
 */
public class EmrIchCharge extends Model<EmrIchCharge> {

    private static final long serialVersionUID = 1L;

    /**
     * 内码
     */
    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    /**
     * 病案首页内码
     */
    private String ichId;

    /**
     * 住院费用-分类代码
     */
    private String chargeTypeCode;

    /**
     * 住院费用-分类
     */
    private String chargeType;

    /**
     * 住院费用-金额（元/人民币）
     */
    private Double chargeAmount;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 所属行政区划
     */
    private String districtCode;

    /**
     * 交换类型
     */
    private String exchangeType;

    /**
     * 数据上传时间戳
     */
    private LocalDateTime systemTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIchId() {
        return ichId;
    }

    public void setIchId(String ichId) {
        this.ichId = ichId;
    }

    public String getChargeTypeCode() {
        return chargeTypeCode;
    }

    public void setChargeTypeCode(String chargeTypeCode) {
        this.chargeTypeCode = chargeTypeCode;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public LocalDateTime getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(LocalDateTime systemTime) {
        this.systemTime = systemTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EmrIchCharge{" +
        ", id=" + id +
        ", ichId=" + ichId +
        ", chargeTypeCode=" + chargeTypeCode +
        ", chargeType=" + chargeType +
        ", chargeAmount=" + chargeAmount +
        ", createdAt=" + createdAt +
        ", districtCode=" + districtCode +
        ", exchangeType=" + exchangeType +
        ", systemTime=" + systemTime +
        "}";
    }
}
