package com.dchb.service.healthRecord.flup.impl;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.flup.WaMapper;
import com.dchb.model.healthRecord.flup.Wa;
import com.dchb.model.healthRecord.oldman.OldManSelfCare;
import com.dchb.service.healthRecord.flup.WaService;


@Service
public class WaServiceImpl extends ServiceImpl<WaMapper, Wa> implements WaService {

	@Override
	public List<Map<String, Object>> waList(String ab) {
		QueryWrapper<Wa> wrapper = new QueryWrapper<Wa>();
        wrapper.select("CONVERT(varchar(100),ac, 112) ac ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("ac");
        wrapper.orderByDesc("ac");
        return baseMapper.selectMaps(wrapper);
	}

	@Override
	public Wa getWa(String ab, String ac) {
		QueryWrapper<Wa> wrapper = new QueryWrapper<Wa>();
	    wrapper.eq("ab", ab);
	    wrapper.eq("CONVERT(varchar(100),ac, 112)", ac);
	    return baseMapper.selectOne(wrapper);
	}

}
