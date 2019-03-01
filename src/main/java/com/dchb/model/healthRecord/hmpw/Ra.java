package com.dchb.model.healthRecord.hmpw;

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
 * @since 2018-11-28
 */
public class Ra extends Model<Ra> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private String idcard;

    private String doctorid;

    private String aa;

    private String ab;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ac;

    private String ad;

    private String ae;

    private Double af;

    private Double ag;

    private Boolean ah;

    private Boolean ai;

    private String aj;

    private Boolean ak;

    private Boolean al;

    private String am;

    private Boolean an;

    private Boolean ao;

    private String ap;

    private Boolean aq;

    private Boolean ar;

    //伤口异常具体
    @TableField("[as]")
    private String skycjt;

    private String at;

    private Boolean au;

    private Boolean av;

    private String aw;

    private Boolean ax;

    private Boolean ay;

    private Boolean az;

    private Boolean ba;

    private String bb;

    private Boolean bc;

    private Boolean bd;

    private String bf;

    private String bg;

    private String bh;

    @TableField("RegionID")
    private String RegionID;

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

    @TableField("bCityTran")
    private Integer bCityTran;

    @TableField("bCanTran")
    private Boolean bCanTran;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bi;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bj;

    private Boolean bk;

    private Boolean bl;

    private String bm;

    private String bn;

    private String bo;

    private Boolean bp;

    private Boolean bq;

    private Boolean bc1;

    private Boolean br;


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

    public Date getAc() {
        return ac;
    }

    public void setAc(Date ac) {
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

    public Double getAf() {
        return af;
    }

    public void setAf(Double af) {
        this.af = af;
    }

    public Double getAg() {
        return ag;
    }

    public void setAg(Double ag) {
        this.ag = ag;
    }

    public Boolean getAh() {
        return ah;
    }

    public void setAh(Boolean ah) {
        this.ah = ah;
    }

    public Boolean getAi() {
        return ai;
    }

    public void setAi(Boolean ai) {
        this.ai = ai;
    }

    public String getAj() {
        return aj;
    }

    public void setAj(String aj) {
        this.aj = aj;
    }

    public Boolean getAk() {
        return ak;
    }

    public void setAk(Boolean ak) {
        this.ak = ak;
    }

    public Boolean getAl() {
        return al;
    }

    public void setAl(Boolean al) {
        this.al = al;
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public Boolean getAn() {
        return an;
    }

    public void setAn(Boolean an) {
        this.an = an;
    }

    public Boolean getAo() {
        return ao;
    }

    public void setAo(Boolean ao) {
        this.ao = ao;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public Boolean getAq() {
        return aq;
    }

    public void setAq(Boolean aq) {
        this.aq = aq;
    }

    public Boolean getAr() {
        return ar;
    }

    public void setAr(Boolean ar) {
        this.ar = ar;
    }

    public String getSkycjt() {
        return skycjt;
    }

    public void setSkycjt(String skycjt) {
        this.skycjt = skycjt;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public Boolean getAu() {
        return au;
    }

    public void setAu(Boolean au) {
        this.au = au;
    }

    public Boolean getAv() {
        return av;
    }

    public void setAv(Boolean av) {
        this.av = av;
    }

    public String getAw() {
        return aw;
    }

    public void setAw(String aw) {
        this.aw = aw;
    }

    public Boolean getAx() {
        return ax;
    }

    public void setAx(Boolean ax) {
        this.ax = ax;
    }

    public Boolean getAy() {
        return ay;
    }

    public void setAy(Boolean ay) {
        this.ay = ay;
    }

    public Boolean getAz() {
        return az;
    }

    public void setAz(Boolean az) {
        this.az = az;
    }

    public Boolean getBa() {
        return ba;
    }

    public void setBa(Boolean ba) {
        this.ba = ba;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public Boolean getBc() {
        return bc;
    }

    public void setBc(Boolean bc) {
        this.bc = bc;
    }

    public Boolean getBd() {
        return bd;
    }

    public void setBd(Boolean bd) {
        this.bd = bd;
    }

    public String getBf() {
        return bf;
    }

    public void setBf(String bf) {
        this.bf = bf;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getRegionID() {
        return RegionID;
    }

    public void setRegionID(String RegionID) {
        this.RegionID = RegionID;
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

    public Integer getbCityTran() {
        return bCityTran;
    }

    public void setbCityTran(Integer bCityTran) {
        this.bCityTran = bCityTran;
    }

    public Boolean getbCanTran() {
        return bCanTran;
    }

    public void setbCanTran(Boolean bCanTran) {
        this.bCanTran = bCanTran;
    }

    public Date getBi() {
        return bi;
    }

    public void setBi(Date bi) {
        this.bi = bi;
    }

    public Date getBj() {
        return bj;
    }

    public void setBj(Date bj) {
        this.bj = bj;
    }

    public Boolean getBk() {
        return bk;
    }

    public void setBk(Boolean bk) {
        this.bk = bk;
    }

    public Boolean getBl() {
        return bl;
    }

    public void setBl(Boolean bl) {
        this.bl = bl;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    public String getBn() {
        return bn;
    }

    public void setBn(String bn) {
        this.bn = bn;
    }

    public String getBo() {
        return bo;
    }

    public void setBo(String bo) {
        this.bo = bo;
    }

    public Boolean getBp() {
        return bp;
    }

    public void setBp(Boolean bp) {
        this.bp = bp;
    }

    public Boolean getBq() {
        return bq;
    }

    public void setBq(Boolean bq) {
        this.bq = bq;
    }

    public Boolean getBc1() {
        return bc1;
    }

    public void setBc1(Boolean bc1) {
        this.bc1 = bc1;
    }

    public Boolean getBr() {
        return br;
    }

    public void setBr(Boolean br) {
        this.br = br;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
