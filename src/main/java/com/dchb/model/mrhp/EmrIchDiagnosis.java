package com.dchb.model.mrhp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 住院病案首页-诊断(电子病历)
 * </p>
 *
 * @author caichunde
 * @since 2018-11-29
 */
public class EmrIchDiagnosis extends Model<EmrIchDiagnosis> {

    private static final long serialVersionUID = 1L;

    /**
     * 内码
     */
    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    /**
     * 病案首页内码
     */
    private String dcsId;

    /**
     * 序号
     */
    private Double sn;

    /**
     * 疾病诊断类型
     */
    private String diagnosisType;

    /**
     * 疾病编码
     */
    private String diseaseCode;

    /**
     * 疾病诊断名称
     */
    private String disease;

    /**
     * 中西医诊断标识
     */
    private String isCawmDiagnosis;

    /**
     * 确诊日期
     */
    private String diagnosisDate;

    /**
     * 入院病情
     */
    private String admissionCondition;

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

    public String getDcsId() {
        return dcsId;
    }

    public void setDcsId(String dcsId) {
        this.dcsId = dcsId;
    }

    public Double getSn() {
        return sn;
    }

    public void setSn(Double sn) {
        this.sn = sn;
    }

    public String getDiagnosisType() {
        return diagnosisType;
    }

    public void setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getIsCawmDiagnosis() {
        return isCawmDiagnosis;
    }

    public void setIsCawmDiagnosis(String isCawmDiagnosis) {
        this.isCawmDiagnosis = isCawmDiagnosis;
    }

    public String getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(String diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    public String getAdmissionCondition() {
        return admissionCondition;
    }

    public void setAdmissionCondition(String admissionCondition) {
        this.admissionCondition = admissionCondition;
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
        return "EmrIchDiagnosis{" +
        ", id=" + id +
        ", dcsId=" + dcsId +
        ", sn=" + sn +
        ", diagnosisType=" + diagnosisType +
        ", diseaseCode=" + diseaseCode +
        ", disease=" + disease +
        ", isCawmDiagnosis=" + isCawmDiagnosis +
        ", diagnosisDate=" + diagnosisDate +
        ", admissionCondition=" + admissionCondition +
        ", createdAt=" + createdAt +
        ", districtCode=" + districtCode +
        ", exchangeType=" + exchangeType +
        ", systemTime=" + systemTime +
        "}";
    }
}
