package com.yliu.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 密码相关的工具类
 * @author YLiu
 * @Email yliu19930120@163.com
 * 2019年4月13日 上午11:10:02
 */
public class PasswordUtils {
	public static String encodeByMd5(String string) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // 确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        Base64.Encoder base64Encoder = Base64.getEncoder();
        // 加密字符串
        return base64Encoder.encodeToString(md5.digest(string.getBytes("utf-8")));
    }
}
