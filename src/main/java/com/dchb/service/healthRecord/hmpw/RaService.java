package com.dchb.service.healthRecord.hmpw;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.hmpw.Ra;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  产后42天健康检查记录表RA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface RaService extends IService<Ra> {
    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号产后42天健康检查记录表日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getRaDateList(String ab);

    /**
     * @param String ab 档案编号, String ac 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期产后42天健康检查记录表信息
     * @date 2018-11-29
     */
    Ra getRaOne(String ab, String ac);
}
