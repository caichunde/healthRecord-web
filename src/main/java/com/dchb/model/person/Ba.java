package com.dchb.model.person;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.dchb.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
public class Ba extends Model<Ba> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

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

    private String aj;

    private String ak;

    private String al;

    private String am;

    private String an;

    private String ao;

    private Boolean ap;

    private Boolean aq;

    private Boolean ar;

    //医疗费用支付方式4
    @TableField("[as]")
    private Boolean ylfyzffs4;

    private Boolean at;

    private Boolean au;

    private Boolean av;

    private Boolean aw;

    private String ax;

    private Boolean ay;

    private Boolean az;

    private String ba;

    private Boolean bb;

    private Boolean bc;

    private Boolean bd;

    private Boolean be;

    private Boolean bf;

    private Boolean bg;

    private String bh;

    private Boolean bi;

    private Boolean bj;

    private Boolean bk;

    private Boolean bl;

    private Boolean bm;

    private Boolean bn;

    private Boolean bo;

    private Boolean bp;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bq;

    private Boolean br;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bs;

    private Boolean bt;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bu;

    private Boolean bv;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bw;

    private Boolean bx;

    //既往史疾病有脑卒中时间
    @TableField("[by]")
    private Date jwsjbynczsj;

    private Boolean bz;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ca;

    private Boolean cb;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date cc;

    private Boolean cd;

    private Date ce;

    private Boolean cf;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date cg;

    private Boolean ch;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ci;

    private String cj;

    @TableField("Ck")
    private Boolean Ck;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date cl;

    private String cm;

    private Boolean cn;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date co;

    private String cp;

    private Boolean cq;

    private Boolean cr;

    private Boolean cs;

    private String ct;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date cu;

    private Boolean cv;

    private String cw;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date cx;

    private Boolean cy;

    private Boolean cz;

    private Boolean da;

    private String db;

    private Date dc;

    private Boolean dd;

    private String de;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date df;

    private Boolean dg;

    private Boolean dh;

    private Boolean di;

    private String dj;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date dk;

    private Boolean dl;

    private String dm;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date dn;

    //家族史父亲无
    @TableField("[do]")
    private Boolean jzsfqw;

    private Boolean dp;

    private Boolean dq;

    private Boolean dr;

    private Boolean ds;

    private Boolean dt;

    private Boolean du;

    private Boolean dv;

    private Boolean dw;

    private Boolean dx;

    private Boolean dy;

    private Boolean dz;

    private Boolean ea;

    private String eb;

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

    private Boolean eo;

    private String ep;

    private Boolean eq;

    private Boolean er;

    private Boolean es;

    private Boolean et;

    private Boolean eu;

    private Boolean ev;

    private Boolean ew;

    private Boolean ex;

    private Boolean ey;

    private Boolean ez;

    private Boolean fa;

    private Boolean fb;

    private Boolean fc;

    private String fd;

    private Boolean fe;

    private Boolean ff;

    private Boolean fg;

    private Boolean fh;

    private Boolean fi;

    private Boolean fj;

    private Boolean fk;

    private Boolean fl;

    private Boolean fm;

    private Boolean fn;

    private Boolean fo;

    private Boolean fp;

    private Boolean fq;

    private String fr;

    private Boolean fs;

    private Boolean ft;

    private String fu;

    private Boolean fv;

    private Boolean fw;

    private Boolean fx;

    private Boolean fy;

    private Boolean fz;

    private Boolean ga;

    private Boolean gb;

    private Boolean gc;

    private Boolean gd;

    private String ge;

    private String gf;

    private String gg;

    private String gh;

    private String gi;

    private String gj;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date gk;

    @TableField("IPType")
    private Integer IPType;

    @TableField("RegionId")
    private String RegionId;

    @TableField("Dtcreate")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date Dtcreate;

    @TableField("DtLastModi")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date DtLastModi;

    @TableField("DctLastModi")
    private String DctLastModi;

    @TableField("EmptyNum")
    private Integer EmptyNum;

    @TableField("EmptyFeilds")
    private String EmptyFeilds;

    @TableField("iDocstate")
    private Integer iDocstate;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date doccreate;

    @TableField("bCityTran")
    private Integer bCityTran;

    @TableField("bCanTran")
    private Boolean bCanTran;

    @TableField("iTNSendState")
    private Integer iTNSendState;

    @TableField("iGXYSendState")
    private Integer iGXYSendState;

    @TableField("ErrorMsg")
    private String ErrorMsg;

    private String gm;

    private String gn;

    private String go;

    private String gp;

    private String gq;

    private String gr;

    private Integer gs;

    private Boolean gt;

    private Boolean gu;

    private Boolean gv;

    private Boolean gw;

    private Boolean gx;

    private String gy;

    /**
     * 信息是否完整（手机端建档且PC端未完善则不完整为‘0'，PC端完善则为’1‘）
     */
    private String infocomplete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @JsonSerialize(using = JsonDateSerializer.class)
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

    public String getAj() {
        return aj;
    }

    public void setAj(String aj) {
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

    public Boolean getYlfyzffs4() {
        return ylfyzffs4;
    }

    public void setYlfyzffs4(Boolean ylfyzffs4) {
        this.ylfyzffs4 = ylfyzffs4;
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

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
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

    public Date getBq() {
        return bq;
    }

    public void setBq(Date bq) {
        this.bq = bq;
    }

    public Boolean getBr() {
        return br;
    }

    public void setBr(Boolean br) {
        this.br = br;
    }

    public Date getBs() {
        return bs;
    }

    public void setBs(Date bs) {
        this.bs = bs;
    }

    public Boolean getBt() {
        return bt;
    }

    public void setBt(Boolean bt) {
        this.bt = bt;
    }

    public Date getBu() {
        return bu;
    }

    public void setBu(Date bu) {
        this.bu = bu;
    }

    public Boolean getBv() {
        return bv;
    }

    public void setBv(Boolean bv) {
        this.bv = bv;
    }

    public Date getBw() {
        return bw;
    }

    public void setBw(Date bw) {
        this.bw = bw;
    }

    public Boolean getBx() {
        return bx;
    }

    public void setBx(Boolean bx) {
        this.bx = bx;
    }

    public Date getJwsjbynczsj() {
        return jwsjbynczsj;
    }

    public void setJwsjbynczsj(Date jwsjbynczsj) {
        this.jwsjbynczsj = jwsjbynczsj;
    }

    public Boolean getBz() {
        return bz;
    }

    public void setBz(Boolean bz) {
        this.bz = bz;
    }

    public Date getCa() {
        return ca;
    }

    public void setCa(Date ca) {
        this.ca = ca;
    }

    public Boolean getCb() {
        return cb;
    }

    public void setCb(Boolean cb) {
        this.cb = cb;
    }

    public Date getCc() {
        return cc;
    }

    public void setCc(Date cc) {
        this.cc = cc;
    }

    public Boolean getCd() {
        return cd;
    }

    public void setCd(Boolean cd) {
        this.cd = cd;
    }

    public Date getCe() {
        return ce;
    }

    public void setCe(Date ce) {
        this.ce = ce;
    }

    public Boolean getCf() {
        return cf;
    }

    public void setCf(Boolean cf) {
        this.cf = cf;
    }

    public Date getCg() {
        return cg;
    }

    public void setCg(Date cg) {
        this.cg = cg;
    }

    public Boolean getCh() {
        return ch;
    }

    public void setCh(Boolean ch) {
        this.ch = ch;
    }

    public Date getCi() {
        return ci;
    }

    public void setCi(Date ci) {
        this.ci = ci;
    }

    public String getCj() {
        return cj;
    }

    public void setCj(String cj) {
        this.cj = cj;
    }

    public Boolean getCk() {
        return Ck;
    }

    public void setCk(Boolean Ck) {
        this.Ck = Ck;
    }

    public Date getCl() {
        return cl;
    }

    public void setCl(Date cl) {
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

    public Date getCo() {
        return co;
    }

    public void setCo(Date co) {
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

    public Date getCu() {
        return cu;
    }

    public void setCu(Date cu) {
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

    public Date getCx() {
        return cx;
    }

    public void setCx(Date cx) {
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

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public Date getDc() {
        return dc;
    }

    public void setDc(Date dc) {
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

    public Date getDf() {
        return df;
    }

    public void setDf(Date df) {
        this.df = df;
    }

    public Boolean getDg() {
        return dg;
    }

    public void setDg(Boolean dg) {
        this.dg = dg;
    }

    public Boolean getDh() {
        return dh;
    }

    public void setDh(Boolean dh) {
        this.dh = dh;
    }

    public Boolean getDi() {
        return di;
    }

    public void setDi(Boolean di) {
        this.di = di;
    }

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
    }

    public Date getDk() {
        return dk;
    }

    public void setDk(Date dk) {
        this.dk = dk;
    }

    public Boolean getDl() {
        return dl;
    }

    public void setDl(Boolean dl) {
        this.dl = dl;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public Date getDn() {
        return dn;
    }

    public void setDn(Date dn) {
        this.dn = dn;
    }

    public Boolean getJzsfqw() {
        return jzsfqw;
    }

    public void setJzsfqw(Boolean jzsfqw) {
        this.jzsfqw = jzsfqw;
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

    public String getEb() {
        return eb;
    }

    public void setEb(String eb) {
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

    public Boolean getEo() {
        return eo;
    }

    public void setEo(Boolean eo) {
        this.eo = eo;
    }

    public String getEp() {
        return ep;
    }

    public void setEp(String ep) {
        this.ep = ep;
    }

    public Boolean getEq() {
        return eq;
    }

    public void setEq(Boolean eq) {
        this.eq = eq;
    }

    public Boolean getEr() {
        return er;
    }

    public void setEr(Boolean er) {
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

    public Boolean getEy() {
        return ey;
    }

    public void setEy(Boolean ey) {
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

    public Boolean getFb() {
        return fb;
    }

    public void setFb(Boolean fb) {
        this.fb = fb;
    }

    public Boolean getFc() {
        return fc;
    }

    public void setFc(Boolean fc) {
        this.fc = fc;
    }

    public String getFd() {
        return fd;
    }

    public void setFd(String fd) {
        this.fd = fd;
    }

    public Boolean getFe() {
        return fe;
    }

    public void setFe(Boolean fe) {
        this.fe = fe;
    }

    public Boolean getFf() {
        return ff;
    }

    public void setFf(Boolean ff) {
        this.ff = ff;
    }

    public Boolean getFg() {
        return fg;
    }

    public void setFg(Boolean fg) {
        this.fg = fg;
    }

    public Boolean getFh() {
        return fh;
    }

    public void setFh(Boolean fh) {
        this.fh = fh;
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

    public Boolean getFk() {
        return fk;
    }

    public void setFk(Boolean fk) {
        this.fk = fk;
    }

    public Boolean getFl() {
        return fl;
    }

    public void setFl(Boolean fl) {
        this.fl = fl;
    }

    public Boolean getFm() {
        return fm;
    }

    public void setFm(Boolean fm) {
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

    public Boolean getFp() {
        return fp;
    }

    public void setFp(Boolean fp) {
        this.fp = fp;
    }

    public Boolean getFq() {
        return fq;
    }

    public void setFq(Boolean fq) {
        this.fq = fq;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public Boolean getFs() {
        return fs;
    }

    public void setFs(Boolean fs) {
        this.fs = fs;
    }

    public Boolean getFt() {
        return ft;
    }

    public void setFt(Boolean ft) {
        this.ft = ft;
    }

    public String getFu() {
        return fu;
    }

    public void setFu(String fu) {
        this.fu = fu;
    }

    public Boolean getFv() {
        return fv;
    }

    public void setFv(Boolean fv) {
        this.fv = fv;
    }

    public Boolean getFw() {
        return fw;
    }

    public void setFw(Boolean fw) {
        this.fw = fw;
    }

    public Boolean getFx() {
        return fx;
    }

    public void setFx(Boolean fx) {
        this.fx = fx;
    }

    public Boolean getFy() {
        return fy;
    }

    public void setFy(Boolean fy) {
        this.fy = fy;
    }

    public Boolean getFz() {
        return fz;
    }

    public void setFz(Boolean fz) {
        this.fz = fz;
    }

    public Boolean getGa() {
        return ga;
    }

    public void setGa(Boolean ga) {
        this.ga = ga;
    }

    public Boolean getGb() {
        return gb;
    }

    public void setGb(Boolean gb) {
        this.gb = gb;
    }

    public Boolean getGc() {
        return gc;
    }

    public void setGc(Boolean gc) {
        this.gc = gc;
    }

    public Boolean getGd() {
        return gd;
    }

    public void setGd(Boolean gd) {
        this.gd = gd;
    }

    public String getGe() {
        return ge;
    }

    public void setGe(String ge) {
        this.ge = ge;
    }

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public String getGh() {
        return gh;
    }

    public void setGh(String gh) {
        this.gh = gh;
    }

    public String getGi() {
        return gi;
    }

    public void setGi(String gi) {
        this.gi = gi;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public Date getGk() {
        return gk;
    }

    public void setGk(Date gk) {
        this.gk = gk;
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

    public Date getDtcreate() {
        return Dtcreate;
    }

    public void setDtcreate(Date Dtcreate) {
        this.Dtcreate = Dtcreate;
    }

    public Date getDtLastModi() {
        return DtLastModi;
    }

    public void setDtLastModi(Date DtLastModi) {
        this.DtLastModi = DtLastModi;
    }

    public String getDctLastModi() {
        return DctLastModi;
    }

    public void setDctLastModi(String DctLastModi) {
        this.DctLastModi = DctLastModi;
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

    public Integer getiDocstate() {
        return iDocstate;
    }

    public void setiDocstate(Integer iDocstate) {
        this.iDocstate = iDocstate;
    }

    public Date getDoccreate() {
        return doccreate;
    }

    public void setDoccreate(Date doccreate) {
        this.doccreate = doccreate;
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

    public Integer getiTNSendState() {
        return iTNSendState;
    }

    public void setiTNSendState(Integer iTNSendState) {
        this.iTNSendState = iTNSendState;
    }

    public Integer getiGXYSendState() {
        return iGXYSendState;
    }

    public void setiGXYSendState(Integer iGXYSendState) {
        this.iGXYSendState = iGXYSendState;
    }

    public String getErrorMsg() {
        return ErrorMsg;
    }

    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public String getGm() {
        return gm;
    }

    public void setGm(String gm) {
        this.gm = gm;
    }

    public String getGn() {
        return gn;
    }

    public void setGn(String gn) {
        this.gn = gn;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        this.go = go;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public String getGq() {
        return gq;
    }

    public void setGq(String gq) {
        this.gq = gq;
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public Integer getGs() {
        return gs;
    }

    public void setGs(Integer gs) {
        this.gs = gs;
    }

    public Boolean getGt() {
        return gt;
    }

    public void setGt(Boolean gt) {
        this.gt = gt;
    }

    public Boolean getGu() {
        return gu;
    }

    public void setGu(Boolean gu) {
        this.gu = gu;
    }

    public Boolean getGv() {
        return gv;
    }

    public void setGv(Boolean gv) {
        this.gv = gv;
    }

    public Boolean getGw() {
        return gw;
    }

    public void setGw(Boolean gw) {
        this.gw = gw;
    }

    public Boolean getGx() {
        return gx;
    }

    public void setGx(Boolean gx) {
        this.gx = gx;
    }

    public String getGy() {
        return gy;
    }

    public void setGy(String gy) {
        this.gy = gy;
    }

    public String getInfocomplete() {
        return infocomplete;
    }

    public void setInfocomplete(String infocomplete) {
        this.infocomplete = infocomplete;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
