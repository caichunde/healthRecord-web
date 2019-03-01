package com.dchb.model.healthRecord.mental;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dchb.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@TableName("VA")
public class MentalVA implements Serializable {

	private static final long serialVersionUID = -6143302976507862176L;

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
    private String ac;

    @TableField("AD")
    private String ad;

    @TableField("AE")
    private String ae;

    @TableField("AF")
    private String af;

    @TableField("AG")
    private String ag;

    @TableField("AH")
    private String ah;

    @TableField("AI")
    private Boolean ai;

    @TableField("AJ")
    private Boolean aj;

    @TableField("AK")
    private String ak;

    @TableField("AL")
    private Date al;

    @TableField("AM")
    private Date am;

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
    private Boolean vaas;

    @TableField("AT")
    private Boolean at;

    @TableField("AU")
    private Boolean au;

    @TableField("AV")
    private Boolean av;

    @TableField("AW")
    private Boolean aw;

    @TableField("AX")
    private Boolean ax;

    @TableField("AY")
    private String ay;

    @TableField("AZ")
    private Boolean az;

    @TableField("BA")
    private Boolean ba;

    @TableField("BB")
    private Boolean bb;

    @TableField("BC")
    private Date bc;

    @TableField("BD")
    private Integer bd;

    @TableField("BE")
    private String be;

    @TableField("BF")
    private String bf;

    @TableField("BG")
    private Date bg;

    @TableField("BH")
    private Boolean bh;

    @TableField("BI")
    private Boolean bi;

    @TableField("BJ")
    private Boolean bj;

    @TableField("BK")
    private Boolean bk;

    @TableField("BL")
    private Integer bl;

    @TableField("BM")
    private Integer bm;

    @TableField("BN")
    private Integer bn;

    @TableField("BO")
    private Integer bo;

    @TableField("BP")
    private Integer bp;

    @TableField("BQ")
    private Boolean bq;

    @TableField("BR")
    private Boolean br;

    @TableField("BS")
    private Boolean bs;

    @TableField("BT")
    private Boolean bt;

    @TableField("BU")
    private Boolean bu;

    @TableField("BV")
    private Boolean bv;

    @TableField("BW")
    private Boolean bw;

    @TableField("BX")
    private String bx;

    @TableField("[BY]")
    private Date vaby;

    @TableField("BZ")
    private String bz;

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
    private Boolean cg;

    @TableField("CH")
    private Boolean ch;

    @TableField("CI")
    private Boolean ci;

    @TableField("CJ")
    private Boolean cj;

    @TableField("CK")
    private Boolean ck;

    @TableField("CL")
    private Integer cl;

    @TableField("CM")
    private String cm;

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

	public String getAk() {
		return ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getAl() {
		return al;
	}

	public void setAl(Date al) {
		this.al = al;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getAm() {
		return am;
	}

	public void setAm(Date am) {
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

	public Boolean getVaas() {
		return vaas;
	}

	public void setVaas(Boolean vaas) {
		this.vaas = vaas;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getVaby() {
		return vaby;
	}

	public void setVaby(Date vaby) {
		this.vaby = vaby;
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

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getBc() {
		return bc;
	}

	public void setBc(Date bc) {
		this.bc = bc;
	}

	public Integer getBd() {
		return bd;
	}

	public void setBd(Integer bd) {
		this.bd = bd;
	}

	public String getBe() {
		return be;
	}

	public void setBe(String be) {
		this.be = be;
	}

	public String getBf() {
		return bf;
	}

	public void setBf(String bf) {
		this.bf = bf;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getBg() {
		return bg;
	}

	public void setBg(Date bg) {
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

	public Integer getBl() {
		return bl;
	}

	public void setBl(Integer bl) {
		this.bl = bl;
	}

	public Integer getBm() {
		return bm;
	}

	public void setBm(Integer bm) {
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

	public String getBx() {
		return bx;
	}

	public void setBx(String bx) {
		this.bx = bx;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
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

	public Integer getCl() {
		return cl;
	}

	public void setCl(Integer cl) {
		this.cl = cl;
	}

	public String getCm() {
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

}
