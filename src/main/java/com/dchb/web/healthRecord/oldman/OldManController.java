package com.dchb.web.healthRecord.oldman;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.dchb.model.healthRecord.oldman.OldManFollow;
import com.dchb.model.healthRecord.oldman.OldManSelfCare;
import com.dchb.service.healthRecord.oldman.OldManFollowService;
import com.dchb.service.healthRecord.oldman.OldManSelfCareService;
import com.dchb.util.BaseController;
import com.dchb.util.ReturnMsg;


@RestController
@RequestMapping("/oldman")
public class OldManController extends BaseController {
	@Autowired
	private OldManSelfCareService oldManSelfCareService;
	
	@Autowired
	private OldManFollowService oldManFollowService;
	
	/**
		 * 
		 * @Title: (getSelfCare)   
		 * @Description: TODO(查询老年人生活自理能力评估表)    
		 * @param @param 
		 * @return ReturnMsg    返回类型 
		 * @author hukai
		 * @date 2018年12月10日下午2:23:45
		 */
	@PostMapping("selfCareList")
	public ReturnMsg selfCareList(@RequestParam("pid")String pid){
		try {
			if(StringUtils.isEmpty(pid))return new ReturnMsg(false,"档案号为空！");
			List<Map<String,Object>> careMap = oldManSelfCareService.selfCareList(pid);
			if(careMap.isEmpty())return new ReturnMsg(false,"未查到数据！");
			return new ReturnMsg(true,careMap);
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnMsg(false,"操作失败");
		}	
	}
	/**
		 * 
		 * @Title: (getSelfCare)   
		 * @Description: TODO(按日期查询老年人生活自理能力评估表)    
		 * @param @param 
		 * @return ReturnMsg    返回类型 
		 * @author hukai
		 * @date 2018年12月10日下午3:32:28
		 */
	@PostMapping("getSelfCare")
	public ReturnMsg getSelfCare(@RequestParam("pid")String pid,@RequestParam("avtime")String avtime){
		try {
    		if (StringUtils.isEmpty(avtime)) {
                List<Map<String, Object>> careList = oldManSelfCareService.selfCareList(pid);
                if (careList.size() > 0) {
                    Map<String, Object> map = careList.get(0);
                    avtime = map.get("av").toString();
                }
            }
            OldManSelfCare selfCare = oldManSelfCareService.getSelfCare(pid, avtime);
            if (null == selfCare) {
                return new ReturnMsg(false, "未查到信息。");
            }
            return new ReturnMsg(true, "操作成功！", selfCare);
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnMsg(false,"操作失败");
		}	
	}
	
	/**
		 * 
		 * @Title: (followList)   
		 * @Description: TODO(查询老年人中医体质健康)    
		 * @param @param 
		 * @return ReturnMsg    返回类型 
		 * @author hukai
		 * @date 2018年12月17日下午4:37:02
		 */
	@PostMapping("followList")
	public ReturnMsg followList(@RequestParam("pid")String pid){
		try {
			if(StringUtils.isEmpty(pid))return new ReturnMsg(false,"档案号为空！");
			List<Map<String,Object>> careMap = oldManFollowService.followList(pid);
			if(careMap.isEmpty())return new ReturnMsg(false,"未查到数据！");
			return new ReturnMsg(true,careMap);
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnMsg(false,"操作失败");
		}	
	}
	
	/**
		 * 
		 * @Title: (getFollow)   
		 * @Description: TODO(按日期查询老年人中医体质健康)    
		 * @param @param 
		 * @return ReturnMsg    返回类型 
		 * @author hukai
		 * @date 2018年12月17日下午4:51:40
		 */
	@PostMapping("getFollow")
	public ReturnMsg getFollow(@RequestParam("pid")String pid,@RequestParam("antime")String antime){
		try {
    		if (StringUtils.isEmpty(antime)) {
                List<Map<String, Object>> careList = oldManFollowService.followList(pid);
                if(careList.isEmpty()) return new ReturnMsg(false,"未查到信息。");
                if (careList.size() > 0) {
                    Map<String, Object> map = careList.get(0);
                    antime = map.get("antime").toString();
                }
            }
            OldManFollow follow = oldManFollowService.getFollow(pid, antime);
            if (null == follow) {
                return new ReturnMsg(false, "未查到信息。");
            }
            return new ReturnMsg(true, "操作成功！", follow);
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnMsg(false,"操作失败");
		}	
	}
	
}
