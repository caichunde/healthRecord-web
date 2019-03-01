package com.dchb.service.healthRecord.hicp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.hicp.Ib;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  脑卒中患者随访表IB服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface IbService extends IService<Ib> {
    /**
     * @param  String ab 档案编号
     * @return List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取脑卒中患者随访表随访日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getIbDateList(String ab);

    /**
     * @param String ab 档案编号, String ac 随访日期
     * @return Ib
     * @author caichunde
     * @Description: 根据档案编号和随访日期获取脑卒中患者随访表信息
     * @date 2018-11-29
     */
    Ib getIbOne(String ab, String ac);
}
