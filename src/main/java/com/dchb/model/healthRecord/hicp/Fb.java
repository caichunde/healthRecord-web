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
public class Fb extends Model<Fb> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private String idcard;

    private String doctorid;

    private String aa;

    private String ab;

    private String ac;

    private String ad;

    private String ae;

    private String af;

    private Boolean ag;

    private Boolean ah;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ai;

    private Integer aj;

    private String ak;

    private String al;

    private String am;

    private String an;

    private String ao;

    private String ap;

    private String aq;

    private String ar;

    //目前居住地址县
    @TableField("[as]")
    private String mqjzdzx;

    private String at;

    private String au;

    private String av;

    private Integer dt;

    private Boolean aw;

    private Boolean ax;

    private Boolean ay;

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

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bm;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bn;

    private Boolean bo;

    private Boolean bp;

    private Boolean bq;

    private Boolean bq1;

    private Boolean bq2;

    private Boolean bq3;

    private Boolean bq4;

    private Boolean bq5;

    private String br;

    private String bs;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bt;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bu;

    private String bv;

    private String bw;

    private String bx;

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

    @TableField("bCityTran")
    private Integer bCityTran;


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

    public Boolean getAg() {
        return ag;
    }

    public void setAg(Boolean ag) {
        this.ag = ag;
    }

    public Boolean getAh() {
        return ah;
    }

    public void setAh(Boolean ah) {
        this.ah = ah;
    }

    public Date getAi() {
        return ai;
    }

    public void setAi(Date ai) {
        this.ai = ai;
    }

    public Integer getAj() {
        return aj;
    }

    public void setAj(Integer aj) {
        this.aj = aj;
    }

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
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

    public String getMqjzdzx() {
        return mqjzdzx;
    }

    public void setMqjzdzx(String mqjzdzx) {
        this.mqjzdzx = mqjzdzx;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        this.au = au;
    }

    public String getAv() {
        return av;
    }

    public void setAv(String av) {
        this.av = av;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
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

    public Date getBm() {
        return bm;
    }

    public void setBm(Date bm) {
        this.bm = bm;
    }

    public Date getBn() {
        return bn;
    }

    public void setBn(Date bn) {
        this.bn = bn;
    }

    public Boolean getBo() {
        return bo;
    }

    public void setBo(Boolean bo) {
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

    public Boolean getBq1() {
        return bq1;
    }

    public void setBq1(Boolean bq1) {
        this.bq1 = bq1;
    }

    public Boolean getBq2() {
        return bq2;
    }

    public void setBq2(Boolean bq2) {
        this.bq2 = bq2;
    }

    public Boolean getBq3() {
        return bq3;
    }

    public void setBq3(Boolean bq3) {
        this.bq3 = bq3;
    }

    public Boolean getBq4() {
        return bq4;
    }

    public void setBq4(Boolean bq4) {
        this.bq4 = bq4;
    }

    public Boolean getBq5() {
        return bq5;
    }

    public void setBq5(Boolean bq5) {
        this.bq5 = bq5;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public Date getBt() {
        return bt;
    }

    public void setBt(Date bt) {
        this.bt = bt;
    }

    public Date getBu() {
        return bu;
    }

    public void setBu(Date bu) {
        this.bu = bu;
    }

    public String getBv() {
        return bv;
    }

    public void setBv(String bv) {
        this.bv = bv;
    }

    public String getBw() {
        return bw;
    }

    public void setBw(String bw) {
        this.bw = bw;
    }

    public String getBx() {
        return bx;
    }

    public void setBx(String bx) {
        this.bx = bx;
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

    public Integer getbCityTran() {
        return bCityTran;
    }

    public void setbCityTran(Integer bCityTran) {
        this.bCityTran = bCityTran;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
