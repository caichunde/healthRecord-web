package com.dchb.util.dingxiang.api.request;

import java.util.HashMap;  
import java.util.Map;

import com.dchb.util.JsonMapper;
import com.dchb.util.dingxiang.api.JuheRequest;
import com.dchb.util.dingxiang.api.domain.SendInfo;
import com.dchb.util.dingxiang.api.response.SendInfoResponse;


public class SendInfoRequest implements JuheRequest<SendInfoResponse> {
	
	private String key;
	private String realname;
	private String idcard;
	private String moblie;
	
	@Override
	public String getHttpMethod() {
		
		return "GET";
	}

	@Override
	public String getMethod() {
		return "telecom/query";
	}
	
	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> params = new HashMap<String, Object>();
        //params.put("body", JsonMapper.nonEmptyMapper().toJson(sendInfo));
		params.put("key", key);
		params.put("realname", realname);
		params.put("idcard", idcard);
		params.put("mobile", moblie);
        return params;
	}

//	public SendInfo getSendInfo() {
//		return sendInfo;
//	}
//
//	public void setSendInfo(SendInfo sendInfo) {
//		this.sendInfo = sendInfo;
//	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getMoblie() {
		return moblie;
	}

	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}

	@Override
	public Class<SendInfoResponse> getResponseClass() {
		return SendInfoResponse.class;
	}
	

}
