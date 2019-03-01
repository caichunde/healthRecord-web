package com.dchb.model.mrhp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 住院病案首页(电子病历)
 * </p>
 *
 * @author caichunde
 * @since 2018-11-29
 */
public class EmrIch extends Model<EmrIch> {

    private static final long serialVersionUID = 1L;

    /**
     * 内码
     */
    @TableId(value = "ID", type = IdType.UUID)
    private String id;

    /**
     * 病案首页类型代码
     */
    private String homeTypeCode;

    /**
     * 病案首页类型
     */
    private String homeTypeName;

    /**
     * 医院组织机构代码
     */
    private String orgCode;

    /**
     * 医疗机构名称
     */
    private String orgName;

    /**
     * 住院次数(次)
     */
    private Double inpatientTimes;

    /**
     * 医疗付费方式代码
     */
    private String chargeModeCode;

    /**
     * 医疗付费方式
     */
    private String chargeModeName;

    /**
     * 住院总费用
     */
    private Double totalAmount;

    /**
     * 病案号
     */
    private String caseNum;

    /**
     * 住院号
     */
    private String admissionNum;

    /**
     * 本次住院标识号
     */
    private String admissionId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别代码
     */
    private String sexCode;

    /**
     * 性别
     */
    private String sexName;

    /**
     * 出生日期
     */
    private String bornDate;

    /**
     * 年龄（岁）
     */
    private Double age;

    /**
     * 年龄（月）
     */
    private Double ageMonth;

    /**
     * 年龄（天）
     */
    private Double ageDay;

    /**
     * 年龄（小时）
     */
    private Double ageHour;

    /**
     * 婚姻状况代码
     */
    private String maritalStatusCode;

    /**
     * 婚姻状况
     */
    private String maritalStatusName;

    /**
     * 职业代码
     */
    private String occupationCode;

    /**
     * 职业
     */
    private String occupationName;

    /**
     * 民族代码
     */
    private String nationCode;

    /**
     * 民族
     */
    private String nationName;

    /**
     * 国籍代码
     */
    private String countryCode;

    /**
     * 国籍
     */
    private String countryName;

    /**
     * 身份证件类别
     */
    private String idType;

    /**
     * 身份证件号码
     */
    private String idNum;

    /**
     * 工作单位名称
     */
    private String workingOrg;

    /**
     * 电话号码
     */
    private String tel;

    /**
     * 联系人电话号码
     */
    private String linkmanTel;

    /**
     * 工作单位电话号码
     */
    private String workTel;

    /**
     * 出生地址-省（自治区、直辖市）
     */
    private String bornAddressProvince;

    /**
     * 出生地址-市（地区）
     */
    private String bornAddressCity;

    /**
     * 出生地址-县（区）
     */
    private String bornAddressCounty;

    /**
     * 现住址-省（自治区、直辖市）
     */
    private String currentAddressProvince;

    /**
     * 现住址-市（地区）
     */
    private String currentAddressCity;

    /**
     * 现住址-县（区）
     */
    private String currentAddressCounty;

    /**
     * 现住址-乡（镇、街道办事处）
     */
    private String currentAddressTown;

    /**
     * 现住址-村（街、路、弄等）
     */
    private String currentAddressVillage;

    /**
     * 现住址-门牌号码
     */
    private String currentAddressHn;

    /**
     * 现住址-邮政编码
     */
    private String currentAddressZp;

    /**
     * 户口地址-省（自治区、直辖市）
     */
    private String hraAddressProvince;

    /**
     * 户口地址-市（地区）
     */
    private String hraAddressCity;

    /**
     * 户口地址-县（区）
     */
    private String hraAddressCounty;

    /**
     * 户口地址-乡（镇、街道办事处）
     */
    private String hraAddressTown;

    /**
     * 户口地址-村（街、路、弄等）
     */
    private String hraAddressVillage;

    /**
     * 户口地址-门牌号码
     */
    private String hraAddressHn;

    /**
     * 户口地址-邮政编码
     */
    private String hraAddressZp;

    /**
     * 工作单位地址
     */
    private String workAddress;

    /**
     * 工作单位地址-邮政编码
     */
    private String workZp;

    /**
     * 联系人地址
     */
    private String linkmanAddress;

    /**
     * 联系人姓名
     */
    private String linkmanName;

    /**
     * 联系人与患者的关系代码
     */
    private String rbtContactCode;

    /**
     * 联系人与患者的关系
     */
    private String rbtContactName;

    /**
     * 入院日期
     */
    private String admissionDate;

    /**
     * 出院日期
     */
    private String dischargeDate;

    /**
     * 实际住院天数
     */
    private Double inpatientDay;

    /**
     * 损伤和中毒外部原因
     */
    private String injuryCause;

    /**
     * 病案质量代码
     */
    private String caseQualityCode;

    /**
     * 病案质量
     */
    private String caseQualityName;

    /**
     * 死亡患者尸检
     */
    private String isAutopsy;

