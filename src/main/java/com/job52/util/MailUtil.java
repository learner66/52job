package com.job52.util;

import java.io.FileReader;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author
 @version:2017-10-10下午5:00:07
 */
public class MailUtil {
    private MailUtil(){}
    /**
     * 发送邮jian
     * @throws Exception 异常信息
     */
    public static void sendMail(String subject,String text,String email) throws Exception{
        Properties prop = new Properties();
        prop.load(new FileReader(MailUtil.class.getClassLoader().getResource("mail.properties").getPath()));
        //创建程序到邮件服务器之间的一次会话
        Session session = Session.getInstance(prop);
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("snailzkx@aliyun.com"));
        msg.setRecipients(RecipientType.TO, new InternetAddress[]{new InternetAddress(email)});
        msg.setSubject(subject);
        msg.setText(text);
        Transport trans = session.getTransport();
        trans.connect("snailzkx@aliyun.com", "zhangkangxi123");
        trans.sendMessage(msg, msg.getAllRecipients());
    }
}
