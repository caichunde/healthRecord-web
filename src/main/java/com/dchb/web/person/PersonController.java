package com.dchb.web.person;


import com.dchb.model.person.Aa;
import com.dchb.model.person.Ba;
import com.dchb.service.person.AaService;
import com.dchb.service.person.BaService;
import com.dchb.util.BaseController;
import com.dchb.util.IReturn;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
@RestController
@RequestMapping("/person")
public class PersonController extends BaseController {
    // 健康档案表AA服务类
    @Autowired
    private AaService aaService;
    // 个人基本信息表BA服务类
    @Autowired
    private BaService baService;

    /**
     * @param String aa 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取患者基本信息
     * @date 2018-11-29
     */
    @RequestMapping(value = "/getPersonOne", method = RequestMethod.POST)
    public IReturn getPersonOne(String aa) {
        if (StringUtils.isEmpty(aa)) {
            return new IReturn(false, "编号不能为空。");
        }
        Aa a01 = aaService.getAaOne(aa);
        Ba ba = baService.getBaOne(aa);
        if (null == ba) {
            return new IReturn(false, "未查到个人信息。");
        }
        Map<String, Object> map = new HashMap();
        map.put("aa", a01);
        map.put("ba", ba);
        return new IReturn(true, "操作成功！", map);
    }
}

