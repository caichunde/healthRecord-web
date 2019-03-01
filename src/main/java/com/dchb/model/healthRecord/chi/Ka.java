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
public class Ka extends Model<Ka> {

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

    private String ai;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date aj;

    private String ak;

    private String al;

    private String am;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date an;

    private String ao;

    private Boolean ap;

    private Boolean aq;

    private Boolean ar;

    //妊娠其他内容
    @TableField("[as]")
    private String rsqtnr;

    private String at;

    private Boolean au;

    private Boolean av;

    private Boolean aw;

    private Boolean ax;

    private Boolean ay;

    private Boolean az;

    private Boolean ba;

    private String bb;

    private Boolean bc;

    private Boolean bd;

    private Boolean be;

    private Boolean bf;

    private Boolean bg;

    private Boolean bh;

    private Boolean bi;

    private String bj;

    private String bk;

    private Boolean bl;

    private Boolean bm;

    private Boolean bn;

    private String bo;

    private Double bp;

    private Double bq;

    private Double br;

    private String bs;

    private Integer bt;

    private Integer bu;

    private String bv;

    private String bw;

    private Integer bx;

    //体温
    @TableField("[by]")
    private Float tw;

    private Integer bz;

    private Integer ca;

    private Boolean cb;

    private Boolean cc;

    private Boolean cd;

    private String ce;

    private String cf;

    private Double cg;

    private Double ch;

    private Boolean ci;

    private Boolean cj;

    private Boolean ck;

    private Boolean cl;

    private String cm;

    private Boolean cn;

    private Boolean co;

    private String cp;

    private Boolean cq;

    private Boolean cr;

    private String cs;

    private Boolean ct;

    private Boolean cu;

    private String cv;

    private Boolean cw;

    private Boolean cx;

    private String cy;

    private Boolean cz;

    private Boolean da;

    private String db;

    private Boolean dc;

    private Boolean dd;

    private String de;

    private Boolean df;

    private Boolean dg;

    private String dh;

    private Boolean di;

    private Boolean dj;

    private String dk;

    private Boolean dl;

    private Boolean dm;

    private String dn;

    //腹部触诊未异常
    @TableField("[do]")
    private Boolean fbczwyc;

    private Boolean dp;

    private String dq;

    private Boolean dr;

    private Boolean ds;

    private String dt;

    private Boolean du;

    private Boolean dv;

    private Boolean dw;

    private Boolean dx;

    private String dy;

    private Boolean dz;

    private Boolean ea;

    private Boolean eb;

    private Boolean ec;

    private String ed;

    private Boolean ee;

    private Boolean ef;

    private String eg;

    private String eh;

    private Boolean ei;

    private Boolean ej;

    private Boolean ek;

    private Boolean el;

    private Boolean em;

    private Boolean en;

    private String eo;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ep;

    private String eq;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date er;

    private String es;

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

    private Boolean et;

    @TableField("bCityTran")
    private Integer bCityTran;

    @TableField("ErrorMsg")
    private String ErrorMsg;

    private Boolean blw;

    private Boolean blj;

    private Boolean eu;

    private Boolean ev;

    private String ew;

    private String ex;

    private String ey;

    private Boolean ez;

    private Boolean fa;

    private String fb;

    private String fc;

    private Boolean fd;

    private Boolean fe;

    private String ff;

    private String fg;


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

    public String getAi() {
        return ai;
    }

    public void setAi(String ai) {
        this.ai = ai;
    }

    public Date getAj() {
        return aj;
    }

