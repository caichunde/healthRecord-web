package com.dchb.model.healthRecord.pex;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.dchb.util.JsonDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
public class Ca extends Model<Ca> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID1", type = IdType.AUTO)
    private Integer id1;

    private String idcard;

    private String doctorid;

    private String aa;

    private String ab;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ac;

    private String ad;

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

    private Boolean ap;

    private Boolean aq;

    private Boolean ar;

    //症状视力模糊
    @TableField("[as]")
    private Boolean zzslmh;

    private Boolean at;

    private Boolean au;

    private Boolean av;

    private Boolean aw;

    private Boolean ax;

    private Boolean ay;

    private Boolean az;

    private Boolean ba;

    private Boolean bb;

    private Boolean bc;

    private String bd;

    private Double be;

    private Double bf;

    private Double bg;

    private Double bh;

    private Double bi;

    private Double bj;

    private Double bk;

    private Double bl;

    private Double bm;

    private Double bn;

    private Double bo;

    private Boolean bp;

    private Boolean bq;

    private Boolean br;

    private Boolean bs;

    private Boolean bt;

    private Boolean bu;

    private Boolean bv;

    private Boolean bw;

    private Boolean bx;

    //一般状况老年人认知功能阴性
    @TableField("[by]")
    private Boolean ybzklnrrzgnyx;

    private Boolean bz;

    private Double ca;

    private Boolean cb;

    private Boolean cc;

    private Double cd;

    private Boolean ce;

    private Boolean cf;

    private Boolean cg;

    private Boolean ch;

    private Double ci;

    private Double cj;

    private String ck;

    private Boolean cl;

    private Boolean cm;

    private Boolean cn;

    private Boolean co;

    private Boolean cp;

    private Boolean cq;

    private Boolean cr;

    private Boolean cs;

    private Boolean ct;

    private Double cu;

    private Double cv;

    private Double cw;

    private Boolean cx;

    private Boolean cy;

    private Boolean cz;

    private Boolean da;

    private Double db;

    private Boolean dc;

    private Boolean dd;

    private Double de;

    private Double df;

    private Boolean dg;

    private Boolean dh;

    private Boolean di;

    private Boolean dj;

    private Boolean dk;

    private Boolean dl;

    private Boolean dm;

    private String dn;

    //生活方式职业病危害因素接触史无
    @TableField("[do]")
    private Boolean shfszybwhysjcsw;

    private Boolean dp;

    private String dq;

    private Double dr;

    private String ds;

    private Boolean dt;

    private Boolean du;

    private String dv;

    private String dw;

    private Boolean dx;

    private Boolean dy;

    private String dz;

    private String ea;

    private Boolean eb;

    private Boolean ec;

    private String ed;

    private String ee;

    private Boolean ef;

    private Boolean eg;

    private String eh;

    private String ei;

    private Boolean ej;

    private Boolean ek;

    private String el;

    private Boolean em;

    private Boolean en;

    private Boolean eo;

    private Boolean ep;

    private Boolean eq;

    private Boolean er;

    private Boolean es;

    private Boolean et;

    private Boolean eu;

    private Boolean ev;

    private Boolean ew;

    private Boolean ex;

    private Double ey;

    private Double ez;

    private Double fa;

    private Double fb;

    private Boolean fc;

    private Boolean fd;

    private Boolean fe;

    private Boolean ff;

    private Boolean fg;

    private Boolean fh;

    private String fi;

    private Boolean fj;

    private Boolean fk;

    private Boolean fl;

    private Boolean fm;

    private Boolean fn;

    private Boolean fo;

    private Boolean fp;

    private String fq;

    private Boolean fr;

    private Boolean fs;

    private Boolean ft;

    private Boolean fu;

    private String fv;

    private Boolean fw;

    private Boolean fx;

    private Boolean fy;

    private Boolean fz;

    private String ga;

    private Boolean gb;

    private Boolean gc;

    private Boolean gd;

    private Boolean ge;

    private String gf;

    private Boolean gg;

    private Boolean gh;

    private Boolean gi;

    private Boolean gj;

    private String gk;

    private Double gl;

    private Boolean gm;

    private Boolean gn;

    private Boolean go;

    private Boolean gp;

    private Boolean gq;

    private String gr;

    private Boolean gs;

    private Boolean gt;

    private String gu;

    private Boolean gv;

    private Boolean gw;

    private String gx;

    private Boolean gy;

    private Boolean gz;

    private String ha;

    private Boolean hb;

    private Boolean hc;

    private String hd;

    private Boolean he;

    private Boolean hf;

    private String hg;

    private Boolean hh;

    private Boolean hi;

    private Boolean hj;

    private Boolean hk;

    private Boolean hl;

    private Boolean hm;

    private Boolean hn;

    private Boolean ho;

    private Boolean hp;

    private Boolean hq;

    private Boolean hr;

    private Boolean hs;

    private Boolean ht;

    private String hu;

    private Boolean hv;

    private Boolean hw;

    private Boolean hx;

    private Boolean hy;

    private Boolean hz;

    private String ia;

    private Boolean ib;

    private Boolean ic;

    private String id;

    private Boolean ie;

    //查体妇科阴道异常
    @TableField("[if]")
    private Boolean ctfkydyc;

    private String ig;

    private Boolean ih;

    private Boolean ii;

    private String ij;

    private Boolean ik;

    private Boolean il;

    private String im;

    //查体妇科附件未见异常
    @TableField("[in]")
    private Boolean ctfkfjwjyc;

    private Boolean io;

    private String ip;

    private String iq;

    private Double ir;

    //辅助检查血常规白细胞
    @TableField("[is]")
    private Double fzjcxcgbxb;

    private Double it;

    private String iu;

    private String iv;

    private String iw;

    private String ix;

    private String iy;

    private String iz;

    private Double ja;

    private Double jb;

    private Boolean jc;

    private String jd;

    private String je;

    private Double jf;

    private Boolean jg;

    private Boolean jh;

    private Double ji;

    private Boolean jj;

    private Boolean jk;

    private Double jl;

    private Double jm;

    private Double jn;

    private Double jo;

    private Double jp;

    private Double jq;

    private Double jr;

    private Double js;

    private Double jt;

    private Double ju;

    private Double jv;

    private Double jw;

    private Double jx;

    private Boolean jy;

    private Boolean jz;

    private String ka;

    private Boolean kb;

    private Boolean kc;

    private String kd;

    private Boolean ke;

    private Boolean kf;

    private String kg;

    private String kh;

    private Boolean ki;

    private Boolean kj;

    private Boolean kk;

    private Boolean kl;

    private Boolean km;

    private Boolean kn;

    private Boolean ko;

    private Boolean kp;

    private Boolean kq;

    private Boolean kr;

    private Boolean ks;

    private Boolean kt;

    private Boolean ku;

    private Boolean kv;

    private Boolean kw;

    private Boolean kx;

    private Boolean ky;

    private Boolean kz;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date la;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date lb;

    private String lc;

    private String ld;

    private String le;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date lf;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date lg;

    private String lh;

    private String li;

    private String lj;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date lk;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date ll;

    private String lm;

    private String ln;

    private String lo;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date lp;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date lq;

    private String lr;

    private String ls;

    private String lt;

    private String lu;

    private String lv;

    private String lw;

    private String lx;

    private Boolean ly;

    private Boolean lz;

    private Boolean ma;

    private String mb;

    private String mc;

    private String md;

    private String me;

    private Boolean mf;

    private Boolean mg;

    private Boolean mh;

    private String mi;

    private String mj;

    private String mk;

    private String ml;

    private Boolean mm;

    private Boolean mn;

    private Boolean mo;

    private String mp;

    private String mq;

    private String mr;

    private String ms;

    private Boolean mt;

    private Boolean mu;

    private Boolean mv;

    private String mw;

    private String mx;

    private String my;

    private String mz;

    private Boolean na;

    private Boolean nb;

    private Boolean nc;

    private String nd;

    private String ne;

    private String nf;

    private String ng;

    private Boolean nh;

    private Boolean ni;

    private Boolean nj;

    private String nk;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date nl;

    private String nm;

    private String nn;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date no;

    private String np;

    private String nq;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date nr;

    private String ns;

    private Boolean nt;

    private Boolean nu;

    private Boolean nv;

    private String nw;

    private Boolean nx;

    private String ny;

    private Boolean nz;

    private String oa;

    private Boolean ob;

    private String oc;

    private Boolean od;

    private Boolean oe;

    //健康指导建议转诊
    @TableField("[of]")
    private Boolean jkzdjyzz;

    private Boolean og;

    private Boolean oh;

    private Boolean oi;

    private Boolean oj;

    private Boolean ok;

    private String ol;

    private Boolean om;

    //危险因素控制建议接种疫苗具体
    @TableField("[on]")
    private String wxyskzjyjzymjt;

    private Boolean oo;

    private String op;

    private Boolean oq;

    //现存主要健康问题脑血管疾病缺血性卒中
    @TableField("[or]")
    private Boolean xczyjkwtnxgjbqxxcz;

    private Boolean os;

    private Boolean ot;

    private Boolean ou;

    private Boolean ov;

    private String ow;

    private Boolean ox;

    private Boolean oy;

    private Boolean oz;

    private Boolean pa;

    private Boolean pb;

    private Boolean pc;

    private String pd;

    private Boolean pe;

    private Boolean pf;

    private Boolean pg;

    private Boolean ph;

    private Boolean pi;

    private Boolean pj;

    private Boolean pk;

    private String pl;

    private Boolean pm;

    private Boolean pn;

    private Boolean po;

    private Boolean pp;

    private String pq;

    private Boolean pr;

    private Boolean ps;

    private Boolean pt;

    private Boolean pu;

    private Boolean pv;

    private String pw;

    private Boolean px;

    private Boolean py;

    private String pz;

    private Boolean qa;

    private Boolean qb;

    private String qc;

    @TableField("RegionId")
    private String RegionId;

    @TableField("DtLastModi")
    private Date DtLastModi;

    @TableField("EmptyNum")
    private Integer EmptyNum;

    @TableField("EmptyFeilds")
    private String EmptyFeilds;

    private String elt;

    private String ert;

    private String elb;

    private String erb;

    private String blt;

    private String brt;

    private String blb;

    private String brb;

    private String flt;

    private String frt;

    private String flb;

    private String frb;

    @TableField("Dtcreate")
    private Date Dtcreate;

    @TableField("bCityTran")
    private Integer bCityTran;

    @TableField("bCanTran")
    private Boolean bCanTran;

    @TableField("ErrorMsg")
    private String ErrorMsg;

    private Boolean fkb;

    private Boolean fkc;

    private String fkd;

    private String dcqa;

    private String dcqb;

    private String dcqc;

    private String dcqd;

    private String dcqe;

    private String dcqf;

    private String dcqg;

    private String dcqh;

    private String dcqi;

    private String dcqj;

    private String dcqk;

    private String dcql;

    private String dcqm;

    private String qd;

    private String qe;

    private Double qf;

    private Boolean qh;

    private Boolean qi;

    private Boolean qj;

    private Boolean qk;

    private Boolean ql;

    private Boolean qm;

    private Boolean qn;

    private Boolean qg;

    private Boolean qo;

    private Boolean qp;

    private Boolean qq;

    private Boolean qr;

    private Boolean qs;

    private Boolean qt;

    private Boolean qu;

    private Boolean qv;

    private String qw;

    private String qx;

    private String qy;

    @JsonFormat(pattern= "yyyy-MM-dd")
    private Date qz;

    private String dcqh1;

    private String dcqh2;

    private String dcqh3;

    private String dcqh4;

    private String dcqh5;

    private String dcqh6;

    private String dcqh7;

    private String dcqh8;


    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
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

    public Boolean getZzslmh() {
        return zzslmh;
    }

    public void setZzslmh(Boolean zzslmh) {
        this.zzslmh = zzslmh;
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

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public Double getBe() {
        return be;
    }

    public void setBe(Double be) {
        this.be = be;
    }

    public Double getBf() {
        return bf;
    }

    public void setBf(Double bf) {
        this.bf = bf;
    }

    public Double getBg() {
        return bg;
    }

    public void setBg(Double bg) {
        this.bg = bg;
    }

    public Double getBh() {
        return bh;
    }

    public void setBh(Double bh) {
        this.bh = bh;
    }

    public Double getBi() {
        return bi;
    }

    public void setBi(Double bi) {
        this.bi = bi;
    }

    public Double getBj() {
        return bj;
    }

    public void setBj(Double bj) {
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

    public Double getBm() {
        return bm;
    }

    public void setBm(Double bm) {
        this.bm = bm;
    }

    public Double getBn() {
        return bn;
    }

    public void setBn(Double bn) {
        this.bn = bn;
    }

    public Double getBo() {
        return bo;
    }

    public void setBo(Double bo) {
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

    public Boolean getBs() {
        return bs;
    }

    public void setBs(Boolean bs) {
        this.bs = bs;
    }

    public Boolean getBt() {
        return bt;
    }

    public void setBt(Boolean bt) {
        this.bt = bt;
    }

    public Boolean getBu() {
        return bu;
    }

    public void setBu(Boolean bu) {
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

    public Boolean getYbzklnrrzgnyx() {
        return ybzklnrrzgnyx;
    }

    public void setYbzklnrrzgnyx(Boolean ybzklnrrzgnyx) {
        this.ybzklnrrzgnyx = ybzklnrrzgnyx;
    }

    public Boolean getBz() {
        return bz;
    }

    public void setBz(Boolean bz) {
        this.bz = bz;
    }

    public Double getCa() {
        return ca;
    }

    public void setCa(Double ca) {
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

    public Double getCd() {
        return cd;
    }

    public void setCd(Double cd) {
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

    public Double getCi() {
        return ci;
    }

    public void setCi(Double ci) {
        this.ci = ci;
    }

    public Double getCj() {
        return cj;
    }

    public void setCj(Double cj) {
        this.cj = cj;
    }

    public String getCk() {
        return ck;
    }

    public void setCk(String ck) {
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

    public Double getCu() {
        return cu;
    }

    public void setCu(Double cu) {
        this.cu = cu;
    }

    public Double getCv() {
        return cv;
    }

    public void setCv(Double cv) {
        this.cv = cv;
    }

    public Double getCw() {
        return cw;
    }

    public void setCw(Double cw) {
        this.cw = cw;
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

    public Double getDb() {
        return db;
    }

    public void setDb(Double db) {
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

    public Double getDe() {
        return de;
    }

    public void setDe(Double de) {
        this.de = de;
    }

    public Double getDf() {
        return df;
    }

    public void setDf(Double df) {
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

    public Boolean getDj() {
        return dj;
    }

    public void setDj(Boolean dj) {
        this.dj = dj;
    }

    public Boolean getDk() {
        return dk;
    }

    public void setDk(Boolean dk) {
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

    public Boolean getShfszybwhysjcsw() {
        return shfszybwhysjcsw;
    }

    public void setShfszybwhysjcsw(Boolean shfszybwhysjcsw) {
        this.shfszybwhysjcsw = shfszybwhysjcsw;
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

    public Double getDr() {
        return dr;
    }

    public void setDr(Double dr) {
        this.dr = dr;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
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

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
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

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getEa() {
        return ea;
    }

    public void setEa(String ea) {
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

    public String getEe() {
        return ee;
    }

    public void setEe(String ee) {
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

    public String getEh() {
        return eh;
    }

    public void setEh(String eh) {
        this.eh = eh;
    }

    public String getEi() {
        return ei;
    }

    public void setEi(String ei) {
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

    public String getEl() {
        return el;
    }

    public void setEl(String el) {
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

    public Double getEy() {
        return ey;
    }

    public void setEy(Double ey) {
        this.ey = ey;
    }

    public Double getEz() {
        return ez;
    }

    public void setEz(Double ez) {
        this.ez = ez;
    }

    public Double getFa() {
        return fa;
    }

    public void setFa(Double fa) {
        this.fa = fa;
    }

    public Double getFb() {
        return fb;
    }

    public void setFb(Double fb) {
        this.fb = fb;
    }

    public Boolean getFc() {
        return fc;
    }

    public void setFc(Boolean fc) {
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

    public String getFi() {
        return fi;
    }

    public void setFi(String fi) {
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

    public String getFq() {
        return fq;
    }

    public void setFq(String fq) {
        this.fq = fq;
    }

    public Boolean getFr() {
        return fr;
    }

    public void setFr(Boolean fr) {
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

    public Boolean getFu() {
        return fu;
    }

    public void setFu(Boolean fu) {
        this.fu = fu;
    }

    public String getFv() {
        return fv;
    }

    public void setFv(String fv) {
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

    public String getGa() {
        return ga;
    }

    public void setGa(String ga) {
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

    public Boolean getGe() {
        return ge;
    }

    public void setGe(Boolean ge) {
        this.ge = ge;
    }

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    public Boolean getGg() {
        return gg;
    }

    public void setGg(Boolean gg) {
        this.gg = gg;
    }

    public Boolean getGh() {
        return gh;
    }

    public void setGh(Boolean gh) {
        this.gh = gh;
    }

    public Boolean getGi() {
        return gi;
    }

    public void setGi(Boolean gi) {
        this.gi = gi;
    }

    public Boolean getGj() {
        return gj;
    }

    public void setGj(Boolean gj) {
        this.gj = gj;
    }

    public String getGk() {
        return gk;
    }

    public void setGk(String gk) {
        this.gk = gk;
    }

    public Double getGl() {
        return gl;
    }

    public void setGl(Double gl) {
        this.gl = gl;
    }

    public Boolean getGm() {
        return gm;
    }

    public void setGm(Boolean gm) {
        this.gm = gm;
    }

    public Boolean getGn() {
        return gn;
    }

    public void setGn(Boolean gn) {
        this.gn = gn;
    }

    public Boolean getGo() {
        return go;
    }

    public void setGo(Boolean go) {
        this.go = go;
    }

    public Boolean getGp() {
        return gp;
    }

    public void setGp(Boolean gp) {
        this.gp = gp;
    }

    public Boolean getGq() {
        return gq;
    }

    public void setGq(Boolean gq) {
        this.gq = gq;
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public Boolean getGs() {
        return gs;
    }

    public void setGs(Boolean gs) {
        this.gs = gs;
    }

    public Boolean getGt() {
        return gt;
    }

    public void setGt(Boolean gt) {
        this.gt = gt;
    }

    public String getGu() {
        return gu;
    }

    public void setGu(String gu) {
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

    public String getGx() {
        return gx;
    }

    public void setGx(String gx) {
        this.gx = gx;
    }

    public Boolean getGy() {
        return gy;
    }

    public void setGy(Boolean gy) {
        this.gy = gy;
    }

    public Boolean getGz() {
        return gz;
    }

    public void setGz(Boolean gz) {
        this.gz = gz;
    }

    public String getHa() {
        return ha;
    }

    public void setHa(String ha) {
        this.ha = ha;
    }

    public Boolean getHb() {
        return hb;
    }

    public void setHb(Boolean hb) {
        this.hb = hb;
    }

    public Boolean getHc() {
        return hc;
    }

    public void setHc(Boolean hc) {
        this.hc = hc;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public Boolean getHe() {
        return he;
    }

    public void setHe(Boolean he) {
        this.he = he;
    }

    public Boolean getHf() {
        return hf;
    }

    public void setHf(Boolean hf) {
        this.hf = hf;
    }

    public String getHg() {
        return hg;
    }

    public void setHg(String hg) {
        this.hg = hg;
    }

    public Boolean getHh() {
        return hh;
    }

    public void setHh(Boolean hh) {
        this.hh = hh;
    }

    public Boolean getHi() {
        return hi;
    }

    public void setHi(Boolean hi) {
        this.hi = hi;
    }

    public Boolean getHj() {
        return hj;
    }

    public void setHj(Boolean hj) {
        this.hj = hj;
    }

    public Boolean getHk() {
        return hk;
    }

    public void setHk(Boolean hk) {
        this.hk = hk;
    }

    public Boolean getHl() {
        return hl;
    }

    public void setHl(Boolean hl) {
        this.hl = hl;
    }

    public Boolean getHm() {
        return hm;
    }

    public void setHm(Boolean hm) {
        this.hm = hm;
    }

    public Boolean getHn() {
        return hn;
    }

    public void setHn(Boolean hn) {
        this.hn = hn;
    }

    public Boolean getHo() {
        return ho;
    }

    public void setHo(Boolean ho) {
        this.ho = ho;
    }

    public Boolean getHp() {
        return hp;
    }

    public void setHp(Boolean hp) {
        this.hp = hp;
    }

    public Boolean getHq() {
        return hq;
    }

    public void setHq(Boolean hq) {
        this.hq = hq;
    }

    public Boolean getHr() {
        return hr;
    }

    public void setHr(Boolean hr) {
        this.hr = hr;
    }

    public Boolean getHs() {
        return hs;
    }

    public void setHs(Boolean hs) {
        this.hs = hs;
    }

    public Boolean getHt() {
        return ht;
    }

    public void setHt(Boolean ht) {
        this.ht = ht;
    }

    public String getHu() {
        return hu;
    }

    public void setHu(String hu) {
        this.hu = hu;
    }

    public Boolean getHv() {
        return hv;
    }

    public void setHv(Boolean hv) {
        this.hv = hv;
    }

    public Boolean getHw() {
        return hw;
    }

    public void setHw(Boolean hw) {
        this.hw = hw;
    }

    public Boolean getHx() {
        return hx;
    }

    public void setHx(Boolean hx) {
        this.hx = hx;
    }

    public Boolean getHy() {
        return hy;
    }

    public void setHy(Boolean hy) {
        this.hy = hy;
    }

    public Boolean getHz() {
        return hz;
    }

    public void setHz(Boolean hz) {
        this.hz = hz;
    }

    public String getIa() {
        return ia;
    }

    public void setIa(String ia) {
        this.ia = ia;
    }

    public Boolean getIb() {
        return ib;
    }

    public void setIb(Boolean ib) {
        this.ib = ib;
    }

    public Boolean getIc() {
        return ic;
    }

    public void setIc(Boolean ic) {
        this.ic = ic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIe() {
        return ie;
    }

    public void setIe(Boolean ie) {
        this.ie = ie;
    }

    public Boolean getCtfkydyc() {
        return ctfkydyc;
    }

    public void setCtfkydyc(Boolean ctfkydyc) {
        this.ctfkydyc = ctfkydyc;
    }

    public String getIg() {
        return ig;
    }

    public void setIg(String ig) {
        this.ig = ig;
    }

    public Boolean getIh() {
        return ih;
    }

    public void setIh(Boolean ih) {
        this.ih = ih;
    }

    public Boolean getIi() {
        return ii;
    }

    public void setIi(Boolean ii) {
        this.ii = ii;
    }

    public String getIj() {
        return ij;
    }

    public void setIj(String ij) {
        this.ij = ij;
    }

    public Boolean getIk() {
        return ik;
    }

    public void setIk(Boolean ik) {
        this.ik = ik;
    }

    public Boolean getIl() {
        return il;
    }

    public void setIl(Boolean il) {
        this.il = il;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public Boolean getCtfkfjwjyc() {
        return ctfkfjwjyc;
    }

    public void setCtfkfjwjyc(Boolean ctfkfjwjyc) {
        this.ctfkfjwjyc = ctfkfjwjyc;
    }

    public Boolean getIo() {
        return io;
    }

    public void setIo(Boolean io) {
        this.io = io;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq;
    }

    public Double getIr() {
        return ir;
    }

    public void setIr(Double ir) {
        this.ir = ir;
    }

    public Double getFzjcxcgbxb() {
        return fzjcxcgbxb;
    }

    public void setFzjcxcgbxb(Double fzjcxcgbxb) {
        this.fzjcxcgbxb = fzjcxcgbxb;
    }

    public Double getIt() {
        return it;
    }

    public void setIt(Double it) {
        this.it = it;
    }

    public String getIu() {
        return iu;
    }

    public void setIu(String iu) {
        this.iu = iu;
    }

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

    public String getIw() {
        return iw;
    }

    public void setIw(String iw) {
        this.iw = iw;
    }

    public String getIx() {
        return ix;
    }

    public void setIx(String ix) {
        this.ix = ix;
    }

    public String getIy() {
        return iy;
    }

    public void setIy(String iy) {
        this.iy = iy;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }

    public Double getJa() {
        return ja;
    }

    public void setJa(Double ja) {
        this.ja = ja;
    }

    public Double getJb() {
        return jb;
    }

    public void setJb(Double jb) {
        this.jb = jb;
    }

    public Boolean getJc() {
        return jc;
    }

    public void setJc(Boolean jc) {
        this.jc = jc;
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    public String getJe() {
        return je;
    }

    public void setJe(String je) {
        this.je = je;
    }

    public Double getJf() {
        return jf;
    }

    public void setJf(Double jf) {
        this.jf = jf;
    }

    public Boolean getJg() {
        return jg;
    }

    public void setJg(Boolean jg) {
        this.jg = jg;
    }

    public Boolean getJh() {
        return jh;
    }

    public void setJh(Boolean jh) {
        this.jh = jh;
    }

    public Double getJi() {
        return ji;
    }

    public void setJi(Double ji) {
        this.ji = ji;
    }

    public Boolean getJj() {
        return jj;
    }

    public void setJj(Boolean jj) {
        this.jj = jj;
    }

    public Boolean getJk() {
        return jk;
    }

    public void setJk(Boolean jk) {
        this.jk = jk;
    }

    public Double getJl() {
        return jl;
    }

    public void setJl(Double jl) {
        this.jl = jl;
    }

    public Double getJm() {
        return jm;
    }

    public void setJm(Double jm) {
        this.jm = jm;
    }

    public Double getJn() {
        return jn;
    }

    public void setJn(Double jn) {
        this.jn = jn;
    }

    public Double getJo() {
        return jo;
    }

    public void setJo(Double jo) {
        this.jo = jo;
    }

    public Double getJp() {
        return jp;
    }

    public void setJp(Double jp) {
        this.jp = jp;
    }

    public Double getJq() {
        return jq;
    }

    public void setJq(Double jq) {
        this.jq = jq;
    }

    public Double getJr() {
        return jr;
    }

    public void setJr(Double jr) {
        this.jr = jr;
    }

    public Double getJs() {
        return js;
    }

    public void setJs(Double js) {
        this.js = js;
    }

    public Double getJt() {
        return jt;
    }

    public void setJt(Double jt) {
        this.jt = jt;
    }

    public Double getJu() {
        return ju;
    }

    public void setJu(Double ju) {
        this.ju = ju;
    }

    public Double getJv() {
        return jv;
    }

    public void setJv(Double jv) {
        this.jv = jv;
    }

    public Double getJw() {
        return jw;
    }

    public void setJw(Double jw) {
        this.jw = jw;
    }

    public Double getJx() {
        return jx;
    }

    public void setJx(Double jx) {
        this.jx = jx;
    }

    public Boolean getJy() {
        return jy;
    }

    public void setJy(Boolean jy) {
        this.jy = jy;
    }

    public Boolean getJz() {
        return jz;
    }

    public void setJz(Boolean jz) {
        this.jz = jz;
    }

    public String getKa() {
        return ka;
    }

    public void setKa(String ka) {
        this.ka = ka;
    }

    public Boolean getKb() {
        return kb;
    }

    public void setKb(Boolean kb) {
        this.kb = kb;
    }

    public Boolean getKc() {
        return kc;
    }

    public void setKc(Boolean kc) {
        this.kc = kc;
    }

    public String getKd() {
        return kd;
    }

    public void setKd(String kd) {
        this.kd = kd;
    }

    public Boolean getKe() {
        return ke;
    }

    public void setKe(Boolean ke) {
        this.ke = ke;
    }

    public Boolean getKf() {
        return kf;
    }

    public void setKf(Boolean kf) {
        this.kf = kf;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public Boolean getKi() {
        return ki;
    }

    public void setKi(Boolean ki) {
        this.ki = ki;
    }

    public Boolean getKj() {
        return kj;
    }

    public void setKj(Boolean kj) {
        this.kj = kj;
    }

    public Boolean getKk() {
        return kk;
    }

    public void setKk(Boolean kk) {
        this.kk = kk;
    }

    public Boolean getKl() {
        return kl;
    }

    public void setKl(Boolean kl) {
        this.kl = kl;
    }

    public Boolean getKm() {
        return km;
    }

    public void setKm(Boolean km) {
        this.km = km;
    }

    public Boolean getKn() {
        return kn;
    }

    public void setKn(Boolean kn) {
        this.kn = kn;
    }

    public Boolean getKo() {
        return ko;
    }

    public void setKo(Boolean ko) {
        this.ko = ko;
    }

    public Boolean getKp() {
        return kp;
    }

    public void setKp(Boolean kp) {
        this.kp = kp;
    }

    public Boolean getKq() {
        return kq;
    }

    public void setKq(Boolean kq) {
        this.kq = kq;
    }

    public Boolean getKr() {
        return kr;
    }

    public void setKr(Boolean kr) {
        this.kr = kr;
    }

    public Boolean getKs() {
        return ks;
    }

    public void setKs(Boolean ks) {
        this.ks = ks;
    }

    public Boolean getKt() {
        return kt;
    }

    public void setKt(Boolean kt) {
        this.kt = kt;
    }

    public Boolean getKu() {
        return ku;
    }

    public void setKu(Boolean ku) {
        this.ku = ku;
    }

    public Boolean getKv() {
        return kv;
    }

    public void setKv(Boolean kv) {
        this.kv = kv;
    }

    public Boolean getKw() {
        return kw;
    }

    public void setKw(Boolean kw) {
        this.kw = kw;
    }

    public Boolean getKx() {
        return kx;
    }

    public void setKx(Boolean kx) {
        this.kx = kx;
    }

    public Boolean getKy() {
        return ky;
    }

    public void setKy(Boolean ky) {
        this.ky = ky;
    }

    public Boolean getKz() {
        return kz;
    }

    public void setKz(Boolean kz) {
        this.kz = kz;
    }

    public Date getLa() {
        return la;
    }

    public void setLa(Date la) {
        this.la = la;
    }

    public Date getLb() {
        return lb;
    }

    public void setLb(Date lb) {
        this.lb = lb;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getLd() {
        return ld;
    }

    public void setLd(String ld) {
        this.ld = ld;
    }

    public String getLe() {
        return le;
    }

    public void setLe(String le) {
        this.le = le;
    }

    public Date getLf() {
        return lf;
    }

    public void setLf(Date lf) {
        this.lf = lf;
    }

    public Date getLg() {
        return lg;
    }

    public void setLg(Date lg) {
        this.lg = lg;
    }

    public String getLh() {
        return lh;
    }

    public void setLh(String lh) {
        this.lh = lh;
    }

    public String getLi() {
        return li;
    }

    public void setLi(String li) {
        this.li = li;
    }

    public String getLj() {
        return lj;
    }

    public void setLj(String lj) {
        this.lj = lj;
    }

    public Date getLk() {
        return lk;
    }

    public void setLk(Date lk) {
        this.lk = lk;
    }

    public Date getLl() {
        return ll;
    }

    public void setLl(Date ll) {
        this.ll = ll;
    }

    public String getLm() {
        return lm;
    }

    public void setLm(String lm) {
        this.lm = lm;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getLo() {
        return lo;
    }

    public void setLo(String lo) {
        this.lo = lo;
    }

    public Date getLp() {
        return lp;
    }

    public void setLp(Date lp) {
        this.lp = lp;
    }

    public Date getLq() {
        return lq;
    }

    public void setLq(Date lq) {
        this.lq = lq;
    }

    public String getLr() {
        return lr;
    }

    public void setLr(String lr) {
        this.lr = lr;
    }

    public String getLs() {
        return ls;
    }

    public void setLs(String ls) {
        this.ls = ls;
    }

    public String getLt() {
        return lt;
    }

    public void setLt(String lt) {
        this.lt = lt;
    }

    public String getLu() {
        return lu;
    }

    public void setLu(String lu) {
        this.lu = lu;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getLw() {
        return lw;
    }

    public void setLw(String lw) {
        this.lw = lw;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public Boolean getLy() {
        return ly;
    }

    public void setLy(Boolean ly) {
        this.ly = ly;
    }

    public Boolean getLz() {
        return lz;
    }

    public void setLz(Boolean lz) {
        this.lz = lz;
    }

    public Boolean getMa() {
        return ma;
    }

    public void setMa(Boolean ma) {
        this.ma = ma;
    }

    public String getMb() {
        return mb;
    }

    public void setMb(String mb) {
        this.mb = mb;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public String getMe() {
        return me;
    }

    public void setMe(String me) {
        this.me = me;
    }

    public Boolean getMf() {
        return mf;
    }

    public void setMf(Boolean mf) {
        this.mf = mf;
    }

    public Boolean getMg() {
        return mg;
    }

    public void setMg(Boolean mg) {
        this.mg = mg;
    }

    public Boolean getMh() {
        return mh;
    }

    public void setMh(Boolean mh) {
        this.mh = mh;
    }

    public String getMi() {
        return mi;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    public String getMj() {
        return mj;
    }

    public void setMj(String mj) {
        this.mj = mj;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getMl() {
        return ml;
    }

    public void setMl(String ml) {
        this.ml = ml;
    }

    public Boolean getMm() {
        return mm;
    }

    public void setMm(Boolean mm) {
        this.mm = mm;
    }

    public Boolean getMn() {
        return mn;
    }

    public void setMn(Boolean mn) {
        this.mn = mn;
    }

    public Boolean getMo() {
        return mo;
    }

    public void setMo(Boolean mo) {
        this.mo = mo;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public String getMq() {
        return mq;
    }

    public void setMq(String mq) {
        this.mq = mq;
    }

    public String getMr() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr = mr;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public Boolean getMt() {
        return mt;
    }

    public void setMt(Boolean mt) {
        this.mt = mt;
    }

    public Boolean getMu() {
        return mu;
    }

    public void setMu(Boolean mu) {
        this.mu = mu;
    }

    public Boolean getMv() {
        return mv;
    }

    public void setMv(Boolean mv) {
        this.mv = mv;
    }

    public String getMw() {
        return mw;
    }

    public void setMw(String mw) {
        this.mw = mw;
    }

    public String getMx() {
        return mx;
    }

    public void setMx(String mx) {
        this.mx = mx;
    }

    public String getMy() {
        return my;
    }

    public void setMy(String my) {
        this.my = my;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public Boolean getNa() {
        return na;
    }

    public void setNa(Boolean na) {
        this.na = na;
    }

    public Boolean getNb() {
        return nb;
    }

    public void setNb(Boolean nb) {
        this.nb = nb;
    }

    public Boolean getNc() {
        return nc;
    }

    public void setNc(Boolean nc) {
        this.nc = nc;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getNe() {
        return ne;
    }

    public void setNe(String ne) {
        this.ne = ne;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public String getNg() {
        return ng;
    }

    public void setNg(String ng) {
        this.ng = ng;
    }

    public Boolean getNh() {
        return nh;
    }

    public void setNh(Boolean nh) {
        this.nh = nh;
    }

    public Boolean getNi() {
        return ni;
    }

    public void setNi(Boolean ni) {
        this.ni = ni;
    }

    public Boolean getNj() {
        return nj;
    }

    public void setNj(Boolean nj) {
        this.nj = nj;
    }

    public String getNk() {
        return nk;
    }

    public void setNk(String nk) {
        this.nk = nk;
    }

    public Date getNl() {
        return nl;
    }

    public void setNl(Date nl) {
        this.nl = nl;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getNn() {
        return nn;
    }

    public void setNn(String nn) {
        this.nn = nn;
    }

    public Date getNo() {
        return no;
    }

    public void setNo(Date no) {
        this.no = no;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    public String getNq() {
        return nq;
    }

    public void setNq(String nq) {
        this.nq = nq;
    }

    public Date getNr() {
        return nr;
    }

    public void setNr(Date nr) {
        this.nr = nr;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public Boolean getNt() {
        return nt;
    }

    public void setNt(Boolean nt) {
        this.nt = nt;
    }

    public Boolean getNu() {
        return nu;
    }

    public void setNu(Boolean nu) {
        this.nu = nu;
    }

    public Boolean getNv() {
        return nv;
    }

    public void setNv(Boolean nv) {
        this.nv = nv;
    }

    public String getNw() {
        return nw;
    }

    public void setNw(String nw) {
        this.nw = nw;
    }

    public Boolean getNx() {
        return nx;
    }

    public void setNx(Boolean nx) {
        this.nx = nx;
    }

    public String getNy() {
        return ny;
    }

    public void setNy(String ny) {
        this.ny = ny;
    }

    public Boolean getNz() {
        return nz;
    }

    public void setNz(Boolean nz) {
        this.nz = nz;
    }

    public String getOa() {
        return oa;
    }

    public void setOa(String oa) {
        this.oa = oa;
    }

    public Boolean getOb() {
        return ob;
    }

    public void setOb(Boolean ob) {
        this.ob = ob;
    }

    public String getOc() {
        return oc;
    }

    public void setOc(String oc) {
        this.oc = oc;
    }

    public Boolean getOd() {
        return od;
    }

    public void setOd(Boolean od) {
        this.od = od;
    }

    public Boolean getOe() {
        return oe;
    }

    public void setOe(Boolean oe) {
        this.oe = oe;
    }

    public Boolean getJkzdjyzz() {
        return jkzdjyzz;
    }

    public void setJkzdjyzz(Boolean jkzdjyzz) {
        this.jkzdjyzz = jkzdjyzz;
    }

    public Boolean getOg() {
        return og;
    }

    public void setOg(Boolean og) {
        this.og = og;
    }

    public Boolean getOh() {
        return oh;
    }

    public void setOh(Boolean oh) {
        this.oh = oh;
    }

    public Boolean getOi() {
        return oi;
    }

    public void setOi(Boolean oi) {
        this.oi = oi;
    }

    public Boolean getOj() {
        return oj;
    }

    public void setOj(Boolean oj) {
        this.oj = oj;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public String getOl() {
        return ol;
    }

    public void setOl(String ol) {
        this.ol = ol;
    }

    public Boolean getOm() {
        return om;
    }

    public void setOm(Boolean om) {
        this.om = om;
    }

    public String getWxyskzjyjzymjt() {
        return wxyskzjyjzymjt;
    }

    public void setWxyskzjyjzymjt(String wxyskzjyjzymjt) {
        this.wxyskzjyjzymjt = wxyskzjyjzymjt;
    }

    public Boolean getOo() {
        return oo;
    }

    public void setOo(Boolean oo) {
        this.oo = oo;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Boolean getOq() {
        return oq;
    }

    public void setOq(Boolean oq) {
        this.oq = oq;
    }

    public Boolean getXczyjkwtnxgjbqxxcz() {
        return xczyjkwtnxgjbqxxcz;
    }

    public void setXczyjkwtnxgjbqxxcz(Boolean xczyjkwtnxgjbqxxcz) {
        this.xczyjkwtnxgjbqxxcz = xczyjkwtnxgjbqxxcz;
    }

    public Boolean getOs() {
        return os;
    }

    public void setOs(Boolean os) {
        this.os = os;
    }

    public Boolean getOt() {
        return ot;
    }

    public void setOt(Boolean ot) {
        this.ot = ot;
    }

    public Boolean getOu() {
        return ou;
    }

    public void setOu(Boolean ou) {
        this.ou = ou;
    }

    public Boolean getOv() {
        return ov;
    }

    public void setOv(Boolean ov) {
        this.ov = ov;
    }

    public String getOw() {
        return ow;
    }

    public void setOw(String ow) {
        this.ow = ow;
    }

    public Boolean getOx() {
        return ox;
    }

    public void setOx(Boolean ox) {
        this.ox = ox;
    }

    public Boolean getOy() {
        return oy;
    }

    public void setOy(Boolean oy) {
        this.oy = oy;
    }

    public Boolean getOz() {
        return oz;
    }

    public void setOz(Boolean oz) {
        this.oz = oz;
    }

    public Boolean getPa() {
        return pa;
    }

    public void setPa(Boolean pa) {
        this.pa = pa;
    }

    public Boolean getPb() {
        return pb;
    }

    public void setPb(Boolean pb) {
        this.pb = pb;
    }

    public Boolean getPc() {
        return pc;
    }

    public void setPc(Boolean pc) {
        this.pc = pc;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public Boolean getPe() {
        return pe;
    }

    public void setPe(Boolean pe) {
        this.pe = pe;
    }

    public Boolean getPf() {
        return pf;
    }

    public void setPf(Boolean pf) {
        this.pf = pf;
    }

    public Boolean getPg() {
        return pg;
    }

    public void setPg(Boolean pg) {
        this.pg = pg;
    }

    public Boolean getPh() {
        return ph;
    }

    public void setPh(Boolean ph) {
        this.ph = ph;
    }

    public Boolean getPi() {
        return pi;
    }

    public void setPi(Boolean pi) {
        this.pi = pi;
    }

    public Boolean getPj() {
        return pj;
    }

    public void setPj(Boolean pj) {
        this.pj = pj;
    }

    public Boolean getPk() {
        return pk;
    }

    public void setPk(Boolean pk) {
        this.pk = pk;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public Boolean getPm() {
        return pm;
    }

    public void setPm(Boolean pm) {
        this.pm = pm;
    }

    public Boolean getPn() {
        return pn;
    }

    public void setPn(Boolean pn) {
        this.pn = pn;
    }

    public Boolean getPo() {
        return po;
    }

    public void setPo(Boolean po) {
        this.po = po;
    }

    public Boolean getPp() {
        return pp;
    }

    public void setPp(Boolean pp) {
        this.pp = pp;
    }

    public String getPq() {
        return pq;
    }

    public void setPq(String pq) {
        this.pq = pq;
    }

    public Boolean getPr() {
        return pr;
    }

    public void setPr(Boolean pr) {
        this.pr = pr;
    }

    public Boolean getPs() {
        return ps;
    }

    public void setPs(Boolean ps) {
        this.ps = ps;
    }

    public Boolean getPt() {
        return pt;
    }

    public void setPt(Boolean pt) {
        this.pt = pt;
    }

    public Boolean getPu() {
        return pu;
    }

    public void setPu(Boolean pu) {
        this.pu = pu;
    }

    public Boolean getPv() {
        return pv;
    }

    public void setPv(Boolean pv) {
        this.pv = pv;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Boolean getPx() {
        return px;
    }

    public void setPx(Boolean px) {
        this.px = px;
    }

    public Boolean getPy() {
        return py;
    }

    public void setPy(Boolean py) {
        this.py = py;
    }

    public String getPz() {
        return pz;
    }

    public void setPz(String pz) {
        this.pz = pz;
    }

    public Boolean getQa() {
        return qa;
    }

    public void setQa(Boolean qa) {
        this.qa = qa;
    }

    public Boolean getQb() {
        return qb;
    }

    public void setQb(Boolean qb) {
        this.qb = qb;
    }

    public String getQc() {
        return qc;
    }

    public void setQc(String qc) {
        this.qc = qc;
    }

    public String getRegionId() {
        return RegionId;
    }

    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
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

    public String getElt() {
        return elt;
    }

    public void setElt(String elt) {
        this.elt = elt;
    }

    public String getErt() {
        return ert;
    }

    public void setErt(String ert) {
        this.ert = ert;
    }

    public String getElb() {
        return elb;
    }

    public void setElb(String elb) {
        this.elb = elb;
    }

    public String getErb() {
        return erb;
    }

    public void setErb(String erb) {
        this.erb = erb;
    }

    public String getBlt() {
        return blt;
    }

    public void setBlt(String blt) {
        this.blt = blt;
    }

    public String getBrt() {
        return brt;
    }

    public void setBrt(String brt) {
        this.brt = brt;
    }

    public String getBlb() {
        return blb;
    }

    public void setBlb(String blb) {
        this.blb = blb;
    }

    public String getBrb() {
        return brb;
    }

    public void setBrb(String brb) {
        this.brb = brb;
    }

    public String getFlt() {
        return flt;
    }

    public void setFlt(String flt) {
        this.flt = flt;
    }

    public String getFrt() {
        return frt;
    }

    public void setFrt(String frt) {
        this.frt = frt;
    }

    public String getFlb() {
        return flb;
    }

    public void setFlb(String flb) {
        this.flb = flb;
    }

    public String getFrb() {
        return frb;
    }

    public void setFrb(String frb) {
        this.frb = frb;
    }

    public Date getDtcreate() {
        return Dtcreate;
    }

    public void setDtcreate(Date Dtcreate) {
        this.Dtcreate = Dtcreate;
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

    public String getErrorMsg() {
        return ErrorMsg;
    }

    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public Boolean getFkb() {
        return fkb;
    }

    public void setFkb(Boolean fkb) {
        this.fkb = fkb;
    }

    public Boolean getFkc() {
        return fkc;
    }

    public void setFkc(Boolean fkc) {
        this.fkc = fkc;
    }

    public String getFkd() {
        return fkd;
    }

    public void setFkd(String fkd) {
        this.fkd = fkd;
    }

    public String getDcqa() {
        return dcqa;
    }

    public void setDcqa(String dcqa) {
        this.dcqa = dcqa;
    }

    public String getDcqb() {
        return dcqb;
    }

    public void setDcqb(String dcqb) {
        this.dcqb = dcqb;
    }

    public String getDcqc() {
        return dcqc;
    }

    public void setDcqc(String dcqc) {
        this.dcqc = dcqc;
    }

    public String getDcqd() {
        return dcqd;
    }

    public void setDcqd(String dcqd) {
        this.dcqd = dcqd;
    }

    public String getDcqe() {
        return dcqe;
    }

    public void setDcqe(String dcqe) {
        this.dcqe = dcqe;
    }

    public String getDcqf() {
        return dcqf;
    }

    public void setDcqf(String dcqf) {
        this.dcqf = dcqf;
    }

    public String getDcqg() {
        return dcqg;
    }

    public void setDcqg(String dcqg) {
        this.dcqg = dcqg;
    }

    public String getDcqh() {
        return dcqh;
    }

    public void setDcqh(String dcqh) {
        this.dcqh = dcqh;
    }

    public String getDcqi() {
        return dcqi;
    }

    public void setDcqi(String dcqi) {
        this.dcqi = dcqi;
    }

    public String getDcqj() {
        return dcqj;
    }

    public void setDcqj(String dcqj) {
        this.dcqj = dcqj;
    }

    public String getDcqk() {
        return dcqk;
    }

    public void setDcqk(String dcqk) {
        this.dcqk = dcqk;
    }

    public String getDcql() {
        return dcql;
    }

    public void setDcql(String dcql) {
        this.dcql = dcql;
    }

    public String getDcqm() {
        return dcqm;
    }

    public void setDcqm(String dcqm) {
        this.dcqm = dcqm;
    }

    public String getQd() {
        return qd;
    }

    public void setQd(String qd) {
        this.qd = qd;
    }

    public String getQe() {
        return qe;
    }

    public void setQe(String qe) {
        this.qe = qe;
    }

    public Double getQf() {
        return qf;
    }

    public void setQf(Double qf) {
        this.qf = qf;
    }

    public Boolean getQh() {
        return qh;
    }

    public void setQh(Boolean qh) {
        this.qh = qh;
    }

    public Boolean getQi() {
        return qi;
    }

    public void setQi(Boolean qi) {
        this.qi = qi;
    }

    public Boolean getQj() {
        return qj;
    }

    public void setQj(Boolean qj) {
        this.qj = qj;
    }

    public Boolean getQk() {
        return qk;
    }

    public void setQk(Boolean qk) {
        this.qk = qk;
    }

    public Boolean getQl() {
        return ql;
    }

    public void setQl(Boolean ql) {
        this.ql = ql;
    }

    public Boolean getQm() {
        return qm;
    }

    public void setQm(Boolean qm) {
        this.qm = qm;
    }

    public Boolean getQn() {
        return qn;
    }

    public void setQn(Boolean qn) {
        this.qn = qn;
    }

    public Boolean getQg() {
        return qg;
    }

    public void setQg(Boolean qg) {
        this.qg = qg;
    }

    public Boolean getQo() {
        return qo;
    }

    public void setQo(Boolean qo) {
        this.qo = qo;
    }

    public Boolean getQp() {
        return qp;
    }

    public void setQp(Boolean qp) {
        this.qp = qp;
    }

    public Boolean getQq() {
        return qq;
    }

    public void setQq(Boolean qq) {
        this.qq = qq;
    }

    public Boolean getQr() {
        return qr;
    }

    public void setQr(Boolean qr) {
        this.qr = qr;
    }

    public Boolean getQs() {
        return qs;
    }

    public void setQs(Boolean qs) {
        this.qs = qs;
    }

    public Boolean getQt() {
        return qt;
    }

    public void setQt(Boolean qt) {
        this.qt = qt;
    }

    public Boolean getQu() {
        return qu;
    }

    public void setQu(Boolean qu) {
        this.qu = qu;
    }

    public Boolean getQv() {
        return qv;
    }

    public void setQv(Boolean qv) {
        this.qv = qv;
    }

    public String getQw() {
        return qw;
    }

    public void setQw(String qw) {
        this.qw = qw;
    }

    public String getQx() {
        return qx;
    }

    public void setQx(String qx) {
        this.qx = qx;
    }

    public String getQy() {
        return qy;
    }

    public void setQy(String qy) {
        this.qy = qy;
    }

    public Date getQz() {
        return qz;
    }

    public void setQz(Date qz) {
        this.qz = qz;
    }

    public String getDcqh1() {
        return dcqh1;
    }

    public void setDcqh1(String dcqh1) {
        this.dcqh1 = dcqh1;
    }

    public String getDcqh2() {
        return dcqh2;
    }

    public void setDcqh2(String dcqh2) {
        this.dcqh2 = dcqh2;
    }

    public String getDcqh3() {
        return dcqh3;
    }

    public void setDcqh3(String dcqh3) {
        this.dcqh3 = dcqh3;
    }

    public String getDcqh4() {
        return dcqh4;
    }

    public void setDcqh4(String dcqh4) {
        this.dcqh4 = dcqh4;
    }

    public String getDcqh5() {
        return dcqh5;
    }

    public void setDcqh5(String dcqh5) {
        this.dcqh5 = dcqh5;
    }

    public String getDcqh6() {
        return dcqh6;
    }

    public void setDcqh6(String dcqh6) {
        this.dcqh6 = dcqh6;
    }

    public String getDcqh7() {
        return dcqh7;
    }

    public void setDcqh7(String dcqh7) {
        this.dcqh7 = dcqh7;
    }

    public String getDcqh8() {
        return dcqh8;
    }

    public void setDcqh8(String dcqh8) {
        this.dcqh8 = dcqh8;
    }

    @Override
    protected Serializable pkVal() {
        return this.id1;
    }
}
