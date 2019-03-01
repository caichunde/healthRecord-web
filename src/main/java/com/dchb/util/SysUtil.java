package com.dchb.util;

import com.dchb.util.dingxiang.api.DefaultJuheClient;
import com.dchb.util.dingxiang.api.JuheClient;
import com.dchb.util.dingxiang.api.domain.SendResult;
import com.dchb.util.dingxiang.api.request.SendInfoRequest;
import com.dchb.util.dingxiang.api.response.SendInfoResponse;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @param
 * @author caichunde
 * @return
 * @Title: (SysUtil)
 * @Description: 系统工具类
 * @date 2018年12月13日
 */
public class SysUtil {
    // 实名验证key
    private static final String REALNAME_KEY = "f2c188ef014dfcb9dff4449f554e3d82";

    /**
     * @param
     * @return
     * @Title: (SysUtil)
     * @Description: 实名验证方法
     * @author caichunde
     * @date 2018年12月13日
     */
    public static ReturnMsg realNameAuth(String xm, String sfzhm, String sjhm) throws Exception {
        JuheClient client = new DefaultJuheClient("http://v.juhe.cn/");
        SendInfoRequest req = new SendInfoRequest();
        req.setKey(SysUtil.REALNAME_KEY);
        req.setRealname(xm);
        req.setIdcard(sfzhm);
        req.setMoblie(sjhm);

        SendInfoResponse rsp = client.execute(req);
        SendResult sendResult = rsp.getResult();
        if (null == sendResult) {
            return new ReturnMsg(false, rsp);
        }
        int res = sendResult.getRes();
        if (res == 1) {
            return new ReturnMsg(true, rsp);
        } else {
            return new ReturnMsg(false, rsp);
        }
    }

    /**
     * @param
     * @return
     * @Title: (SysUtil)
     * @Description: 验证是否是一个手机号码
     * @author caichunde
     * @date 2018年12月13日
     */
    public static boolean isPhone(String sjhm) {
        if (StringUtils.isEmpty(sjhm)) {
            return false;
        }
        Pattern p = Pattern.compile("^(((13[0-9]{1})|(14[0-9]{1})|(15[0-35-9]{1})|(16[0-9]{1})|(17[0-9]{1})|(18[0-9]{1})|(19[0-9]{1}))+\\d{8})$");
        boolean b = p.matcher(sjhm).matches();
        return b;
    }

    /**
     * @param
     * @return
     * @Title: (SysUtil)
     * @Description: 验证是否是一个中文姓名
     * @author caichunde
     * @date 2018年12月13日
     */
    public static boolean isName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        Pattern p = Pattern.compile("^[\\u4e00-\\u9fa5]+(•[\\u4e00-\\u9fa5]+)*$");
        boolean b = p.matcher(name).matches();
        return b;
    }

    /**
     * @param
     * @return
     * @Title: (SysUtil)
     * @Description: 验证是否是一个中文
     * @author caichunde
     * @date 2018年12月13日
     */
    public static boolean isChinese(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Pattern p = Pattern.compile("^[\\u4e00-\\u9fa5]+$");
        boolean b = p.matcher(str).matches();
        return b;
    }

    /**
     * @param
     * @return
     * @Title: (SysUtil)
     * @Description: 验证是否是一个邮箱
     * @author caichunde
     * @date 2018年12月13日
     */
    public static boolean isEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return false;
        }
        Pattern p = Pattern.compile("^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$");
        boolean b = p.matcher(email).matches();
        return b;
    }

    /**
     * @param
     * @return
     * @Title: (SysUtil)
     * @Description: 验证是否是一个密码
     * @author caichunde
     * @date 2018年12月13日
     */
    public static boolean isPwd(String pwd) {
        if (StringUtils.isEmpty(pwd)) {
            return false;
        }
        Pattern p = Pattern.compile("^\\w{6,20}$");
        boolean b = p.matcher(pwd).matches();
        return b;
    }
}
