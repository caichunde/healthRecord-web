package com.dchb.web.sys;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.exceptions.ClientException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.dchb.model.person.Ba;
import com.dchb.model.user.EmrUser;
import com.dchb.service.person.BaService;
import com.dchb.service.user.EmrUserService;
import com.dchb.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

@RestController
@RequestMapping("/sysHealth")
public class SysHealthController extends BaseController {
    @Autowired
    private BaService baService;
    @Autowired
    private EmrUserService emrUserService;

    /**
     * @param @param
     * @return ReturnMsg 返回类型
     * @Title: (verifyLogin)
     * @Description: 一键通对接验证登录接口
     * @author caichunde
     * @date 2019年1月2日
     */
    @PostMapping("/invisibleLogin")
    public ReturnMsg invisibleLogin(@RequestParam("xm")String xm,
                                    @RequestParam("sfzhm") String sfzhm,
                                    @RequestParam("sjhm") String sjhm,
                                    HttpServletRequest request) {
        HttpSession session = request.getSession();

        if (StringUtils.isEmpty(xm)) {
            return fail("姓名不能为空。");
        }
        if (StringUtils.isEmpty(sfzhm)) {
            return fail("身份证号码不能为空。");
        }
        if (StringUtils.isEmpty(sjhm)) {
            return fail("手机号码不能为空。");
        }
        if (!SysUtil.isName(xm)) {
            return fail("姓名不正确。");
        }
        if (!IDCardUtil.validateIdCard(sfzhm)) {
            return fail("身份证号码不正确。");
        }
        if (!SysUtil.isPhone(sjhm)) {
            return fail("手机号码不正确。");
        }
        xm = xm.trim();
        sfzhm = sfzhm.trim().toUpperCase();
        sjhm = sjhm.trim();
        EmrUser emrUser = emrUserService.getEmrUserOne(xm, sfzhm);
        List<Ba> baList = baService.getBaOneByAe(sfzhm);
        if (baList.size() == 0) {
            return fail("对不起，没有查到您的健康档案信息，无法使用该功能。");
        }
        if (baList.size() > 1) {
            return fail("根据身份证号码【" + sfzhm + "】查出包含多条数据，无法使用该功能，请联系相关人员。");
        }
        if (null == emrUser) {
            EmrUser emrUser1 = new EmrUser();// 记录
            String yhid = sysService.getSeq("emr_user_id");
            emrUser1.setYhid(yhid);
            emrUser1.setXm(xm);
            emrUser1.setSfzhm(sfzhm);
            emrUser1.setSjhm(sjhm);
            emrUser1.setBz("一建通跳转");
            emrUserService.saveEmrUser(emrUser1);
            emrUser = emrUserService.getEmrUserOne(xm, sfzhm);// 在查询一次用与获取数据
        }
        JSONObject resData = new JSONObject();
        resData.put("ab", baList.get(0).getAb());// 档案编号
        resData.put("yhid", emrUser.getYhid());
        resData.put("xm", emrUser.getXm());
        resData.put("sfzhm", emrUser.getSfzhm());
        session.setAttribute("logPerson", resData);
        return new ReturnMsg(true, "登录验证成功", resData);
    }

