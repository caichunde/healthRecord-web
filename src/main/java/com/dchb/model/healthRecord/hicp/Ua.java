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
public class Ua extends Model<Ua> {

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

    private Boolean ao;

    private String ap;

    private Integer aq;

    private Integer ar;

    //体重1
    @TableField("[as]")
    private Double tz1;

    private Double at;

    private Float au;

    private Float av;

    private Boolean aw;

    private Boolean ax;

    private String ay;

    private Integer az;

    private Integer ba;

    private Integer bb;

    private Integer bc;

    private Integer bd;

    private Integer be;

    private Integer bf;

    private Integer bg;

    private Integer bh;

    private Integer bi;

    private Boolean bj;

    private Boolean bk;

    private Boolean bl;

    private Boolean bm;

    private Boolean bn;

    private Boolean bo;

    private Double bp;

    private String bq;

    private Integer br;

    private String bs;

    private String bt;

    private Integer bu;

    private String bv;

    private String bw;

    private Integer bx;

    //药物3用量
    @TableField("[by]")
    private String yw3yl;

    private String bz;

    private Integer ca;

    private String cb;

    private String cc;

    private String cd;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ce;

    private String cf;

    private Integer cg;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ch;

    private String ci;

    private Boolean cj;

    private Boolean ck;

    private Boolean cl;

    private Boolean cm;

    private Boolean cn;

    private String co;

    private Boolean cp;

    private Boolean cq;

    private Boolean cr;

    private Boolean cs;

    private Boolean ct;

    private Boolean cu;

    private Boolean cv;

    private String cw;

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

    private Boolean cx;

    private Boolean cy;

    private Boolean cz;

    private Boolean da;

    private Boolean db;

    private String dc;

    private Integer dd;

    private String de;

    private String df;

    private Integer dg;

    private String dh;

    private String di;

    private Integer dj;

    private String dk;

    private String dl;

    private Integer dm;

    private String dn;

    //居民签名
    @TableField("[do]")
    private String jmqm;

    private String dp;

    private String dq;

    private String dr;

    private Boolean ds;

    private Boolean dt;

    private String du;


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

    public Integer getAq() {
        return aq;
    }

    public void setAq(Integer aq) {
        this.aq = aq;
    }

    public Integer getAr() {
        return ar;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public Double getTz1() {
        return tz1;
    }

    public void setTz1(Double tz1) {
        this.tz1 = tz1;
    }

    public Double getAt() {
        return at;
    }

    public void setAt(Double at) {
        this.at = at;
    }

    public Float getAu() {
        return au;
    }

    public void setAu(Float au) {
        this.au = au;
    }

    public Float getAv() {
        return av;
    }

    public void setAv(Float av) {
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

    public String getAy() {
        return ay;
    }

    public void setAy(String ay) {
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

    public Integer getBd() {
        return bd;
    }

    public void setBd(Integer bd) {
        this.bd = bd;
    }

    public Integer getBe() {
        return be;
    }

    public void setBe(Integer be) {
        this.be = be;
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

    public Integer getBh() {
        return bh;
    }

    public void setBh(Integer bh) {
        this.bh = bh;
    }

    public Integer getBi() {
        return bi;
    }

    public void setBi(Integer bi) {
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

    public Boolean getBo() {
        return bo;
    }

    public void setBo(Boolean bo) {
        this.bo = bo;
    }

    public Double getBp() {
        return bp;
    }

    public void setBp(Double bp) {
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

    public Integer getBx() {
        return bx;
    }

    public void setBx(Integer bx) {
        this.bx = bx;
    }

    public String getYw3yl() {
        return yw3yl;
    }

    public void setYw3yl(String yw3yl) {
        this.yw3yl = yw3yl;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Integer getCa() {
        return ca;
    }

    public void setCa(Integer ca) {
        this.ca = ca;
    }

    public String getCb() {
        return cb;
    }

    public void setCb(String cb) {
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

    public Date getCe() {
        return ce;
    }

    public void setCe(Date ce) {
        this.ce = ce;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public Integer getCg() {
        return cg;
    }

    public void setCg(Integer cg) {
        this.cg = cg;
    }

    public Date getCh() {
        return ch;
    }

    public void setCh(Date ch) {
        this.ch = ch;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
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

    public Boolean getCl() {
        return cl;
    }

    public void setCl(Boolean cl) {
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

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public Boolean getCp() {
        return cp;
    }

    public void setCp(Boolean cp) {
        this.cp = cp;
    }

    public Boolean getCq() {
        return cq;
    }

    public void setCq(Boolean cq) {
        this.cq = cq;
    }

    public Boolean getCr() {
        return cr;
    }

    public void setCr(Boolean cr) {
        this.cr = cr;
    }

    public Boolean getCs() {
        return cs;
    }

    public void setCs(Boolean cs) {
        this.cs = cs;
    }

    public Boolean getCt() {
        return ct;
    }

    public void setCt(Boolean ct) {
        this.ct = ct;
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

    public String getCw() {
        return cw;
    }

    public void setCw(String cw) {
        this.cw = cw;
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

    public Boolean getCx() {
        return cx;
    }

    public void setCx(Boolean cx) {
        this.cx = cx;
    }

    public Boolean getCy() {
        return cy;
    }

    public void setCy(Boolean cy) {
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

    public Boolean getDb() {
        return db;
    }

    public void setDb(Boolean db) {
        this.db = db;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public Integer getDd() {
        return dd;
    }

    public void setDd(Integer dd) {
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

    public Integer getDg() {
        return dg;
    }

    public void setDg(Integer dg) {
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

    public Integer getDj() {
        return dj;
    }

    public void setDj(Integer dj) {
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

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getJmqm() {
        return jmqm;
    }

    public void setJmqm(String jmqm) {
        this.jmqm = jmqm;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getDq() {
        return dq;
    }

    public void setDq(String dq) {
        this.dq = dq;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public Boolean getDs() {
        return ds;
    }

    public void setDs(Boolean ds) {
        this.ds = ds;
    }

    public Boolean getDt() {
        return dt;
    }

    public void setDt(Boolean dt) {
        this.dt = dt;
    }

    public String getDu() {
        return du;
    }

    public void setDu(String du) {
        this.du = du;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
