package com.dchb.service.healthRecord.oldman;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService; 
import com.dchb.model.healthRecord.oldman.OldManSelfCare;

public interface OldManSelfCareService extends IService<OldManSelfCare> {
	public List<Map<String, Object>> selfCareList(String pid);
	public OldManSelfCare getSelfCare(String pid,String avtime);
}
