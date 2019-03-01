package com.dchb.service.healthRecord.chi.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.chi.LaMapper;
import com.dchb.model.healthRecord.chi.La;
import com.dchb.service.healthRecord.chi.LaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
@Service
public class LaServiceImpl extends ServiceImpl<LaMapper, La> implements LaService {
    /**
     * @param String ab 档案编号
     * @return List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取1岁以内儿童健康检查记录表记录日期信息
     * @date 2018-11-29
     */
    @Override
    public List<Map<String, Object>> getLaDateList(String ab) {
        QueryWrapper<La> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),ad, 112) ad ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ad");
        wrapper.orderByDesc("ad");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return La
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取1岁以内儿童健康检查记录表记录信息
     * @date 2018-11-29
     */
    @Override
    public La getLaOne(String ab, String ad) {
        QueryWrapper<La> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ad, 112)", ad);
        return baseMapper.selectOne(wrapper);
    }
}
