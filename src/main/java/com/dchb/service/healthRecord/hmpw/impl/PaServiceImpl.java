package com.dchb.service.healthRecord.hmpw.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.hmpw.PaMapper;
import com.dchb.model.healthRecord.hmpw.Pa;
import com.dchb.service.healthRecord.hmpw.PaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  第2-5次产前随访服务记录表PA服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
@Service
public class PaServiceImpl extends ServiceImpl<PaMapper, Pa> implements PaService {

    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取第2-5次产前随访服务记录表日期信息
     * @date 2018-11-29
     */
    @Override
    public List<Map<String, Object>> getPaDateList(String ab) {
        QueryWrapper<Pa> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),ad, 112) ad ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ad");
        wrapper.orderByDesc("ad");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取第2-5次产前随访服务记录表信息
     * @date 2018-11-29
     */
    @Override
    public Pa getPaOne(String ab, String ad) {
        QueryWrapper<Pa> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ad, 112)", ad);
        return baseMapper.selectOne(wrapper);
    }
}
