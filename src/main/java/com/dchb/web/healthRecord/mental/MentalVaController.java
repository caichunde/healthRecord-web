package com.dchb.web.healthRecord.mental;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.dchb.model.healthRecord.mental.MentalVA;
import com.dchb.service.healthRecord.mental.MentalVaService;
import com.dchb.util.BaseController;
import com.dchb.util.ReturnMsg;

@RestController
@RequestMapping("/va")
public class MentalVaController extends BaseController {
	@Autowired
	private MentalVaService mentalVaService;

	/**
	 * 
	 * @Title: (mentalVaList)
	 * @Description: TODO(查询严重精神疾病个人信息补充表)
	 * @param @param
	 * @return ReturnMsg 返回类型
	 * @author hukai
	 * @date 2018年12月10日下午2:23:45
	 */
	@PostMapping("mentalVaList")
	public ReturnMsg mentalVaList(@RequestParam("ab") String ab) {
		try {
			if (StringUtils.isEmpty(ab)) return new ReturnMsg(false, "档案号为空！");
			List<Map<String, Object>> careMap = mentalVaService
					.mentalVaList(ab);
			if (careMap.isEmpty()) return new ReturnMsg(false, "未查到数据！");
			return new ReturnMsg(true, careMap);
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnMsg(false, "操作失败");
		}
	}	

	/**
	 * 
	 * @Title: (getMentalVa)
	 * @Description: TODO(按日期查询严重精神疾病个人信息补充表)
	 * @param @param
	 * @return ReturnMsg 返回类型
	 * @author hukai
	 * @date 2018年12月10日下午3:32:28
	 */
	@PostMapping("getMentalVa")
	public ReturnMsg getMentalVa(@RequestParam("ab") String ab,
			@RequestParam("vaby") String vaby) {
		try {
			if (StringUtils.isEmpty(vaby)) {
				List<Map<String, Object>> careList = mentalVaService.mentalVaList(ab);
				if (careList.size() > 0) {
					Map<String, Object> map = careList.get(0);
					vaby = map.get("by").toString();
				}
			}
			MentalVA mentalVa = mentalVaService.getMentalVa(ab,vaby);
			if (null == mentalVa) {
				return new ReturnMsg(false, "未查到信息。");
			}
			return new ReturnMsg(true, "操作成功！", mentalVa);
		} catch (Exception e) {
			e.printStackTrace();
			return new ReturnMsg(false, "操作失败");
		}

	}

}
