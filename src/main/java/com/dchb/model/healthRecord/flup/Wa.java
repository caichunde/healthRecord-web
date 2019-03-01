package com.dchb.model.healthRecord.flup;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dchb.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@TableName("WA")
public class Wa implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("IDCARD")
    private String idcard;

    @TableField("DOCTORID")
    private String doctorid;

    @TableField("AA")
    private String aa;

    @TableField("AB")
    private String ab;

    @TableField("AC")
    private Date ac;

    @TableField("AD")
    private Boolean ad;

    @TableField("AE")
    private Boolean ae;

    @TableField("AF")
    private Boolean af;

    @TableField("AG")
    private Boolean ag;

    @TableField("AH")
    private Boolean ah;

    @TableField("AI")
    private Boolean ai;

    @TableField("AJ")
    private Boolean aj;

    @TableField("AK")
    private Boolean ak;

    @TableField("AL")
    private Boolean al;

    @TableField("AM")
    private Boolean am;

    @TableField("AN")
    private Boolean an;

    @TableField("AO")
    private Boolean ao;

    @TableField("AP")
    private Boolean ap;

    @TableField("AQ")
    private Boolean aq;

    @TableField("AR")
    private Boolean ar;

    @TableField("[AS]")
    private Boolean waas;

    @TableField("AT")
    private Boolean at;

    @TableField("AU")
    private String au;

    @TableField("AV")
    private Boolean av;

    @TableField("AW")
    private Boolean aw;

    @TableField("AX")
    private Boolean ax;

    @TableField("AY")
    private Boolean ay;

    @TableField("AZ")
    private Boolean az;

    @TableField("BA")
    private Boolean ba;

    @TableField("BB")
    private Boolean bb;

    @TableField("BC")
    private Boolean bc;

    @TableField("BD")
    private Boolean bd;

    @TableField("BE")
    private Boolean be;

    @TableField("BF")
    private Boolean bf;

    @TableField("BG")
    private Boolean bg;

    @TableField("BH")
    private Boolean bh;

    @TableField("BI")
    private Boolean bi;

    @TableField("BJ")
    private Boolean bj;

    @TableField("BK")
    private Boolean bk;

    @TableField("BL")
    private Boolean bl;

    @TableField("BM")
    private Boolean bm;

    @TableField("BN")
    private Boolean bn;

    @TableField("BO")
    private Boolean bo;

    @TableField("BP")
    private Boolean bp;

    @TableField("BQ")
    private Boolean bq;

    @TableField("BR")
    private Boolean br;

    @TableField("BS")
    private Boolean bs;

    @TableField("BT")
    private Boolean bt;

    @TableField("BU")
    private Integer bu;

    @TableField("BV")
    private Integer bv;

    @TableField("BW")
    private Integer bw;

    @TableField("BX")
    private Integer bx;

    @TableField("[BY]")
    private Integer waby;

    @TableField("BZ")
    private Boolean bz;

    @TableField("CA")
    private Boolean ca;

    @TableField("CB")
    private Boolean cb;

    @TableField("CC")
    private Boolean cc;

    @TableField("CD")
    private Boolean cd;

    @TableField("CE")
    private Boolean ce;

    @TableField("CF")
    private Boolean cf;

    @TableField("CG")
    private Date cg;

    @TableField("CH")
    private Boolean ch;

    @TableField("CI")
    private Boolean ci;

    @TableField("CJ")
    private String cj;

    @TableField("CK")
    private Boolean ck;

    @TableField("CL")
    private Boolean cl;

    @TableField("CM")
    private Boolean cm;

    @TableField("CN")
    private Boolean cn;

    @TableField("CO")
    private Boolean co;

    @TableField("CP")
    private String cp;

    @TableField("CQ")
    private Boolean cq;

    @TableField("CR")
    private Boolean cr;

    @TableField("CT")
    private Boolean ct;

    @TableField("CU")
    private Boolean cu;

    @TableField("CV")
    private Boolean cv;

    @TableField("CW")
    private String cw;

    @TableField("CX")
    private String cx;

    @TableField("CY")
    private String cy;

    @TableField("CZ")
    private Integer cz;

    @TableField("DA")
    private Double da;

    @TableField("DB")
    private String db;

    @TableField("DC")
    private Integer dc;

    @TableField("DD")
    private Double dd;

    @TableField("DE")
    private String de;

    @TableField("DF")
    private Integer df;

    @TableField("DG")
    private Double dg;

    @TableField("DH")
    private Boolean dh;

    @TableField("DI")
    private Boolean di;

    @TableField("DJ")
    private Boolean dj;

    @TableField("DK")
    private Boolean dk;

    @TableField("DL")
    private Boolean dl;

    @TableField("DM")
    private String dm;

    @TableField("DN")
    private Boolean dn;

    @TableField("DO")
    private Boolean wado;

    @TableField("DP")
    private Boolean dp;

    @TableField("DQ")
    private Boolean dq;

    @TableField("DR")
    private Date dr;

    @TableField("DS")
    private String ds;

    @TableField("CS")
    private Boolean cs;

    @TableField("bnextvisited")
    private Boolean bnextvisited;

    @TableField("RegionID")
    private String RegionID;

    @TableField("DtCreate")
    private Date DtCreate;

    @TableField("DtLastModi")
    private Date DtLastModi;

    @TableField("EmptyNum")
    private Integer EmptyNum;

    @TableField("EmptyFeilds")
    private String EmptyFeilds;

    @TableField("bCityTran")
    private Integer bCityTran;

    @TableField("ErrorMsg")
    private String ErrorMsg;

    @TableField("DT")
    private Boolean dt;

    @TableField("DU")
    private Boolean du;

    @TableField("DV")
    private Boolean dv;

    @TableField("DW")
    private Boolean dw;

    @TableField("DX")
    private Boolean dx;

    @TableField("DY")
    private Boolean dy;

    @TableField("DZ")
    private Boolean dz;

    @TableField("EA")
    private Boolean ea;

    @TableField("EB")
    private Boolean eb;

    @TableField("EC")
    private String ec;

    @TableField("ED")
    private Date ed;

    @TableField("EE")
    private Boolean ee;

    @TableField("EF")
    private Boolean ef;

    @TableField("EG")
    private Boolean eg;

    @TableField("EH")
    private Boolean eh;

    @TableField("EI")
    private Boolean ei;

    @TableField("EJ")
    private Boolean ej;

    @TableField("EK")
    private Boolean ek;

    @TableField("EL")
    private Boolean el;

    @TableField("EM")
    private Boolean em;

    @TableField("EN")
    private Boolean en;

    @TableField("EO")
    private Boolean eo;

    @TableField("EP")
    private Boolean ep;

    @TableField("EQ")
    private Boolean eq;

    @TableField("ER")
    private Boolean er;

    @TableField("ES")
    private Integer es;

    @TableField("ET")
    private Boolean et;

    @TableField("EU")
    private Boolean eu;

    @TableField("EV")
    private Boolean ev;

    @TableField("EW")
    private String ew;

    @TableField("EX")
    private Integer ex;

    @TableField("EY")
    private Double ey;

    @TableField("EZ")
    private String ez;

    @TableField("FA")
    private Integer fa;

    @TableField("FB")
    private Double fb;

    @TableField("FC")
    private String fc;

    @TableField("FD")
    private Integer fd;

    @TableField("FE")
    private Double fe;

    @TableField("FF")
    private Boolean ff;

    @TableField("FG")
    private Boolean fg;

    @TableField("FH")
    private String fh;

    @TableField("FI")
    private String fi;

    @TableField("FJ")
    private String fj;

    @TableField("FK")
    private String fk;

    @TableField("FL")
    private Boolean fl;

    @TableField("FM")
    private Boolean fm;

    @TableField("FN")
    private String fn;

    @TableField("FO")
    private Boolean fo;

    @TableField("FP")
    private Boolean fp;

    @TableField("FQ")
    private String fq;

    @TableField("FR")
    private String fr;

    @TableField("FS")
    private String fs;

    @TableField("FT")
    private String ft;

    @TableField("FU")
    private Boolean fu;

    @TableField("FV")
    private Boolean fv;

    @TableField("FW")
    private String fw;

    @TableField("FX")
    private String fx;

    @TableField("FY")
    private String fy;

    @TableField("FZ")
    private String fz;

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


	public Boolean getAt() {
		return at;
	}

	public void setAt(Boolean at) {
		this.at = at;
	}

	public String getAu() {
		return au;
	}

	public void setAu(String au) {
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

	public Integer getBu() {
		return bu;
	}

	public void setBu(Integer bu) {
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

	public Integer getBx() {
		return bx;
	}

	public void setBx(Integer bx) {
		this.bx = bx;
	}

	public Boolean getWaas() {
		return waas;
	}

	public void setWaas(Boolean waas) {
		this.waas = waas;
	}

	public Integer getWaby() {
		return waby;
	}

	public void setWaby(Integer waby) {
		this.waby = waby;
	}

	public Boolean getBz() {
		return bz;
	}

	public void setBz(Boolean bz) {
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

	@JsonSerialize(using = JsonDateSerializer.class)
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

	public Boolean getCi() {
		return ci;
	}

	public void setCi(Boolean ci) {
		this.ci = ci;
	}

	public String getCj() {
		return cj;
	}

	public void setCj(String cj) {
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

	public Integer getCz() {
		return cz;
	}

	public void setCz(Integer cz) {
		this.cz = cz;
	}

	public Double getDa() {
		return da;
	}

	public void setDa(Double da) {
		this.da = da;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public Integer getDc() {
		return dc;
	}

	public void setDc(Integer dc) {
		this.dc = dc;
	}

	public Double getDd() {
		return dd;
	}

	public void setDd(Double dd) {
		this.dd = dd;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public Integer getDf() {
		return df;
	}

	public void setDf(Integer df) {
		this.df = df;
	}

	public Double getDg() {
		return dg;
	}

	public void setDg(Double dg) {
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

	public String getDm() {
		return dm;
	}

	public void setDm(String dm) {
		this.dm = dm;
	}

	public Boolean getDn() {
		return dn;
	}

	public void setDn(Boolean dn) {
		this.dn = dn;
	}

	public Boolean getWado() {
		return wado;
	}

	public void setWado(Boolean wado) {
		this.wado = wado;
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

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getDr() {
		return dr;
	}

	public void setDr(Date dr) {
		this.dr = dr;
	}

	public String getDs() {
		return ds;
	}

	public void setDs(String ds) {
		this.ds = ds;
	}

	public Boolean getCs() {
		return cs;
	}

	public void setCs(Boolean cs) {
		this.cs = cs;
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

	public void setRegionID(String regionID) {
		RegionID = regionID;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getDtCreate() {
		return DtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		DtCreate = dtCreate;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getDtLastModi() {
		return DtLastModi;
	}

	public void setDtLastModi(Date dtLastModi) {
		DtLastModi = dtLastModi;
	}

	public Integer getEmptyNum() {
		return EmptyNum;
	}

	public void setEmptyNum(Integer emptyNum) {
		EmptyNum = emptyNum;
	}

	public String getEmptyFeilds() {
		return EmptyFeilds;
	}

	public void setEmptyFeilds(String emptyFeilds) {
		EmptyFeilds = emptyFeilds;
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

	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
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

	public Boolean getEb() {
		return eb;
	}

	public void setEb(Boolean eb) {
		this.eb = eb;
	}

	public String getEc() {
		return ec;
	}

	public void setEc(String ec) {
		this.ec = ec;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getEd() {
		return ed;
	}

	public void setEd(Date ed) {
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

	public Integer getEs() {
		return es;
	}

	public void setEs(Integer es) {
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

	public String getEw() {
		return ew;
	}

	public void setEw(String ew) {
		this.ew = ew;
	}

	public Integer getEx() {
		return ex;
	}

	public void setEx(Integer ex) {
		this.ex = ex;
	}

	public Double getEy() {
		return ey;
	}

	public void setEy(Double ey) {
		this.ey = ey;
	}

	public String getEz() {
		return ez;
	}

	public void setEz(String ez) {
		this.ez = ez;
	}

	public Integer getFa() {
		return fa;
	}

	public void setFa(Integer fa) {
		this.fa = fa;
	}

	public Double getFb() {
		return fb;
	}

	public void setFb(Double fb) {
		this.fb = fb;
	}

	public String getFc() {
		return fc;
	}

	public void setFc(String fc) {
		this.fc = fc;
	}

	public Integer getFd() {
		return fd;
	}

	public void setFd(Integer fd) {
		this.fd = fd;
	}

	public Double getFe() {
		return fe;
	}

	public void setFe(Double fe) {
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

	public String getFh() {
		return fh;
	}

	public void setFh(String fh) {
		this.fh = fh;
	}

	public String getFi() {
		return fi;
	}

	public void setFi(String fi) {
		this.fi = fi;
	}

	public String getFj() {
		return fj;
	}

	public void setFj(String fj) {
		this.fj = fj;
	}

	public String getFk() {
		return fk;
	}

	public void setFk(String fk) {
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

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
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

	public String getFr() {
		return fr;
	}

	public void setFr(String fr) {
		this.fr = fr;
	}

	public String getFs() {
		return fs;
	}

	public void setFs(String fs) {
		this.fs = fs;
	}

	public String getFt() {
		return ft;
	}

	public void setFt(String ft) {
		this.ft = ft;
	}

	public Boolean getFu() {
		return fu;
	}

	public void setFu(Boolean fu) {
		this.fu = fu;
	}

	public Boolean getFv() {
		return fv;
	}

	public void setFv(Boolean fv) {
		this.fv = fv;
	}

	public String getFw() {
		return fw;
	}

	public void setFw(String fw) {
		this.fw = fw;
	}

	public String getFx() {
		return fx;
	}

	public void setFx(String fx) {
		this.fx = fx;
	}

	public String getFy() {
		return fy;
	}

	public void setFy(String fy) {
		this.fy = fy;
	}

	public String getFz() {
		return fz;
	}

	public void setFz(String fz) {
		this.fz = fz;
	}

}
