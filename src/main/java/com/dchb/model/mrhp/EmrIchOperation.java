package com.dchb.model.mrhp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 住院病案首页-手术(电子病历)
 * </p>
 *
 * @author caichunde
 * @since 2018-11-29
 */
public class EmrIchOperation extends Model<EmrIchOperation> {

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
     * 手术/操作-代码
     */
    private String operationCode;

    /**
     * 手术/操作-名称
     */
    private String operationName;

    /**
     * 手术操作日期
     */
    private String operationDate;

    /**
     * 麻醉方法代码
     */
    private String anaesthesiaCode;

    /**
     * 麻醉方法
     */
    private String anaesthesiaName;

    /**
     * 切口愈合等级代码
     */
    private String healingGradeCode;

    /**
     * 切口愈合等级
     */
    private String healingGradeName;

    /**
     * 手术级别
     */
    private Double operationGrade;

    /**
     * 手术/操作-目标部位名称
     */
    private String operationBpName;

    /**
     * 手术/操作-目标部位代码
     */
    private String operationBpCode;

    /**
     * 手术切口类别代码
     */
    private String incisionCategory;

    /**
     * 手术者代码
     */
    private String surgeonCode;

    /**
     * 手术者姓名
     */
    private String surgeonName;

    /**
     * Ⅰ助代码
     */
    private String assistantFirCode;

    /**
     * Ⅰ助姓名
     */
    private String assistantFirName;

    /**
     * Ⅱ助代码
     */
    private String assistantSedCode;

    /**
     * Ⅱ助姓名
     */
    private String assistantSedName;

    /**
     * 麻醉医师代码
     */
    private String anesthesiaDocCode;

    /**
     * 麻醉医师姓名
     */
    private String anesthesiaDocName;

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

    public Double getSn() {
        return sn;
    }

    public void setSn(Double sn) {
        this.sn = sn;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public String getAnaesthesiaCode() {
        return anaesthesiaCode;
    }

    public void setAnaesthesiaCode(String anaesthesiaCode) {
        this.anaesthesiaCode = anaesthesiaCode;
    }

    public String getAnaesthesiaName() {
        return anaesthesiaName;
    }

    public void setAnaesthesiaName(String anaesthesiaName) {
        this.anaesthesiaName = anaesthesiaName;
    }

    public String getHealingGradeCode() {
        return healingGradeCode;
    }

    public void setHealingGradeCode(String healingGradeCode) {
        this.healingGradeCode = healingGradeCode;
    }

    public String getHealingGradeName() {
        return healingGradeName;
    }

    public void setHealingGradeName(String healingGradeName) {
        this.healingGradeName = healingGradeName;
    }

    public Double getOperationGrade() {
        return operationGrade;
    }

    public void setOperationGrade(Double operationGrade) {
        this.operationGrade = operationGrade;
    }

    public String getOperationBpName() {
        return operationBpName;
    }

    public void setOperationBpName(String operationBpName) {
        this.operationBpName = operationBpName;
    }

    public String getOperationBpCode() {
        return operationBpCode;
    }

    public void setOperationBpCode(String operationBpCode) {
        this.operationBpCode = operationBpCode;
    }

    public String getIncisionCategory() {
        return incisionCategory;
    }

    public void setIncisionCategory(String incisionCategory) {
        this.incisionCategory = incisionCategory;
    }

    public String getSurgeonCode() {
        return surgeonCode;
    }

    public void setSurgeonCode(String surgeonCode) {
        this.surgeonCode = surgeonCode;
    }

    public String getSurgeonName() {
        return surgeonName;
    }

    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName;
    }

    public String getAssistantFirCode() {
        return assistantFirCode;
    }

    public void setAssistantFirCode(String assistantFirCode) {
        this.assistantFirCode = assistantFirCode;
    }

    public String getAssistantFirName() {
        return assistantFirName;
    }

    public void setAssistantFirName(String assistantFirName) {
        this.assistantFirName = assistantFirName;
    }

    public String getAssistantSedCode() {
        return assistantSedCode;
    }

    public void setAssistantSedCode(String assistantSedCode) {
        this.assistantSedCode = assistantSedCode;
    }

    public String getAssistantSedName() {
        return assistantSedName;
    }

    public void setAssistantSedName(String assistantSedName) {
        this.assistantSedName = assistantSedName;
    }

    public String getAnesthesiaDocCode() {
        return anesthesiaDocCode;
    }

    public void setAnesthesiaDocCode(String anesthesiaDocCode) {
        this.anesthesiaDocCode = anesthesiaDocCode;
    }

    public String getAnesthesiaDocName() {
        return anesthesiaDocName;
    }

    public void setAnesthesiaDocName(String anesthesiaDocName) {
        this.anesthesiaDocName = anesthesiaDocName;
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
        return "EmrIchOperation{" +
        ", id=" + id +
        ", ichId=" + ichId +
        ", sn=" + sn +
        ", operationCode=" + operationCode +
        ", operationName=" + operationName +
        ", operationDate=" + operationDate +
        ", anaesthesiaCode=" + anaesthesiaCode +
        ", anaesthesiaName=" + anaesthesiaName +
        ", healingGradeCode=" + healingGradeCode +
        ", healingGradeName=" + healingGradeName +
        ", operationGrade=" + operationGrade +
        ", operationBpName=" + operationBpName +
        ", operationBpCode=" + operationBpCode +
        ", incisionCategory=" + incisionCategory +
        ", surgeonCode=" + surgeonCode +
        ", surgeonName=" + surgeonName +
        ", assistantFirCode=" + assistantFirCode +
        ", assistantFirName=" + assistantFirName +
        ", assistantSedCode=" + assistantSedCode +
        ", assistantSedName=" + assistantSedName +
        ", anesthesiaDocCode=" + anesthesiaDocCode +
        ", anesthesiaDocName=" + anesthesiaDocName +
        ", createdAt=" + createdAt +
        ", districtCode=" + districtCode +
        ", exchangeType=" + exchangeType +
        ", systemTime=" + systemTime +
        "}";
    }
}
