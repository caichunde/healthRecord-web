package com.dchb.util.dingxiang.api;

import java.util.HashMap;
import java.util.Map;

import com.dchb.util.ApiHttpClientUtil;
import com.dchb.util.JsonMapper;
import com.dchb.util.dingxiang.api.request.SendInfoRequest;
import com.dchb.util.dingxiang.api.response.SendInfoResponse;

public class DefaultJuheClient implements JuheClient {

	private String url;
	
	public DefaultJuheClient(String url) {
		this.url = url;
	}
	
	@Override
	public <T extends JuheResponse> T execute(JuheRequest<T> request) throws Exception {
		return _execute(request);
	}
	
	
	public <T extends JuheResponse> T _execute(JuheRequest<T> request) throws Exception {
		Map<String, Object> rt = doRequest(request);
		if(rt == null)
			return null;
		
		T tsp = JsonMapper.nonDefaultMapper().fromJson(String.valueOf(rt.get("rsp")), request.getResponseClass());
		return tsp;
	}
	
	
	public <T extends JuheResponse> Map<String, Object> doRequest(JuheRequest<T> request) 
			throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
        Map<String, Object> params = request.getTextParams();
        String sendUrl = this.url + request.getMethod();
        String rsp = "";
        if ("GET".equals(request.getHttpMethod())) {
            rsp = ApiHttpClientUtil.doGet(sendUrl, params);
        } else {
        	rsp = ApiHttpClientUtil.doPostJson(sendUrl, params.toString(), "utf-8");
        }
        result.put("rsp", rsp);
        System.out.println("Juhe:" + rsp);
        return result;
	}
	
	public static void main(String[] args) throws Exception {
		JuheClient client = new DefaultJuheClient("http://v.juhe.cn/");
		SendInfoRequest req = new SendInfoRequest();
		req.setKey("f2c188ef014dfcb9dff4449f554e3d82");
		req.setRealname("胡凯");
		req.setIdcard("370923199709171535");
		req.setMoblie("18053111535");
		
		System.out.println(JsonMapper.nonEmptyMapper().toJson(req));
		SendInfoResponse rsp = client.execute(req);
		System.out.println(rsp.getErrorCode());
	}

}
