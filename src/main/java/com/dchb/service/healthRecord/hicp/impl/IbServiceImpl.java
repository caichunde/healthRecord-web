package com.dchb.service.healthRecord.hicp.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.hicp.IbMapper;
import com.dchb.model.healthRecord.hicp.Ib;
import com.dchb.service.healthRecord.hicp.IbService;
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
public class IbServiceImpl extends ServiceImpl<IbMapper, Ib> implements IbService {
    /**
     * @param  String ab 档案编号
     * @return List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取脑卒中患者随访表随访日期信息
     * @date 2018-11-29
     */
    @Override
    public List<Map<String, Object>> getIbDateList(String ab) {
        QueryWrapper<Ib> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),ac, 112) ac ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ac");
        wrapper.orderByDesc("ac");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return Ib
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取脑卒中患者随访表信息
     * @date 2018-11-29
     */
    @Override
    public Ib getIbOne(String ab, String ac) {
        QueryWrapper<Ib> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ac, 112)", ac);
        return baseMapper.selectOne(wrapper);
    }
}
