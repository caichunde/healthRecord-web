package com.dchb.service.healthRecord.hmpw;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.hmpw.Qa;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  产后访视记录表QA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface QaService extends IService<Qa> {
    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取产后访视记录表日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getQaDateList(String ab);

    /**
     * @param String ab, String ac 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取产后访视记录表信息
     * @date 2018-11-29
     */
    Qa getQaOne(String ab, String ac);
}
