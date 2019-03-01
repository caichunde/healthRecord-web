package com.dchb.service.healthRecord.oldman;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.oldman.OldManFollow;
import com.dchb.model.healthRecord.oldman.OldManSelfCare;


public interface OldManFollowService extends IService<OldManFollow> {
	public List<Map<String, Object>> followList(String pid);
	public OldManFollow getFollow(String pid, String antime);
}
