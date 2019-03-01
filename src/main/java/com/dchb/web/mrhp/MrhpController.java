package com.dchb.web.mrhp;

import com.dchb.service.mrhp.*;
import com.dchb.util.BaseController;
import com.dchb.util.IReturn;
import com.dchb.util.ReturnMsg;
import com.dchb.util.WordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 * 住院病案首页(电子病历) 前端控制器
 * </p>
 * mrhp 为Medical record home page缩写
 *
 * @author caichunde
 * @since 2018-12-3
 */
@RestController
@RequestMapping("/mrhp")
public class MrhpController extends BaseController {
    //住院病案首页(电子病历) 服务类
    @Autowired
    private EmrIchService emrIchService;
    //住院病案首页-手术(电子病历) 服务类
    @Autowired
    private EmrIchOperationService emrIchOperationService;
    //住院病案首页-住院费用(电子病历) 服务类
    @Autowired
    private EmrIchChargeService emrIchChargeService;
    //住院病案首页-过敏药物(电子病历) 服务类
    @Autowired
    private EmrIchAllergiesService emrIchAllergiesService;
    //住院病案首页-诊断(电子病历) 服务类
    @Autowired
    private EmrIchDiagnosisService emrIchDiagnosisService;

    /**
     * @param @param
     * @return IReturn    返回类型
     * @Title: (获取病案首页电子病历列表)
     * @Description: TODO(getEmrIchList)
     * @author caichunde
     * @date 2018年12月3日
     */
    @RequestMapping(method = RequestMethod.POST, value = "/getEmrIchList")
    public IReturn getEmrIchList(@RequestParam("sfzhm") String sfzhm) {
        List<Map<String, Object>> emrIchList = emrIchService.getEmrIchList(sfzhm);
        if (emrIchList.size() == 0) {
            return new IReturn(false, "未查到数据。");
        }
        Map<String, List<Map<String, Object>>> mapList = new HashMap<>();
        for (int i = 0, len = emrIchList.size(); i < len; i++) {
            Map<String, Object> map = emrIchList.get(i);
            String orgCode = map.get("ORGCODE").toString();
            String orgName = map.get("ORGNAME").toString();
            List<Map<String, Object>> emrIchList1 = emrIchService.getEmrIchByOrgCode(sfzhm, orgCode);
            mapList.put(orgName, emrIchList1);
        }
        return new IReturn(true, "操作成功。", mapList);
    }

    /**
     * @param @param
     * @return ReturnMsg    返回类型
     * @Title: (获取病案首页电子病历图片)
     * @Description: TODO(getEmrIchList)
     * @author caichunde
     * @date 2018年12月26日
     */
    @RequestMapping(value = "/getEmrIchOne")
    public ReturnMsg getEmrIchOne(@RequestParam("id") String id, HttpServletResponse response) throws Exception {
//        String docfile = "D:\\test\\";
//        String pdffile = "D:\\test\\";
//        String templetPath = "D:\\test2.doc";
        List<Map<String, Object>> emrIchOne = emrIchService.getEmrIchOne(id);
        if (emrIchOne.size() == 0) {
            return fail("未查到数据。");
        }
        if (emrIchOne.size() > 1) {
            return fail("查出多条数据，请联系相关人员。");
        }
        String docfile = "/usr/local/healthRecord-web/temp/";
        String pdffile = "/usr/local/healthRecord-web/temp/";
        String templetPath = "/usr/local/healthRecord-web/basymb.doc";
        String uuid = UUID.randomUUID().toString().replace("-", "");
        docfile = docfile + uuid + ".doc";
        pdffile = pdffile + uuid + ".pdf";
        Map<String, Object> mapData = emrIchOne.get(0);
        String ichId = mapData.get("ID").toString();
        //(住院病案首页 - 手术 ( 电子病历)列表)
        List<Map<String, Object>> emrIchOperationList = emrIchOperationService.getEmrIchOperationList(ichId);
        for (int i = 0, len = emrIchOperationList.size(); i < len; i++) {
            Map<String, Object> map = emrIchOperationList.get(i);
            for (String key : map.keySet()) {
                String key1 = key + (i + 1);
                Object value = map.get(key);
                mapData.put(key1, value);
            }
        }
        //(住院病案首页 - 住院费用 ( 电子病历) 列表)
        List<Map<String, Object>> emrIchChargeList = emrIchChargeService.getEmrIchChargeList(ichId);
        for (int i = 0, len = emrIchChargeList.size(); i < len; i++) {
            Map<String, Object> map = emrIchChargeList.get(i);
            for (String key : map.keySet()) {
                String key1 = key + (i + 1);
                Object value = map.get(key);
                mapData.put(key1, value);
            }
        }
        //(住院病案首页 - 过敏药物 ( 电子病历)列表)
        List<Map<String, Object>> emrIchAllergiesList = emrIchAllergiesService.getEmrIchAllergiesList(ichId);
        String gmywAll = "";// 所有药物拼接一块
        for (int i = 0, len = emrIchAllergiesList.size(); i < len; i++) {
            Map<String, Object> map = emrIchAllergiesList.get(i);
            for (String key : map.keySet()) {
                String key1 = key + (i + 1);
                Object value = map.get(key);
                mapData.put(key1, value);
                if (i == len - 1) {
                    gmywAll = gmywAll + value;
                } else {
                    gmywAll = gmywAll + value + "；";
                }
            }
        }
        mapData.put("gmywAll", gmywAll);
        //(住院病案首页 - 诊断 ( 电子病历 ） 列表)
        List<Map<String, Object>> emrIchDiagnosisList = emrIchDiagnosisService.getEmrIchDiagnosisList(ichId);
        for (int i = 0, len = emrIchDiagnosisList.size(); i < len; i++) {
            Map<String, Object> map = emrIchDiagnosisList.get(i);
            for (String key : map.keySet()) {
                String key1 = key + (i + 1);
                Object value = map.get(key);
                mapData.put(key1, value);
            }
        }
        response.resetBuffer();
        WordUtil.wordToImg(response, docfile, pdffile, templetPath, "png", mapData);
        return success();
    }


    /**
     * @param @param
     * @return IReturn    返回类型
     * @Title: (获取病案首页电子病历列表)
     * @Description: TODO(getEmrIchList)
     * @author caichunde
     * @date 2018年12月3日
     */
    @GetMapping(value = "/getEmrIchImg")
    public String getEmrIchImg(HttpServletResponse response) throws Exception {
//        String docfile = "D:\\test\\test.doc";
//        String pdffile = "D:\\test\\test.pdf";
//        String templetPath = "D:\\test3.doc";

        String docfile = "/root/test/test.doc";
        String pdffile = "/root/test/test.pdf";
        String templetPath = "/root/test/test2.doc";
        Map map = new HashMap();
        map.put("xm", "張三");
        map.put("sfzhm", "1212121212");
        map.put("jgmc", "医院1");
        map.put("jgdm", "1212");
        map.put("fffs", "网上");
        map.put("jkkh", "11111111");
        map.put("zycs", "12");
        map.put("xb", "女");
        map.put("csrq", "19991111");
        map.put("gj", "中國");
        map.put("bah", "12121212");
        map.put("nl", "34");
        WordUtil.wordToImg2(response, docfile, pdffile, templetPath, "png", map);
        return null;
    }
}
