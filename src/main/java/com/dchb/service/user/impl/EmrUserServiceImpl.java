package com.dchb.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.annotation.DataSource;
import com.dchb.enums.DataSourceEnum;
import com.dchb.mapper.user.EmrUserMapper;
import com.dchb.model.user.EmrUser;
import com.dchb.service.user.EmrUserService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EmrUserServiceImpl extends ServiceImpl<EmrUserMapper, EmrUser> implements EmrUserService {
    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public EmrUser getEmrUserOne(String xm, String sfzhm) {
        QueryWrapper<EmrUser> wrapper = new QueryWrapper();
        wrapper.eq("xm", xm);
        wrapper.eq("sfzhm", sfzhm);
        return baseMapper.selectOne(wrapper);
    }

    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public int saveEmrUser(EmrUser emrUser) {
        emrUser.setJbsj(new Date());
        return baseMapper.insert(emrUser);
    }

    @Override
    @DataSource(DataSourceEnum.ORACLE)
    public int updateEmrUser(EmrUser emrUser) {
        return baseMapper.updateById(emrUser);
    }
}
