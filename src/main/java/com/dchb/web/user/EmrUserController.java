package com.dchb.web.user;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.dchb.model.user.EmrUser;
import com.dchb.service.user.EmrUserService;
import com.dchb.util.BaseController;
import com.dchb.util.ReturnMsg;
import com.dchb.util.ShareCodeUtil;
import com.dchb.util.SysUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author caichunde
 * @since 2018-11-29
 */
@RestController
@RequestMapping("/emrUser")
public class EmrUserController extends BaseController {
    @Autowired
    private EmrUserService emrUserService;

    /**
     * @param @param
     * @Description: java生成一个9位的随机数后产生6位数字（授权码）
     * @author: caichunde
     * @date 2018年11月30日
     */
    @PostMapping("/randomCode")
    public ReturnMsg randomCode(HttpServletRequest request) {
        HttpSession session = request.getSession();
        long radomLong = new Random().nextInt(999999999);
        String sqm = ShareCodeUtil.toSerialCode(radomLong);
        Map<String, String> map = new HashMap<>();
        map.put("code", sqm);
        EmrUser emrUser = new EmrUser();
        JSONObject jsonObject = (JSONObject) session.getAttribute("logPerson");
        String yhid = jsonObject.get("yhid").toString();
        emrUser.setYhid(yhid);
        emrUser.setSqm(sqm);
        int count = emrUserService.updateEmrUser(emrUser);
        //TimerTask实现5小时删除
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                emrUser.setYhid(yhid);
                emrUser.setSqm("0");
                emrUserService.updateEmrUser(emrUser);
                timer.cancel();
            }
        }, 5 * 60 * 60 * 1000);
        if (count == 0) {
            return fail("操作失败");
        }
        return new ReturnMsg(true, map);
    }

    /**
     * @param @param
     * @Description: 修改手机号码
     * @author: caichunde
     * @date 2018年12月13日
     */
    @PostMapping("/updateEmrUserSjhm")
    public ReturnMsg updateEmrUserSjhm(HttpServletRequest request, String sjhm, String sjyzm) throws Exception {
        HttpSession session = request.getSession();
        if (StringUtils.isEmpty(sjhm)) {
            return fail("手机号码不能为空。");
        }
        if (StringUtils.isEmpty(sjyzm)) {
            return fail("手机验证码不能为空。");
        }
        String checkCode = (String) session.getAttribute("checkCode");
        if (StringUtils.isEmpty(checkCode)) {
            return fail("手机验证码已过期，请重新发送。");
        }
        if (!checkCode.equals(sjyzm)) {
            return fail("手机验证码不正确。");
        }
        JSONObject jsonObject = (JSONObject) session.getAttribute("logPerson");
        String yhid = jsonObject.get("yhid").toString();
        String xm = jsonObject.get("xm").toString();
        String sfzhm = jsonObject.get("sfzhm").toString();
        ReturnMsg returnMsg = SysUtil.realNameAuth(xm, sfzhm, sjhm);
        if (returnMsg.getSuccess()) {
            EmrUser emrUser = new EmrUser();
            emrUser.setYhid(yhid);
            emrUser.setSjhm(sjhm);
            int count = emrUserService.updateEmrUser(emrUser);
            if (count == 0) {
                return fail("操作失败");
            }
            return success();
        } else {
            return fail(returnMsg.getData());
        }
    }
}

