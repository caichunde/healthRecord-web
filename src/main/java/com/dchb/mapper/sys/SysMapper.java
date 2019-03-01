package com.dchb.mapper.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.poi.ss.formula.functions.T;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author caichunde
 * @since 2018-11-29
 */
@Mapper
public interface SysMapper extends BaseMapper<T> {
    @Select("select to_char(sysdate,'yyyymmdd')||to_char(${seqName}.nextval ) from dual")
    String getSeq(@Param("seqName") String seqName);
}
