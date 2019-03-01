package com.dchb.config;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.util.DigestUtils;

public class SecrectUtils {
	public static final String HMAC_SHA1 = "HmacSHA1";
    private static final String CHARSET_NAME_UTF8 = "UTF-8";
    public static final char[] digital = "0123456789ABCDEF".toCharArray();
    
    public static String encryptMD5(String content)  throws IOException {
    	return encryptMD5(content, CHARSET_NAME_UTF8);
    }
	
	public static String encryptMD5(String srcContent, String charset) throws IOException {
		if (srcContent == null)
		{
			return null;
		}
		String strDes = null;
		try
		{
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(srcContent.getBytes(charset));
			strDes = byte2hex(md5.digest()); // to HexString
		}
		catch (NoSuchAlgorithmException e)
		{
			return null;
		}
		return strDes;
	}

	private static String byte2hex(byte[] byteArray) {
		StringBuffer strBuf = new StringBuffer();
		for (int i = 0; i < byteArray.length; i++)
		{
			if(byteArray[i] >= 0 && byteArray[i] < 16)
			{
				strBuf.append("0");
			}
			strBuf.append(Integer.toHexString(byteArray[i] & 0xFF));
		}
		return strBuf.toString();
	}


//	public static String encryptSHA1(String content) {
//		return DigestUtils.sha1Hex(content);
//	}

	/**
	 * HMA_SHA1 to HEX
	 * @category hmacSha1ToHexStr
	 * @param str
	 * @param key
	 * @return
	 */
	public static String encryptHmacSha1ToHexStr(String str, String key) {
        try {
            byte[] data = str.getBytes(CHARSET_NAME_UTF8);
            return hmacSha1ToHexStr(data, key.getBytes(CHARSET_NAME_UTF8), 0, data.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
	
	public static String hmacSha1ToHexStr(byte[] data, byte[] key, int offset, int len) {
        byte[] rawHmac = hmacSha1(data, key, offset, len);
        return encodeHexStr(rawHmac);
    }
    
	public static byte[] hmacSha1(byte[] data, byte[] key, int offset, int len) {
        SecretKeySpec signingKey = new SecretKeySpec(key, HMAC_SHA1);
        Mac mac = null;
        try {
            mac = Mac.getInstance(HMAC_SHA1);
            mac.init(signingKey);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        mac.update(data, offset, len);
        return mac.doFinal();
    }
	
	public static String encodeHexStr(final byte[] bytes){
        if(bytes == null){
            return null;
        }
        char[] result = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            result[i*2] = digital[(bytes[i] & 0xf0) >> 4];
            result[i*2 + 1] = digital[bytes[i] & 0x0f];
        }
        return new String(result);
	}
}
