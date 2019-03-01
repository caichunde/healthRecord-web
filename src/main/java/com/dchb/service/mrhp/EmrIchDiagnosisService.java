package com.dchb.service.mrhp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.mrhp.EmrIchDiagnosis;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 住院病案首页-诊断(电子病历) 服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-12-3
 */
public interface EmrIchDiagnosisService extends IService<EmrIchDiagnosis> {
    List<Map<String, Object>> getEmrIchDiagnosisList(String basynm);
}
