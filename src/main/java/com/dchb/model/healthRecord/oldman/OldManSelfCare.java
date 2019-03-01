package com.dchb.model.healthRecord.oldman;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dchb.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@TableName("SA")
public class OldManSelfCare implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("PID")
    private String pid;

    @TableField("PNAME")
    private String pname;

    @TableField("IDCARD")
    private String idcard;

    @TableField("AA")
    private Boolean aa;

    @TableField("AB")
    private Boolean ab;

    @TableField("AC")
    private Boolean ac;

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
    private Boolean oldas;

    @TableField("AT")
    private Boolean at;

    @TableField("AU")
    private Integer au;

    @TableField("AV")
    private Date av;

    @TableField("AW")
    private String aw;

    @TableField("AX")
    private String ax;

    @TableField("AY")
    private Date ay;

    @TableField("AZ")
    private String az;

    @TableField("DtCreate")
    private Date DtCreate;

    @TableField("DOCTORID")
    private String doctorid;

    @TableField("RegionID")
    private String RegionID;

    @TableField("DtLastModi")
    private Date DtLastModi;

    @TableField("EmptyNum")
    private Integer EmptyNum;

    @TableField("EmptyFeilds")
    private String EmptyFeilds;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Boolean getAa() {
		return aa;
	}

	public void setAa(Boolean aa) {
		this.aa = aa;
	}

	public Boolean getAb() {
		return ab;
	}

	public void setAb(Boolean ab) {
		this.ab = ab;
	}

	public Boolean getAc() {
		return ac;
	}

	public void setAc(Boolean ac) {
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
	
	public Boolean getOldas() {
		return oldas;
	}

	public void setOldas(Boolean oldas) {
		this.oldas = oldas;
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

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getAv() {
		return av;
	}

	public void setAv(Date av) {
		this.av = av;
	}

	public String getAw() {
		return aw;
	}

	public void setAw(String aw) {
		this.aw = aw;
	}

	public String getAx() {
		return ax;
	}

	public void setAx(String ax) {
		this.ax = ax;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getAy() {
		return ay;
	}

	public void setAy(Date ay) {
		this.ay = ay;
	}

	public String getAz() {
		return az;
	}

	public void setAz(String az) {
		this.az = az;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getDtCreate() {
		return DtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		DtCreate = dtCreate;
	}

	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getRegionID() {
		return RegionID;
	}

	public void setRegionID(String regionID) {
		RegionID = regionID;
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
}
