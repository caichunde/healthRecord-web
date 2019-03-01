package com.dchb.util.dingxiang.api;

public interface JuheClient {

    <T extends JuheResponse> T execute(JuheRequest<T> request) throws Exception;
}
