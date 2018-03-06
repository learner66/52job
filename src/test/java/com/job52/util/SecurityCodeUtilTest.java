package com.job52.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecurityCodeUtilTest {

    @Test
    public void getPhoneCode()  throws Exception{
        String code = SecurityCodeUtil.getPhoneCode("13243166689");
        System.out.println(code);
    }

    @Test
    public void getEmailCode() throws Exception {
        String code= SecurityCodeUtil.getEmailCode("kubo310@qq.com");
        System.out.println(code);
    }
}