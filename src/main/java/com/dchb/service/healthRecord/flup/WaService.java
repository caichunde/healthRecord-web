package com.dchb.service.healthRecord.flup;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.flup.Wa;
import com.dchb.model.healthRecord.oldman.OldManSelfCare;

public interface WaService extends IService<Wa> {
	public List<Map<String, Object>> waList(String ab);
	public Wa getWa(String ab, String ac);
}
