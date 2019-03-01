package com.dchb.util.dingxiang.api.response;

import com.dchb.util.dingxiang.api.JuheResponse;
import com.dchb.util.dingxiang.api.domain.SendResult;
import com.fasterxml.jackson.annotation.JsonProperty;
 
/**
 * 
 * @author 
 *
 */
public class SendInfoResponse extends JuheResponse {

	private static final long serialVersionUID = -3293577270033199078L;

	@JsonProperty("result")
	private SendResult result;
	
	private int errorCode;
	
	private String reason;
	
	public SendResult getResult() {
		return result;
	}
	public void setResult(SendResult result) {
		this.result = result;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
