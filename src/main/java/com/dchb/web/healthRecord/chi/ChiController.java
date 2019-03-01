package com.dchb.web.healthRecord.chi;


import com.dchb.model.healthRecord.chi.Ka;
import com.dchb.model.healthRecord.chi.La;
import com.dchb.model.healthRecord.chi.Ma;
import com.dchb.model.healthRecord.chi.Na;
import com.dchb.service.healthRecord.chi.KaService;
import com.dchb.service.healthRecord.chi.LaService;
import com.dchb.service.healthRecord.chi.MaService;
import com.dchb.service.healthRecord.chi.NaService;
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
 * 儿童健康信息前端控制器
 * </p>
 * chi 为 Child health information简写
 *
 * @author caichunde
 * @since 2018-11-28
 */
@RestController
@RequestMapping("/chi")
public class ChiController extends BaseController {
    //新生儿家庭访视记录表KA服务类
    @Autowired
    private KaService kaService;
    //1岁以内儿童健康检查记录表LA服务类
    @Autowired
    private LaService laService;
    //1-2岁儿童健康检查记录表MA服务类
    @Autowired
    private MaService maService;
    //3-6岁儿童健康检查记录表NA服务类
    @Autowired
    private NaService naService;

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取新生儿家庭访视记录表记录日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getKaDateList", method = RequestMethod.POST)
    public IReturn getKaDateList(String ab) {
        List<Map<String, Object>> uaDateList = kaService.getKaDateList(ab);
        return new IReturn(true, "操作成功！", uaDateList);
    }

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取新生儿家庭访视记录表记录信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getKaOne", method = RequestMethod.POST)
    public IReturn getKaOne(String ab, String ad) {
        if (StringUtils.isEmpty(ad)) {
            List<Map<String, Object>> kaDateList = kaService.getKaDateList(ab);
            if (kaDateList.size() > 0) {
                Map<String, Object> map = kaDateList.get(0);
                ad = map.get("ad").toString();
            }
        }
        Ka ka = kaService.getKaOne(ab, ad);
        if (null == ka) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", ka);
    }

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取1岁以内儿童健康检查记录表记录日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getLaDateList", method = RequestMethod.POST)
    public IReturn getLaDateList(String ab) {
        List<Map<String, Object>> laDateList = laService.getLaDateList(ab);
        return new IReturn(true, "操作成功！", laDateList);
    }

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取1岁以内儿童健康检查记录表记录信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getLaOne", method = RequestMethod.POST)
    public IReturn getLaOne(String ab, String ad) {
        if (StringUtils.isEmpty(ad)) {
            List<Map<String, Object>> laDateList = laService.getLaDateList(ab);
            if (laDateList.size() > 0) {
                Map<String, Object> map = laDateList.get(0);
                ad = map.get("ad").toString();
            }
        }
        La la = laService.getLaOne(ab, ad);
        if (null == la) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", la);
    }

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取1-2岁儿童健康检查记录表记录日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getMaDateList", method = RequestMethod.POST)
    public IReturn getMaDateList(String ab) {
        List<Map<String, Object>> maDateList = maService.getMaDateList(ab);
        return new IReturn(true, "操作成功！", maDateList);
    }

    /**
     * @param String ab 档案编号， String ad 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取1-2岁儿童健康检查记录表记录信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getMaOne", method = RequestMethod.POST)
    public IReturn getMaOne(String ab, String ad) {
        if (StringUtils.isEmpty(ad)) {
            List<Map<String, Object>> maDateList = maService.getMaDateList(ab);
            if (maDateList.size() > 0) {
                Map<String, Object> map = maDateList.get(0);
                ad = map.get("ad").toString();
            }
        }
        Ma ma = maService.getMaOne(ab, ad);
        if (null == ma) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", ma);
    }

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取3-6岁儿童健康检查记录表记录日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getNaDateList", method = RequestMethod.POST)
    public IReturn getNaDateList(String ab) {
        List<Map<String, Object>> naDateList = naService.getNaDateList(ab);
        return new IReturn(true, "操作成功！", naDateList);
    }

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取3-6岁儿童健康检查记录表记录信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getNaOne", method = RequestMethod.POST)
    public IReturn getNaOne(String ab, String ad) {
        if (StringUtils.isEmpty(ad)) {
            List<Map<String, Object>> naDateList = naService.getNaDateList(ab);
            if (naDateList.size() > 0) {
                Map<String, Object> map = naDateList.get(0);
                ad = map.get("ad").toString();
            }
        }
        Na na = naService.getNaOne(ab, ad);
        if (null == na) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", na);
    }
}

