package com.dchb.web.healthRecord.pex;


import com.dchb.model.healthRecord.pex.Ca;
import com.dchb.service.healthRecord.pex.CaService;
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
 * 前端控制器
 * </p>
 * pex 为 Physical Examination身体体检的缩写
 *
 * @author caichunde
 * @since 2018-11-27
 */
@RestController
@RequestMapping("/pex")
public class PExController extends BaseController {
    // 健康体检表CA服务类
    @Autowired
    private CaService caService;

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取患者体检次数的体检日期信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getCaDateList", method = RequestMethod.POST)
    public IReturn getCaDateList(String ab) {
        List<Map<String, Object>> caDateList = caService.getCaDateList(ab);
        return new IReturn(true, "操作成功！", caDateList);
    }

    /**
     * @param String ab 档案编号, String ac 体检日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和体检日期获取患者体检信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getCaOne", method = RequestMethod.POST)
    public IReturn getCaOne(String ab, String ac) {
        if (StringUtils.isEmpty(ac)) {
            List<Map<String, Object>> caDateList = caService.getCaDateList(ab);
            if (caDateList.size() > 0) {
                Map<String, Object> map = caDateList.get(0);
                ac = map.get("ac").toString();
            }
        }
        Ca ca = caService.getCaOne(ab, ac);
        if (null == ca) {
            return new IReturn(false, "未查到信息。");
        }
        return new IReturn(true, "操作成功！", ca);
    }
}

