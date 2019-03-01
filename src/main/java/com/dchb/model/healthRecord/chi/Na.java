package com.dchb.model.healthRecord.chi;

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
public class Na extends Model<Na> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private String idcard;

    private String doctorid;

    private String aa;

    private String ab;

    private String ac;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ad;

    private String ae;

    private String af;

    private String ag;

    private String ah;

    private Boolean ai;

    private Boolean aj;

    private Integer ak;

    private Integer al;

    private Boolean am;

    private Boolean an;

    private Boolean ao;

    private Boolean ap;

    private Double aq;

    private String ar;

    //患病无
    @TableField("[as]")
    private Boolean hbw;

    private Boolean at;

    private Integer au;

    private Integer av;

    private Integer aw;

    private String ax;

    private Boolean ay;

    private Boolean az;

    private String ba;

    private String bb;

    private Boolean bc;

    private Boolean bd;

    private Boolean be;

    private Boolean bf;

    private Boolean bg;

    private String bh;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bi;

    private String bj;

    private Double bk;

    private Double bl;

    @TableField("sDemo")
    private String sDemo;

    private Boolean bnextvisited;

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

    @TableField("ErrorMsg")
    private String ErrorMsg;

    private Double bm;

    private String bn;

    private Boolean bo;

    private Boolean bp;

    private Boolean bq;

    private Boolean br;

    private Boolean fbq;

    private Boolean fbr;

    private String bs;

    private String bt;

    private String bu;

    private Boolean bv;

    private Boolean bw;

    private Boolean bx;

    private String byo;

    private String bz;

    private Boolean ca;

    private Boolean cb;

    private String cc;

    private String cd;

    private Boolean bq1;

    private Boolean br1;


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

    public Date getAd() {
        return ad;
    }

    public void setAd(Date ad) {
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

    public Integer getAk() {
        return ak;
    }

    public void setAk(Integer ak) {
        this.ak = ak;
    }

    public Integer getAl() {
        return al;
    }

    public void setAl(Integer al) {
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

    public Double getAq() {
        return aq;
    }

    public void setAq(Double aq) {
        this.aq = aq;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public Boolean getHbw() {
        return hbw;
    }

    public void setHbw(Boolean hbw) {
        this.hbw = hbw;
    }

    public Boolean getAt() {
        return at;
    }

    public void setAt(Boolean at) {
        this.at = at;
    }

    public Integer getAu() {
        return au;
    }

    public void setAu(Integer au) {
        this.au = au;
    }

    public Integer getAv() {
        return av;
    }

    public void setAv(Integer av) {
        this.av = av;
    }

    public Integer getAw() {
        return aw;
    }

    public void setAw(Integer aw) {
        this.aw = aw;
    }

    public String getAx() {
        return ax;
    }

    public void setAx(String ax) {
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

    public String getBa() {
        return ba;
    }

    public void setBa(String ba) {
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

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public Date getBi() {
        return bi;
    }

    public void setBi(Date bi) {
        this.bi = bi;
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    public Double getBk() {
        return bk;
    }

    public void setBk(Double bk) {
        this.bk = bk;
    }

    public Double getBl() {
        return bl;
    }

    public void setBl(Double bl) {
        this.bl = bl;
    }

    public String getsDemo() {
        return sDemo;
    }

    public void setsDemo(String sDemo) {
        this.sDemo = sDemo;
    }

    public Boolean getBnextvisited() {
        return bnextvisited;
    }

    public void setBnextvisited(Boolean bnextvisited) {
        this.bnextvisited = bnextvisited;
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

    public String getErrorMsg() {
        return ErrorMsg;
    }

    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public Double getBm() {
        return bm;
    }

    public void setBm(Double bm) {
        this.bm = bm;
    }

    public String getBn() {
        return bn;
    }

    public void setBn(String bn) {
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

    public Boolean getBr() {
        return br;
    }

    public void setBr(Boolean br) {
        this.br = br;
    }

    public Boolean getFbq() {
        return fbq;
    }

    public void setFbq(Boolean fbq) {
        this.fbq = fbq;
    }

    public Boolean getFbr() {
        return fbr;
    }

    public void setFbr(Boolean fbr) {
        this.fbr = fbr;
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

    public String getBu() {
        return bu;
    }

    public void setBu(String bu) {
        this.bu = bu;
    }

    public Boolean getBv() {
        return bv;
    }

    public void setBv(Boolean bv) {
        this.bv = bv;
    }

    public Boolean getBw() {
        return bw;
    }

    public void setBw(Boolean bw) {
        this.bw = bw;
    }

    public Boolean getBx() {
        return bx;
    }

    public void setBx(Boolean bx) {
        this.bx = bx;
    }

    public String getByo() {
        return byo;
    }

    public void setByo(String byo) {
        this.byo = byo;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Boolean getCa() {
        return ca;
    }

    public void setCa(Boolean ca) {
        this.ca = ca;
    }

    public Boolean getCb() {
        return cb;
    }

    public void setCb(Boolean cb) {
        this.cb = cb;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public Boolean getBq1() {
        return bq1;
    }

    public void setBq1(Boolean bq1) {
        this.bq1 = bq1;
    }

    public Boolean getBr1() {
        return br1;
    }

    public void setBr1(Boolean br1) {
        this.br1 = br1;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
