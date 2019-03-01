package com.dchb.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.user.EmrUser;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-29
 */
public interface EmrUserService extends IService<EmrUser> {

    EmrUser getEmrUserOne(String xm, String sfzhm);

    int saveEmrUser(EmrUser emrUser);

    int updateEmrUser(EmrUser emrUser);
}
