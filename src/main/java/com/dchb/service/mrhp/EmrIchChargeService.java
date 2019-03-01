package com.dchb.service.mrhp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.mrhp.EmrIchCharge;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 住院病案首页-住院费用(电子病历) 服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-12-3
 */
public interface EmrIchChargeService extends IService<EmrIchCharge> {
    List<Map<String, Object>> getEmrIchChargeList(String basynm);
}
