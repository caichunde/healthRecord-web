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
public class Pa extends Model<Pa> {

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

    private Double ag;

    private Double ah;

    private Double ai;

    private String aj;

    private Integer ak;

    private Integer ak1;

    private Integer al;

    private Integer am;

    private Double an;

    private String ao;

    private String ap;

    private Boolean aq;

    private Boolean ar;

    //分类异常具体
    @TableField("[as]")
    private String flycjt;

    private Boolean at;

    private Boolean au;

    private Boolean av;

    private Boolean aw;

    private Boolean ax;

    private Boolean ay;

    private Boolean az;

    private Boolean ba;

    private Boolean bb;

    private String bc;

    private Boolean bd;

    private Boolean be;

    private String bf;

    private String bg;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date bh;

    private String bi;

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

    private Boolean bj;

    private Boolean bk;

    private Boolean bl;

    private Boolean bm;

    private Boolean bn;

    private String bo;

    private Boolean bp;

    private Boolean bq;

    private Boolean br;

    private Boolean bs;

    private Boolean bt;

    private Boolean bu;

    private String bv;

    private String bw;

    private Boolean bx;

    private Boolean byo;

    private String bz;


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

    public Double getAg() {
        return ag;
    }

    public void setAg(Double ag) {
        this.ag = ag;
    }

    public Double getAh() {
        return ah;
    }

    public void setAh(Double ah) {
        this.ah = ah;
    }

    public Double getAi() {
        return ai;
    }

    public void setAi(Double ai) {
        this.ai = ai;
    }

    public String getAj() {
        return aj;
    }

    public void setAj(String aj) {
        this.aj = aj;
    }

    public Integer getAk() {
        return ak;
    }

    public void setAk(Integer ak) {
        this.ak = ak;
    }

    public Integer getAk1() {
        return ak1;
    }

    public void setAk1(Integer ak1) {
        this.ak1 = ak1;
    }

    public Integer getAl() {
        return al;
    }

    public void setAl(Integer al) {
        this.al = al;
    }

    public Integer getAm() {
        return am;
    }

    public void setAm(Integer am) {
        this.am = am;
    }

    public Double getAn() {
        return an;
    }

    public void setAn(Double an) {
        this.an = an;
    }

    public String getAo() {
        return ao;
    }

    public void setAo(String ao) {
        this.ao = ao;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
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

    public String getFlycjt() {
        return flycjt;
    }

    public void setFlycjt(String flycjt) {
        this.flycjt = flycjt;
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

    public String getBf() {
        return bf;
    }

    public void setBf(String bf) {
        this.bf = bf;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public Date getBh() {
        return bh;
    }

    public void setBh(Date bh) {
        this.bh = bh;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
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

    public String getBo() {
        return bo;
    }

    public void setBo(String bo) {
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

    public Boolean getBx() {
        return bx;
    }

    public void setBx(Boolean bx) {
        this.bx = bx;
    }

    public Boolean getByo() {
        return byo;
    }

    public void setByo(Boolean byo) {
        this.byo = byo;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
