package com.dchb.service.healthRecord.mental;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.mental.MentalVA;


public interface MentalVaService extends IService<MentalVA> {
	public List<Map<String, Object>> mentalVaList(String ab);
	public MentalVA getMentalVa(String ab,String vaby);
}
