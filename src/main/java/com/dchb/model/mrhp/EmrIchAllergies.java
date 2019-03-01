package com.dchb.model.mrhp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 住院病案首页-过敏药物(电子病历)
 * </p>
 *
 * @author caichunde
 * @since 2018-11-29
 */
public class EmrIchAllergies extends Model<EmrIchAllergies> {

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
     * 序号
     */
    private Double sn;

    /**
     * 过敏药物名称
     */
    private String medicine;

    /**
     * 所属行政区划
     */
    private String districtCode;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

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

    public Double getSn() {
        return sn;
    }

    public void setSn(Double sn) {
        this.sn = sn;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
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
        return "EmrIchAllergies{" +
        ", id=" + id +
        ", ichId=" + ichId +
        ", sn=" + sn +
        ", medicine=" + medicine +
        ", districtCode=" + districtCode +
        ", createdAt=" + createdAt +
        ", exchangeType=" + exchangeType +
        ", systemTime=" + systemTime +
        "}";
    }
}
