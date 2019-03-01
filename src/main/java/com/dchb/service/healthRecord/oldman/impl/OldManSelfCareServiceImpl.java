package com.dchb.service.healthRecord.oldman.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.oldman.OldManSelfCareMapper;
import com.dchb.model.healthRecord.chi.Na;
import com.dchb.model.healthRecord.oldman.OldManSelfCare;
import com.dchb.service.healthRecord.oldman.OldManSelfCareService;
 

@Service
public class OldManSelfCareServiceImpl extends ServiceImpl<OldManSelfCareMapper, OldManSelfCare> implements OldManSelfCareService {
	@Override
	public List<Map<String, Object>> selfCareList(String pid) {
		QueryWrapper<OldManSelfCare> wrapper = new QueryWrapper<OldManSelfCare>();
        wrapper.select("CONVERT(varchar(100),av, 112) av ");
        wrapper.eq("pid", pid);
        wrapper.groupBy("av");
        wrapper.orderByDesc("av");
        return baseMapper.selectMaps(wrapper);
	}
	@Override
	public OldManSelfCare getSelfCare(String pid,String avtime) {
		QueryWrapper<OldManSelfCare> wrapper = new QueryWrapper<OldManSelfCare>();
	    wrapper.eq("pid", pid);
	    wrapper.eq("CONVERT(varchar(100),av, 112)", avtime);
	    return baseMapper.selectOne(wrapper);
	}
	 
}
