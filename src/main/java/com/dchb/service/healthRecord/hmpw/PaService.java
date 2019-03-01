package com.dchb.service.healthRecord.hmpw;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.hmpw.Pa;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  第2-5次产前随访服务记录表PA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface PaService extends IService<Pa> {
    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号获取第2-5次产前随访服务记录表日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getPaDateList(String ab);

    /**
     * @param String ab 档案编号, String ad 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取第2-5次产前随访服务记录表信息
     * @date 2018-11-29
     */
    Pa getPaOne(String ab, String ad);
}
