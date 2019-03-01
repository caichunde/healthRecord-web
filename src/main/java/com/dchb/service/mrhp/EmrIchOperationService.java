package com.dchb.service.mrhp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.mrhp.EmrIchOperation;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 住院病案首页-手术(电子病历) 服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-12-3
 */
public interface EmrIchOperationService extends IService<EmrIchOperation> {
    List<Map<String, Object>> getEmrIchOperationList(String basynm);
}
