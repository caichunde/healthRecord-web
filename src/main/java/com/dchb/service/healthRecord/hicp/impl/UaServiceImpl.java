package com.dchb.service.healthRecord.hicp.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.hicp.UaMapper;
import com.dchb.model.healthRecord.hicp.Ua;
import com.dchb.service.healthRecord.hicp.UaService;
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
public class UaServiceImpl extends ServiceImpl<UaMapper, Ua> implements UaService {
    /**
     * @param String ab  档案编号
     * @return  List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取2型糖尿病患者随访服务记录表随访日期信息
     * @date 2018-11-29
     */
    @Override
    public List<Map<String, Object>> getUaDateList(String ab) {
        QueryWrapper<Ua> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),ac, 112) ac ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ac");
        wrapper.orderByDesc("ac");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return Ua
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取2型糖尿病患者随访服务记录表随访信息
     * @date 2018-11-29
     */
    @Override
    public Ua getUaOne(String ab, String ac) {
        QueryWrapper<Ua> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ac, 112)", ac);
        return baseMapper.selectOne(wrapper);
    }
}