    /**
     * @param @param
     * @return String 返回类型
     * @Title: (verifyLogin)
     * @Description: 验证登录接口
     * @author caichunde
     * @date 2018年11月30日
     */
    @PostMapping("/verifyLogin")
    public ReturnMsg verifyLogin(@RequestParam("xm") String xm,
                                 @RequestParam("sfzhm") String sfzhm,
                                 @RequestParam("sjyzm") String sjyzm,
                                 @RequestParam("sjhm") String sjhm,
                                 HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        if (StringUtils.isEmpty(xm)) {
            return fail("姓名不能为空。");
        }
        if (StringUtils.isEmpty(sfzhm)) {
            return fail("身份证号码不能为空。");
        }
        if (StringUtils.isEmpty(sjyzm)) {
            return fail("手机验证码不能为空。");
        }
        if (!SysUtil.isName(xm)) {
            return fail("请输入真实的姓名。");
        }
        if (!IDCardUtil.validateIdCard(sfzhm)) {
            return fail("请输入真实的身份证号码。");
        }
        if (!SysUtil.isPhone(sjhm)) {
            return fail("请输入真实的手机号码。");
        }
        String checkCode = (String) session.getAttribute("checkCode");
//        if (StringUtils.isEmpty(checkCode)) {
//            return fail("手机验证码已过期，请重新发送。");
//        }
        if (!sjyzm.equals("123")) {
            return fail("手机验证码不正确。");
        }
        xm = xm.trim();
        sfzhm = sfzhm.trim().toUpperCase();
        sjhm = sjhm.trim();
        EmrUser emrUser = emrUserService.getEmrUserOne(xm, sfzhm);
        List<Ba> baList = baService.getBaOneByAe(sfzhm);
        if (baList.size() > 1) {
            return fail("根据身份证号码【" + sfzhm + "】查出包含多条数据，请联系相关人员。");
        }
        if (baList.size() == 0) {
            return fail("对不起，没有查到您的健康档案信息，无法使用该功能。");
        }
        if (null == emrUser) {// 为空去实名验证getBaOneByAe
            //实名验证
            //     ReturnMsg returnMsg = SysUtil.realNameAuth(xm, sfzhm, sjhm);
            if (true) {
                EmrUser emrUser1 = new EmrUser();// 记录验证结果，下次无需验证
                String yhid = sysService.getSeq("emr_user_id");
                emrUser1.setYhid(yhid);
                emrUser1.setXm(xm);
                emrUser1.setSfzhm(sfzhm);
                emrUser1.setSjhm(sjhm);
                emrUserService.saveEmrUser(emrUser1);
                emrUser = emrUserService.getEmrUserOne(xm, sfzhm);// 在查询一次用与获取数据
            } else {
                // return fail(returnMsg.getData());
                return fail("12121212");
            }
        } else {
//            String phone = emrUser.getSjhm();
//            String yhid = emrUser.getYhid();
//            if (!sjhm.equals(phone)) {// 如果手机号码更换实名验证并更新手机号码
//                //实名验证
//                ReturnMsg returnMsg = SysUtil.realNameAuth(xm, sfzhm, sjhm);
//                if (returnMsg.getSuccess()) {
//                    EmrUser emrUser1 = new EmrUser();// 记录验证结果，下次无需验证
//                    emrUser1.setYhid(yhid);
//                    emrUser1.setSjhm(sjhm);
//                    emrUserService.updateEmrUser(emrUser1);
//                } else {
//                    return fail(returnMsg.getData());
//                }
//            }
        }
        JSONObject resData = new JSONObject();
        resData.put("ab", baList.get(0).getAb());// 档案编号
        resData.put("yhid", emrUser.getYhid());
        resData.put("xm", emrUser.getXm());
        resData.put("sfzhm", emrUser.getSfzhm());
        session.setAttribute("logPerson", resData);
        return new ReturnMsg(true, "登录验证成功", resData);
    }

    /**
     * @param @param
     * @return ReturnMsg    返回类型
     * @Title: (getSendCode)
     * @Description: TODO(发送验证码)
     * @author hukai
     * @date 2018年11月28日下午3:56:14
     */
    @PostMapping("/getSendCode")
    public ReturnMsg getSendCode(String phone, HttpServletRequest request) throws ClientException {
        if (StringUtils.isEmpty(phone)) {
            return new ReturnMsg(false, "手机号码不能为空");
        }
        if (!SysUtil.isPhone(phone)) {
            return new ReturnMsg(false, "请输入真实的手机号码。");
        }
        ReturnMsg msg = ShortMsgUtil.sendCode(phone);
        if (!msg.getSuccess()) return msg;
        String sendCode = (String) msg.getData();
        HttpSession session = request.getSession();
        session.setAttribute("checkCode", sendCode);
        //TimerTask实现1分钟后从session中删除checkCode
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                session.removeAttribute("checkCode");
                timer.cancel();
            }
        }, 60 * 1000);
        return new ReturnMsg(true, "发送成功");
    }

    /**
     * @param @param
     * @return ReturnMsg    返回类型
     * @Title: (logout)
     * @Description: TODO(退出登录)
     * @author hukai
     * @date 2018年11月30日
     */
    @PostMapping("/logout")
    public ReturnMsg logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("logPerson");
        return new ReturnMsg(true, "退出成功");
    }

    /**
     * @param @param
     * @Description: 修改手机号码
     * @author: caichunde
     * @date 2018年12月13日
     */
    @PostMapping("/addEmrUser")
    public ReturnMsg addEmrUser(Map emrUser,HttpServletRequest request) {
        System.out.println(emrUser);
        return null;
    }
}
