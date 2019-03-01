package com.dchb.service.healthRecord.hicp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.hicp.Ta;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  高血压患者随访服务记录表TA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface TaService extends IService<Ta> {
    /**
     * @param String ab 档案编号
     * @return  List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取高血压患者随访服务记录表日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getTaDateList(String ab);

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return Ta
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取高血压患者随访服务记录表信息
     * @date 2018-11-29
     */
    Ta getTaOne(String ab, String ac);
}
