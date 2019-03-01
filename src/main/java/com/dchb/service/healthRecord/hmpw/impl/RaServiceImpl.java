package com.dchb.service.healthRecord.hmpw.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.hmpw.RaMapper;
import com.dchb.model.healthRecord.hmpw.Ra;
import com.dchb.service.healthRecord.hmpw.RaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  产后42天健康检查记录表RA服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
@Service
public class RaServiceImpl extends ServiceImpl<RaMapper, Ra> implements RaService {

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号产后42天健康检查记录表日期信息
     * @date 2018-11-29
     */
    @Override
    public List<Map<String, Object>> getRaDateList(String ab) {
        QueryWrapper<Ra> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),ac, 112) ac ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ac");
        wrapper.orderByDesc("ac");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String ab 档案编号, String ac 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期产后42天健康检查记录表信息
     * @date 2018-11-29
     */
    @Override
    public Ra getRaOne(String ab, String ac) {
        QueryWrapper<Ra> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ac, 112)", ac);
        return baseMapper.selectOne(wrapper);
    }
}