    /**
     * ABO血型代码
     */
    private String bloodAboCode;

    /**
     * ABO血型
     */
    private String bloodAboName;

    /**
     * RH血型代码
     */
    private String bloodRhCode;

    /**
     * RH血型
     */
    private String bloodRhName;

    /**
     * 病案记录日期
     */
    private String recordDate;

    /**
     * 健康卡号
     */
    private String healthRecordCode;

    /**
     * 入院途径代码
     */
    private String admissionTypeCode;

    /**
     * 入院途径
     */
    private String admissionTypeName;

    /**
     * 新生儿出生体重
     */
    private Double birthBodyWeight;

    /**
     * 新生儿入院体重
     */
    private Double admissionBodyWeight;

    /**
     * 病理号
     */
    private String pathologyNum;

    /**
     * 药物过敏标志
     */
    private String isAllergy;

    /**
     * 离院方式代码
     */
    private String dischargeTypeCode;

    /**
     * 离院方式
     */
    private String dischargeTypeName;

    /**
     * 拟接收医疗机构名称
     */
    private String receiveOrgName;

    /**
     * 是否有出院31天内再住院计划
     */
    private String isReadmission;

    /**
     * 再住院目的
     */
    private String readmissionPurpose;

    /**
     * 入院前昏迷天数
     */
    private Double priorComaDays;

    /**
     * 入院前昏迷小时数
     */
    private Double priorComaHours;

    /**
     * 入院前昏迷分钟数
     */
    private Double priorComaMinutes;

    /**
     * 入院后昏迷天数
     */
    private Double afterComaDays;

    /**
     * 入院后昏迷小时数
     */
    private Double afterComaHours;

    /**
     * 入院后昏迷分钟数
     */
    private Double afterComaMinutes;

    /**
     * 质控日期
     */
    private String qcDate;

    /**
     * 治疗类别代码
     */
    private String treateTypeCode;

    /**
     * 治疗类别
     */
    private String treateTypeName;

    /**
     * 实施临床路径代码
     */
    private String pathwayTypeCode;

    /**
     * 实施临床路径
     */
    private String pathwayTypeName;

    /**
     * 使用医疗机构中药制剂
     */
    private String isUseHerb;

    /**
     * 使用中医诊疗设备
     */
    private String isUseEquip;

    /**
     * 使用中医诊疗技术
     */
    private String isUseTech;

    /**
     * 辨证施护
     */
    private String isDialectialNursing;

    /**
     * 住院总费用-自付金额
     */
    private Double totalAmountStp;

    /**
     * 住院患者抢救次数
     */
    private Double saveTimes;

    /**
     * 住院患者抢救成功次数
     */
    private Double saveSuccessTimes;

    /**
     * 死亡标识
     */
    private String isDeath;

    /**
     * 输液反应标志
     */
    private String infusionReactionMark;

    /**
     * 输血反应标志
     */
    private String btReactionMark;

    /**
     * 手术并发症标识
     */
    private String operationComplications;

    /**
     * 传染病标识
     */
    private String isInfection;

    /**
     * 传染病报告上报标识
     */
    private String isInfectionReport;

    /**
     * 危重标识
     */
    private String isCritical;

    /**
     * 急症标识
     */
    private String isEmergency;

    /**
     * 死亡日期时间
     */
    private String deathTime;

    /**
     * 死亡原因
     */
    private String deathCause;

    /**
     * 死亡根本原因诊断代码
     */
    private String rootDeathCode;

    /**
     * 感染次数
     */
    private Integer infectiousnessTimes;

    /**
     * 医疗保险号
     */
    private String insuranceNum;

    /**
     * 入院情况代码
     */
    private String inConditionCode;

    /**
     * 入院情况名称
     */
    private String inConditionName;

    /**
     * 输红细胞量(单位）
     */
    private Double redBloodCell;

    /**
     * 输血小板量(袋）
     */
    private Double platelet;

    /**
     * 输血浆量(ml)
     */
    private Double plasma;

    /**
     * 输全血量(ml)
     */
    private Double wholeBlood;

    /**
     * 输其它血制品量(ml)
     */
    private Double otherBlood;

    /**
     * 科主任代码
     */
    private String directorCode;

    /**
     * 科主任签名
     */
    private String directorName;

    /**
     * 主任（副主任）医师代码
     */
    private String chiefPhysicianCode;

    /**
     * 主任（副主任）医师签名
     */
    private String chiefPhysicianName;

    /**
     * 主治医师代码
     */
    private String attendingPhysicianCode;

    /**
     * 主治医师签名
     */
    private String attendingPhysicianName;

    /**
     * 住院医师代码
     */
    private String residentCode;

    /**
     * 住院医师签名
     */
    private String residentName;

    /**
     * 责任护士代码
     */
    private String nurseCode;

    /**
     * 责任护士签名
     */
    private String nurseName;

    /**
     * 进修医师代码
     */
    private String refresherDoctorsCode;

    /**
     * 进修医师签名
     */
    private String refresherDoctorsName;

