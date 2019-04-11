package com.itcat.galaxy.utils.encryp.md5;

import java.security.MessageDigest;

/**
 * Copyright (c) 2019. TwinkleGalaxy.com, All Rights Reserved
 * Description: MD5 加密工具类
 * Author: ItApe / Galaxy
 * Date: 2019/3/27
 * Time: 22:17
 */
public class MD5Utils {

    /**
     * encrypt32
     *
     * @param encryptStr
     * @return String
     */
    public static String encrypt32(String encryptStr) {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md5.digest(encryptStr.getBytes());
            StringBuffer hexValue = new StringBuffer();
            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16)
                    hexValue.append("0");
                hexValue.append(Integer.toHexString(val));
            }
            encryptStr = hexValue.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return encryptStr;
    }


}
