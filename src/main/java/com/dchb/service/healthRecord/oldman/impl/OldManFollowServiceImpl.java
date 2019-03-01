package com.dchb.service.healthRecord.oldman.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.oldman.OldManFollowMapper;
import com.dchb.model.healthRecord.oldman.OldManFollow;
import com.dchb.service.healthRecord.oldman.OldManFollowService;


@Service
public class OldManFollowServiceImpl extends ServiceImpl<OldManFollowMapper, OldManFollow> implements OldManFollowService {

	@Override
	public List<Map<String, Object>> followList(String pid) {
		QueryWrapper<OldManFollow> wrapper = new QueryWrapper<OldManFollow>();
        wrapper.select("CONVERT(varchar(100),antime, 112) antime ");
        wrapper.eq("pid", pid);
        wrapper.groupBy("antime");
        wrapper.orderByDesc("antime");
        return baseMapper.selectMaps(wrapper);
	}

	@Override
	public OldManFollow getFollow(String pid, String antime) {
		QueryWrapper<OldManFollow> wrapper = new QueryWrapper<OldManFollow>();
	    wrapper.eq("pid", pid);
	    wrapper.eq("CONVERT(varchar(100),antime, 112)", antime);
	    return baseMapper.selectOne(wrapper);
	}

}
