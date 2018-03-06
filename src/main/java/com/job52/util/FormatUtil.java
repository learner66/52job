package com.job52.util;

import java.util.regex.Pattern;

public class FormatUtil {
    public static final String REGEX_PHONE= "^1[34578]\\d{9}$";
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private FormatUtil(){};

    public static int  verifyPhoneOrEmailFormat(String format){
        //校验是手机还是邮箱,两者都不是，则认为是错误
        if(Pattern.matches(REGEX_PHONE,format)){
            return 1;
        }else if(Pattern.matches(REGEX_EMAIL,format)){
            return 2;
        }
        return 0;
    }
}