    /**
     * 实习医师代码
     */
    private String internCode;

    /**
     * 实习医师签名
     */
    private String internName;

    /**
     * 编码员代码
     */
    private String coderCode;

    /**
     * 编码员签名
     */
    private String coderName;

    /**
     * 质控医师代码
     */
    private String qcdCode;

    /**
     * 质控医师签名
     */
    private String qcdName;

    /**
     * 质控护士代码
     */
    private String qcnCode;

    /**
     * 质控护士签名
     */
    private String qcnName;

    /**
     * 入院科别代码
     */
    private String depCode;

    /**
     * 入院科别
     */
    private String depName;

    /**
     * 入院病房
     */
    private String inWord;

    /**
     * 转科科别代码
     */
    private String tdepCode;

    /**
     * 转科科别
     */
    private String tdepName;

    /**
     * 出院科别代码
     */
    private String odepCode;

    /**
     * 出院科别
     */
    private String odepName;

    /**
     * 出院病房
     */
    private String outWord;

    /**
     * 个人内码
     */
    private String citizenId;

    /**
     * 活动发生时间
     */
    private String effectiveTime;

    /**
     * 卡片状态
     */
    private String status;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 所属行政区划
     */
    private String districtCode;

    /**
     * 交换类型
     */
    private String exchangeType;

    /**
     * 数据交换标识符
     */
    private String dei;

    /**
     * 节点标识符
     */
    private String nodeCode;

    /**
     * 院内病案标识码
     */
    private String caseId;

    /**
     * 病案所属机构编码
     */
    private String caseOrgCode;

    /**
     * 数据上传时间戳
     */
    private Date systemTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHomeTypeCode() {
        return homeTypeCode;
    }

    public void setHomeTypeCode(String homeTypeCode) {
        this.homeTypeCode = homeTypeCode;
    }

    public String getHomeTypeName() {
        return homeTypeName;
    }

