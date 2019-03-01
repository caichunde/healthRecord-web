package com.dchb.service.mrhp.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.annotation.DataSource;
import com.dchb.enums.DataSourceEnum;
import com.dchb.mapper.mrhp.EmrIchMapper;
import com.dchb.model.mrhp.EmrIch;
import com.dchb.service.mrhp.EmrIchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 住院病案首页(电子病历) 服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-12-3
 */
@Service
public class EmrIchServiceImpl extends ServiceImpl<EmrIchMapper, EmrIch> implements EmrIchService {

    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public List<Map<String, Object>> getEmrIchList(String sfzhm) {
        QueryWrapper<EmrIch> wrapper = new QueryWrapper();
        wrapper.select("ID id, ORG_CODE orgCode, ORG_NAME orgName ");
        wrapper.eq("ID_NUM", sfzhm);
        wrapper.groupBy("ID", "ORG_CODE", "ORG_NAME", "ADMISSION_DATE");
        wrapper.orderByDesc("ADMISSION_DATE");
        return baseMapper.selectMaps(wrapper);
    }

    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public List<Map<String, Object>> getEmrIchByOrgCode(String sfzhm, String orgCode) {
        QueryWrapper<EmrIch> wrapper = new QueryWrapper();
        wrapper.select("ID id, ORG_CODE orgCode, ORG_NAME orgName, ADMISSION_DATE admissionDate ");
        wrapper.eq("ID_NUM", sfzhm);
        wrapper.eq("ORG_CODE", orgCode);
        wrapper.orderByDesc("ADMISSION_DATE");
        return baseMapper.selectMaps(wrapper);
    }

    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public List<Map<String, Object>> getEmrIchOne(String id) {
        QueryWrapper<EmrIch> wrapper = new QueryWrapper();
        wrapper.eq("ID", id);
        return baseMapper.selectMaps(wrapper);
    }
}
