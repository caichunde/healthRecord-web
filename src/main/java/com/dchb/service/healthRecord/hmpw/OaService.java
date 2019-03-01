package com.dchb.service.healthRecord.hmpw;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dchb.model.healthRecord.hmpw.Oa;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  第一次产前随访服务记录表OA服务类
 * </p>
 *
 * @author caichunde
 * @since 2018-11-28
 */
public interface OaService extends IService<Oa> {
    /**
     * @param String ab 档案编号
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号第一次产前随访服务记录日期信息
     * @date 2018-11-29
     */
    List<Map<String, Object>> getOaDateList(String ab);

    /**
     * @param String ab, String ac 记录日期
     * @return IReturn
     * @author caichunde
     * @Description: 根据档案编号和记录日期获取第一次产前随访服务记录信息
     * @date 2018-11-29
     */
    Oa getOaOne(String ab, String ac);
}
