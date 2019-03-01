package com.dchb.service.healthRecord.chi;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.chi.Na;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  3-6岁儿童健康检查记录表NA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface NaService extends IService<Na> {
    /**
     * @param String ab 档案编号
     * @return List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取3-6岁儿童健康检查记录表记录日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getNaDateList(String ab);

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return Na
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取3-6岁儿童健康检查记录表记录信息
     * @date 2018-11-29
     */
    Na getNaOne(String ab, String ad);
}
