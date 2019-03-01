package com.dchb.service.sys;

import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.poi.ss.formula.functions.T;

public interface SysService extends IService<T> {
    String getSeq(String seqName);
}
