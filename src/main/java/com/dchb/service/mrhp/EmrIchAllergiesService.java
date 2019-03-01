package com.dchb.service.mrhp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.mrhp.EmrIchAllergies;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 住院病案首页-过敏药物(电子病历) 服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-12-3
 */
public interface EmrIchAllergiesService extends IService<EmrIchAllergies> {
    List<Map<String, Object>> getEmrIchAllergiesList(String basynm);
}
