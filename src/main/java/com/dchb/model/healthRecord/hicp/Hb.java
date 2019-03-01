package com.dchb.model.healthRecord.hicp;

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
public class Hb extends Model<Hb> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private String idcard;

    private String doctorid;

    private String aa;

    private String ab;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ac;

    private Boolean ad;

    private Boolean ae;

    private Boolean af;

    private String ag;

    private Boolean ah;

    private Boolean ai;

    private Boolean aj;

    private Boolean ak;

    private Boolean al;

    private Boolean am;

    private Boolean an;

    private Boolean ao;

    private String ap;

    private String aq;

    private String ar;

    //体征体重
    @TableField("[as]")
    private Double tztz;

    private Double as2;

    private String at;

    private Integer au;

    private Integer au1;

    private Integer av;

    private Integer av1;

    private Integer aw;

    private Integer ax;

    private Integer ay;

    private Integer ay1;

    private Boolean az;

    private Boolean ba;

    private Boolean bb;

    private Boolean bc;

    private Boolean bd;

    private Boolean be;

    private Boolean bf;

    private Boolean bg;

    private Boolean bh;

    private Boolean bi;

    private Boolean bj;

    private Boolean bk;

    private Boolean bl;

    private String bm;

    private String bn;

    private Integer bo;

    private String bp;

    private String bq;

    private Integer br;

    private String bs;

    private String bt;

    @TableField("NextTime")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date NextTime;

    @TableField("RegionID")
    private String RegionID;

    @TableField("Dtcreate")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date Dtcreate;

    @TableField("DtlastModi")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date DtlastModi;

    @TableField("EmptyNum")
    private Integer EmptyNum;

    @TableField("EmptyFeilds")
    private String EmptyFeilds;


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

    public Boolean getAd() {
        return ad;
    }

    public void setAd(Boolean ad) {
        this.ad = ad;
    }

    public Boolean getAe() {
        return ae;
    }

    public void setAe(Boolean ae) {
        this.ae = ae;
    }

    public Boolean getAf() {
        return af;
    }

    public void setAf(Boolean af) {
        this.af = af;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
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

    public Boolean getAj() {
        return aj;
    }

    public void setAj(Boolean aj) {
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

    public Boolean getAm() {
        return am;
    }

    public void setAm(Boolean am) {
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

    public Double getTztz() {
        return tztz;
    }

    public void setTztz(Double tztz) {
        this.tztz = tztz;
    }

    public Double getAs2() {
        return as2;
    }

    public void setAs2(Double as2) {
        this.as2 = as2;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public Integer getAu() {
        return au;
    }

    public void setAu(Integer au) {
        this.au = au;
    }

    public Integer getAu1() {
        return au1;
    }

    public void setAu1(Integer au1) {
        this.au1 = au1;
    }

    public Integer getAv() {
        return av;
    }

    public void setAv(Integer av) {
        this.av = av;
    }

    public Integer getAv1() {
        return av1;
    }

    public void setAv1(Integer av1) {
        this.av1 = av1;
    }

    public Integer getAw() {
        return aw;
    }

    public void setAw(Integer aw) {
        this.aw = aw;
    }

    public Integer getAx() {
        return ax;
    }

    public void setAx(Integer ax) {
        this.ax = ax;
    }

    public Integer getAy() {
        return ay;
    }

    public void setAy(Integer ay) {
        this.ay = ay;
    }

    public Integer getAy1() {
        return ay1;
    }

    public void setAy1(Integer ay1) {
        this.ay1 = ay1;
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

    public Boolean getBb() {
        return bb;
    }

    public void setBb(Boolean bb) {
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

    public Boolean getBe() {
        return be;
    }

    public void setBe(Boolean be) {
        this.be = be;
    }

    public Boolean getBf() {
        return bf;
    }

    public void setBf(Boolean bf) {
        this.bf = bf;
    }

    public Boolean getBg() {
        return bg;
    }

    public void setBg(Boolean bg) {
        this.bg = bg;
    }

    public Boolean getBh() {
        return bh;
    }

    public void setBh(Boolean bh) {
        this.bh = bh;
    }

    public Boolean getBi() {
        return bi;
    }

    public void setBi(Boolean bi) {
        this.bi = bi;
    }

    public Boolean getBj() {
        return bj;
    }

    public void setBj(Boolean bj) {
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

    public Integer getBo() {
        return bo;
    }

    public void setBo(Integer bo) {
        this.bo = bo;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getBq() {
        return bq;
    }

    public void setBq(String bq) {
        this.bq = bq;
    }

    public Integer getBr() {
        return br;
    }

    public void setBr(Integer br) {
        this.br = br;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public Date getNextTime() {
        return NextTime;
    }

    public void setNextTime(Date NextTime) {
        this.NextTime = NextTime;
    }

    public String getRegionID() {
        return RegionID;
    }

    public void setRegionID(String RegionID) {
        this.RegionID = RegionID;
    }

    public Date getDtcreate() {
        return Dtcreate;
    }

    public void setDtcreate(Date Dtcreate) {
        this.Dtcreate = Dtcreate;
    }

    public Date getDtlastModi() {
        return DtlastModi;
    }

    public void setDtlastModi(Date DtlastModi) {
        this.DtlastModi = DtlastModi;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
