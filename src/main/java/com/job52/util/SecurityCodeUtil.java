package com.job52.util;

import java.util.Random;

public class SecurityCodeUtil {

    private SecurityCodeUtil(){};

    /**
     * 获取手机验证码
     * @param phone 手机号
     * @return 手机验证码
     * @throws Exception 异常信息
     */
    public static String getPhoneCode(String phone) throws Exception{
        //生成验证码，然后发送，并且返回验证码
        String code = getCode();
        if( PhoneUtil.sendMessage(phone,code)){
            return code;
        }else{
            throw new Exception("验证码发送失败");
        }
    }



    /**
     * 获取邮箱验证码
     * @param email 邮箱
     * @return  邮箱验证码
     * @throws Exception 异常信息
     */
    public static String getEmailCode(String email) throws Exception{
        //生成验证码，然后发送，并且返回验证码
        String code = getCode();
        try{
          MailUtil.sendMail("欢迎您的使用","52job欢迎您的使用，您的验证码是:"+code,email);
        }catch (Exception e){

           throw new Exception("验证码发送失败");
        }
        return code;
    }

    /**
     * 生成随机验证码
     * @return
     */
    private static String getCode(){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        String tmp = null;
        for(int i =0;i<4;i++){
            sb.append(r.nextInt(9));
        }
        return  sb.toString();
    }

}