    public void setAj(Date aj) {
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

    public Date getAn() {
        return an;
    }

    public void setAn(Date an) {
        this.an = an;
    }

    public String getAo() {
        return ao;
    }

    public void setAo(String ao) {
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

    public String getRsqtnr() {
        return rsqtnr;
    }

    public void setRsqtnr(String rsqtnr) {
        this.rsqtnr = rsqtnr;
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

    public Double getBp() {
        return bp;
    }

    public void setBp(Double bp) {
        this.bp = bp;
    }

    public Double getBq() {
        return bq;
    }

    public void setBq(Double bq) {
        this.bq = bq;
    }

    public Double getBr() {
        return br;
    }

    public void setBr(Double br) {
        this.br = br;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public Integer getBt() {
        return bt;
    }

    public void setBt(Integer bt) {
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

    public Float getTw() {
        return tw;
    }

    public void setTw(Float tw) {
        this.tw = tw;
    }

    public Integer getBz() {
        return bz;
    }

    public void setBz(Integer bz) {
        this.bz = bz;
    }

    public Integer getCa() {
        return ca;
    }

    public void setCa(Integer ca) {
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

    public String getCe() {
        return ce;
    }

    public void setCe(String ce) {
        this.ce = ce;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public Double getCg() {
        return cg;
    }

    public void setCg(Double cg) {
        this.cg = cg;
    }

    public Double getCh() {
        return ch;
    }

    public void setCh(Double ch) {
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

    public Boolean getCl() {
        return cl;
    }

    public void setCl(Boolean cl) {
        this.cl = cl;
    }

    public String getCm() {
        return cm;
    }

    public void setCm(String cm) {
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

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
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

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
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

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public Boolean getCw() {
        return cw;
    }

    public void setCw(Boolean cw) {
        this.cw = cw;
    }

    public Boolean getCx() {
        return cx;
    }

    public void setCx(Boolean cx) {
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

    public Boolean getDc() {
        return dc;
    }

    public void setDc(Boolean dc) {
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

    public Boolean getDf() {
        return df;
    }

    public void setDf(Boolean df) {
        this.df = df;
    }

    public Boolean getDg() {
        return dg;
    }

    public void setDg(Boolean dg) {
        this.dg = dg;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public Boolean getDi() {
        return di;
    }

    public void setDi(Boolean di) {
        this.di = di;
    }

    public Boolean getDj() {
        return dj;
    }

    public void setDj(Boolean dj) {
        this.dj = dj;
    }

    public String getDk() {
        return dk;
    }

    public void setDk(String dk) {
        this.dk = dk;
    }

    public Boolean getDl() {
        return dl;
    }

    public void setDl(Boolean dl) {
        this.dl = dl;
    }

    public Boolean getDm() {
        return dm;
    }

    public void setDm(Boolean dm) {
        this.dm = dm;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public Boolean getFbczwyc() {
        return fbczwyc;
    }

    public void setFbczwyc(Boolean fbczwyc) {
        this.fbczwyc = fbczwyc;
    }

    public Boolean getDp() {
        return dp;
    }

    public void setDp(Boolean dp) {
        this.dp = dp;
    }

    public String getDq() {
        return dq;
    }

    public void setDq(String dq) {
        this.dq = dq;
    }

    public Boolean getDr() {
        return dr;
    }

    public void setDr(Boolean dr) {
        this.dr = dr;
    }

    public Boolean getDs() {
        return ds;
    }

    public void setDs(Boolean ds) {
        this.ds = ds;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Boolean getDu() {
        return du;
    }

    public void setDu(Boolean du) {
        this.du = du;
    }

    public Boolean getDv() {
        return dv;
    }

    public void setDv(Boolean dv) {
        this.dv = dv;
    }

    public Boolean getDw() {
        return dw;
    }

    public void setDw(Boolean dw) {
        this.dw = dw;
    }

    public Boolean getDx() {
        return dx;
    }

    public void setDx(Boolean dx) {
        this.dx = dx;
    }

    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public Boolean getDz() {
        return dz;
    }

    public void setDz(Boolean dz) {
        this.dz = dz;
    }

    public Boolean getEa() {
        return ea;
    }

    public void setEa(Boolean ea) {
        this.ea = ea;
    }

    public Boolean getEb() {
        return eb;
    }

    public void setEb(Boolean eb) {
        this.eb = eb;
    }

    public Boolean getEc() {
        return ec;
    }

    public void setEc(Boolean ec) {
        this.ec = ec;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public Boolean getEe() {
        return ee;
    }

    public void setEe(Boolean ee) {
        this.ee = ee;
    }

    public Boolean getEf() {
        return ef;
    }

    public void setEf(Boolean ef) {
        this.ef = ef;
    }

    public String getEg() {
        return eg;
    }

    public void setEg(String eg) {
        this.eg = eg;
    }

    public String getEh() {
        return eh;
    }

    public void setEh(String eh) {
        this.eh = eh;
    }

    public Boolean getEi() {
        return ei;
    }

    public void setEi(Boolean ei) {
        this.ei = ei;
    }

    public Boolean getEj() {
        return ej;
    }

    public void setEj(Boolean ej) {
        this.ej = ej;
    }

    public Boolean getEk() {
        return ek;
    }

    public void setEk(Boolean ek) {
        this.ek = ek;
    }

    public Boolean getEl() {
        return el;
    }

    public void setEl(Boolean el) {
        this.el = el;
    }

    public Boolean getEm() {
        return em;
    }

    public void setEm(Boolean em) {
        this.em = em;
    }

    public Boolean getEn() {
        return en;
    }

    public void setEn(Boolean en) {
        this.en = en;
    }

    public String getEo() {
        return eo;
    }

    public void setEo(String eo) {
        this.eo = eo;
    }

    public Date getEp() {
        return ep;
    }

    public void setEp(Date ep) {
        this.ep = ep;
    }

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

    public Date getEr() {
        return er;
    }

    public void setEr(Date er) {
        this.er = er;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
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

    public Boolean getEt() {
        return et;
    }

    public void setEt(Boolean et) {
        this.et = et;
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

    public Boolean getBlw() {
        return blw;
    }

    public void setBlw(Boolean blw) {
        this.blw = blw;
    }

    public Boolean getBlj() {
        return blj;
    }

    public void setBlj(Boolean blj) {
        this.blj = blj;
    }

    public Boolean getEu() {
        return eu;
    }

    public void setEu(Boolean eu) {
        this.eu = eu;
    }

    public Boolean getEv() {
        return ev;
    }

    public void setEv(Boolean ev) {
        this.ev = ev;
    }

    public String getEw() {
        return ew;
    }

    public void setEw(String ew) {
        this.ew = ew;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public String getEy() {
        return ey;
    }

    public void setEy(String ey) {
        this.ey = ey;
    }

    public Boolean getEz() {
        return ez;
    }

    public void setEz(Boolean ez) {
        this.ez = ez;
    }

    public Boolean getFa() {
        return fa;
    }

    public void setFa(Boolean fa) {
        this.fa = fa;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public Boolean getFd() {
        return fd;
    }

    public void setFd(Boolean fd) {
        this.fd = fd;
    }

    public Boolean getFe() {
        return fe;
    }

    public void setFe(Boolean fe) {
        this.fe = fe;
    }

    public String getFf() {
        return ff;
    }

    public void setFf(String ff) {
        this.ff = ff;
    }

    public String getFg() {
        return fg;
    }

    public void setFg(String fg) {
        this.fg = fg;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
