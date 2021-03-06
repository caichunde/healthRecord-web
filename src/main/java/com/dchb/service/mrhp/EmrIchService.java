package com.dchb.service.mrhp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.mrhp.EmrIch;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 住院病案首页(电子病历) 服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-12-3
 */
public interface EmrIchService extends IService<EmrIch> {
   List<Map<String, Object>> getEmrIchList(String sfzhm);
   List<Map<String, Object>> getEmrIchByOrgCode(String sfzhm, String orgCode);
   List<Map<String, Object>> getEmrIchOne(String id);
}
