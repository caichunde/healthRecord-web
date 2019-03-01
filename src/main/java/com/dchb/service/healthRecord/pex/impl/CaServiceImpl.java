package com.dchb.service.healthRecord.pex.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.pex.CaMapper;
import com.dchb.model.healthRecord.pex.Ca;
import com.dchb.service.healthRecord.pex.CaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
@Service
public class CaServiceImpl extends ServiceImpl<CaMapper, Ca> implements CaService {
    /**
     * @param String ab 档案编号
     * @return List<Map < String ,   Object>>
     * @author caichunde
     * @Description: 根据档案编号获取患者体检次数的体检日期信息
     * @date 2018-11-29
     */

    @Override
    public List<Map<String, Object>> getCaDateList(String ab) {
        QueryWrapper<Ca> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),ac, 112) ac ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ac");
        wrapper.orderByDesc("ac");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String ab 档案编号, String ac 体检日期
     * @return Ca
     * @author caichunde
     * @Description: 根据档案编号和体检日期获取患者体检信息
     * @date 2018-11-29
     */
    @Override
    public Ca getCaOne(String ab, String ac) {
        QueryWrapper<Ca> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ac, 112)", ac);
        return baseMapper.selectOne(wrapper);
    }

}
