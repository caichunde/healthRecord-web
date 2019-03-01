package com.dchb.service.healthRecord.hmpw.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.hmpw.OaMapper;
import com.dchb.model.healthRecord.hmpw.Oa;
import com.dchb.service.healthRecord.hmpw.OaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  第一次产前随访服务记录表OA服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
@Service
public class OaServiceImpl extends ServiceImpl<OaMapper, Oa> implements OaService {
    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号第一次产前随访服务记录日期信息
     * @date 2018-11-29
     */
    @Override
    public List<Map<String, Object>> getOaDateList(String ab) {
        QueryWrapper<Oa> wrapper = new QueryWrapper();
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
     * @Description: 根据档案编号和记录日期获取第一次产前随访服务记录信息
     * @date 2018-11-29
     */
    @Override
    public Oa getOaOne(String ab, String ac) {
        QueryWrapper<Oa> wrapper = new QueryWrapper();
        wrapper.eq("ab", ab);
        wrapper.eq("CONVERT(varchar(100),ac, 112)", ac);
        return baseMapper.selectOne(wrapper);
    }
}
