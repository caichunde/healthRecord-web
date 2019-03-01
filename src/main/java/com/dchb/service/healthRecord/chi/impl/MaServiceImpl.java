package com.dchb.service.healthRecord.chi.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.chi.MaMapper;
import com.dchb.model.healthRecord.chi.Ma;
import com.dchb.service.healthRecord.chi.MaService;
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
public class MaServiceImpl extends ServiceImpl<MaMapper, Ma> implements MaService {
    /**
     * @param String ab 档案编号
     * @return  List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取1-2岁儿童健康检查记录表记录日期信息
     * @date 2018-11-29
     */
    @Override
    public List<Map<String, Object>> getMaDateList(String ab) {
        QueryWrapper<Ma> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),ad, 112) ad ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ad");
        wrapper.orderByDesc("ad");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String ab 档案编号， String ad 记录日期
     * @return Ma
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取1-2岁儿童健康检查记录表记录信息
     * @date 2018-11-29
     */
    @Override
    public Ma getMaOne(String ab, String ad) {
        QueryWrapper<Ma> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ad, 112)", ad);
        return baseMapper.selectOne(wrapper);
    }
}
