package com.dchb.service.healthRecord.hicp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.hicp.Fb;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  脑卒中、冠心病发病报告卡表FB服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface FbService extends IService<Fb> {
    /**
     * @param String bx 档案编号
     * @return List<Map<String, Object>>
     * @author caichunde
     * @Description: 根据档案编号获取脑卒中、冠心病发病报告卡日期信息
     * @date 2018-12-4
     */
    List<Map<String, Object>> getFbDateList(String bx);

    /**
     * @param String bx 档案编号，String bt 报卡日期
     * @return Fb
     * @author caichunde
     * @Description: 根据档案编号和报告卡日期获取脑卒中、冠心病发病报告卡表患者信息
     * @date 2018-11-29
     */
    Fb getFbOne(String bx, String bt);
}
