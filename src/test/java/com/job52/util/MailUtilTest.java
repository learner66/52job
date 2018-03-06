package com.job52.util;

import org.junit.Test;



public class MailUtilTest {

    @Test
    public void sendMail() throws Exception {
        MailUtil.sendMail("欢迎您的使用","您的验证码是:1234","736979041@qq.com");
    }
}