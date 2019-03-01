package com.dchb.service.healthRecord.chi;

import com.dchb.model.healthRecord.chi.La;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  1岁以内儿童健康检查记录表LA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface LaService extends IService<La> {
    /**
     * @param String ab 档案编号
     * @return List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取1岁以内儿童健康检查记录表记录日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getLaDateList(String ab);

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return La
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取1岁以内儿童健康检查记录表记录信息
     * @date 2018-11-29
     */
    La getLaOne(String ab, String ad);
}
