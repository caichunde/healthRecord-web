package com.dchb.service.healthRecord.hmpw.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.hmpw.QaMapper;
import com.dchb.model.healthRecord.hmpw.Qa;
import com.dchb.service.healthRecord.hmpw.QaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *   产后访视记录表QA服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
@Service
public class QaServiceImpl extends ServiceImpl<QaMapper, Qa> implements QaService {
    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取产后访视记录表日期信息
     * @date 2018-11-29
     */
    @Override
    public List<Map<String, Object>> getQaDateList(String ab) {
        QueryWrapper<Qa> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),ac, 112) ac ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ac");
        wrapper.orderByDesc("ac");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String ab, String ac 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取产后访视记录表信息
     * @date 2018-11-29
     */
    @Override
    public Qa getQaOne(String ab, String ac) {
        QueryWrapper<Qa> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ac, 112)", ac);
        return baseMapper.selectOne(wrapper);
    }
}
