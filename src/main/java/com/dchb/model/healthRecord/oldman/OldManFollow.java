package com.dchb.model.healthRecord.oldman;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dchb.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@TableName("SB")
public class OldManFollow implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("IDCARD")
    private String idcard;

    @TableField("pid")
    private String pid;

    @TableField("pname")
    private String pname;

    @TableField("antime")
    private Date antime;

    @TableField("A1")
    private Integer a1;

    @TableField("A2")
    private Integer a2;

    @TableField("A3")
    private Integer a3;

    @TableField("A4")
    private Integer a4;

    @TableField("A5")
    private Integer a5;

    @TableField("A6")
    private Integer a6;

    @TableField("A7")
    private Integer a7;

    @TableField("A8")
    private Integer a8;

    @TableField("A9")
    private Integer a9;

    @TableField("AA")
    private Integer aa;

    @TableField("AB")
    private Integer ab;

    @TableField("AC")
    private Integer ac;

    @TableField("AD")
    private Integer ad;

    @TableField("AE")
    private Integer ae;

    @TableField("AF")
    private Integer af;

    @TableField("AG")
    private Integer ag;

    @TableField("AH")
    private Integer ah;

    @TableField("AI")
    private Integer ai;

    @TableField("AJ")
    private Integer aj;

    @TableField("AK")
    private Integer ak;

    @TableField("AL")
    private Integer al;

    @TableField("AM")
    private Integer am;

    @TableField("AN")
    private Integer an;

    @TableField("AO")
    private Integer ao;

    @TableField("AP")
    private Integer ap;

    @TableField("AQ")
    private Integer aq;

    @TableField("AR")
    private Integer ar;

    @TableField("[AS]")
    private Integer fwas;

    @TableField("AT")
    private Integer at;

    @TableField("AU")
    private Integer au;

    @TableField("AV")
    private Integer av;

    @TableField("AW")
    private Integer aw;

    @TableField("AX")
    private Integer ax;

    @TableField("TA1")
    private Integer ta1;

    @TableField("TA2")
    private Boolean ta2;

    @TableField("TA3")
    private Boolean ta3;

    @TableField("TA4")
    private Boolean ta4;

    @TableField("TA5")
    private Boolean ta5;

    @TableField("TA6")
    private Boolean ta6;

    @TableField("TA7")
    private Boolean ta7;

    @TableField("TA8")
    private Boolean ta8;

    @TableField("TA9")
    private String ta9;

    @TableField("TB1")
    private Integer tb1;

    @TableField("TB2")
    private Boolean tb2;

    @TableField("TB3")
    private Boolean tb3;

    @TableField("TB4")
    private Boolean tb4;

    @TableField("TB5")
    private Boolean tb5;

    @TableField("TB6")
    private Boolean tb6;

    @TableField("TB7")
    private Boolean tb7;

    @TableField("TB8")
    private Boolean tb8;

    @TableField("TB9")
    private String tb9;

    @TableField("TC1")
    private Integer tc1;

    @TableField("TC2")
    private Boolean tc2;

    @TableField("TC3")
    private Boolean tc3;

    @TableField("TC4")
    private Boolean tc4;

    @TableField("TC5")
    private Boolean tc5;

    @TableField("TC6")
    private Boolean tc6;

    @TableField("TC7")
    private Boolean tc7;

    @TableField("TC8")
    private Boolean tc8;

    @TableField("TC9")
    private String tc9;

    @TableField("TD1")
    private Integer td1;

    @TableField("TD2")
    private Boolean td2;

    @TableField("TD3")
    private Boolean td3;

    @TableField("TD4")
    private Boolean td4;

    @TableField("TD5")
    private Boolean td5;

    @TableField("TD6")
    private Boolean td6;

    @TableField("TD7")
    private Boolean td7;

    @TableField("TD8")
    private Boolean td8;

    @TableField("TD9")
    private String td9;

    @TableField("TE1")
    private Integer te1;

    @TableField("TE2")
    private Boolean te2;

    @TableField("TE3")
    private Boolean te3;

    @TableField("TE4")
    private Boolean te4;

    @TableField("TE5")
    private Boolean te5;

    @TableField("TE6")
    private Boolean te6;

    @TableField("TE7")
    private Boolean te7;

    @TableField("TE8")
    private Boolean te8;

    @TableField("TE9")
    private String te9;

    @TableField("TF1")
    private Integer tf1;

    @TableField("TF2")
    private Boolean tf2;

    @TableField("TF3")
    private Boolean tf3;

    @TableField("TF4")
    private Boolean tf4;

    @TableField("TF5")
    private Boolean tf5;

    @TableField("TF6")
    private Boolean tf6;

    @TableField("TF7")
    private Boolean tf7;

    @TableField("TF8")
    private Boolean tf8;

    @TableField("TF9")
    private String tf9;

    @TableField("TG1")
    private Integer tg1;

    @TableField("TG2")
    private Boolean tg2;

    @TableField("TG3")
    private Boolean tg3;

    @TableField("TG4")
    private Boolean tg4;

    @TableField("TG5")
    private Boolean tg5;

    @TableField("TG6")
    private Boolean tg6;

    @TableField("TG7")
    private Boolean tg7;

    @TableField("TG8")
    private Boolean tg8;

    @TableField("TG9")
    private String tg9;

    @TableField("TH1")
    private Integer th1;

    @TableField("TH2")
    private Boolean th2;

    @TableField("TH3")
    private Boolean th3;

    @TableField("TH4")
    private Boolean th4;

    @TableField("TH5")
    private Boolean th5;

    @TableField("TH6")
    private Boolean th6;

    @TableField("TH7")
    private Boolean th7;

    @TableField("TH8")
    private Boolean th8;

    @TableField("TH9")
    private String th9;

    @TableField("TI1")
    private Integer ti1;

    @TableField("TI2")
    private Boolean ti2;

    @TableField("TI3")
    private Boolean ti3;

    @TableField("TI4")
    private Boolean ti4;

    @TableField("TI5")
    private Boolean ti5;

    @TableField("TI6")
    private Boolean ti6;

    @TableField("TI7")
    private Boolean ti7;

    @TableField("TI8")
    private Boolean ti8;

    @TableField("TI9")
    private String ti9;

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

    @TableField("DT")
    private String dt;

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

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getAntime() {
		return antime;
	}

	public void setAntime(Date antime) {
		this.antime = antime;
	}

	public Integer getA1() {
		return a1;
	}

	public void setA1(Integer a1) {
		this.a1 = a1;
	}

	public Integer getA2() {
		return a2;
	}

	public void setA2(Integer a2) {
		this.a2 = a2;
	}

	public Integer getA3() {
		return a3;
	}

	public void setA3(Integer a3) {
		this.a3 = a3;
	}

	public Integer getA4() {
		return a4;
	}

	public void setA4(Integer a4) {
		this.a4 = a4;
	}

	public Integer getA5() {
		return a5;
	}

	public void setA5(Integer a5) {
		this.a5 = a5;
	}

	public Integer getA6() {
		return a6;
	}

	public void setA6(Integer a6) {
		this.a6 = a6;
	}

	public Integer getA7() {
		return a7;
	}

	public void setA7(Integer a7) {
		this.a7 = a7;
	}

	public Integer getA8() {
		return a8;
	}

	public void setA8(Integer a8) {
		this.a8 = a8;
	}

	public Integer getA9() {
		return a9;
	}

	public void setA9(Integer a9) {
		this.a9 = a9;
	}

	public Integer getAa() {
		return aa;
	}

	public void setAa(Integer aa) {
		this.aa = aa;
	}

	public Integer getAb() {
		return ab;
	}

	public void setAb(Integer ab) {
		this.ab = ab;
	}

	public Integer getAc() {
		return ac;
	}

	public void setAc(Integer ac) {
		this.ac = ac;
	}

	public Integer getAd() {
		return ad;
	}

	public void setAd(Integer ad) {
		this.ad = ad;
	}

	public Integer getAe() {
		return ae;
	}

	public void setAe(Integer ae) {
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

	public Integer getAk() {
		return ak;
	}

	public void setAk(Integer ak) {
		this.ak = ak;
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

	public Integer getAn() {
		return an;
	}

	public void setAn(Integer an) {
		this.an = an;
	}

	public Integer getAo() {
		return ao;
	}

	public void setAo(Integer ao) {
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

	public Integer getAr() {
		return ar;
	}

	public void setAr(Integer ar) {
		this.ar = ar;
	}

	public Integer getFwas() {
		return fwas;
	}

	public void setFwas(Integer fwas) {
		this.fwas = fwas;
	}

	public Integer getAt() {
		return at;
	}

	public void setAt(Integer at) {
		this.at = at;
	}

	public Integer getAu() {
		return au;
	}

	public void setAu(Integer au) {
		this.au = au;
	}

	public Integer getAv() {
		return av;
	}

	public void setAv(Integer av) {
		this.av = av;
	}

	public Integer getAw() {
		return aw;
	}

	public void setAw(Integer aw) {
		this.aw = aw;
	}

	public Integer getAx() {
		return ax;
	}

	public void setAx(Integer ax) {
		this.ax = ax;
	}

	public Integer getTa1() {
		return ta1;
	}

	public void setTa1(Integer ta1) {
		this.ta1 = ta1;
	}

	public Boolean getTa2() {
		return ta2;
	}

	public void setTa2(Boolean ta2) {
		this.ta2 = ta2;
	}

	public Boolean getTa3() {
		return ta3;
	}

	public void setTa3(Boolean ta3) {
		this.ta3 = ta3;
	}

	public Boolean getTa4() {
		return ta4;
	}

	public void setTa4(Boolean ta4) {
		this.ta4 = ta4;
	}

	public Boolean getTa5() {
		return ta5;
	}

	public void setTa5(Boolean ta5) {
		this.ta5 = ta5;
	}

	public Boolean getTa6() {
		return ta6;
	}

	public void setTa6(Boolean ta6) {
		this.ta6 = ta6;
	}

	public Boolean getTa7() {
		return ta7;
	}

	public void setTa7(Boolean ta7) {
		this.ta7 = ta7;
	}

	public Boolean getTa8() {
		return ta8;
	}

	public void setTa8(Boolean ta8) {
		this.ta8 = ta8;
	}

	public String getTa9() {
		return ta9;
	}

	public void setTa9(String ta9) {
		this.ta9 = ta9;
	}

	public Integer getTb1() {
		return tb1;
	}

	public void setTb1(Integer tb1) {
		this.tb1 = tb1;
	}

	public Boolean getTb2() {
		return tb2;
	}

	public void setTb2(Boolean tb2) {
		this.tb2 = tb2;
	}

	public Boolean getTb3() {
		return tb3;
	}

	public void setTb3(Boolean tb3) {
		this.tb3 = tb3;
	}

	public Boolean getTb4() {
		return tb4;
	}

	public void setTb4(Boolean tb4) {
		this.tb4 = tb4;
	}

	public Boolean getTb5() {
		return tb5;
	}

	public void setTb5(Boolean tb5) {
		this.tb5 = tb5;
	}

	public Boolean getTb6() {
		return tb6;
	}

	public void setTb6(Boolean tb6) {
		this.tb6 = tb6;
	}

	public Boolean getTb7() {
		return tb7;
	}

	public void setTb7(Boolean tb7) {
		this.tb7 = tb7;
	}

	public Boolean getTb8() {
		return tb8;
	}

	public void setTb8(Boolean tb8) {
		this.tb8 = tb8;
	}

	public String getTb9() {
		return tb9;
	}

	public void setTb9(String tb9) {
		this.tb9 = tb9;
	}

	public Integer getTc1() {
		return tc1;
	}

	public void setTc1(Integer tc1) {
		this.tc1 = tc1;
	}

	public Boolean getTc2() {
		return tc2;
	}

	public void setTc2(Boolean tc2) {
		this.tc2 = tc2;
	}

	public Boolean getTc3() {
		return tc3;
	}

	public void setTc3(Boolean tc3) {
		this.tc3 = tc3;
	}

	public Boolean getTc4() {
		return tc4;
	}

	public void setTc4(Boolean tc4) {
		this.tc4 = tc4;
	}

	public Boolean getTc5() {
		return tc5;
	}

	public void setTc5(Boolean tc5) {
		this.tc5 = tc5;
	}

	public Boolean getTc6() {
		return tc6;
	}

	public void setTc6(Boolean tc6) {
		this.tc6 = tc6;
	}

	public Boolean getTc7() {
		return tc7;
	}

	public void setTc7(Boolean tc7) {
		this.tc7 = tc7;
	}

	public Boolean getTc8() {
		return tc8;
	}

	public void setTc8(Boolean tc8) {
		this.tc8 = tc8;
	}

	public String getTc9() {
		return tc9;
	}

	public void setTc9(String tc9) {
		this.tc9 = tc9;
	}

	public Integer getTd1() {
		return td1;
	}

	public void setTd1(Integer td1) {
		this.td1 = td1;
	}

	public Boolean getTd2() {
		return td2;
	}

	public void setTd2(Boolean td2) {
		this.td2 = td2;
	}

	public Boolean getTd3() {
		return td3;
	}

	public void setTd3(Boolean td3) {
		this.td3 = td3;
	}

	public Boolean getTd4() {
		return td4;
	}

	public void setTd4(Boolean td4) {
		this.td4 = td4;
	}

	public Boolean getTd5() {
		return td5;
	}

	public void setTd5(Boolean td5) {
		this.td5 = td5;
	}

	public Boolean getTd6() {
		return td6;
	}

	public void setTd6(Boolean td6) {
		this.td6 = td6;
	}

	public Boolean getTd7() {
		return td7;
	}

	public void setTd7(Boolean td7) {
		this.td7 = td7;
	}

	public Boolean getTd8() {
		return td8;
	}

	public void setTd8(Boolean td8) {
		this.td8 = td8;
	}

	public String getTd9() {
		return td9;
	}

	public void setTd9(String td9) {
		this.td9 = td9;
	}

	public Integer getTe1() {
		return te1;
	}

	public void setTe1(Integer te1) {
		this.te1 = te1;
	}

	public Boolean getTe2() {
		return te2;
	}

	public void setTe2(Boolean te2) {
		this.te2 = te2;
	}

	public Boolean getTe3() {
		return te3;
	}

	public void setTe3(Boolean te3) {
		this.te3 = te3;
	}

	public Boolean getTe4() {
		return te4;
	}

	public void setTe4(Boolean te4) {
		this.te4 = te4;
	}

	public Boolean getTe5() {
		return te5;
	}

	public void setTe5(Boolean te5) {
		this.te5 = te5;
	}

	public Boolean getTe6() {
		return te6;
	}

	public void setTe6(Boolean te6) {
		this.te6 = te6;
	}

	public Boolean getTe7() {
		return te7;
	}

	public void setTe7(Boolean te7) {
		this.te7 = te7;
	}

	public Boolean getTe8() {
		return te8;
	}

	public void setTe8(Boolean te8) {
		this.te8 = te8;
	}

	public String getTe9() {
		return te9;
	}

	public void setTe9(String te9) {
		this.te9 = te9;
	}

	public Integer getTf1() {
		return tf1;
	}

	public void setTf1(Integer tf1) {
		this.tf1 = tf1;
	}

	public Boolean getTf2() {
		return tf2;
	}

	public void setTf2(Boolean tf2) {
		this.tf2 = tf2;
	}

	public Boolean getTf3() {
		return tf3;
	}

	public void setTf3(Boolean tf3) {
		this.tf3 = tf3;
	}

	public Boolean getTf4() {
		return tf4;
	}

	public void setTf4(Boolean tf4) {
		this.tf4 = tf4;
	}

	public Boolean getTf5() {
		return tf5;
	}

	public void setTf5(Boolean tf5) {
		this.tf5 = tf5;
	}

	public Boolean getTf6() {
		return tf6;
	}

	public void setTf6(Boolean tf6) {
		this.tf6 = tf6;
	}

	public Boolean getTf7() {
		return tf7;
	}

	public void setTf7(Boolean tf7) {
		this.tf7 = tf7;
	}

	public Boolean getTf8() {
		return tf8;
	}

	public void setTf8(Boolean tf8) {
		this.tf8 = tf8;
	}

	public String getTf9() {
		return tf9;
	}

	public void setTf9(String tf9) {
		this.tf9 = tf9;
	}

	public Integer getTg1() {
		return tg1;
	}

	public void setTg1(Integer tg1) {
		this.tg1 = tg1;
	}

	public Boolean getTg2() {
		return tg2;
	}

	public void setTg2(Boolean tg2) {
		this.tg2 = tg2;
	}

	public Boolean getTg3() {
		return tg3;
	}

	public void setTg3(Boolean tg3) {
		this.tg3 = tg3;
	}

	public Boolean getTg4() {
		return tg4;
	}

	public void setTg4(Boolean tg4) {
		this.tg4 = tg4;
	}

	public Boolean getTg5() {
		return tg5;
	}

	public void setTg5(Boolean tg5) {
		this.tg5 = tg5;
	}

	public Boolean getTg6() {
		return tg6;
	}

	public void setTg6(Boolean tg6) {
		this.tg6 = tg6;
	}

	public Boolean getTg7() {
		return tg7;
	}

	public void setTg7(Boolean tg7) {
		this.tg7 = tg7;
	}

	public Boolean getTg8() {
		return tg8;
	}

	public void setTg8(Boolean tg8) {
		this.tg8 = tg8;
	}

	public String getTg9() {
		return tg9;
	}

	public void setTg9(String tg9) {
		this.tg9 = tg9;
	}

	public Integer getTh1() {
		return th1;
	}

	public void setTh1(Integer th1) {
		this.th1 = th1;
	}

	public Boolean getTh2() {
		return th2;
	}

	public void setTh2(Boolean th2) {
		this.th2 = th2;
	}

	public Boolean getTh3() {
		return th3;
	}

	public void setTh3(Boolean th3) {
		this.th3 = th3;
	}

	public Boolean getTh4() {
		return th4;
	}

	public void setTh4(Boolean th4) {
		this.th4 = th4;
	}

	public Boolean getTh5() {
		return th5;
	}

	public void setTh5(Boolean th5) {
		this.th5 = th5;
	}

	public Boolean getTh6() {
		return th6;
	}

	public void setTh6(Boolean th6) {
		this.th6 = th6;
	}

	public Boolean getTh7() {
		return th7;
	}

	public void setTh7(Boolean th7) {
		this.th7 = th7;
	}

	public Boolean getTh8() {
		return th8;
	}

	public void setTh8(Boolean th8) {
		this.th8 = th8;
	}

	public String getTh9() {
		return th9;
	}

	public void setTh9(String th9) {
		this.th9 = th9;
	}

	public Integer getTi1() {
		return ti1;
	}

	public void setTi1(Integer ti1) {
		this.ti1 = ti1;
	}

	public Boolean getTi2() {
		return ti2;
	}

	public void setTi2(Boolean ti2) {
		this.ti2 = ti2;
	}

	public Boolean getTi3() {
		return ti3;
	}

	public void setTi3(Boolean ti3) {
		this.ti3 = ti3;
	}

	public Boolean getTi4() {
		return ti4;
	}

	public void setTi4(Boolean ti4) {
		this.ti4 = ti4;
	}

	public Boolean getTi5() {
		return ti5;
	}

	public void setTi5(Boolean ti5) {
		this.ti5 = ti5;
	}

	public Boolean getTi6() {
		return ti6;
	}

	public void setTi6(Boolean ti6) {
		this.ti6 = ti6;
	}

	public Boolean getTi7() {
		return ti7;
	}

	public void setTi7(Boolean ti7) {
		this.ti7 = ti7;
	}

	public Boolean getTi8() {
		return ti8;
	}

	public void setTi8(Boolean ti8) {
		this.ti8 = ti8;
	}

	public String getTi9() {
		return ti9;
	}

	public void setTi9(String ti9) {
		this.ti9 = ti9;
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

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}
}
