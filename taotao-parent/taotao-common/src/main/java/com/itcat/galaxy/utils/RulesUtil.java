package com.itcat.galaxy.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright (c) 2019. TwinkleGalaxy.com, All Rights Reserved
 * Description: 正则校验工具类
 * Author: ItApe / Galaxy
 * Date: 2019/3/25
 * Time: 21:44
 */
public class RulesUtil {

    /* ## 信用卡银行卡正则 */
    public static final String BANKNO = "^(\\d{11}|\\d{12}|\\d{13}|\\d{14}|\\d{15}|\\d{16}|\\d{17}|\\d{18}|\\d{19})$";
    /* ## 身份证 */
    public static final String IDCODE = "(^[1-9]\\d{5}(18|19|20|21|22)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)";
    /* ## 手机号正则 */
    public static final String MOBILE = "^((1[1-9]{1})+\\d{9})$";
    /* ## 手机号正则 */
    public static final String T_MOBILE = "^(1+\\d{10})$";
    /* ## 6位短信验证码正则等 */
    public static final String NUM_LENGTH_6 = "^(\\d{6})$";
    /* ## 4位短信验证码正则等 */
    public static final String NUM_LENGTH_4 = "^(\\d{4})$";
    /* ## numTwo正则等 */
    public static final String NUM_LENGTH_3 = "^(\\d{3})$";
    /* ## 两位数字的月份 */
    public static final String MONTH = "^(0?[1-9]|1[0-2])$";
    /* ## 包含小数点的数字 */
    public static final String NUM = "^([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])$";
    /* ## 借记卡银行卡正则 */
    public static final String DEBIT_CARD_NO = "^(\\d{16}|\\d{17}|\\d{18}|\\d{19})$";
    /* ## 邮箱 */
    public static final String EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    /* ## 密码 */
    public static final String PASSWORD = "^[0-9a-zA-Z~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]{6,16}$";
    /* ## 银行编码 */
    public static final String BANKCODE = "^[A-Z]+$";
    /* ## 只允许输入汉字或· */
    public static final String CONTACTS_NAME = "[\\u4E00-\\u9FA5]{1,20}(?:·[\\u4E00-\\u9FA5]{1,20})*";

    /**
     * @param regex 正则表达式
     * @param param 业务参数
     * @return true=匹配成功,false=匹配失败
     * @Description 正则校验
     * @author 王鑫
     */
    public static boolean rules(final String regex, String param) {
        if (StringUtils.isBlank(regex) || StringUtils.isBlank(param)) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(param);
        return matcher.matches();
    }

}
