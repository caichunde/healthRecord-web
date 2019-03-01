package com.dchb.model.person;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.dchb.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
public class Aa extends Model<Aa> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 家庭医生手机端暂时 不做插入
     */
    private String idcard;

    /**
     * 家庭医生手机端暂时 不做插入
     */
    private String doctorid;

    private String aa;

    private String ab;

    private String ac;

    private String ad;

    private String ae;

    private String af;

    private String ag;

    private String ah;

    private String ai;

    private String aj;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ak;

    /**
     * 啊手动阀
     */
    @TableField("IPType")
    private Integer IPType;

    @TableField("RegionId")
    private String RegionId;

    @TableField("DtCreate")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date DtCreate;

    @TableField("DtLastModi")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date DtLastModi;

    @TableField("EmptyNum")
    private Integer EmptyNum;

    @TableField("EmptyFeilds")
    private String EmptyFeilds;

    private String al;

    private String am;

    private String an;

    private String ao;

    private String ap;

    private String aq;

    private String ar;

    private String aso;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getAb() {
        return ab;
    }

    public void setAb(String ab) {
        this.ab = ab;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAe() {
        return ae;
    }

    public void setAe(String ae) {
        this.ae = ae;
    }

    public String getAf() {
        return af;
    }

    public void setAf(String af) {
        this.af = af;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getAi() {
        return ai;
    }

    public void setAi(String ai) {
        this.ai = ai;
    }

    public String getAj() {
        return aj;
    }

    public void setAj(String aj) {
        this.aj = aj;
    }

    public Date getAk() {
        return ak;
    }

    public void setAk(Date ak) {
        this.ak = ak;
    }

    public Integer getIPType() {
        return IPType;
    }

    public void setIPType(Integer IPType) {
        this.IPType = IPType;
    }

    public String getRegionId() {
        return RegionId;
    }

    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    public Date getDtCreate() {
        return DtCreate;
    }

    public void setDtCreate(Date DtCreate) {
        this.DtCreate = DtCreate;
    }

    public Date getDtLastModi() {
        return DtLastModi;
    }

    public void setDtLastModi(Date DtLastModi) {
        this.DtLastModi = DtLastModi;
    }

    public Integer getEmptyNum() {
        return EmptyNum;
    }

    public void setEmptyNum(Integer EmptyNum) {
        this.EmptyNum = EmptyNum;
    }

    public String getEmptyFeilds() {
        return EmptyFeilds;
    }

    public void setEmptyFeilds(String EmptyFeilds) {
        this.EmptyFeilds = EmptyFeilds;
    }

    public String getAl() {
        return al;
    }

    public void setAl(String al) {
        this.al = al;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getAn() {
        return an;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public String getAo() {
        return ao;
    }

    public void setAo(String ao) {
        this.ao = ao;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAq() {
        return aq;
    }

    public void setAq(String aq) {
        this.aq = aq;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getAso() {
        return aso;
    }

    public void setAso(String aso) {
        this.aso = aso;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Aa{" +
        ", id=" + id +
        ", idcard=" + idcard +
        ", doctorid=" + doctorid +
        ", aa=" + aa +
        ", ab=" + ab +
        ", ac=" + ac +
        ", ad=" + ad +
        ", ae=" + ae +
        ", af=" + af +
        ", ag=" + ag +
        ", ah=" + ah +
        ", ai=" + ai +
        ", aj=" + aj +
        ", ak=" + ak +
        ", IPType=" + IPType +
        ", RegionId=" + RegionId +
        ", DtCreate=" + DtCreate +
        ", DtLastModi=" + DtLastModi +
        ", EmptyNum=" + EmptyNum +
        ", EmptyFeilds=" + EmptyFeilds +
        ", al=" + al +
        ", am=" + am +
        ", an=" + an +
        ", ao=" + ao +
        ", ap=" + ap +
        ", aq=" + aq +
        ", ar=" + ar +
        ", aso=" + aso +
        "}";
    }
}
