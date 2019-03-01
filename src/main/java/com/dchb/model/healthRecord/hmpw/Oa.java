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
public class Oa extends Model<Oa> {

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

    private Integer af;

    private Integer ag;

    private Integer ah;

    private Integer ai;

    private Integer aj;

    @TableField("Ajd")
    private Integer Ajd;

    private Integer ak;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date al;

    private Boolean am;

    private Boolean an;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ao;

    private Boolean ap;

    private Boolean aq;

    private Boolean ar;

    //既往史有肾脏疾病
    @TableField("[as]")
    private Boolean jwsyszjb;

    private Boolean at;

    private Boolean au;

    private Boolean av;

    private Boolean aw;

    private Boolean ax;

    private String ay;

    private Boolean az;

    private Boolean ba;

    private Boolean bb;

    private String bc;

    private Boolean bd;

    private Boolean be;

    private Boolean bf;

    private Boolean bg;

    private Boolean bh;

    private Boolean bi;

    private String bj;

    private Boolean bk;

    private Boolean bl;

    private String bm;

    private Integer bn;

    private Integer bo;

    private Integer bp;

    private Integer bq;

    private Integer br;

    private Double bs;

    private Double bt;

    private Double bu;

    private Integer bv;

    private Integer bw;

    private Boolean bx;

    //听诊心脏异常
    @TableField("[by]")
    private Boolean tzxzjb;

    private String bz;

    private Boolean ca;

    private Boolean cb;

    private String cc;

    private Boolean cd;

    private Boolean ce;

    private String cf;

    private Boolean cg;

    private Boolean ch;

    private String ci;

    private Boolean cj;

    private Boolean ck;

    private String cl;

    private Boolean cm;

    private Boolean cn;

    private String co;

    private Boolean cp;

    private Boolean cq;

    private String cr;

    private Double cs;

    private Double ct;

    private Double cu;

    private String cv;

    private String cw;

    private String cx;

    private String cy;

    private String cz;

    private String da;

    private Boolean db;

    private Boolean dc;

    private Boolean dd;

    private Boolean de;

    private Boolean df;

    private Boolean dg;

    private Double dh;

    private Double di;

    private Double dj;

    private Double dk;

    private Double dl;

    private Double dm;

    private Double dn;

    //辅助检查肾功能血尿素氨
    @TableField("[do]")
    private Double fzjcsgnxnsa;

    private Boolean dp;

    private Boolean dq;

    private Boolean dr;

    private Boolean ds;

    private Boolean dt;

    private String du;

    private Boolean dv;

    private Boolean dw;

    private Boolean dx;

    private Boolean dy;

    private Boolean dz;

    private Boolean ea;

    private Boolean eb;

    private Boolean ec;

    private Boolean ed;

    private Boolean ee;

    private Boolean ef;

    private Boolean eg;

    private Boolean eh;

    private Boolean ei;

    private Boolean ej;

    private Boolean ek;

    private Boolean el;

    private Boolean em;

    private Boolean en;

    private String eo;

    private Boolean ep;

    private Boolean eq;

    private String er;

    private Boolean es;

    private Boolean et;

    private Boolean eu;

    private Boolean ev;

    private Boolean ew;

    private Boolean ex;

    private String ey;

    private Boolean ez;

    private Boolean fa;

    private String fb;

    private String fc;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date fd;

    private String fe;

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

    private Boolean ff;

    private Boolean fh;

    private Integer fg;

    private Boolean fi;

    private Boolean fj;

    private String fk;

    private String fl;

    private String fm;

    private Boolean fn;

    private Boolean fo;

    private String fp;

    private Boolean az0;

    private String fq;


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

    public Integer getAf() {
        return af;
    }

    public void setAf(Integer af) {
        this.af = af;
    }

    public Integer getAg() {
        return ag;
    }

    public void setAg(Integer ag) {
        this.ag = ag;
    }

    public Integer getAh() {
        return ah;
    }

    public void setAh(Integer ah) {
        this.ah = ah;
    }

    public Integer getAi() {
        return ai;
    }

    public void setAi(Integer ai) {
        this.ai = ai;
    }

    public Integer getAj() {
        return aj;
    }

    public void setAj(Integer aj) {
        this.aj = aj;
    }

    public Integer getAjd() {
        return Ajd;
    }

    public void setAjd(Integer Ajd) {
        this.Ajd = Ajd;
    }

    public Integer getAk() {
        return ak;
    }

    public void setAk(Integer ak) {
        this.ak = ak;
    }

    public Date getAl() {
        return al;
    }

