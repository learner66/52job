package com.job52.controller;

import com.job52.model.Person;
import com.job52.service.PersonService;
import com.job52.util.FormatUtil;
import com.job52.util.SecurityCodeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/index")
    public String index() {
        return "/index";
    }

    /**
     * 向用户发送验证码
     * @param userName 用户手机/邮箱
     * @return 操作结果，向前段ajax返回json串。
     * @throws Exception 异常信息
     */
    @RequestMapping("/sendCode")
    @ResponseBody
    public  Map<String,Object> sendCode(String userName, HttpSession session) throws Exception{
        Map<String, Object> modelMap = new HashMap<String, Object>();
        /**
         * 1.判断用户是邮箱还是手机，如果格式不正确，则认为输入出错
         * 2.如果是邮箱，则向用户的邮箱发送验证码
         * 3.如果是手机，则向用户的手机发送验证码
         */
        int format = FormatUtil.verifyPhoneOrEmailFormat(userName);
        String verifyCode = null;
        if(format==0) {//格式错误
            modelMap.put("msg","账号格式出错");
            return modelMap;
        }else{
            if(format == 1){//手机
                //得到手机验证码
                verifyCode= SecurityCodeUtil.getPhoneCode(userName);
               //将验证码放入session域中
               session.setAttribute("verifyCode",verifyCode);
            }else if(format == 2){//邮箱
                //得到邮箱验证码
                 verifyCode = SecurityCodeUtil.getEmailCode(userName);
                //将验证码放入session域中
                session.setAttribute("verifyCode",verifyCode);
            }
        }
        modelMap.put("msg",verifyCode);
        return modelMap;
    }

    /**
     * 接收用户的注册信息
     * @param person  注册信息
     * @param response  响应
     * @param request  请求
     * @param session  会话
     * @return 如果成功注册，跳转到登录界面。如果失败，回到注册页面。
     */
    @RequestMapping("/register")
    public String registerPerson(Person person, HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception {
        String verifyCode = (String) session.getAttribute("verifyCode");
        String verifyNum = request.getParameter("verifyNum");
        if(!verifyNum.equals(verifyCode)){
            request.setAttribute("verifyMsg","验证码错误");
            throw new Exception("验证码错误");
        }else{
          if(personService.registerPerson(person)){
              request.getSession().removeAttribute("verifyNum");
              return "redirect:/person/index";
          }else{
              throw new Exception("验证码错误");
          }
        }
    }


    /**
     * 个人用户登录
     * @param password 用户密码
     * @param username 登录名
     * @return 跳转地址
     * 无需判断用户账号是什么类型的，直接获取到用户的信息到数据库中进行查找即可
     */
    @RequestMapping("login")
    public String  loginPerson(String username,String password) throws Exception{
        Person person = new Person();
        person.setEmail(username);  //用户使用邮箱登录
        person.setUserName(username);//用户使用用户名登录
        person.setPhone(username);//用户使用手机登录
        if(personService.personLogin(person)){
            //登录成功，跳转到主页
        }
        //登录失败，跳转到登录页面
        return null;
    }

    /**
     * 更新用户基本信息
     * @param username 用户名
     * @param imgUrl 用户头像
     * @return  跳转地址
     * @throws Exception 异常信息
     */
    @RequestMapping("updatePersonInfo")
   public void updatePersonInfo(String username,String imgUrl) throws  Exception{
        String pid = new String();
        Person person = new Person();
        person.setImgUrl(imgUrl);
        person.setUserName(username);
        if(personService.updatePersonInfo(pid,person)){
            //更新成功，给出正确提示，不跳转
        }else{
            //更新失败，给出错误提示，不跳转
        }
   }

    /**
     * 更新用户手机
     * @param newPhone 新手机号
     * @param verifyNum  验证码
     * @return
     * @throws Exception 异常信息
     */
   @RequestMapping("updatePersonPhone")
   public String UpdatePersonPhone(String newPhone,String verifyNum,HttpSession session)throws Exception{
        /*
           1.先判断验证码是否正确
           2.验证码正确更新手机
         */
        String verifyCode = (String) session.getAttribute("verifyCode");
        if(verifyCode.equals(verifyNum)){
            //更新手机
            String pid = new String();
            personService.UpdatePersonPhone(pid,newPhone);
        }else{
            //提示失败
        }
     return null;
   }

    /**
     * 更新用户邮箱
     * @param newEmail 新邮箱
     * @param verifyNum  验证码
     * @return
     * @throws Exception 异常信息
     */
    @RequestMapping("updatePersonEmail")
    public String UpdatePersonEmail(String newEmail,String verifyNum,HttpSession session)throws Exception{
        /*
           1.先判断验证码是否正确
           2.验证码正确更新手机
         */
        String verifyCode = (String) session.getAttribute("verifyCode");
        if(verifyCode.equals(verifyNum)){
            //更新手机
            String pid = new String();
            personService.UpdatePersonPhone(pid,newEmail);
        }else{
            //提示失败
        }
        return null;
    }
}
