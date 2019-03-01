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
public class Ta extends Model<Ta> {

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

    private Boolean ag;

    private Boolean ah;

    private Boolean ai;

    private Boolean aj;

    private Boolean ak;

    private Boolean al;

    private Boolean am;

    private Boolean an;

    private String ao;

    private Integer ap;

    private Integer aq;

    private Double ar;

    //体重2
    @TableField("[as]")
    private Double tz2;

    private Float at;

    private Float au;

    private Integer av;

    private String aw;

    private Integer ax;

    private Integer ay;

    private Integer az;

    private Integer ba;

    private Integer bb;

    private Integer bc;

    private Boolean bd;

    private Boolean be;

    private Boolean bf;

    private Boolean bg;

    private Boolean bh;

    private Boolean bi;

    private String bj;

    private String bk;

    private Integer bl;

    private String bm;

    private String bn;

    private Integer bo;

    private String bp;

    private String bq;

    private Integer br;

    private String bs;

    private String bt;

    private Integer bu;

    private String bv;

    private String bw;

    private String bx;

    //下次随访日期
    @TableField("[by]")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date xcsfrq;

    private String bz;

    private Boolean ca;

    private Boolean cb;

    private Boolean cc;

    private Boolean cd;

    private Boolean ce;

    private Boolean cf;

    private Boolean cg;

    private Boolean ch;

    private Boolean ci;

    private Boolean cj;

    private Boolean ck;

    private String cl;

    private Boolean cm;

    private Boolean cn;

    private Boolean co;

    private Boolean cp;

    private Integer cq;

    private Integer cr;

    private Boolean cs;

    private String ct;

    private Boolean bnextvisited;

    @TableField("DtCreate")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date DtCreate;

    @TableField("RegionID")
    private String RegionID;

    @TableField("DtLastModi")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date DtLastModi;

    @TableField("EmptyNum")
    private Integer EmptyNum;

    @TableField("EmptyFeilds")
    private String EmptyFeilds;

    private Integer timesvist;

    @TableField("bCityTran")
    private Integer bCityTran;

    @TableField("bCanTran")
    private Boolean bCanTran;

    private Boolean cu;

    private Boolean cv;

    private Boolean cw;

    private String cx;

    private String cy;

    private Boolean cz;

    private Boolean da;

    private String db;

    private String dc;

    private Boolean dd;

    private String de;

    private String df;

    private String dg;

    private String dh;

    private String di;

    private String dj;

    private String dk;

    private String dl;

    private Integer dm;

    private Integer dn;

    private Integer doo;

    private Integer dp;

    private String dq;


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

    public String getAo() {
        return ao;
    }

    public void setAo(String ao) {
        this.ao = ao;
    }

    public Integer getAp() {
        return ap;
    }

    public void setAp(Integer ap) {
        this.ap = ap;
    }

    public Integer getAq() {
        return aq;
    }

    public void setAq(Integer aq) {
        this.aq = aq;
    }

    public Double getAr() {
        return ar;
    }

    public void setAr(Double ar) {
        this.ar = ar;
    }

    public Double getTz2() {
        return tz2;
    }

    public void setTz2(Double tz2) {
        this.tz2 = tz2;
    }

    public Float getAt() {
        return at;
    }

    public void setAt(Float at) {
        this.at = at;
    }

    public Float getAu() {
        return au;
    }

    public void setAu(Float au) {
        this.au = au;
    }

    public Integer getAv() {
        return av;
    }

    public void setAv(Integer av) {
        this.av = av;
    }

    public String getAw() {
        return aw;
    }

