package com.dchb.service.person.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.person.AaMapper;
import com.dchb.model.person.Aa;
import com.dchb.service.person.AaService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
@Service
public class AaServiceImpl extends ServiceImpl<AaMapper, Aa> implements AaService {
    /**
     * @param String aa 档案编号
     * @author caichunde
     * @Description: 根据档案编号获取患者基本信息
     * @date 2018-11-29
     */
    @Override
    public Aa getAaOne(String aa) {
        QueryWrapper<Aa> wrapper = new QueryWrapper<Aa>();
        wrapper.eq("aa", aa);
        return baseMapper.selectOne(wrapper);
    }
}
