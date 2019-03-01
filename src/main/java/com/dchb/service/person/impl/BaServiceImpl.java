package com.dchb.service.person.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.person.BaMapper;
import com.dchb.model.person.Ba;
import com.dchb.service.person.BaService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
@Service
public class BaServiceImpl extends ServiceImpl<BaMapper, Ba> implements BaService {
    /**
     * @param String aa 档案编号
     * @author caichunde
     * @Description: 根据档案编号获取患者基本信息
     * @date 2018-11-29
     */
    @Override
    public Ba getBaOne(String aa) {
        QueryWrapper<Ba> wrapper = new QueryWrapper();
        wrapper.eq("ab", aa);
        return baseMapper.selectOne(wrapper);
    }

    @Override
    public List<Ba> getBaOneByAe(String ae) {
        QueryWrapper<Ba> wrapper = new QueryWrapper();
        wrapper.select("ab");
        wrapper.eq("ae", ae);
        return baseMapper.selectList(wrapper);
    }
}
