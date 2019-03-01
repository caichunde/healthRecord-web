package com.dchb.web.healthRecord.hicp;


import com.dchb.model.healthRecord.hicp.*;
import com.dchb.service.healthRecord.hicp.*;
import com.dchb.util.BaseController;
import com.dchb.util.IReturn;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 慢性患者健康信息前端控制器
 * </p>
 * hicp 为Health Information for Chronic Patients简写
 *
 * @author caichunde
 * @since 2018-11-28
 */
@RestController
@RequestMapping("/hicp")
public class HicpController extends BaseController {
    //脑卒中、冠心病发病报告卡表FB服务类
    @Autowired
    private FbService fbService;
    //冠心病患者随访表HB服务类
    @Autowired
    private HbService hbService;
    //脑卒中患者随访表IB服务类
    @Autowired
    private IbService ibService;
    //高血压患者随访服务记录表TA服务类
    @Autowired
    private TaService taService;
    //2型糖尿病患者随访服务记录表UA服务类
    @Autowired
    private UaService uaService;

    /**
     * @param String bx 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取脑卒中、冠心病发病报告卡日期信息
     * @date 2018-12-4
     */
    @RequestMapping(value = "/getFbDateList", method = RequestMethod.POST)
    public IReturn getFbDateList(String bx) {
        List<Map<String, Object>> fbDateList = fbService.getFbDateList(bx);
        return new IReturn(true, "操作成功！", fbDateList);
    }

    /**
     * @param String bx 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取脑卒中、冠心病发病报告卡表患者信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getFbOne", method = RequestMethod.POST)
    public IReturn getFbOne(String bx, String bt) {
        if (StringUtils.isEmpty(bt)) {
            List<Map<String, Object>> fbDateList = fbService.getFbDateList(bx);
            if (fbDateList.size() > 0) {
                Map<String, Object> map = fbDateList.get(0);
                bt = map.get("bt").toString();
            }
        }
        Fb fb = fbService.getFbOne(bx, bt);
        if (null == fb) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", fb);
    }

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取患者冠心病随访表随访日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getHbDateList", method = RequestMethod.POST)
    public IReturn getHbDateList(String ab) {
        List<Map<String, Object>> hbDateList = hbService.getHbDateList(ab);
        return new IReturn(true, "操作成功！", hbDateList);
    }

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取冠心病患者随访表信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getHbOne", method = RequestMethod.POST)
    public IReturn getHbOne(String ab, String ac) {
        if (StringUtils.isEmpty(ac)) {
            List<Map<String, Object>> hbDateList = hbService.getHbDateList(ab);
            if (hbDateList.size() > 0) {
                Map<String, Object> map = hbDateList.get(0);
                ac = map.get("ac").toString();
            }
        }
        Hb hb = hbService.getHbOne(ab, ac);
        if (null == hb) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", hb);
    }

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取脑卒中患者随访表随访日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getIbDateList", method = RequestMethod.POST)
    public IReturn getIbDateList(String ab) {
        List<Map<String, Object>> ibDateList = ibService.getIbDateList(ab);
        return new IReturn(true, "操作成功！", ibDateList);
    }

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取脑卒中患者随访表信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getIbOne", method = RequestMethod.POST)
    public IReturn getIbOne(String ab, String ac) {
        if (StringUtils.isEmpty(ac)) {
            List<Map<String, Object>> ibDateList = ibService.getIbDateList(ab);
            if (ibDateList.size() > 0) {
                Map<String, Object> map = ibDateList.get(0);
                ac = map.get("ac").toString();
            }
        }
        Ib ib = ibService.getIbOne(ab, ac);
        if (null == ib) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", ib);
    }

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取高血压患者随访服务记录表日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getTaDateList", method = RequestMethod.POST)
    public IReturn getTaDateList(String ab) {
        List<Map<String, Object>> ibDateList = taService.getTaDateList(ab);
        return new IReturn(true, "操作成功！", ibDateList);
    }

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取高血压患者随访服务记录表信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getTaOne", method = RequestMethod.POST)
    public IReturn getTaOne(String ab, String ac) {
        if (StringUtils.isEmpty(ac)) {
            List<Map<String, Object>> taDateList = taService.getTaDateList(ab);
            if (taDateList.size() > 0) {
                Map<String, Object> map = taDateList.get(0);
                ac = map.get("ac").toString();
            }
        }
        Ta ta = taService.getTaOne(ab, ac);
        if (null == ta) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", ta);
    }

    /**
     * @param String ab  档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取2型糖尿病患者随访服务记录表随访日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getUaDateList", method = RequestMethod.POST)
    public IReturn getUaDateList(String ab) {
        List<Map<String, Object>> uaDateList = uaService.getUaDateList(ab);
        return new IReturn(true, "操作成功！", uaDateList);
    }

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取2型糖尿病患者随访服务记录表随访信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getUaOne")
    public IReturn getUaOne(String ab, String ac) {
        if (StringUtils.isEmpty(ac)) {
            List<Map<String, Object>> uaDateList = uaService.getUaDateList(ab);
            if (uaDateList.size() > 0) {
                Map<String, Object> map = uaDateList.get(0);
                ac = map.get("ac").toString();
            }
        }
        Ua ua = uaService.getUaOne(ab, ac);
        if (null == ua) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", ua);
    }
}

