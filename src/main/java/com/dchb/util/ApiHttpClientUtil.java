package com.dchb.util;

import java.io.File;
import java.net.URLEncoder;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.SSLContext;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class ApiHttpClientUtil {
	private static String DEFAULT_ENCODE = "UTF-8";
	private static int DEFAULT_OUTTIME = 3600000;
	
	/**
	 * HTTP POST
	 * @param url 接口服务地址
	 * @param params 参数
	 * @return
	 * @throws Exception
	 */
	public static String doPost(String url, Map<String, Object> params) throws Exception {
		return doPost(url, params, DEFAULT_ENCODE, DEFAULT_OUTTIME, null);
	}
	
	/**
	 * HTTP POST
	 * @category doPost
	 * @param url
	 * @param params
	 * @param headers 请求头信息
	 * @return
	 * @throws Exception
	 */
	public static String doPost(String url, Map<String, Object> params, Map<String, String> headers) throws Exception {
		return doPost(url, params, DEFAULT_ENCODE, DEFAULT_OUTTIME, headers);
	}
	
	/**
	 * HTTP POST
	 * @param url 接口服务地址
	 * @param params 参数
	 * @param encoding 编码格式 默认：UTF-8
	 * @return
	 * @throws Exception
	 */
	public static String doPost(String url, Map<String, Object> params, String encoding) throws Exception {
		return doPost(url, params, encoding, DEFAULT_OUTTIME, null);
	}
	
	/**
	 * HTTP POST
	 * @param url 接口服务地址
	 * @param params 参数
	 * @param outtime 连接超时时间 默认DEFAULT_OUTTIME
	 * @return
	 * @throws Exception
	 */
	public static String doPost(String url, Map<String, Object> params, int outtime) throws Exception {
		return doPost(url, params, DEFAULT_ENCODE, outtime, null);
	}
	
	/**
	 * HTTP POST
	 * @category doPost
	 * @param url
	 * @param params
	 * @param encoding
	 * @param outtime
	 * @return
	 * @throws Exception
	 */
	public static String doPost(String url, Map<String, Object> params, String encoding, int outtime) throws Exception {
		return doPost(url, params, DEFAULT_ENCODE, outtime, null);
	}
	
	/**
	 * 传入json字符串和编码格式
	 * @Title: HTTP POST
	 * @param url
	 * @param params
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public static String doPostJson(String url, String params,String encoding) throws Exception {
		return doPostJson(url, params, DEFAULT_ENCODE, DEFAULT_OUTTIME, null);
	}
	public static String doPost(String url, String params,String encoding) throws Exception {
		return doPost(url, params, DEFAULT_ENCODE, DEFAULT_OUTTIME, null);
	}
	
	/**
	 * 
	 * @Description PUT请求
	 * @param url
	 * @param params
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public static String doPut(String url, String params,String encoding) throws Exception {
        return doPut(url, params, DEFAULT_ENCODE, DEFAULT_OUTTIME, null);
    }
	
	/**
     * 
     * @Description PUT请求
     * @param url
     * @param params
     * @param encoding
     * @return
     * @throws Exception
     */
    public static String doPatch(String url, String params,String encoding) throws Exception {
        return doPatch(url, params, DEFAULT_ENCODE, DEFAULT_OUTTIME, null);
    }
    
	/**
	 * @Title: HTTP POST
	 * @param url 接口服务地址
	 * @param params 参数
	 * @param encoding 编码 默认UTF-8
	 * @param outtime  连接超时时间 默认DEFAULT_OUTTIME
	 * @return String
	 * @throws Exception
	 *
	 */
	public static String doPost(String url, Map<String, Object> params, String encoding, int outtime, Map<String, String> headers) throws Exception {
		try {
			if(StringUtils.isBlank(encoding)){
				encoding = DEFAULT_ENCODE;
			}
			CloseableHttpClient httpclient = null;
			if(url.startsWith("https")) {
				httpclient = buildSSLCloseableHttpClient();
			}else {
				httpclient = HttpClients.createDefault();
			}
			HttpPost httpPost = new HttpPost(url);
			if(headers != null) {
				for (String name : headers.keySet()) {
					httpPost.addHeader(name, headers.get(name));
				}
			}
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(outtime).setConnectTimeout(outtime).build();
			httpPost.setConfig(requestConfig);
			if(checkFileParams(params)){
				MultipartEntity mpEntity = new MultipartEntity();
				for (String key : params.keySet()) {
					if(params.get(key) == null){
						continue;
					}
					if(params.get(key) instanceof File){
						mpEntity.addPart(key, new FileBody((File)params.get(key)));
					}else{
						mpEntity.addPart(key,new StringBody(params.get(key).toString()));
					}
				}
				httpPost.setEntity(mpEntity);
			}else{
				List<NameValuePair> nvps = new ArrayList<NameValuePair>();
				Set<String> keySet = params.keySet();
				for (String key : keySet) {
					if(params.get(key) == null){
						continue;
					}
					nvps.add(new BasicNameValuePair(key, params.get(key).toString()));
				}
				httpPost.setEntity(new UrlEncodedFormEntity(nvps, encoding));
			}
			CloseableHttpResponse response = httpclient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			String res = EntityUtils.toString(entity,encoding);
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("网络异常!");
		}
	}
	
	/**
	 * 传入json字符串
	 * @Title: HTTP POST
	 * @param url
	 * @param params
	 * @param encoding
	 * @param outtime
	 * @param headers
	 * @return
	 * @throws Exception
	 */
	public static String doPostJson(String url, String params, String encoding, int outtime, Map<String, String> headers) throws Exception {
		try {
			if(StringUtils.isBlank(encoding)){
				encoding = DEFAULT_ENCODE;
			}
			CloseableHttpClient httpclient = null;
			if(url.startsWith("https")) {
				httpclient = buildSSLCloseableHttpClient();
			}else {
				httpclient = HttpClients.createDefault();
			}
			HttpPost httpPost = new HttpPost(url);
			if(headers != null) {
				for (String name : headers.keySet()) {
					httpPost.addHeader(name, headers.get(name));
				}
			}
			StringEntity entityS = new StringEntity(params,"utf-8");
			entityS.setContentEncoding("UTF-8");
	        entityS.setContentType("application/json");
			httpPost.setEntity(entityS);
			CloseableHttpResponse response = httpclient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			return EntityUtils.toString(entity,encoding);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("网络异常!");
		}
	}
	public static String doPost(String url, String params, String encoding, int outtime, Map<String, String> headers) throws Exception {
		try {
			if(StringUtils.isBlank(encoding)){
				encoding = DEFAULT_ENCODE;
			}
			CloseableHttpClient httpclient = null;
			if(url.startsWith("https")) {
				httpclient = buildSSLCloseableHttpClient();
			}else {
				httpclient = HttpClients.createDefault();
			}
			HttpPost httpPost = new HttpPost(url);
			if(headers != null) {
				for (String name : headers.keySet()) {
					httpPost.addHeader(name, headers.get(name));
				}
			}
			StringEntity entityS = new StringEntity(params,"utf-8");
			entityS.setContentEncoding("UTF-8");
	        entityS.setContentType("text/plain");
			httpPost.setEntity(entityS);
			CloseableHttpResponse response = httpclient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			return EntityUtils.toString(entity,encoding);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("网络异常!");
		}
	}
	/**
	 * @Title: 验证参数中是否包含文件类型
	 */
	public static boolean checkFileParams(Map<String, Object> params){
		for (String key : params.keySet()) {
			if(params.get(key) instanceof File){
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * HTTP GET
	 * @param url 请求路径  例:http://api.open.dangdang.com/openapi/rest
	 * @param params 参数
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String url, Map<String, Object> params) throws Exception{
		return doGet(url, params, DEFAULT_ENCODE);
	}
	
	/**
	 * HTTP GET
	 * @param url 请求路径  例:http://api.open.dangdang.com/openapi/rest
	 * @param params 参数
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String url, Map<String, Object> params, Map<String, String> headers) throws Exception{
		return doGet(url, params, DEFAULT_ENCODE, DEFAULT_OUTTIME, headers);
	} 
	
	/**
	 * HTTP GET
	 * @param url 请求路径  例:http://api.open.dangdang.com/openapi/rest
	 * @param params 参数
	 * @param encoding 编码格式 默认UTF-8
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String url, Map<String, Object> params, String encoding) throws Exception{
		return doGet(url, params, encoding, DEFAULT_OUTTIME, null);
	}
	
	/**
	 * @Title HTTP Get ： 编码格式默认UTF-8
	 * @param url 请求路径  例:http://api.open.dangdang.com/openapi/rest
	 * @param params 参数
	 * @param outtime 连接超时时间 默认DEFAULT_OUTTIME
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String url, Map<String, Object> params, int outtime) throws Exception{
		return doGet(url, params, DEFAULT_ENCODE, outtime, null);
	}
	
	/**
	 * HTTP GET
	 * @category doGet
	 * @param url
	 * @param params
	 * @param outtime
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String url, Map<String, Object> params, String encoding, int outtime) throws Exception{
		return doGet(url, params, DEFAULT_ENCODE, outtime, null);
	}
	
	/**
	 * @Title HTTP Get
	 * @param url 请求路径  例:http://api.open.dangdang.com/openapi/rest
	 * @param params 参数
	 * @param encoding 编码格式 默认UTF-8
	 * @param outtime  连接超时时间 默认DEFAULT_OUTTIME
	 * @return String
	 * @throws Exception
	 *
	 */
	public static String doGet(String url, Map<String, Object> params, String encoding, int outtime, Map<String, String> headers) throws Exception{
		try {
			if(StringUtils.isBlank(encoding)){
				encoding = DEFAULT_ENCODE;
			}
			CloseableHttpClient httpclient = null;
			if(url.startsWith("https")) {
				httpclient = buildSSLCloseableHttpClient();
			}else {
				httpclient = HttpClients.createDefault();
			}
			StringBuilder sb = new StringBuilder(url);
			if (params.size() > 0) {
				for (String it : params.keySet()) {
					if(params.get(it) == null) {
						continue;
					}
					sb.append("&"+it+"="+URLEncoder.encode(String.valueOf(params.get(it)), encoding));
				}
			}
			HttpGet httpGet = new HttpGet(sb.toString().replaceFirst("&", "?"));
			if(headers != null) {
				for (String name : headers.keySet()) {
					httpGet.addHeader(name, headers.get(name));
				}
			}
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(outtime).setConnectTimeout(outtime).build();
			httpGet.setConfig(requestConfig);
			CloseableHttpResponse response = httpclient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			return EntityUtils.toString(entity, encoding);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("网络异常!");
		}
	}
	
	
	/**
	 * 创建SSL证书信任客户端
	 * @return
	 * @throws Exception
	 */
	private static CloseableHttpClient buildSSLCloseableHttpClient() throws Exception {
		SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
            //信任所有
            public boolean isTrusted(X509Certificate[] chain,
                            String authType) throws CertificateException {
                return true;
            }
        }).build();
		//ALLOW_ALL_HOSTNAME_VERIFIER:这个主机名验证器基本上是关闭主机名验证的。这个实现是一个空操作，而且不会抛出javax.net.ssl.SSLException异常。
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, new String[] { "TLSv1" }, null,  
                SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        return HttpClients.custom().setSSLSocketFactory(sslsf).build();
	}

	public static String doPut(String url, String params, String encoding, int outtime, Map<String, String> headers) throws Exception{
	    try {
            if(StringUtils.isBlank(encoding)){
                encoding = DEFAULT_ENCODE;
            }
            CloseableHttpClient httpclient = null;
            if(url.startsWith("https")) {
                httpclient = buildSSLCloseableHttpClient();
            }else {
                httpclient = HttpClients.createDefault();
            }
            HttpPut httpPut = new HttpPut(url);
            if(headers != null) {
                for (String name : headers.keySet()) {
                    httpPut.addHeader(name, headers.get(name));
                }
            }
            StringEntity entityS = new StringEntity(params,"utf-8");
            entityS.setContentEncoding("UTF-8");
            entityS.setContentType("application/json");
            httpPut.setEntity(entityS);
            CloseableHttpResponse response = httpclient.execute(httpPut);
            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity,encoding);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("网络异常!");
        }
	}
	
	public static String doPatch(String url, String params, String encoding, int outtime, Map<String, String> headers) throws Exception{
        try {
            if(StringUtils.isBlank(encoding)){
                encoding = DEFAULT_ENCODE;
            }
            CloseableHttpClient httpclient = null;
            if(url.startsWith("https")) {
                httpclient = buildSSLCloseableHttpClient();
            }else {
                httpclient = HttpClients.createDefault();
            }
            HttpPatch httpPatch = new HttpPatch(url);
            if(headers != null) {
                for (String name : headers.keySet()) {
                    httpPatch.addHeader(name, headers.get(name));
                }
            }
            StringEntity entityS = new StringEntity(params,"utf-8");
            entityS.setContentEncoding("UTF-8");
            entityS.setContentType("application/json");
            httpPatch.setEntity(entityS);
            CloseableHttpResponse response = httpclient.execute(httpPatch);
            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity,encoding);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("网络异常!");
        }
    }
	
}
