package com.dchb.service.healthRecord.chi;

import com.dchb.model.healthRecord.chi.Ma;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  1-2岁儿童健康检查记录表MA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface MaService extends IService<Ma> {
    /**
     * @param String ab 档案编号
     * @return  List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取1-2岁儿童健康检查记录表记录日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getMaDateList(String ab);

    /**
     * @param String ab 档案编号， String ad 记录日期
     * @return Ma
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取1-2岁儿童健康检查记录表记录信息
     * @date 2018-11-29
     */
    Ma getMaOne(String ab, String ad);
}
