package com.dchb.service.healthRecord.hicp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.hicp.Ua;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  2型糖尿病患者随访服务记录表UA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface UaService extends IService<Ua> {
    /**
     * @param String ab  档案编号
     * @return  List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取2型糖尿病患者随访服务记录表随访日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getUaDateList(String ab);

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return Ua
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取2型糖尿病患者随访服务记录表随访信息
     * @date 2018-11-29
     */
    Ua getUaOne(String ab, String ac);
}