    public void setAw(String aw) {
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

    public Integer getAz() {
        return az;
    }

    public void setAz(Integer az) {
        this.az = az;
    }

    public Integer getBa() {
        return ba;
    }

    public void setBa(Integer ba) {
        this.ba = ba;
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

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    public String getBk() {
        return bk;
    }

    public void setBk(String bk) {
        this.bk = bk;
    }

    public Integer getBl() {
        return bl;
    }

    public void setBl(Integer bl) {
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

    public Integer getBu() {
        return bu;
    }

    public void setBu(Integer bu) {
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

    public Date getXcsfrq() {
        return xcsfrq;
    }

    public void setXcsfrq(Date xcsfrq) {
        this.xcsfrq = xcsfrq;
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

    public Boolean getCc() {
        return cc;
    }

    public void setCc(Boolean cc) {
        this.cc = cc;
    }

    public Boolean getCd() {
        return cd;
    }

    public void setCd(Boolean cd) {
        this.cd = cd;
    }

    public Boolean getCe() {
        return ce;
    }

    public void setCe(Boolean ce) {
        this.ce = ce;
    }

    public Boolean getCf() {
        return cf;
    }

    public void setCf(Boolean cf) {
        this.cf = cf;
    }

    public Boolean getCg() {
        return cg;
    }

    public void setCg(Boolean cg) {
        this.cg = cg;
    }

    public Boolean getCh() {
        return ch;
    }

    public void setCh(Boolean ch) {
        this.ch = ch;
    }

    public Boolean getCi() {
        return ci;
    }

    public void setCi(Boolean ci) {
        this.ci = ci;
    }

    public Boolean getCj() {
        return cj;
    }

    public void setCj(Boolean cj) {
        this.cj = cj;
    }

    public Boolean getCk() {
        return ck;
    }

    public void setCk(Boolean ck) {
        this.ck = ck;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    public Boolean getCm() {
        return cm;
    }

    public void setCm(Boolean cm) {
        this.cm = cm;
    }

    public Boolean getCn() {
        return cn;
    }

    public void setCn(Boolean cn) {
        this.cn = cn;
    }

    public Boolean getCo() {
        return co;
    }

    public void setCo(Boolean co) {
        this.co = co;
    }

    public Boolean getCp() {
        return cp;
    }

    public void setCp(Boolean cp) {
        this.cp = cp;
    }

    public Integer getCq() {
        return cq;
    }

    public void setCq(Integer cq) {
        this.cq = cq;
    }

    public Integer getCr() {
        return cr;
    }

    public void setCr(Integer cr) {
        this.cr = cr;
    }

    public Boolean getCs() {
        return cs;
    }

    public void setCs(Boolean cs) {
        this.cs = cs;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public Boolean getBnextvisited() {
        return bnextvisited;
    }

    public void setBnextvisited(Boolean bnextvisited) {
        this.bnextvisited = bnextvisited;
    }

    public Date getDtCreate() {
        return DtCreate;
    }

    public void setDtCreate(Date DtCreate) {
        this.DtCreate = DtCreate;
    }

    public String getRegionID() {
        return RegionID;
    }

    public void setRegionID(String RegionID) {
        this.RegionID = RegionID;
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

    public Integer getTimesvist() {
        return timesvist;
    }

    public void setTimesvist(Integer timesvist) {
        this.timesvist = timesvist;
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

    public Boolean getCu() {
        return cu;
    }

    public void setCu(Boolean cu) {
        this.cu = cu;
    }

    public Boolean getCv() {
        return cv;
    }

    public void setCv(Boolean cv) {
        this.cv = cv;
    }

    public Boolean getCw() {
        return cw;
    }

    public void setCw(Boolean cw) {
        this.cw = cw;
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    public String getCy() {
        return cy;
    }

    public void setCy(String cy) {
        this.cy = cy;
    }

    public Boolean getCz() {
        return cz;
    }

    public void setCz(Boolean cz) {
        this.cz = cz;
    }

    public Boolean getDa() {
        return da;
    }

    public void setDa(Boolean da) {
        this.da = da;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public Boolean getDd() {
        return dd;
    }

    public void setDd(Boolean dd) {
        this.dd = dd;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getDf() {
        return df;
    }

    public void setDf(String df) {
        this.df = df;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getDi() {
        return di;
    }

    public void setDi(String di) {
        this.di = di;
    }

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
    }

    public String getDk() {
        return dk;
    }

    public void setDk(String dk) {
        this.dk = dk;
    }

    public String getDl() {
        return dl;
    }

    public void setDl(String dl) {
        this.dl = dl;
    }

    public Integer getDm() {
        return dm;
    }

    public void setDm(Integer dm) {
        this.dm = dm;
    }

    public Integer getDn() {
        return dn;
    }

    public void setDn(Integer dn) {
        this.dn = dn;
    }

    public Integer getDoo() {
        return doo;
    }

    public void setDoo(Integer doo) {
        this.doo = doo;
    }

    public Integer getDp() {
        return dp;
    }

    public void setDp(Integer dp) {
        this.dp = dp;
    }

    public String getDq() {
        return dq;
    }

    public void setDq(String dq) {
        this.dq = dq;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
