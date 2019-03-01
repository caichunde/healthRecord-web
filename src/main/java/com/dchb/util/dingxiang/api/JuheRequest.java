package com.dchb.util.dingxiang.api;

import java.util.Map;

public interface JuheRequest<T extends JuheResponse> {

	public String getHttpMethod();
	
	public Class<T> getResponseClass();
	
	public String getMethod();
	
	public Map<String,Object> getTextParams();
	
}
