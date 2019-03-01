package com.dchb.service.sys.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.annotation.DataSource;
import com.dchb.enums.DataSourceEnum;
import com.dchb.mapper.sys.SysMapper;
import com.dchb.service.sys.SysService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

@Service
public class SysServiceImpl extends ServiceImpl<SysMapper, T> implements SysService {

    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public String getSeq(String seqName) {
        return baseMapper.getSeq(seqName);
    }
}
