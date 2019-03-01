package com.dchb.service.mrhp.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.annotation.DataSource;
import com.dchb.enums.DataSourceEnum;
import com.dchb.mapper.mrhp.EmrIchOperationMapper;
import com.dchb.model.mrhp.EmrIchOperation;
import com.dchb.service.mrhp.EmrIchOperationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 住院病案首页-手术(电子病历) 服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-12-3
 */
@Service
public class EmrIchOperationServiceImpl extends ServiceImpl<EmrIchOperationMapper, EmrIchOperation> implements EmrIchOperationService {

    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public List<Map<String, Object>> getEmrIchOperationList(String basynm) {
        QueryWrapper<EmrIchOperation> wrapper = new QueryWrapper();
        wrapper.eq("ICH_ID", basynm);
        wrapper.orderByDesc("created_at");
        return baseMapper.selectMaps(wrapper);
    }
}
