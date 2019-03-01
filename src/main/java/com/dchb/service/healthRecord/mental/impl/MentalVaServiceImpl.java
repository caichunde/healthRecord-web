package com.dchb.service.healthRecord.mental.impl;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dchb.mapper.healthRecord.mental.MentalVaMapper;
import com.dchb.model.healthRecord.mental.MentalVA;
import com.dchb.service.healthRecord.mental.MentalVaService;


@Service
public class MentalVaServiceImpl extends ServiceImpl<MentalVaMapper, MentalVA> implements MentalVaService {
	@Override
	public List<Map<String, Object>> mentalVaList(String ab) {
		QueryWrapper<MentalVA> wrapper = new QueryWrapper<MentalVA>();
        wrapper.select("CONVERT(varchar(100),[by], 112) [by] ");
        wrapper.eq("ab", ab);
        wrapper.groupBy("[by]");
        wrapper.orderByDesc("[by]");
        return baseMapper.selectMaps(wrapper);
	}
	@Override
	public MentalVA getMentalVa(String ab,String vaby) {
		QueryWrapper<MentalVA> wrapper = new QueryWrapper<MentalVA>();
	    wrapper.eq("ab", ab);
	    wrapper.eq("CONVERT(varchar(100),[by], 112)", vaby);
	    return baseMapper.selectOne(wrapper);
	}
}
