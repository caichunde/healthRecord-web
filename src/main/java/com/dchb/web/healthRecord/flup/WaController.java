package com.dchb.web.healthRecord.flup;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.dchb.model.healthRecord.flup.Wa;
import com.dchb.service.healthRecord.flup.WaService;
import com.dchb.util.BaseController;
import com.dchb.util.ReturnMsg;

@RestController
@RequestMapping("/wa")
public class WaController extends BaseController {
	@Autowired
	private WaService waService;
	
	/**
		 * 
		 * @Title: (waList)   
		 * @Description: TODO(查询严重精神疾病随访服务记录表)    
		 * @param @param 
		 * @return ReturnMsg    返回类型 
		 * @author hukai
		 * @date 2018年12月17日下午3:06:28
		 */
	@PostMapping("waList")
	public ReturnMsg waList(@RequestParam("ab")String ab){
		try {
			if(StringUtils.isEmpty(ab))return new ReturnMsg(false,"档案号为空！");
			List<Map<String,Object>> careMap = waService.waList(ab);
			if(careMap.isEmpty())return new ReturnMsg(false,"未查到数据！");
			return new ReturnMsg(true,careMap);
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnMsg(false,"操作失败");
		}	
	}
	
	/**
		 * 
		 * @Title: (getWa)   
		 * @Description: TODO(按日期查询严重精神疾病随访服务记录表)    
		 * @param @param 
		 * @return ReturnMsg    返回类型 
		 * @author hukai
		 * @date 2018年12月17日下午3:08:08
		 */
	@PostMapping("getWa")
	public ReturnMsg getSelfCare(@RequestParam("ab")String ab,@RequestParam("ac")String ac){
		try {
    		if (StringUtils.isEmpty(ac)) {
                List<Map<String, Object>> careList = waService.waList(ab);
                if (careList.size() > 0) {
                    Map<String, Object> map = careList.get(0);
                    ac = map.get("ac").toString();
                }
            }
            Wa wa = waService.getWa(ab, ac);
            if (null == wa) {
                return new ReturnMsg(false, "未查到信息。");
            }
            return new ReturnMsg(true, "操作成功！", wa);
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnMsg(false,"操作失败");
		}
		
	}
	
}
