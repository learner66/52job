package com.job52.util;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class FormatUtilTest {

    @Test
    public void verifyPhoneOrEmailFormat() {

            String format = "13243166689@aliyun.vip.com";
            int result = FormatUtil.verifyPhoneOrEmailFormat(format);
            if (result == 1) {
                System.out.println("手机号");
            } else if (result == 2) {
                System.out.println("邮箱");
            } else {
                System.out.println("格式错误");
            }
        }
}