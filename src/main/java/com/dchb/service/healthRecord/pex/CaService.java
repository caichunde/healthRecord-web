package com.dchb.service.healthRecord.pex;

import com.dchb.model.healthRecord.pex.Ca;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  健康体检表CA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
public interface CaService extends IService<Ca> {
    /**
     * @param String ab 档案编号
     * @return List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取患者体检次数的体检日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getCaDateList(String ab);

    /**
     * @param String ab 档案编号, String ac 体检日期
     * @return Ca
     * @author caichunde
     * @Description: 根据档案编号和体检日期获取患者体检信息
     * @date 2018-11-29
     */
    Ca getCaOne(String ab, String ac);
}
