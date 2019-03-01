package com.dchb.service.mrhp.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.annotation.DataSource;
import com.dchb.enums.DataSourceEnum;
import com.dchb.mapper.mrhp.EmrIchDiagnosisMapper;
import com.dchb.model.mrhp.EmrIchDiagnosis;
import com.dchb.service.mrhp.EmrIchDiagnosisService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 住院病案首页-诊断(电子病历) 服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-12-3
 */
@Service
public class EmrIchDiagnosisServiceImpl extends ServiceImpl<EmrIchDiagnosisMapper, EmrIchDiagnosis> implements EmrIchDiagnosisService {

    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public List<Map<String, Object>> getEmrIchDiagnosisList(String basynm) {
        QueryWrapper<EmrIchDiagnosis> wrapper = new QueryWrapper();
        wrapper.eq("DCS_ID", basynm);
        wrapper.orderByDesc("created_at");
        return baseMapper.selectMaps(wrapper);
    }
}
