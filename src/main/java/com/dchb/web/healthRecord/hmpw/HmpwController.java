package com.dchb.web.healthRecord.hmpw;


import com.dchb.model.healthRecord.hmpw.Oa;
import com.dchb.model.healthRecord.hmpw.Pa;
import com.dchb.model.healthRecord.hmpw.Qa;
import com.dchb.model.healthRecord.hmpw.Ra;
import com.dchb.service.healthRecord.hmpw.OaService;
import com.dchb.service.healthRecord.hmpw.PaService;
import com.dchb.service.healthRecord.hmpw.QaService;
import com.dchb.service.healthRecord.hmpw.RaService;
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
 * 孕妇健康管理前端控制器
 * </p>
 * hmpw 为Health management for pregnant women简写
 * @author caichunde
 * @since 2018-11-28
 */
@RestController
@RequestMapping("/hmpw")
public class HmpwController extends BaseController {
    // 第一次产前随访服务记录表OA服务类
    @Autowired
    private OaService oaService;
    // 第2-5次产前随访服务记录表PA服务类
    @Autowired
    private PaService paService;
    // 产后访视记录表QA服务类
    @Autowired
    private QaService qaService;
    // 产后42天健康检查记录表RA服务类
    @Autowired
    private RaService raService;

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号第一次产前随访服务记录日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getOaDateList", method = RequestMethod.POST)
    public IReturn getOaDateList(String ab) {
        List<Map<String, Object>> oaDateList = oaService.getOaDateList(ab);
        return new IReturn(true, "操作成功！", oaDateList);
    }

    /**
     * @param String ab, String ac 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取第一次产前随访服务记录信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getOaOne", method = RequestMethod.POST)
    public IReturn getLaOne(String ab, String ac) {
        if (StringUtils.isEmpty(ac)) {
            List<Map<String, Object>> oaDateList = oaService.getOaDateList(ab);
            if (oaDateList.size() > 0) {
                Map<String, Object> map = oaDateList.get(0);
                ac = map.get("ac").toString();
            }
        }
        Oa oa = oaService.getOaOne(ab, ac);
        if (null == oa) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", oa);
    }

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取第2-5次产前随访服务记录表日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getPaDateList", method = RequestMethod.POST)
    public IReturn getPaDateList(String ab) {
        List<Map<String, Object>> paDateList = paService.getPaDateList(ab);
        return new IReturn(true, "操作成功！", paDateList);
    }

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取第2-5次产前随访服务记录表信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getPaOne", method = RequestMethod.POST)
    public IReturn getPaOne(String ab, String ad) {
        if (StringUtils.isEmpty(ad)) {
            List<Map<String, Object>> paDateList = paService.getPaDateList(ab);
            if (paDateList.size() > 0) {
                Map<String, Object> map = paDateList.get(0);
                ad = map.get("ad").toString();
            }
        }
        Pa pa = paService.getPaOne(ab, ad);
        if (null == pa) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", pa);
    }

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取产后访视记录表日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getQaDateList", method = RequestMethod.POST)
    public IReturn getQaDateList(String ab) {
        List<Map<String, Object>> qaDateList = qaService.getQaDateList(ab);
        return new IReturn(true, "操作成功！", qaDateList);
    }

    /**
     * @param String ab, String ac 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取产后访视记录表信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getQaOne", method = RequestMethod.POST)
    public IReturn getQaOne(String ab, String ac) {
        if (StringUtils.isEmpty(ac)) {
            List<Map<String, Object>> qaDateList = qaService.getQaDateList(ab);
            if (qaDateList.size() > 0) {
                Map<String, Object> map = qaDateList.get(0);
                ac = map.get("ac").toString();
            }
        }
        Qa qa = qaService.getQaOne(ab, ac);
        if (null == qa) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", qa);
    }

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号产后42天健康检查记录表日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getRaDateList", method = RequestMethod.POST)
    public IReturn getRaDateList(String ab) {
        List<Map<String, Object>> raDateList = raService.getRaDateList(ab);
        return new IReturn(true, "操作成功！", raDateList);
    }

    /**
     * @param String ab 档案编号, String ac 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期产后42天健康检查记录表信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getRaOne", method = RequestMethod.POST)
    public IReturn getRaOne(String ab, String ac) {
        if (StringUtils.isEmpty(ac)) {
            List<Map<String, Object>> raDateList = raService.getRaDateList(ab);
            if (raDateList.size() > 0) {
                Map<String, Object> map = raDateList.get(0);
                ac = map.get("ac").toString();
            }
        }
        Ra ra = raService.getRaOne(ab, ac);
        if (null == ra) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", ra);
    }
}

