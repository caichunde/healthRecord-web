package com.dchb.service.healthRecord.hicp.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.hicp.FbMapper;
import com.dchb.model.healthRecord.hicp.Fb;
import com.dchb.service.healthRecord.hicp.FbService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 脑卒中、冠心病发病报告卡表FB服服务实现类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
@Service
public class FbServiceImpl extends ServiceImpl<FbMapper, Fb> implements FbService {
    /**
     * @param String bx 档案编号
     * @return List<Map<String,Object>>
     * @author caichunde
     * @Description: 根据档案编号获取脑卒中、冠心病发病报告卡日期信息
     * @date 2018-12-4
     */
    @Override
    public List<Map<String, Object>> getFbDateList(String bx) {
        QueryWrapper<Fb> wrapper = new QueryWrapper();
        wrapper.select("CONVERT(varchar(100),bt, 112) bt ");
        wrapper.eq("bx", bx);
        wrapper.groupBy("bt");
        wrapper.orderByDesc("bt");
        return baseMapper.selectMaps(wrapper);
    }

    /**
     * @param String bx 档案编号
     * @return Fb
     * @author caichunde
     * @Description: 根据档案编号获取脑卒中、冠心病发病报告卡表患者信息
     * @date 2018-11-29
     */
    @Override
    public Fb getFbOne(String bx, String bt) {
        QueryWrapper<Fb> wrapper = new QueryWrapper();
        wrapper.eq("bx", bx);
        wrapper.eq("CONVERT(varchar(100),bt, 112)", bt);
        return baseMapper.selectOne(wrapper);
    }
}
