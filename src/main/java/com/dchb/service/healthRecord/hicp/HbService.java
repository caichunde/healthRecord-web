package com.dchb.service.healthRecord.hicp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.hicp.Hb;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  冠心病患者随访表HB服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface HbService extends IService<Hb> {
    /**
     * @param String ab 档案编号
     * @return List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取患者冠心病随访表随访日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getHbDateList(String ab);

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return Hb
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取冠心病患者随访表信息
     * @date 2018-11-29
     */
    Hb getHbOne(String ab, String ac);
}
