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
public class Ib extends Model<Ib> {

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

    private Boolean ap;

    private Boolean aq;

    private Boolean ar;

    //面瘫有
    @TableField("[as]")
    private Boolean mty;

    private Boolean at;

    private Boolean au;

    private Boolean av;

    private Boolean aw;

    private Boolean ax;

    private Boolean av1;

    private String aw1;

    private String ay;

    private String az;

    private Double ba;

    private Double ba1;

    private Integer bb;

    private Integer bc;

    private Integer bc1;

    private Integer bd;

    private Integer bd1;

    private Integer be;

    private Integer be1;

    private Integer bf;

    private Integer bg;

    private Boolean bh;

    private Boolean bi;

    private Boolean bj;

    private Boolean bk;

    private Boolean bl;

    private Boolean bm;

    private Boolean bn;

    private String bo;

    private Integer bp;

    private String bq;

    private String br;

    private Integer bs;

    private String bt;

    private String bu;

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

    public Boolean getAp() {
        return ap;
    }

    public void setAp(Boolean ap) {
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

    public Boolean getMty() {
        return mty;
    }

    public void setMty(Boolean mty) {
        this.mty = mty;
    }

    public Boolean getAt() {
        return at;
    }

    public void setAt(Boolean at) {
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

    public Boolean getAw() {
        return aw;
    }

    public void setAw(Boolean aw) {
        this.aw = aw;
    }

    public Boolean getAx() {
        return ax;
    }

    public void setAx(Boolean ax) {
        this.ax = ax;
    }

    public Boolean getAv1() {
        return av1;
    }

    public void setAv1(Boolean av1) {
        this.av1 = av1;
    }

    public String getAw1() {
        return aw1;
    }

    public void setAw1(String aw1) {
        this.aw1 = aw1;
    }

    public String getAy() {
        return ay;
    }

    public void setAy(String ay) {
        this.ay = ay;
    }

    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public Double getBa() {
        return ba;
    }

    public void setBa(Double ba) {
        this.ba = ba;
    }

    public Double getBa1() {
        return ba1;
    }

    public void setBa1(Double ba1) {
        this.ba1 = ba1;
    }

    public Integer getBb() {
        return bb;
    }

    public void setBb(Integer bb) {
        this.bb = bb;
    }

    public Integer getBc() {
        return bc;
    }

    public void setBc(Integer bc) {
        this.bc = bc;
    }

    public Integer getBc1() {
        return bc1;
    }

    public void setBc1(Integer bc1) {
        this.bc1 = bc1;
    }

    public Integer getBd() {
        return bd;
    }

    public void setBd(Integer bd) {
        this.bd = bd;
    }

    public Integer getBd1() {
        return bd1;
    }

    public void setBd1(Integer bd1) {
        this.bd1 = bd1;
    }

    public Integer getBe() {
        return be;
    }

    public void setBe(Integer be) {
        this.be = be;
    }

    public Integer getBe1() {
        return be1;
    }

    public void setBe1(Integer be1) {
        this.be1 = be1;
    }

    public Integer getBf() {
        return bf;
    }

    public void setBf(Integer bf) {
        this.bf = bf;
    }

    public Integer getBg() {
        return bg;
    }

    public void setBg(Integer bg) {
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

    public Boolean getBm() {
        return bm;
    }

    public void setBm(Boolean bm) {
        this.bm = bm;
    }

    public Boolean getBn() {
        return bn;
    }

    public void setBn(Boolean bn) {
        this.bn = bn;
    }

    public String getBo() {
        return bo;
    }

    public void setBo(String bo) {
        this.bo = bo;
    }

    public Integer getBp() {
        return bp;
    }

    public void setBp(Integer bp) {
        this.bp = bp;
    }

    public String getBq() {
        return bq;
    }

    public void setBq(String bq) {
        this.bq = bq;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public Integer getBs() {
        return bs;
    }

    public void setBs(Integer bs) {
        this.bs = bs;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public String getBu() {
        return bu;
    }

    public void setBu(String bu) {
        this.bu = bu;
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