    public void setAl(Date al) {
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

    public Date getAo() {
        return ao;
    }

    public void setAo(Date ao) {
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

    public Boolean getJwsyszjb() {
        return jwsyszjb;
    }

    public void setJwsyszjb(Boolean jwsyszjb) {
        this.jwsyszjb = jwsyszjb;
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

    public String getAy() {
        return ay;
    }

    public void setAy(String ay) {
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

    public String getBc() {
        return bc;
    }

    public void setBc(String bc) {
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

    public Integer getBn() {
        return bn;
    }

    public void setBn(Integer bn) {
        this.bn = bn;
    }

    public Integer getBo() {
        return bo;
    }

    public void setBo(Integer bo) {
        this.bo = bo;
    }

    public Integer getBp() {
        return bp;
    }

    public void setBp(Integer bp) {
        this.bp = bp;
    }

    public Integer getBq() {
        return bq;
    }

    public void setBq(Integer bq) {
        this.bq = bq;
    }

    public Integer getBr() {
        return br;
    }

    public void setBr(Integer br) {
        this.br = br;
    }

    public Double getBs() {
        return bs;
    }

    public void setBs(Double bs) {
        this.bs = bs;
    }

    public Double getBt() {
        return bt;
    }

    public void setBt(Double bt) {
        this.bt = bt;
    }

    public Double getBu() {
        return bu;
    }

    public void setBu(Double bu) {
        this.bu = bu;
    }

    public Integer getBv() {
        return bv;
    }

    public void setBv(Integer bv) {
        this.bv = bv;
    }

    public Integer getBw() {
        return bw;
    }

    public void setBw(Integer bw) {
        this.bw = bw;
    }

    public Boolean getBx() {
        return bx;
    }

    public void setBx(Boolean bx) {
        this.bx = bx;
    }

    public Boolean getTzxzjb() {
        return tzxzjb;
    }

    public void setTzxzjb(Boolean tzxzjb) {
        this.tzxzjb = tzxzjb;
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

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
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

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public Double getCs() {
        return cs;
    }

    public void setCs(Double cs) {
        this.cs = cs;
    }

    public Double getCt() {
        return ct;
    }

    public void setCt(Double ct) {
        this.ct = ct;
    }

    public Double getCu() {
        return cu;
    }

    public void setCu(Double cu) {
        this.cu = cu;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getCw() {
        return cw;
    }

    public void setCw(String cw) {
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

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public Boolean getDb() {
        return db;
    }

    public void setDb(Boolean db) {
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

    public Boolean getDe() {
        return de;
    }

    public void setDe(Boolean de) {
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

    public Double getDh() {
        return dh;
    }

    public void setDh(Double dh) {
        this.dh = dh;
    }

    public Double getDi() {
        return di;
    }

    public void setDi(Double di) {
        this.di = di;
    }

    public Double getDj() {
        return dj;
    }

    public void setDj(Double dj) {
        this.dj = dj;
    }

    public Double getDk() {
        return dk;
    }

    public void setDk(Double dk) {
        this.dk = dk;
    }

    public Double getDl() {
        return dl;
    }

    public void setDl(Double dl) {
        this.dl = dl;
    }

    public Double getDm() {
        return dm;
    }

    public void setDm(Double dm) {
        this.dm = dm;
    }

    public Double getDn() {
        return dn;
    }

    public void setDn(Double dn) {
        this.dn = dn;
    }

    public Double getFzjcsgnxnsa() {
        return fzjcsgnxnsa;
    }

    public void setFzjcsgnxnsa(Double fzjcsgnxnsa) {
        this.fzjcsgnxnsa = fzjcsgnxnsa;
    }

    public Boolean getDp() {
        return dp;
    }

    public void setDp(Boolean dp) {
        this.dp = dp;
    }

    public Boolean getDq() {
        return dq;
    }

    public void setDq(Boolean dq) {
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

    public Boolean getDy() {
        return dy;
    }

    public void setDy(Boolean dy) {
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

    public Boolean getEd() {
        return ed;
    }

    public void setEd(Boolean ed) {
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

    public Boolean getEg() {
        return eg;
    }

    public void setEg(Boolean eg) {
        this.eg = eg;
    }

    public Boolean getEh() {
        return eh;
    }

    public void setEh(Boolean eh) {
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

    public Boolean getEp() {
        return ep;
    }

    public void setEp(Boolean ep) {
        this.ep = ep;
    }

    public Boolean getEq() {
        return eq;
    }

    public void setEq(Boolean eq) {
        this.eq = eq;
    }

    public String getEr() {
        return er;
    }

    public void setEr(String er) {
        this.er = er;
    }

    public Boolean getEs() {
        return es;
    }

    public void setEs(Boolean es) {
        this.es = es;
    }

    public Boolean getEt() {
        return et;
    }

    public void setEt(Boolean et) {
        this.et = et;
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

    public Boolean getEw() {
        return ew;
    }

    public void setEw(Boolean ew) {
        this.ew = ew;
    }

    public Boolean getEx() {
        return ex;
    }

    public void setEx(Boolean ex) {
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

    public Date getFd() {
        return fd;
    }

    public void setFd(Date fd) {
        this.fd = fd;
    }

    public String getFe() {
        return fe;
    }

    public void setFe(String fe) {
        this.fe = fe;
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

    public Boolean getFf() {
        return ff;
    }

    public void setFf(Boolean ff) {
        this.ff = ff;
    }

    public Boolean getFh() {
        return fh;
    }

    public void setFh(Boolean fh) {
        this.fh = fh;
    }

    public Integer getFg() {
        return fg;
    }

    public void setFg(Integer fg) {
        this.fg = fg;
    }

    public Boolean getFi() {
        return fi;
    }

    public void setFi(Boolean fi) {
        this.fi = fi;
    }

    public Boolean getFj() {
        return fj;
    }

    public void setFj(Boolean fj) {
        this.fj = fj;
    }

    public String getFk() {
        return fk;
    }

    public void setFk(String fk) {
        this.fk = fk;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm;
    }

    public Boolean getFn() {
        return fn;
    }

    public void setFn(Boolean fn) {
        this.fn = fn;
    }

    public Boolean getFo() {
        return fo;
    }

    public void setFo(Boolean fo) {
        this.fo = fo;
    }

    public String getFp() {
        return fp;
    }

    public void setFp(String fp) {
        this.fp = fp;
    }

    public Boolean getAz0() {
        return az0;
    }

    public void setAz0(Boolean az0) {
        this.az0 = az0;
    }

    public String getFq() {
        return fq;
    }

    public void setFq(String fq) {
        this.fq = fq;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
