package com.dchb.service.person;

import com.dchb.model.person.Ba;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
public interface BaService extends IService<Ba> {
     /**
      * @param String aa 档案编号
      * @author caichunde
      * @Description: 根据档案编号获取患者基本信息
      * @date 2018-11-29
      */
     Ba getBaOne(String aa);

     /**
      * @param String ae 身份证号码
      * @author caichunde
      * @Description: 根据身份证号码获取患者基本信息
      * @date 2018-11-29
      */
     List<Ba> getBaOneByAe(String ae);
}
