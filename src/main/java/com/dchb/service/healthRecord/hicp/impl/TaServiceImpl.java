package com.dchb.service.healthRecord.hicp.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.hicp.TaMapper;
import com.dchb.model.healthRecord.hicp.Ta;
import com.dchb.service.healthRecord.hicp.TaService;
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
public class TaServiceImpl extends ServiceImpl<TaMapper, Ta> implements TaService {
    /**
     * @param String ab 档案编号
     * @return  List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取高血压患者随访服务记录表日期信息
     * @date 2018-11-29
     */
    @Override
    public List<Map<String, Object>> getTaDateList(String ab) {
        QueryWrapper<Ta> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),ac, 112) ac ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ac");
        wrapper.orderByDesc("ac");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return Ta
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取高血压患者随访服务记录表信息
     * @date 2018-11-29
     */
    @Override
    public Ta getTaOne(String ab, String ac) {
        QueryWrapper<Ta> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ac, 112)", ac);
        return baseMapper.selectOne(wrapper);
    }
}
