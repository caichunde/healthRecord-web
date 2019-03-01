package com.dchb.model.user;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.dchb.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author caichunde
 * @since 2018-11-29
 */
@TableName("emr_user")
public class EmrUser extends Model<EmrUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "YHID")
    private String yhid;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 身份证号码
     */
    private String sfzhm;

    /**
     * 手机号码
     */
    private String sjhm;

    /**
     * 授权码
     */
    private String sqm;

    /**
     * 经办时间
     */
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date jbsj;

    /**
     * 备注
     */
    private String bz;


    public String getYhid() {
        return yhid;
    }

    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getSqm() {
        return sqm;
    }

    public void setSqm(String sqm) {
        this.sqm = sqm;
    }

    public Date getJbsj() {
        return jbsj;
    }

    public void setJbsj(Date jbsj) {
        this.jbsj = jbsj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    protected Serializable pkVal() {
        return this.yhid;
    }

}
