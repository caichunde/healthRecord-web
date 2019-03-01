package com.dchb.service.mrhp.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.annotation.DataSource;
import com.dchb.enums.DataSourceEnum;
import com.dchb.mapper.mrhp.EmrIchChargeMapper;
import com.dchb.model.mrhp.EmrIchCharge;
import com.dchb.service.mrhp.EmrIchChargeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 住院病案首页-住院费用(电子病历) 服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-12-3
 */
@Service
public class EmrIchChargeServiceImpl extends ServiceImpl<EmrIchChargeMapper, EmrIchCharge> implements EmrIchChargeService {

    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public List<Map<String, Object>> getEmrIchChargeList(String basynm) {
        QueryWrapper<EmrIchCharge> wrapper = new QueryWrapper();
        wrapper.eq("ICH_ID", basynm);
        wrapper.orderByDesc("created_at");
        return baseMapper.selectMaps(wrapper);
    }
}