    public void setHomeTypeName(String homeTypeName) {
        this.homeTypeName = homeTypeName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Double getInpatientTimes() {
        return inpatientTimes;
    }

    public void setInpatientTimes(Double inpatientTimes) {
        this.inpatientTimes = inpatientTimes;
    }

    public String getChargeModeCode() {
        return chargeModeCode;
    }

    public void setChargeModeCode(String chargeModeCode) {
        this.chargeModeCode = chargeModeCode;
    }

    public String getChargeModeName() {
        return chargeModeName;
    }

    public void setChargeModeName(String chargeModeName) {
        this.chargeModeName = chargeModeName;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public String getAdmissionNum() {
        return admissionNum;
    }

    public void setAdmissionNum(String admissionNum) {
        this.admissionNum = admissionNum;
    }

    public String getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(String admissionId) {
        this.admissionId = admissionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(Double ageMonth) {
        this.ageMonth = ageMonth;
    }

    public Double getAgeDay() {
        return ageDay;
    }

    public void setAgeDay(Double ageDay) {
        this.ageDay = ageDay;
    }

    public Double getAgeHour() {
        return ageHour;
    }

    public void setAgeHour(Double ageHour) {
        this.ageHour = ageHour;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    public String getMaritalStatusName() {
        return maritalStatusName;
    }

    public void setMaritalStatusName(String maritalStatusName) {
        this.maritalStatusName = maritalStatusName;
    }

    public String getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode;
    }

    public String getOccupationName() {
        return occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getWorkingOrg() {
        return workingOrg;
    }

    public void setWorkingOrg(String workingOrg) {
        this.workingOrg = workingOrg;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    public String getBornAddressProvince() {
        return bornAddressProvince;
    }

    public void setBornAddressProvince(String bornAddressProvince) {
        this.bornAddressProvince = bornAddressProvince;
    }

    public String getBornAddressCity() {
        return bornAddressCity;
    }

    public void setBornAddressCity(String bornAddressCity) {
        this.bornAddressCity = bornAddressCity;
    }

    public String getBornAddressCounty() {
        return bornAddressCounty;
    }

    public void setBornAddressCounty(String bornAddressCounty) {
        this.bornAddressCounty = bornAddressCounty;
    }

    public String getCurrentAddressProvince() {
        return currentAddressProvince;
    }

    public void setCurrentAddressProvince(String currentAddressProvince) {
        this.currentAddressProvince = currentAddressProvince;
    }

    public String getCurrentAddressCity() {
        return currentAddressCity;
    }

    public void setCurrentAddressCity(String currentAddressCity) {
        this.currentAddressCity = currentAddressCity;
    }

    public String getCurrentAddressCounty() {
        return currentAddressCounty;
    }

    public void setCurrentAddressCounty(String currentAddressCounty) {
        this.currentAddressCounty = currentAddressCounty;
    }

    public String getCurrentAddressTown() {
        return currentAddressTown;
    }

    public void setCurrentAddressTown(String currentAddressTown) {
        this.currentAddressTown = currentAddressTown;
    }

    public String getCurrentAddressVillage() {
        return currentAddressVillage;
    }

    public void setCurrentAddressVillage(String currentAddressVillage) {
        this.currentAddressVillage = currentAddressVillage;
    }

    public String getCurrentAddressHn() {
        return currentAddressHn;
    }

    public void setCurrentAddressHn(String currentAddressHn) {
        this.currentAddressHn = currentAddressHn;
    }

    public String getCurrentAddressZp() {
        return currentAddressZp;
    }

    public void setCurrentAddressZp(String currentAddressZp) {
        this.currentAddressZp = currentAddressZp;
    }

    public String getHraAddressProvince() {
        return hraAddressProvince;
    }

    public void setHraAddressProvince(String hraAddressProvince) {
        this.hraAddressProvince = hraAddressProvince;
    }

    public String getHraAddressCity() {
        return hraAddressCity;
    }

    public void setHraAddressCity(String hraAddressCity) {
        this.hraAddressCity = hraAddressCity;
    }

    public String getHraAddressCounty() {
        return hraAddressCounty;
    }

    public void setHraAddressCounty(String hraAddressCounty) {
        this.hraAddressCounty = hraAddressCounty;
    }

    public String getHraAddressTown() {
        return hraAddressTown;
    }

    public void setHraAddressTown(String hraAddressTown) {
        this.hraAddressTown = hraAddressTown;
    }

    public String getHraAddressVillage() {
        return hraAddressVillage;
    }

    public void setHraAddressVillage(String hraAddressVillage) {
        this.hraAddressVillage = hraAddressVillage;
    }

    public String getHraAddressHn() {
        return hraAddressHn;
    }

    public void setHraAddressHn(String hraAddressHn) {
        this.hraAddressHn = hraAddressHn;
    }

    public String getHraAddressZp() {
        return hraAddressZp;
    }

    public void setHraAddressZp(String hraAddressZp) {
        this.hraAddressZp = hraAddressZp;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getWorkZp() {
        return workZp;
    }

    public void setWorkZp(String workZp) {
        this.workZp = workZp;
    }

    public String getLinkmanAddress() {
        return linkmanAddress;
    }

    public void setLinkmanAddress(String linkmanAddress) {
        this.linkmanAddress = linkmanAddress;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    public String getRbtContactCode() {
        return rbtContactCode;
    }

    public void setRbtContactCode(String rbtContactCode) {
        this.rbtContactCode = rbtContactCode;
    }

    public String getRbtContactName() {
        return rbtContactName;
    }

    public void setRbtContactName(String rbtContactName) {
        this.rbtContactName = rbtContactName;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public Double getInpatientDay() {
        return inpatientDay;
    }

    public void setInpatientDay(Double inpatientDay) {
        this.inpatientDay = inpatientDay;
    }

    public String getInjuryCause() {
        return injuryCause;
    }

    public void setInjuryCause(String injuryCause) {
        this.injuryCause = injuryCause;
    }

    public String getCaseQualityCode() {
        return caseQualityCode;
    }

    public void setCaseQualityCode(String caseQualityCode) {
        this.caseQualityCode = caseQualityCode;
    }

    public String getCaseQualityName() {
        return caseQualityName;
    }

    public void setCaseQualityName(String caseQualityName) {
        this.caseQualityName = caseQualityName;
    }

    public String getIsAutopsy() {
        return isAutopsy;
    }

    public void setIsAutopsy(String isAutopsy) {
        this.isAutopsy = isAutopsy;
    }

    public String getBloodAboCode() {
        return bloodAboCode;
    }

    public void setBloodAboCode(String bloodAboCode) {
        this.bloodAboCode = bloodAboCode;
    }

    public String getBloodAboName() {
        return bloodAboName;
    }

    public void setBloodAboName(String bloodAboName) {
        this.bloodAboName = bloodAboName;
    }

    public String getBloodRhCode() {
        return bloodRhCode;
    }

    public void setBloodRhCode(String bloodRhCode) {
        this.bloodRhCode = bloodRhCode;
    }

    public String getBloodRhName() {
        return bloodRhName;
    }

    public void setBloodRhName(String bloodRhName) {
        this.bloodRhName = bloodRhName;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getHealthRecordCode() {
        return healthRecordCode;
    }

    public void setHealthRecordCode(String healthRecordCode) {
        this.healthRecordCode = healthRecordCode;
    }

    public String getAdmissionTypeCode() {
        return admissionTypeCode;
    }

    public void setAdmissionTypeCode(String admissionTypeCode) {
        this.admissionTypeCode = admissionTypeCode;
    }

    public String getAdmissionTypeName() {
        return admissionTypeName;
    }

    public void setAdmissionTypeName(String admissionTypeName) {
        this.admissionTypeName = admissionTypeName;
    }

    public Double getBirthBodyWeight() {
        return birthBodyWeight;
    }

    public void setBirthBodyWeight(Double birthBodyWeight) {
        this.birthBodyWeight = birthBodyWeight;
    }

    public Double getAdmissionBodyWeight() {
        return admissionBodyWeight;
    }

    public void setAdmissionBodyWeight(Double admissionBodyWeight) {
        this.admissionBodyWeight = admissionBodyWeight;
    }

    public String getPathologyNum() {
        return pathologyNum;
    }

    public void setPathologyNum(String pathologyNum) {
        this.pathologyNum = pathologyNum;
    }

    public String getIsAllergy() {
        return isAllergy;
    }

    public void setIsAllergy(String isAllergy) {
        this.isAllergy = isAllergy;
    }

    public String getDischargeTypeCode() {
        return dischargeTypeCode;
    }

    public void setDischargeTypeCode(String dischargeTypeCode) {
        this.dischargeTypeCode = dischargeTypeCode;
    }

    public String getDischargeTypeName() {
        return dischargeTypeName;
    }

    public void setDischargeTypeName(String dischargeTypeName) {
        this.dischargeTypeName = dischargeTypeName;
    }

    public String getReceiveOrgName() {
        return receiveOrgName;
    }

    public void setReceiveOrgName(String receiveOrgName) {
        this.receiveOrgName = receiveOrgName;
    }

    public String getIsReadmission() {
        return isReadmission;
    }

    public void setIsReadmission(String isReadmission) {
        this.isReadmission = isReadmission;
    }

    public String getReadmissionPurpose() {
        return readmissionPurpose;
    }

    public void setReadmissionPurpose(String readmissionPurpose) {
        this.readmissionPurpose = readmissionPurpose;
    }

    public Double getPriorComaDays() {
        return priorComaDays;
    }

    public void setPriorComaDays(Double priorComaDays) {
        this.priorComaDays = priorComaDays;
    }

    public Double getPriorComaHours() {
        return priorComaHours;
    }

    public void setPriorComaHours(Double priorComaHours) {
        this.priorComaHours = priorComaHours;
    }

    public Double getPriorComaMinutes() {
        return priorComaMinutes;
    }

    public void setPriorComaMinutes(Double priorComaMinutes) {
        this.priorComaMinutes = priorComaMinutes;
    }

    public Double getAfterComaDays() {
        return afterComaDays;
    }

    public void setAfterComaDays(Double afterComaDays) {
        this.afterComaDays = afterComaDays;
    }

    public Double getAfterComaHours() {
        return afterComaHours;
    }

    public void setAfterComaHours(Double afterComaHours) {
        this.afterComaHours = afterComaHours;
    }

    public Double getAfterComaMinutes() {
        return afterComaMinutes;
    }

    public void setAfterComaMinutes(Double afterComaMinutes) {
        this.afterComaMinutes = afterComaMinutes;
    }

    public String getQcDate() {
        return qcDate;
    }

    public void setQcDate(String qcDate) {
        this.qcDate = qcDate;
    }

    public String getTreateTypeCode() {
        return treateTypeCode;
    }

    public void setTreateTypeCode(String treateTypeCode) {
        this.treateTypeCode = treateTypeCode;
    }

    public String getTreateTypeName() {
        return treateTypeName;
    }

    public void setTreateTypeName(String treateTypeName) {
        this.treateTypeName = treateTypeName;
    }

    public String getPathwayTypeCode() {
        return pathwayTypeCode;
    }

    public void setPathwayTypeCode(String pathwayTypeCode) {
        this.pathwayTypeCode = pathwayTypeCode;
    }

    public String getPathwayTypeName() {
        return pathwayTypeName;
    }

    public void setPathwayTypeName(String pathwayTypeName) {
        this.pathwayTypeName = pathwayTypeName;
    }

    public String getIsUseHerb() {
        return isUseHerb;
    }

    public void setIsUseHerb(String isUseHerb) {
        this.isUseHerb = isUseHerb;
    }

    public String getIsUseEquip() {
        return isUseEquip;
    }

    public void setIsUseEquip(String isUseEquip) {
        this.isUseEquip = isUseEquip;
    }

    public String getIsUseTech() {
        return isUseTech;
    }

    public void setIsUseTech(String isUseTech) {
        this.isUseTech = isUseTech;
    }

    public String getIsDialectialNursing() {
        return isDialectialNursing;
    }

    public void setIsDialectialNursing(String isDialectialNursing) {
        this.isDialectialNursing = isDialectialNursing;
    }

    public Double getTotalAmountStp() {
        return totalAmountStp;
    }

    public void setTotalAmountStp(Double totalAmountStp) {
        this.totalAmountStp = totalAmountStp;
    }

    public Double getSaveTimes() {
        return saveTimes;
    }

    public void setSaveTimes(Double saveTimes) {
        this.saveTimes = saveTimes;
    }

    public Double getSaveSuccessTimes() {
        return saveSuccessTimes;
    }

    public void setSaveSuccessTimes(Double saveSuccessTimes) {
        this.saveSuccessTimes = saveSuccessTimes;
    }

    public String getIsDeath() {
        return isDeath;
    }

    public void setIsDeath(String isDeath) {
        this.isDeath = isDeath;
    }

    public String getInfusionReactionMark() {
        return infusionReactionMark;
    }

    public void setInfusionReactionMark(String infusionReactionMark) {
        this.infusionReactionMark = infusionReactionMark;
    }

    public String getBtReactionMark() {
        return btReactionMark;
    }

    public void setBtReactionMark(String btReactionMark) {
        this.btReactionMark = btReactionMark;
    }

    public String getOperationComplications() {
        return operationComplications;
    }

    public void setOperationComplications(String operationComplications) {
        this.operationComplications = operationComplications;
    }

    public String getIsInfection() {
        return isInfection;
    }

    public void setIsInfection(String isInfection) {
        this.isInfection = isInfection;
    }

    public String getIsInfectionReport() {
        return isInfectionReport;
    }

    public void setIsInfectionReport(String isInfectionReport) {
        this.isInfectionReport = isInfectionReport;
    }

    public String getIsCritical() {
        return isCritical;
    }

    public void setIsCritical(String isCritical) {
        this.isCritical = isCritical;
    }

    public String getIsEmergency() {
        return isEmergency;
    }

    public void setIsEmergency(String isEmergency) {
        this.isEmergency = isEmergency;
    }

    public String getDeathTime() {
        return deathTime;
    }

    public void setDeathTime(String deathTime) {
        this.deathTime = deathTime;
    }

    public String getDeathCause() {
        return deathCause;
    }

    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause;
    }

    public String getRootDeathCode() {
        return rootDeathCode;
    }

    public void setRootDeathCode(String rootDeathCode) {
        this.rootDeathCode = rootDeathCode;
    }

    public Integer getInfectiousnessTimes() {
        return infectiousnessTimes;
    }

    public void setInfectiousnessTimes(Integer infectiousnessTimes) {
        this.infectiousnessTimes = infectiousnessTimes;
    }

    public String getInsuranceNum() {
        return insuranceNum;
    }

    public void setInsuranceNum(String insuranceNum) {
        this.insuranceNum = insuranceNum;
    }

    public String getInConditionCode() {
        return inConditionCode;
    }

    public void setInConditionCode(String inConditionCode) {
        this.inConditionCode = inConditionCode;
    }

    public String getInConditionName() {
        return inConditionName;
    }

    public void setInConditionName(String inConditionName) {
        this.inConditionName = inConditionName;
    }

    public Double getRedBloodCell() {
        return redBloodCell;
    }

    public void setRedBloodCell(Double redBloodCell) {
        this.redBloodCell = redBloodCell;
    }

    public Double getPlatelet() {
        return platelet;
    }

    public void setPlatelet(Double platelet) {
        this.platelet = platelet;
    }

    public Double getPlasma() {
        return plasma;
    }

    public void setPlasma(Double plasma) {
        this.plasma = plasma;
    }

    public Double getWholeBlood() {
        return wholeBlood;
    }

    public void setWholeBlood(Double wholeBlood) {
        this.wholeBlood = wholeBlood;
    }

    public Double getOtherBlood() {
        return otherBlood;
    }

    public void setOtherBlood(Double otherBlood) {
        this.otherBlood = otherBlood;
    }

    public String getDirectorCode() {
        return directorCode;
    }

    public void setDirectorCode(String directorCode) {
        this.directorCode = directorCode;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getChiefPhysicianCode() {
        return chiefPhysicianCode;
    }

    public void setChiefPhysicianCode(String chiefPhysicianCode) {
        this.chiefPhysicianCode = chiefPhysicianCode;
    }

    public String getChiefPhysicianName() {
        return chiefPhysicianName;
    }

    public void setChiefPhysicianName(String chiefPhysicianName) {
        this.chiefPhysicianName = chiefPhysicianName;
    }

    public String getAttendingPhysicianCode() {
        return attendingPhysicianCode;
    }

    public void setAttendingPhysicianCode(String attendingPhysicianCode) {
        this.attendingPhysicianCode = attendingPhysicianCode;
    }

    public String getAttendingPhysicianName() {
        return attendingPhysicianName;
    }

    public void setAttendingPhysicianName(String attendingPhysicianName) {
        this.attendingPhysicianName = attendingPhysicianName;
    }

    public String getResidentCode() {
        return residentCode;
    }

    public void setResidentCode(String residentCode) {
        this.residentCode = residentCode;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getNurseCode() {
        return nurseCode;
    }

    public void setNurseCode(String nurseCode) {
        this.nurseCode = nurseCode;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getRefresherDoctorsCode() {
        return refresherDoctorsCode;
    }

    public void setRefresherDoctorsCode(String refresherDoctorsCode) {
        this.refresherDoctorsCode = refresherDoctorsCode;
    }

    public String getRefresherDoctorsName() {
        return refresherDoctorsName;
    }

    public void setRefresherDoctorsName(String refresherDoctorsName) {
        this.refresherDoctorsName = refresherDoctorsName;
    }

    public String getInternCode() {
        return internCode;
    }

    public void setInternCode(String internCode) {
        this.internCode = internCode;
    }

    public String getInternName() {
        return internName;
    }

    public void setInternName(String internName) {
        this.internName = internName;
    }

    public String getCoderCode() {
        return coderCode;
    }

    public void setCoderCode(String coderCode) {
        this.coderCode = coderCode;
    }

    public String getCoderName() {
        return coderName;
    }

    public void setCoderName(String coderName) {
        this.coderName = coderName;
    }

    public String getQcdCode() {
        return qcdCode;
    }

    public void setQcdCode(String qcdCode) {
        this.qcdCode = qcdCode;
    }

    public String getQcdName() {
        return qcdName;
    }

    public void setQcdName(String qcdName) {
        this.qcdName = qcdName;
    }

    public String getQcnCode() {
        return qcnCode;
    }

    public void setQcnCode(String qcnCode) {
        this.qcnCode = qcnCode;
    }

    public String getQcnName() {
        return qcnName;
    }

    public void setQcnName(String qcnName) {
        this.qcnName = qcnName;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getInWord() {
        return inWord;
    }

    public void setInWord(String inWord) {
        this.inWord = inWord;
    }

    public String getTdepCode() {
        return tdepCode;
    }

    public void setTdepCode(String tdepCode) {
        this.tdepCode = tdepCode;
    }

    public String getTdepName() {
        return tdepName;
    }

    public void setTdepName(String tdepName) {
        this.tdepName = tdepName;
    }

    public String getOdepCode() {
        return odepCode;
    }

    public void setOdepCode(String odepCode) {
        this.odepCode = odepCode;
    }

    public String getOdepName() {
        return odepName;
    }

    public void setOdepName(String odepName) {
        this.odepName = odepName;
    }

    public String getOutWord() {
        return outWord;
    }

    public void setOutWord(String outWord) {
        this.outWord = outWord;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
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

    public String getDei() {
        return dei;
    }

    public void setDei(String dei) {
        this.dei = dei;
    }

    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseOrgCode() {
        return caseOrgCode;
    }

    public void setCaseOrgCode(String caseOrgCode) {
        this.caseOrgCode = caseOrgCode;
    }

    public Date getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(Date systemTime) {
        this.systemTime = systemTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EmrIch{" +
        ", id=" + id +
        ", homeTypeCode=" + homeTypeCode +
        ", homeTypeName=" + homeTypeName +
        ", orgCode=" + orgCode +
        ", orgName=" + orgName +
        ", inpatientTimes=" + inpatientTimes +
        ", chargeModeCode=" + chargeModeCode +
        ", chargeModeName=" + chargeModeName +
        ", totalAmount=" + totalAmount +
        ", caseNum=" + caseNum +
        ", admissionNum=" + admissionNum +
        ", admissionId=" + admissionId +
        ", name=" + name +
        ", sexCode=" + sexCode +
        ", sexName=" + sexName +
        ", bornDate=" + bornDate +
        ", age=" + age +
        ", ageMonth=" + ageMonth +
        ", ageDay=" + ageDay +
        ", ageHour=" + ageHour +
        ", maritalStatusCode=" + maritalStatusCode +
        ", maritalStatusName=" + maritalStatusName +
        ", occupationCode=" + occupationCode +
        ", occupationName=" + occupationName +
        ", nationCode=" + nationCode +
        ", nationName=" + nationName +
        ", countryCode=" + countryCode +
        ", countryName=" + countryName +
        ", idType=" + idType +
        ", idNum=" + idNum +
        ", workingOrg=" + workingOrg +
        ", tel=" + tel +
        ", linkmanTel=" + linkmanTel +
        ", workTel=" + workTel +
        ", bornAddressProvince=" + bornAddressProvince +
        ", bornAddressCity=" + bornAddressCity +
        ", bornAddressCounty=" + bornAddressCounty +
        ", currentAddressProvince=" + currentAddressProvince +
        ", currentAddressCity=" + currentAddressCity +
        ", currentAddressCounty=" + currentAddressCounty +
        ", currentAddressTown=" + currentAddressTown +
        ", currentAddressVillage=" + currentAddressVillage +
        ", currentAddressHn=" + currentAddressHn +
        ", currentAddressZp=" + currentAddressZp +
        ", hraAddressProvince=" + hraAddressProvince +
        ", hraAddressCity=" + hraAddressCity +
        ", hraAddressCounty=" + hraAddressCounty +
        ", hraAddressTown=" + hraAddressTown +
        ", hraAddressVillage=" + hraAddressVillage +
        ", hraAddressHn=" + hraAddressHn +
        ", hraAddressZp=" + hraAddressZp +
        ", workAddress=" + workAddress +
        ", workZp=" + workZp +
        ", linkmanAddress=" + linkmanAddress +
        ", linkmanName=" + linkmanName +
        ", rbtContactCode=" + rbtContactCode +
        ", rbtContactName=" + rbtContactName +
        ", admissionDate=" + admissionDate +
        ", dischargeDate=" + dischargeDate +
        ", inpatientDay=" + inpatientDay +
        ", injuryCause=" + injuryCause +
        ", caseQualityCode=" + caseQualityCode +
        ", caseQualityName=" + caseQualityName +
        ", isAutopsy=" + isAutopsy +
        ", bloodAboCode=" + bloodAboCode +
        ", bloodAboName=" + bloodAboName +
        ", bloodRhCode=" + bloodRhCode +
        ", bloodRhName=" + bloodRhName +
        ", recordDate=" + recordDate +
        ", healthRecordCode=" + healthRecordCode +
        ", admissionTypeCode=" + admissionTypeCode +
        ", admissionTypeName=" + admissionTypeName +
        ", birthBodyWeight=" + birthBodyWeight +
        ", admissionBodyWeight=" + admissionBodyWeight +
        ", pathologyNum=" + pathologyNum +
        ", isAllergy=" + isAllergy +
        ", dischargeTypeCode=" + dischargeTypeCode +
        ", dischargeTypeName=" + dischargeTypeName +
        ", receiveOrgName=" + receiveOrgName +
        ", isReadmission=" + isReadmission +
        ", readmissionPurpose=" + readmissionPurpose +
        ", priorComaDays=" + priorComaDays +
        ", priorComaHours=" + priorComaHours +
        ", priorComaMinutes=" + priorComaMinutes +
        ", afterComaDays=" + afterComaDays +
        ", afterComaHours=" + afterComaHours +
        ", afterComaMinutes=" + afterComaMinutes +
        ", qcDate=" + qcDate +
        ", treateTypeCode=" + treateTypeCode +
        ", treateTypeName=" + treateTypeName +
        ", pathwayTypeCode=" + pathwayTypeCode +
        ", pathwayTypeName=" + pathwayTypeName +
        ", isUseHerb=" + isUseHerb +
        ", isUseEquip=" + isUseEquip +
        ", isUseTech=" + isUseTech +
        ", isDialectialNursing=" + isDialectialNursing +
        ", totalAmountStp=" + totalAmountStp +
        ", saveTimes=" + saveTimes +
        ", saveSuccessTimes=" + saveSuccessTimes +
        ", isDeath=" + isDeath +
        ", infusionReactionMark=" + infusionReactionMark +
        ", btReactionMark=" + btReactionMark +
        ", operationComplications=" + operationComplications +
        ", isInfection=" + isInfection +
        ", isInfectionReport=" + isInfectionReport +
        ", isCritical=" + isCritical +
        ", isEmergency=" + isEmergency +
        ", deathTime=" + deathTime +
        ", deathCause=" + deathCause +
        ", rootDeathCode=" + rootDeathCode +
        ", infectiousnessTimes=" + infectiousnessTimes +
        ", insuranceNum=" + insuranceNum +
        ", inConditionCode=" + inConditionCode +
        ", inConditionName=" + inConditionName +
        ", redBloodCell=" + redBloodCell +
        ", platelet=" + platelet +
        ", plasma=" + plasma +
        ", wholeBlood=" + wholeBlood +
        ", otherBlood=" + otherBlood +
        ", directorCode=" + directorCode +
        ", directorName=" + directorName +
        ", chiefPhysicianCode=" + chiefPhysicianCode +
        ", chiefPhysicianName=" + chiefPhysicianName +
        ", attendingPhysicianCode=" + attendingPhysicianCode +
        ", attendingPhysicianName=" + attendingPhysicianName +
        ", residentCode=" + residentCode +
        ", residentName=" + residentName +
        ", nurseCode=" + nurseCode +
        ", nurseName=" + nurseName +
        ", refresherDoctorsCode=" + refresherDoctorsCode +
        ", refresherDoctorsName=" + refresherDoctorsName +
        ", internCode=" + internCode +
        ", internName=" + internName +
        ", coderCode=" + coderCode +
        ", coderName=" + coderName +
        ", qcdCode=" + qcdCode +
        ", qcdName=" + qcdName +
        ", qcnCode=" + qcnCode +
        ", qcnName=" + qcnName +
        ", depCode=" + depCode +
        ", depName=" + depName +
        ", inWord=" + inWord +
        ", tdepCode=" + tdepCode +
        ", tdepName=" + tdepName +
        ", odepCode=" + odepCode +
        ", odepName=" + odepName +
        ", outWord=" + outWord +
        ", citizenId=" + citizenId +
        ", effectiveTime=" + effectiveTime +
        ", status=" + status +
        ", createdAt=" + createdAt +
        ", districtCode=" + districtCode +
        ", exchangeType=" + exchangeType +
        ", dei=" + dei +
        ", nodeCode=" + nodeCode +
        ", caseId=" + caseId +
        ", caseOrgCode=" + caseOrgCode +
        ", systemTime=" + systemTime +
        "}";
    }
}
