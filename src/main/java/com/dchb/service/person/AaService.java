package com.dchb.service.person;

import com.dchb.model.person.Aa;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-27
 */
public interface AaService extends IService<Aa> {
      /**
       * @param String aa 档案编号
       * @author caichunde
       * @Description: 根据档案编号获取患者基本信息
       * @date 2018-11-29
       */
      Aa getAaOne(String aa);
}
