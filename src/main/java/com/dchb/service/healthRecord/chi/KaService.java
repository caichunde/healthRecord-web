package com.dchb.service.healthRecord.chi;

import com.dchb.model.healthRecord.chi.Ka;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  新生儿家庭访视记录表KA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface KaService extends IService<Ka> {
    /**
     * @param String ab 档案编号
     * @return  List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取新生儿家庭访视记录表记录日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getKaDateList(String ab);

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return Ka
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取新生儿家庭访视记录表记录信息
     * @date 2018-11-29
     */
    Ka getKaOne(String ab, String ad);
}
